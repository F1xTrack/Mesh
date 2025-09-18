package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import defpackage.AbstractC1705Vq;
import defpackage.NG;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.sentry.C5115c1;
import io.sentry.C5127g1;
import io.sentry.C5133i1;
import io.sentry.C5185y;
import io.sentry.D1;
import io.sentry.EnumC5148n1;
import io.sentry.ILogger;
import io.sentry.N1;
import io.sentry.O1;
import io.sentry.S0;
import io.sentry.protocol.C5155a;
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

/* renamed from: io.sentry.android.core.t */
/* loaded from: classes2.dex */
public abstract class AbstractC5102t {
    public static void a(io.sentry.android.core.performance.f fVar, ArrayList arrayList) {
        if (fVar.c == 0) {
            S0.c().A().getLogger().k(EnumC5148n1.WARNING, "Can not convert not-started TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        if (fVar.d == 0) {
            S0.c().A().getLogger().k(EnumC5148n1.WARNING, "Can not convert not-stopped TimeSpan to Map for Hybrid SDKs.", new Object[0]);
            return;
        }
        HashMap map = new HashMap();
        map.put("description", fVar.a);
        map.put("start_timestamp_ms", Long.valueOf(fVar.b));
        map.put("end_timestamp_ms", Long.valueOf(fVar.a()));
        arrayList.add(map);
    }

    public static void b(byte[] bArr, boolean z) {
        D1 d1A = S0.c().A();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                io.sentry.S serializer = d1A.getSerializer();
                io.sentry.internal.debugmeta.c cVarA = d1A.getEnvelopeReader().a(byteArrayInputStream);
                if (cVarA == null) {
                    byteArrayInputStream.close();
                    return;
                }
                ArrayList arrayList = new ArrayList();
                N1 n1 = null;
                boolean z2 = false;
                for (C5127g1 c5127g1 : (Collection) cVarA.c) {
                    arrayList.add(c5127g1);
                    C5133i1 c5133i1E = c5127g1.e(serializer);
                    if (c5133i1E != null) {
                        if (c5133i1E.b() != null) {
                            n1 = N1.Crashed;
                        }
                        if ((c5133i1E.b() != null) || c5133i1E.c()) {
                            z2 = true;
                        }
                    }
                }
                AtomicReference atomicReference = new AtomicReference();
                S0.b(new NG(n1, z2, atomicReference, d1A));
                O1 o1 = (O1) atomicReference.get();
                if (o1 != null) {
                    arrayList.add(C5127g1.b(serializer, o1));
                    if (z && S0.c().A().getMainThreadChecker().a()) {
                        try {
                            d1A.getExecutorService().submit(new RunnableC5084a(3, d1A));
                        } catch (Throwable th) {
                            d1A.getLogger().d(EnumC5148n1.WARNING, "Submission of deletion of the current session file rejected.", th);
                        }
                    } else {
                        d(d1A);
                    }
                    if (z) {
                        S0.c().E();
                    }
                }
                S0.c().y(new io.sentry.internal.debugmeta.c((C5115c1) cVarA.b, arrayList), new C5185y());
                byteArrayInputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            d1A.getLogger().d(EnumC5148n1.ERROR, "Failed to capture envelope", th2);
        }
    }

    public static io.sentry.Y c(Context context, D d) {
        return Build.VERSION.SDK_INT >= 30 ? new AnrV2Integration(context) : new AnrIntegration(context);
    }

    public static void d(D1 d1) {
        String cacheDirPath = d1.getCacheDirPath();
        if (cacheDirPath == null) {
            d1.getLogger().k(EnumC5148n1.INFO, "Cache dir is not set, not deleting the current session.", new Object[0]);
            return;
        }
        if (!d1.isEnableAutoSessionTracking()) {
            d1.getLogger().k(EnumC5148n1.DEBUG, "Session tracking is disabled, bailing from deleting current session file.", new Object[0]);
            return;
        }
        Charset charset = io.sentry.cache.c.g;
        if (new File(cacheDirPath, "session.json").delete()) {
            return;
        }
        d1.getLogger().k(EnumC5148n1.WARNING, "Failed to delete the current session file.", new Object[0]);
    }

    public static String e(Context context, ILogger iLogger) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i != 0) {
                return context.getString(i);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            return charSequence != null ? charSequence.toString() : context.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable th) {
            iLogger.d(EnumC5148n1.ERROR, "Error getting application name.", th);
            return null;
        }
    }

    public static String f(ILogger iLogger) {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th) {
            iLogger.d(EnumC5148n1.ERROR, "Error getting device family.", th);
            return null;
        }
    }

    public static String g(ILogger iLogger) throws IOException {
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
            iLogger.d(EnumC5148n1.ERROR, "Exception while attempting to read kernel information", e);
            return property;
        }
    }

    public static ActivityManager.MemoryInfo h(Context context, ILogger iLogger) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            iLogger.k(EnumC5148n1.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th) {
            iLogger.d(EnumC5148n1.ERROR, "Error getting MemoryInfo.", th);
            return null;
        }
    }

    public static Bundle i(Context context, ILogger iLogger, D d) {
        if (d == null) {
            io.sentry.config.a.D(iLogger, "The ILogger object is required.");
        }
        return (Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)) : context.getPackageManager().getApplicationInfo(context.getPackageName(), 128)).metaData;
    }

    public static PackageInfo j(Context context, int i, ILogger iLogger, D d) {
        try {
            d.getClass();
            return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(i)) : context.getPackageManager().getPackageInfo(context.getPackageName(), i);
        } catch (Throwable th) {
            iLogger.d(EnumC5148n1.ERROR, "Error getting package info.", th);
            return null;
        }
    }

    public static String k(PackageInfo packageInfo, D d) {
        d.getClass();
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }

    public static boolean l() {
        try {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            return runningAppProcessInfo.importance == 100;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean m(Bundle bundle, ILogger iLogger, String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        iLogger.k(EnumC5148n1.DEBUG, str + " read: " + z2, new Object[0]);
        return z2;
    }

    public static Boolean n(Bundle bundle, ILogger iLogger) {
        if (bundle.getSerializable("io.sentry.traces.enable") == null) {
            iLogger.k(EnumC5148n1.DEBUG, "io.sentry.traces.enable used default null", new Object[0]);
            return null;
        }
        boolean z = bundle.getBoolean("io.sentry.traces.enable", false);
        iLogger.k(EnumC5148n1.DEBUG, "io.sentry.traces.enable read: " + z, new Object[0]);
        return Boolean.valueOf(z);
    }

    public static Double o(Bundle bundle, ILogger iLogger, String str) {
        Double dValueOf = Double.valueOf(Float.valueOf(bundle.getFloat(str, bundle.getInt(str, -1))).doubleValue());
        iLogger.k(EnumC5148n1.DEBUG, str + " read: " + dValueOf, new Object[0]);
        return dValueOf;
    }

    public static List p(Bundle bundle, ILogger iLogger, String str) {
        String string = bundle.getString(str);
        iLogger.k(EnumC5148n1.DEBUG, AbstractC1705Vq.h(str, " read: ", string), new Object[0]);
        if (string != null) {
            return Arrays.asList(string.split(StringUtils.COMMA, -1));
        }
        return null;
    }

    public static long q(Bundle bundle, ILogger iLogger, String str, long j) {
        long j2 = bundle.getInt(str, (int) j);
        iLogger.k(EnumC5148n1.DEBUG, str + " read: " + j2, new Object[0]);
        return j2;
    }

    public static String r(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.k(EnumC5148n1.DEBUG, AbstractC1705Vq.h(str, " read: ", string), new Object[0]);
        return string;
    }

    public static String s(Bundle bundle, ILogger iLogger, String str, String str2) {
        String string = bundle.getString(str, str2);
        iLogger.k(EnumC5148n1.DEBUG, AbstractC1705Vq.h(str, " read: ", string), new Object[0]);
        return string;
    }

    public static C t(Context context, ILogger iLogger, D d) {
        String str;
        try {
            PackageInfo packageInfoJ = j(context, 0, iLogger, d);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfoJ != null && packageManager != null) {
                str = packageInfoJ.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    return new C(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    iLogger.k(EnumC5148n1.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    public static void u(PackageInfo packageInfo, D d, C5155a c5155a) {
        c5155a.a = packageInfo.packageName;
        c5155a.f = packageInfo.versionName;
        c5155a.g = k(packageInfo, d);
        HashMap map = new HashMap();
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                map.put(str.substring(str.lastIndexOf(46) + 1), (iArr[i] & 2) == 2 ? "granted" : "not_granted");
            }
        }
        c5155a.h = map;
    }
}
