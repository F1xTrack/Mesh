package p000;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: Iw */
/* loaded from: classes.dex */
public final class C0563Iw {

    /* renamed from: p */
    public static final int[] f5208p = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: q */
    public static final Pattern f5209q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    public final LinkedHashSet f5210a;

    /* renamed from: c */
    public int f5212c;

    /* renamed from: f */
    public final ScheduledExecutorService f5215f;

    /* renamed from: g */
    public final C0248Dw f5216g;

    /* renamed from: h */
    public final C0786MU f5217h;

    /* renamed from: i */
    public final InterfaceC1478XU f5218i;

    /* renamed from: j */
    public final C7169xw f5219j;

    /* renamed from: k */
    public final Context f5220k;

    /* renamed from: l */
    public final String f5221l;

    /* renamed from: o */
    public final C0877Nw f5224o;

    /* renamed from: b */
    public boolean f5211b = false;

    /* renamed from: m */
    public final Random f5222m = new Random();

    /* renamed from: n */
    public final Clock f5223n = DefaultClock.getInstance();

    /* renamed from: d */
    public boolean f5213d = false;

    /* renamed from: e */
    public boolean f5214e = false;

    public C0563Iw(C0786MU c0786mu, InterfaceC1478XU interfaceC1478XU, C0248Dw c0248Dw, C7169xw c7169xw, Context context, String str, LinkedHashSet linkedHashSet, C0877Nw c0877Nw, ScheduledExecutorService scheduledExecutorService) {
        this.f5210a = linkedHashSet;
        this.f5215f = scheduledExecutorService;
        this.f5212c = Math.max(8 - c0877Nw.m5909c().f7406a, 1);
        this.f5217h = c0786mu;
        this.f5216g = c0248Dw;
        this.f5218i = interfaceC1478XU;
        this.f5219j = c7169xw;
        this.f5220k = context;
        this.f5221l = str;
        this.f5224o = c0877Nw;
    }

    /* renamed from: b */
    public static void m4074b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public static boolean m4075d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* renamed from: f */
    public static String m4076f(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0019  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean m4077a() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashSet r0 = r1.f5210a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f5211b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f5213d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.f5214e     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            r0 = 1
            goto L1a
        L17:
            r0 = move-exception
            goto L1c
        L19:
            r0 = 0
        L1a:
            monitor-exit(r1)
            return r0
        L1c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0563Iw.m4077a():boolean");
    }

    /* renamed from: c */
    public final String m4078c(String str) {
        C0786MU c0786mu = this.f5217h;
        c0786mu.m5379a();
        Matcher matcher = f5209q.matcher(c0786mu.f7176c.f27219b);
        return AbstractC11153tN0.m24912x("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    /* renamed from: e */
    public final synchronized void m4079e(long j) {
        try {
            if (m4077a()) {
                int i = this.f5212c;
                if (i > 0) {
                    this.f5212c = i - 1;
                    this.f5215f.schedule(new GR0(9, this), j, TimeUnit.MILLISECONDS);
                } else if (!this.f5214e) {
                    m4080g(new C6684qV("Unable to connect to the server. Check your connection and try again.", 2));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* renamed from: g */
    public final synchronized void m4080g(C6747rV c6747rV) {
        Iterator it = this.f5210a.iterator();
        while (it.hasNext()) {
            ((C0500Hw) it.next()).m3651a(c6747rV);
        }
    }

    /* renamed from: h */
    public final synchronized void m4081h() {
        m4079e(Math.max(0L, this.f5224o.m5909c().f7407b.getTime() - new Date(this.f5223n.currentTimeMillis()).getTime()));
    }

    /* renamed from: i */
    public final synchronized void m4082i(boolean z) {
        this.f5211b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m4083j(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            MU r9 = r6.f5217h
            r9.m5379a()
            fV r0 = r9.f7176c
            java.lang.String r1 = r0.f27218a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.f5220k
            java.lang.String r2 = r1.getPackageName()
            java.lang.String r3 = "X-Android-Package"
            r7.setRequestProperty(r3, r2)
            r2 = 0
            java.lang.String r3 = r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            byte[] r3 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            if (r3 != 0) goto L33
            r1.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
        L31:
            r1 = r2
            goto L3d
        L33:
            r4 = 0
            java.lang.String r1 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(r3, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L39
            goto L3d
        L39:
            r1.getPackageName()
            goto L31
        L3d:
            java.lang.String r3 = "X-Android-Cert"
            r7.setRequestProperty(r3, r1)
            java.lang.String r1 = "X-Google-GFE-Can-Retry"
            java.lang.String r3 = "yes"
            r7.setRequestProperty(r1, r3)
            java.lang.String r1 = "X-Accept-Response-Streaming"
            java.lang.String r3 = "true"
            r7.setRequestProperty(r1, r3)
            java.lang.String r1 = "Content-Type"
            java.lang.String r3 = "application/json"
            r7.setRequestProperty(r1, r3)
            java.lang.String r1 = "Accept"
            r7.setRequestProperty(r1, r3)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r9.m5379a()
            java.lang.String r3 = r0.f27219b
            java.util.regex.Pattern r4 = p000.C0563Iw.f5209q
            java.util.regex.Matcher r3 = r4.matcher(r3)
            boolean r4 = r3.matches()
            if (r4 == 0) goto L77
            r2 = 1
            java.lang.String r2 = r3.group(r2)
        L77:
            java.lang.String r3 = "project"
            r1.put(r3, r2)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.f5221l
            r1.put(r2, r3)
            Dw r2 = r6.f5216g
            Nw r2 = r2.f2320h
            android.content.SharedPreferences r2 = r2.f8136a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.m5379a()
            java.lang.String r9 = "appId"
            java.lang.String r0 = r0.f27219b
            r1.put(r9, r0)
            java.lang.String r9 = "sdkVersion"
            java.lang.String r0 = "22.1.0"
            r1.put(r9, r0)
            java.lang.String r9 = "appInstanceId"
            r1.put(r9, r8)
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream
            java.io.OutputStream r7 = r7.getOutputStream()
            r9.<init>(r7)
            r9.write(r8)
            r9.flush()
            r9.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0563Iw.m4083j(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    /* renamed from: k */
    public final synchronized C10030kb1 m4084k(HttpURLConnection httpURLConnection) {
        return new C10030kb1(httpURLConnection, this.f5216g, this.f5219j, this.f5210a, new C0500Hw(0, this), this.f5215f);
    }

    /* renamed from: l */
    public final void m4085l(Date date) {
        C0877Nw c0877Nw = this.f5224o;
        int i = c0877Nw.m5909c().f7406a + 1;
        c0877Nw.m5912f(i, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(f5208p[(i < 8 ? i : 8) - 1]) / 2) + this.f5222m.nextInt((int) r2)));
    }
}
