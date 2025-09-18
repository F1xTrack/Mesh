package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.C5127g1;
import io.sentry.O1;
import io.sentry.S;
import io.sentry.V0;
import io.sentry.android.core.E;
import io.sentry.android.core.G;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.clientreport.b;
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
public final /* synthetic */ class CallableC7695vw implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ CallableC7695vw(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i;
        Context context = (Context) this.b;
        Intent intent = (Intent) this.c;
        C6860rY0 c6860rY0X = C6860rY0.x();
        ((ArrayDeque) c6860rY0X.e).offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        synchronized (c6860rY0X) {
            try {
                str = (String) c6860rY0X.b;
                if (str == null) {
                    ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                    if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null && context.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                        if (str2.startsWith(".")) {
                            c6860rY0X.b = context.getPackageName() + serviceInfo.name;
                        } else {
                            c6860rY0X.b = serviceInfo.name;
                        }
                        str = (String) c6860rY0X.b;
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
            i = (c6860rY0X.z(context) ? AbstractC6903rm1.d(context, intent2) : context.startService(intent2)) == null ? 404 : -1;
        } catch (IllegalStateException e) {
            e.toString();
            i = 402;
        } catch (SecurityException unused) {
            i = 401;
        }
        return Integer.valueOf(i);
    }

    private final Object b() {
        boolean z;
        C6469pV c6469pV = (C6469pV) this.b;
        C3866fw1 c3866fw1 = (C3866fw1) this.c;
        C1099Nw c1099Nw = c6469pV.i;
        HashMap map = (HashMap) c3866fw1.b;
        synchronized (c1099Nw.e) {
            try {
                HashMap mapB = c1099Nw.b();
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    z = (str.length() <= 250 && (str2 == null || str2.length() <= 500)) ? z | (str2 != null ? !Objects.equals(mapB.put(str, str2), str2) : mapB.remove(str) != null) : false;
                    String.format("Invalid custom signal: Custom signal keys must be %d characters or less, and values must be %d characters or less.", 250, 500);
                    return null;
                }
                if (!z) {
                    return null;
                }
                if (mapB.size() > 100) {
                    String.format("Invalid custom signal: Too many custom signals provided. The maximum allowed is %d.", 100);
                    return null;
                }
                c1099Nw.a.edit().putString("customSignals", new JSONObject(mapB).toString()).commit();
                Objects.toString(c1099Nw.b().keySet());
                return null;
            } finally {
            }
        }
    }

    private final Object c() {
        C6469pV c6469pV = (C6469pV) this.b;
        C7581vK c7581vK = (C7581vK) this.c;
        C1099Nw c1099Nw = c6469pV.i;
        synchronized (c1099Nw.b) {
            c1099Nw.a.edit().putLong("fetch_timeout_in_seconds", c7581vK.b).putLong("minimum_fetch_interval_in_seconds", c7581vK.c).commit();
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedWriter bufferedWriter;
        switch (this.a) {
            case 0:
                C8075xw c8075xw = (C8075xw) this.b;
                C8265yw c8265yw = (C8265yw) this.c;
                C1177Ow c1177Ow = c8075xw.b;
                synchronized (c1177Ow) {
                    FileOutputStream fileOutputStreamOpenFileOutput = c1177Ow.a.openFileOutput(c1177Ow.b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(c8265yw.a.toString().getBytes("UTF-8"));
                    } finally {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
                return null;
            case 1:
                return a();
            case 2:
                return b();
            case 3:
                return c();
            case 4:
                C1145Ol0 c1145Ol0 = (C1145Ol0) this.b;
                boolean z = c1145Ol0.m;
                String str = (String) this.c;
                if (!z) {
                    return AbstractC2578cm0.b(c1145Ol0.getContext(), str, null);
                }
                Context context = c1145Ol0.getContext();
                HashMap map = AbstractC2578cm0.a;
                return AbstractC2578cm0.b(context, str, "asset_" + str);
            case 5:
                return AbstractC2578cm0.c((InputStream) this.b, (String) this.c);
            case 6:
                return AbstractC2578cm0.f(null, (ZipInputStream) this.b, (String) this.c);
            case 7:
                FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance((ReactApplicationContext) ((C2180ag1) this.b).b);
                Boolean bool = (Boolean) this.c;
                bool.getClass();
                CG1 cg1 = firebaseAnalytics.a;
                cg1.getClass();
                cg1.f(new C4316iH1(cg1, bool, 0));
                return null;
            case 8:
                CG1 cg12 = FirebaseAnalytics.getInstance((ReactApplicationContext) ((C2180ag1) this.b).b).a;
                cg12.getClass();
                cg12.f(new C2486cH1(cg12, (String) this.c, 0));
                return null;
            case 9:
                C7581vK c7581vK = new C7581vK(2);
                Bundle bundle = (Bundle) this.b;
                if (bundle.containsKey("minimumFetchInterval")) {
                    c7581vK.a((long) bundle.getDouble("minimumFetchInterval"));
                }
                if (bundle.containsKey("fetchTimeout")) {
                    long j = (long) bundle.getDouble("fetchTimeout");
                    if (j < 0) {
                        throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j)));
                    }
                    c7581vK.b = j;
                }
                C6469pV c6469pVD = C6469pV.d((MU) this.c);
                C7581vK c7581vK2 = new C7581vK(c7581vK);
                c6469pVD.getClass();
                AbstractC3782fU1.c(c6469pVD.c, new CallableC7695vw(c6469pVD, 3, c7581vK2));
                return null;
            case 10:
                S s = (S) this.b;
                O1 o1 = (O1) this.c;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, C5127g1.d));
                    try {
                        s.e(o1, bufferedWriter2);
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
                S s2 = (S) this.b;
                V0 v0 = (V0) this.c;
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C5127g1.d));
                    try {
                        s2.e(v0, bufferedWriter);
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
                S s3 = (S) this.b;
                b bVar = (b) this.c;
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C5127g1.d));
                    try {
                        s3.e(bVar, bufferedWriter);
                        byte[] byteArray3 = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray3;
                    } finally {
                    }
                } finally {
                }
            default:
                return G.c(((E) this.b).a, (SentryAndroidOptions) this.c);
        }
    }
}
