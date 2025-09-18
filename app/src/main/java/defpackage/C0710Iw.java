package defpackage;

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
public final class C0710Iw {
    public static final int[] p = {2, 4, 8, 16, 32, 64, 128, 256};
    public static final Pattern q = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final LinkedHashSet a;
    public int c;
    public final ScheduledExecutorService f;
    public final C0320Dw g;
    public final MU h;
    public final XU i;
    public final C8075xw j;
    public final Context k;
    public final String l;
    public final C1099Nw o;
    public boolean b = false;
    public final Random m = new Random();
    public final Clock n = DefaultClock.getInstance();
    public boolean d = false;
    public boolean e = false;

    public C0710Iw(MU mu, XU xu, C0320Dw c0320Dw, C8075xw c8075xw, Context context, String str, LinkedHashSet linkedHashSet, C1099Nw c1099Nw, ScheduledExecutorService scheduledExecutorService) {
        this.a = linkedHashSet;
        this.f = scheduledExecutorService;
        this.c = Math.max(8 - c1099Nw.c().a, 1);
        this.h = mu;
        this.g = c0320Dw;
        this.i = xu;
        this.j = c8075xw;
        this.k = context;
        this.l = str;
        this.o = c1099Nw;
    }

    public static void b(HttpURLConnection httpURLConnection) {
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

    public static boolean d(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    public static String f(InputStream inputStream) {
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashSet r0 = r1.a     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.b     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.d     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L19
            boolean r0 = r1.e     // Catch: java.lang.Throwable -> L17
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0710Iw.a():boolean");
    }

    public final String c(String str) {
        MU mu = this.h;
        mu.a();
        Matcher matcher = q.matcher(mu.c.b);
        return AbstractC7209tN0.x("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/", matcher.matches() ? matcher.group(1) : null, "/namespaces/", str, ":streamFetchInvalidations");
    }

    public final synchronized void e(long j) {
        try {
            if (a()) {
                int i = this.c;
                if (i > 0) {
                    this.c = i - 1;
                    this.f.schedule(new GR0(9, this), j, TimeUnit.MILLISECONDS);
                } else if (!this.e) {
                    g(new C6660qV("Unable to connect to the server. Check your connection and try again.", 2));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void g(C6850rV c6850rV) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((C0632Hw) it.next()).a(c6850rV);
        }
    }

    public final synchronized void h() {
        e(Math.max(0L, this.o.c().b.getTime() - new Date(this.n.currentTimeMillis()).getTime()));
    }

    public final synchronized void i(boolean z) {
        this.b = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "POST"
            r7.setRequestMethod(r0)
            java.lang.String r0 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r0, r9)
            MU r9 = r6.h
            r9.a()
            fV r0 = r9.c
            java.lang.String r1 = r0.a
            java.lang.String r2 = "X-Goog-Api-Key"
            r7.setRequestProperty(r2, r1)
            android.content.Context r1 = r6.k
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
            r9.a()
            java.lang.String r3 = r0.b
            java.util.regex.Pattern r4 = defpackage.C0710Iw.q
            java.util.regex.Matcher r3 = r4.matcher(r3)
            boolean r4 = r3.matches()
            if (r4 == 0) goto L77
            r2 = 1
            java.lang.String r2 = r3.group(r2)
        L77:
            java.lang.String r3 = "project"
            r1.put(r3, r2)
            java.lang.String r2 = "namespace"
            java.lang.String r3 = r6.l
            r1.put(r2, r3)
            Dw r2 = r6.g
            Nw r2 = r2.h
            android.content.SharedPreferences r2 = r2.a
            java.lang.String r3 = "last_template_version"
            r4 = 0
            long r2 = r2.getLong(r3, r4)
            java.lang.String r2 = java.lang.Long.toString(r2)
            java.lang.String r3 = "lastKnownVersionNumber"
            r1.put(r3, r2)
            r9.a()
            java.lang.String r9 = "appId"
            java.lang.String r0 = r0.b
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0710Iw.j(java.net.HttpURLConnection, java.lang.String, java.lang.String):void");
    }

    public final synchronized C5534kb1 k(HttpURLConnection httpURLConnection) {
        return new C5534kb1(httpURLConnection, this.g, this.j, this.a, new C0632Hw(0, this), this.f);
    }

    public final void l(Date date) {
        C1099Nw c1099Nw = this.o;
        int i = c1099Nw.c().a + 1;
        c1099Nw.f(i, new Date(date.getTime() + (TimeUnit.MINUTES.toMillis(p[(i < 8 ? i : 8) - 1]) / 2) + this.m.nextInt((int) r2)));
    }
}
