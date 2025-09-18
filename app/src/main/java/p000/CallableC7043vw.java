package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.AbstractC5811V0;
import io.sentry.C5792O1;
import io.sentry.C6022g1;
import io.sentry.InterfaceC5801S;
import io.sentry.android.core.C5833E;
import io.sentry.android.core.C5835G;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.clientreport.C5998b;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;
import org.json.JSONObject;

/* renamed from: vw */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC7043vw implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f44604a;

    /* renamed from: b */
    public final /* synthetic */ Object f44605b;

    /* renamed from: c */
    public final /* synthetic */ Object f44606c;

    public /* synthetic */ CallableC7043vw(Object obj, int i, Object obj2) {
        this.f44604a = i;
        this.f44605b = obj;
        this.f44606c = obj2;
    }

    /* renamed from: a */
    private final Object m25526a() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i;
        Context context = (Context) this.f44605b;
        Intent intent = (Intent) this.f44606c;
        C10919rY0 c10919rY0M24401x = C10919rY0.m24401x();
        ((ArrayDeque) c10919rY0M24401x.f41731e).offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (c10919rY0M24401x) {
            try {
                str = (String) c10919rY0M24401x.f41728b;
                if (str == null) {
                    ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                    if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null && context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                        if (str2.startsWith(".")) {
                            c10919rY0M24401x.f41728b = context.getPackageName() + serviceInfo.name;
                        } else {
                            c10919rY0M24401x.f41728b = serviceInfo.name;
                        }
                        str = (String) c10919rY0M24401x.f41728b;
                    }
                    str = null;
                }
            } finally {
            }
        }
        if (str != null) {
            intent2.setClassName(context.getPackageName(), str);
        }
        try {
            i = (c10919rY0M24401x.m24426z(context) ? AbstractC10948rm1.m24488d(context, intent2) : context.startService(intent2)) == null ? 404 : -1;
        } catch (IllegalStateException e) {
            e.toString();
            i = 402;
        } catch (SecurityException unused) {
            i = 401;
        }
        return Integer.valueOf(i);
    }

    /* renamed from: b */
    private final Object m25527b() {
        boolean z;
        C6621pV c6621pV = (C6621pV) this.f44605b;
        C9432fw1 c9432fw1 = (C9432fw1) this.f44606c;
        C0877Nw c0877Nw = c6621pV.f40122i;
        HashMap map = (HashMap) c9432fw1.f27505b;
        synchronized (c0877Nw.f8140e) {
            try {
                HashMap mapM5908b = c0877Nw.m5908b();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    z = (str.length() <= 250 && (str2 == null || str2.length() <= 500)) ? z | (str2 != null ? !Objects.equals(mapM5908b.put(str, str2), str2) : mapM5908b.remove(str) != null) : false;
                    String.format("Invalid custom signal: Custom signal keys must be %d characters or less, and values must be %d characters or less.", 250, 500);
                    return null;
                }
                if (!z) {
                    return null;
                }
                if (mapM5908b.size() > 100) {
                    String.format("Invalid custom signal: Too many custom signals provided. The maximum allowed is %d.", 100);
                    return null;
                }
                c0877Nw.f8136a.edit().putString("customSignals", new JSONObject(mapM5908b).toString()).commit();
                Objects.toString(c0877Nw.m5908b().keySet());
                return null;
            } finally {
            }
        }
    }

    /* renamed from: c */
    private final Object m25528c() {
        C6621pV c6621pV = (C6621pV) this.f44605b;
        C7005vK c7005vK = (C7005vK) this.f44606c;
        C0877Nw c0877Nw = c6621pV.f40122i;
        synchronized (c0877Nw.f8137b) {
            c0877Nw.f8136a.edit().putLong("fetch_timeout_in_seconds", c7005vK.f44329b).putLong("minimum_fetch_interval_in_seconds", c7005vK.f44330c).commit();
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedWriter bufferedWriter;
        switch (this.f44604a) {
            case 0:
                C7169xw c7169xw = (C7169xw) this.f44605b;
                C7232yw c7232yw = (C7232yw) this.f44606c;
                C0940Ow c0940Ow = c7169xw.f45907b;
                synchronized (c0940Ow) {
                    FileOutputStream fileOutputStreamOpenFileOutput = c0940Ow.f8690a.openFileOutput(c0940Ow.f8691b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(c7232yw.f46542a.toString().getBytes("UTF-8"));
                    } finally {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
                return null;
            case 1:
                return m25526a();
            case 2:
                return m25527b();
            case 3:
                return m25528c();
            case 4:
                C8064Ol0 c8064Ol0 = (C8064Ol0) this.f44605b;
                boolean z = c8064Ol0.f8606m;
                String str = (String) this.f44606c;
                if (!z) {
                    return AbstractC9022cm0.m10856b(c8064Ol0.getContext(), str, null);
                }
                Context context = c8064Ol0.getContext();
                HashMap map = AbstractC9022cm0.f17734a;
                return AbstractC9022cm0.m10856b(context, str, "asset_" + str);
            case 5:
                return AbstractC9022cm0.m10857c((InputStream) this.f44605b, (String) this.f44606c);
            case 6:
                return AbstractC9022cm0.m10860f(null, (ZipInputStream) this.f44605b, (String) this.f44606c);
            case 7:
                FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance((ReactApplicationContext) ((C8755ag1) this.f44605b).f2474b);
                Boolean bool = (Boolean) this.f44606c;
                bool.getClass();
                CG1 cg1 = firebaseAnalytics.f18443a;
                cg1.getClass();
                cg1.m1136f(new C9734iH1(cg1, bool, 0));
                return null;
            case 8:
                CG1 cg12 = FirebaseAnalytics.getInstance((ReactApplicationContext) ((C8755ag1) this.f44605b).f2474b).f18443a;
                cg12.getClass();
                cg12.m1136f(new C8961cH1(cg12, (String) this.f44606c, 0));
                return null;
            case 9:
                C7005vK c7005vK = new C7005vK(2);
                Bundle bundle = (Bundle) this.f44605b;
                if (bundle.containsKey("minimumFetchInterval")) {
                    c7005vK.m25399a((long) bundle.getDouble("minimumFetchInterval"));
                }
                if (bundle.containsKey("fetchTimeout")) {
                    long j = (long) bundle.getDouble("fetchTimeout");
                    if (j < 0) {
                        throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
                    }
                    c7005vK.f44329b = j;
                }
                C6621pV c6621pVM23803d = C6621pV.m23803d((C0786MU) this.f44606c);
                C7005vK c7005vK2 = new C7005vK(c7005vK);
                c6621pVM23803d.getClass();
                AbstractC9376fU1.m18242c(c6621pVM23803d.f40116c, new CallableC7043vw(c6621pVM23803d, 3, c7005vK2));
                return null;
            case 10:
                InterfaceC5801S interfaceC5801S = (InterfaceC5801S) this.f44605b;
                C5792O1 c5792o1 = (C5792O1) this.f44606c;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, C6022g1.f34163d));
                    try {
                        interfaceC5801S.mo21461e(c5792o1, bufferedWriter2);
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
                        return byteArray;
                    } finally {
                        try {
                            bufferedWriter2.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            case 11:
                InterfaceC5801S interfaceC5801S2 = (InterfaceC5801S) this.f44605b;
                AbstractC5811V0 abstractC5811V0 = (AbstractC5811V0) this.f44606c;
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C6022g1.f34163d));
                    try {
                        interfaceC5801S2.mo21461e(abstractC5811V0, bufferedWriter);
                        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray2;
                    } finally {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                } finally {
                }
            case 12:
                InterfaceC5801S interfaceC5801S3 = (InterfaceC5801S) this.f44605b;
                C5998b c5998b = (C5998b) this.f44606c;
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C6022g1.f34163d));
                    try {
                        interfaceC5801S3.mo21461e(c5998b, bufferedWriter);
                        byte[] byteArray3 = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray3;
                    } finally {
                    }
                } finally {
                }
            default:
                return C5835G.m21526c(((C5833E) this.f44605b).f33523a, (SentryAndroidOptions) this.f44606c);
        }
    }
}
