package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.AbstractC5802S0;
import io.sentry.C5759D1;
import io.sentry.C5792O1;
import io.sentry.C5987c1;
import io.sentry.C6022g1;
import io.sentry.C6039i1;
import io.sentry.C6193y;
import io.sentry.EnumC5789N1;
import io.sentry.EnumC6069n1;
import io.sentry.ILogger;
import io.sentry.InterfaceC5801S;
import io.sentry.InterfaceC5819Y;
import io.sentry.android.core.performance.C5906f;
import io.sentry.cache.C5991c;
import io.sentry.config.AbstractC6003a;
import io.sentry.internal.debugmeta.C6042c;
import io.sentry.protocol.C6085a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p000.AbstractC1374Vq;
import p000.C0835NG;

/* renamed from: io.sentry.android.core.t */
/* loaded from: classes2.dex */
public abstract class AbstractC5911t {
    /* renamed from: a */
    public static void m21620a(C5906f c5906f, ArrayList arrayList) {
        if (c5906f.f33834c == 0) {
            AbstractC5802S0.m21465c().mo21364A().getLogger().mo21407k(EnumC6069n1.WARNING, "Can not convert not-started TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        if (c5906f.f33835d == 0) {
            AbstractC5802S0.m21465c().mo21364A().getLogger().mo21407k(EnumC6069n1.WARNING, "Can not convert not-stopped TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        HashMap map = new HashMap();
        map.put("description", c5906f.f33832a);
        map.put("start_timestamp_ms", Long.valueOf(c5906f.f33833b));
        map.put("end_timestamp_ms", Long.valueOf(c5906f.m21609a()));
        arrayList.add(map);
    }

    /* renamed from: b */
    public static void m21621b(byte[] bArr, boolean z) {
        C5759D1 c5759d1Mo21364A = AbstractC5802S0.m21465c().mo21364A();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                InterfaceC5801S serializer = c5759d1Mo21364A.getSerializer();
                C6042c c6042cMo21401a = c5759d1Mo21364A.getEnvelopeReader().mo21401a(byteArrayInputStream);
                if (c6042cMo21401a == null) {
                    byteArrayInputStream.close();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                EnumC5789N1 enumC5789N1 = null;
                boolean z2 = false;
                for (C6022g1 c6022g1 : (Collection) c6042cMo21401a.f34199c) {
                    arrayList.add(c6022g1);
                    C6039i1 c6039i1M21784e = c6022g1.m21784e(serializer);
                    if (c6039i1M21784e != null) {
                        if (c6039i1M21784e.m21787b() != null) {
                            enumC5789N1 = EnumC5789N1.Crashed;
                        }
                        if ((c6039i1M21784e.m21787b() != null) || c6039i1M21784e.m21788c()) {
                            z2 = true;
                        }
                    }
                }
                AtomicReference atomicReference = new AtomicReference();
                AbstractC5802S0.m21464b(new C0835NG(enumC5789N1, z2, atomicReference, c5759d1Mo21364A));
                C5792O1 c5792o1 = (C5792O1) atomicReference.get();
                if (c5792o1 != null) {
                    arrayList.add(C6022g1.m21780b(serializer, c5792o1));
                    if (z && AbstractC5802S0.m21465c().mo21364A().getMainThreadChecker().mo21581a()) {
                        try {
                            c5759d1Mo21364A.getExecutorService().submit(new RunnableC5854a(3, c5759d1Mo21364A));
                        } catch (Throwable th) {
                            c5759d1Mo21364A.getLogger().mo21406d(EnumC6069n1.WARNING, "Submission of deletion of the current session file rejected.", th);
                        }
                    } else {
                        m21623d(c5759d1Mo21364A);
                    }
                    if (z) {
                        AbstractC5802S0.m21465c().mo21368E();
                    }
                }
                AbstractC5802S0.m21465c().mo21379y(new C6042c((C5987c1) c6042cMo21401a.f34198b, arrayList), new C6193y());
                byteArrayInputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            c5759d1Mo21364A.getLogger().mo21406d(EnumC6069n1.ERROR, "Failed to capture envelope", th2);
        }
    }

    /* renamed from: c */
    public static InterfaceC5819Y m21622c(Context context, C5832D c5832d) {
        return Build.VERSION.SDK_INT >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context);
    }

    /* renamed from: d */
    public static void m21623d(C5759D1 c5759d1) {
        String cacheDirPath = c5759d1.getCacheDirPath();
        if (cacheDirPath == null) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.INFO, "Cache dir is not set, not deleting the current session.", new Object[0]);
            return;
        }
        if (!c5759d1.isEnableAutoSessionTracking()) {
            c5759d1.getLogger().mo21407k(EnumC6069n1.DEBUG, "Session tracking is disabled, bailing from deleting current session file.", new Object[0]);
            return;
        }
        Charset charset = C5991c.f34097g;
        if (new File(cacheDirPath, "session.json").delete()) {
            return;
        }
        c5759d1.getLogger().mo21407k(EnumC6069n1.WARNING, "Failed to delete the current session file.", new Object[0]);
    }

    /* renamed from: e */
    public static String m21624e(Context context, ILogger iLogger) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i != 0) {
                return context.getString(i);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable th) {
            iLogger.mo21406d(EnumC6069n1.ERROR, "Error getting application name.", th);
            return null;
        }
    }

    /* renamed from: f */
    public static String m21625f(ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th) {
            iLogger.mo21406d(EnumC6069n1.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    /* renamed from: g */
    public static String m21626g(ILogger iLogger) throws IOException {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            try {
                String line = bufferedReader.readLine();
                bufferedReader.close();
                return line;
            } finally {
            }
        } catch (IOException e) {
            iLogger.mo21406d(EnumC6069n1.ERROR, "Exception while attempting to read kernel information", e);
            return property;
        }
    }

    /* renamed from: h */
    public static ActivityManager.MemoryInfo m21627h(Context context, ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.mo21407k(EnumC6069n1.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            iLogger.mo21406d(EnumC6069n1.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    /* renamed from: i */
    public static Bundle m21628i(Context context, ILogger iLogger, C5832D c5832d) {
        if (c5832d == null) {
            AbstractC6003a.m21735D(iLogger, "The ILogger object is required.");
        }
        return (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)).metaData;
    }

    /* renamed from: j */
    public static PackageInfo m21629j(Context context, int i, ILogger iLogger, C5832D c5832d) {
        try {
            c5832d.getClass();
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i)) : context.getPackageManager().getPackageInfo(context.getPackageName(), i);
        } catch (Throwable th) {
            iLogger.mo21406d(EnumC6069n1.ERROR, "Error getting package info.", th);
            return null;
        }
    }

    /* renamed from: k */
    public static String m21630k(PackageInfo packageInfo, C5832D c5832d) {
        c5832d.getClass();
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    /* renamed from: l */
    public static boolean m21631l() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: m */
    public static boolean m21632m(Bundle bundle, ILogger iLogger, String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        iLogger.mo21407k(EnumC6069n1.DEBUG, str + " read: " + z2, new Object[0]);
        return z2;
    }

    /* renamed from: n */
    public static Boolean m21633n(Bundle bundle, ILogger iLogger) {
        if (bundle.getSerializable("io.sentry.traces.enable") == null) {
            iLogger.mo21407k(EnumC6069n1.DEBUG, "io.sentry.traces.enable used default null", new Object[0]);
            return null;
        }
        boolean z = bundle.getBoolean("io.sentry.traces.enable", false);
        iLogger.mo21407k(EnumC6069n1.DEBUG, "io.sentry.traces.enable read: " + z, new Object[0]);
        return Boolean.valueOf(z);
    }

    /* renamed from: o */
    public static Double m21634o(Bundle bundle, ILogger iLogger, String str) {
        Double dValueOf = Double.valueOf(Float.valueOf(bundle.getFloat(str, bundle.getInt(str, -1))).doubleValue());
        iLogger.mo21407k(EnumC6069n1.DEBUG, str + " read: " + dValueOf, new Object[0]);
        return dValueOf;
    }

    /* renamed from: p */
    public static List m21635p(Bundle bundle, ILogger iLogger, String str) {
        String string = bundle.getString(str);
        iLogger.mo21407k(EnumC6069n1.DEBUG, AbstractC1374Vq.m8589h(str, " read: ", string), new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(StringUtils.COMMA, -1));
        }
        return null;
    }

    /* renamed from: q */
    public static long m21636q(Bundle bundle, ILogger iLogger, String str, long j) {
        long j2 = bundle.getInt(str, (int) j);
        iLogger.mo21407k(EnumC6069n1.DEBUG, str + " read: " + j2, new Object[0]);
        return j2;
    }

    /* renamed from: r */
    public static String m21637r(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.mo21407k(EnumC6069n1.DEBUG, AbstractC1374Vq.m8589h(str, " read: ", string), new Object[0]);
        return string;
    }

    /* renamed from: s */
    public static String m21638s(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.mo21407k(EnumC6069n1.DEBUG, AbstractC1374Vq.m8589h(str, " read: ", string), new Object[0]);
        return string;
    }

    /* renamed from: t */
    public static C5831C m21639t(Context context, ILogger iLogger, C5832D c5832d) {
        String str;
        try {
            PackageInfo packageInfoM21629j = m21629j(context, 0, iLogger, c5832d);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfoM21629j != null && packageManager != null) {
                str = packageInfoM21629j.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new C5831C(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    iLogger.mo21407k(EnumC6069n1.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    /* renamed from: u */
    public static void m21640u(PackageInfo packageInfo, C5832D c5832d, C6085a c6085a) {
        c6085a.f34312a = packageInfo.packageName;
        c6085a.f34317f = packageInfo.versionName;
        c6085a.f34318g = m21630k(packageInfo, c5832d);
        HashMap map = new HashMap();
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i] & 2) == 2 ? "granted" : "not_granted");
            }
        }
        c6085a.f34319h = map;
    }
}
