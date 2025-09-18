package defpackage;

import android.net.TrafficStats;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class WU implements XU {
    public static final Object m = new Object();
    public final MU a;
    public final UU b;
    public final ES1 c;
    public final C0589Hh1 d;
    public final C6697qh0 e;
    public final C3748fJ0 f;
    public final Object g;
    public final ExecutorService h;
    public final ExecutorC5524kY0 i;
    public String j;
    public final HashSet k;
    public final ArrayList l;

    static {
        new AtomicInteger(1);
    }

    public WU(MU mu, InterfaceC3739fG0 interfaceC3739fG0, ExecutorService executorService, ExecutorC5524kY0 executorC5524kY0) {
        mu.a();
        UU uu = new UU(mu.a, interfaceC3739fG0);
        ES1 es1 = new ES1(17, mu);
        if (OL0.h == null) {
            OL0.h = new OL0(21);
        }
        OL0 ol0 = OL0.h;
        if (C0589Hh1.d == null) {
            C0589Hh1.d = new C0589Hh1(ol0);
        }
        C0589Hh1 c0589Hh1 = C0589Hh1.d;
        C6697qh0 c6697qh0 = new C6697qh0(new C0863Kv(2, mu));
        C3748fJ0 c3748fJ0 = new C3748fJ0();
        this.g = new Object();
        this.k = new HashSet();
        this.l = new ArrayList();
        this.a = mu;
        this.b = uu;
        this.c = es1;
        this.d = c0589Hh1;
        this.e = c6697qh0;
        this.f = c3748fJ0;
        this.h = executorService;
        this.i = executorC5524kY0;
    }

    public final void a(D41 d41) {
        synchronized (this.g) {
            this.l.add(d41);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void b() {
        C5541ke c5541keI;
        synchronized (m) {
            try {
                MU mu = this.a;
                mu.a();
                CC0 cc0H0 = CC0.H0(mu.a);
                try {
                    c5541keI = this.c.I();
                    int i = c5541keI.b;
                    boolean z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                    if (z) {
                        String strH = h(c5541keI);
                        ES1 es1 = this.c;
                        C5350je c5350jeA = c5541keI.a();
                        c5350jeA.c = strH;
                        c5350jeA.b = 3;
                        c5541keI = c5350jeA.i();
                        es1.A(c5541keI);
                    }
                    if (cc0H0 != null) {
                        cc0H0.k1();
                    }
                } catch (Throwable th) {
                    if (cc0H0 != null) {
                        cc0H0.k1();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k(c5541keI);
        this.i.execute(new VU(this, 2));
    }

    public final C5541ke c(C5541ke c5541ke) throws YU {
        int responseCode;
        C1435Se c1435SeF;
        MU mu = this.a;
        mu.a();
        String str = mu.c.a;
        mu.a();
        String str2 = mu.c.g;
        String str3 = c5541ke.d;
        UU uu = this.b;
        CR0 cr0 = uu.c;
        if (!cr0.b()) {
            throw new YU("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = UU.a("projects/" + str2 + "/installations/" + c5541ke.a + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = uu.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str3);
                    httpURLConnectionC.setDoOutput(true);
                    UU.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    cr0.d(responseCode);
                } catch (Throwable th) {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                c1435SeF = UU.f(httpURLConnectionC);
            } else {
                UU.b(httpURLConnectionC, null, str, str2);
                if (responseCode == 401 || responseCode == 404) {
                    VY vyA = C1435Se.a();
                    vyA.b = 3;
                    c1435SeF = vyA.j();
                } else {
                    if (responseCode == 429) {
                        throw new YU("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        VY vyA2 = C1435Se.a();
                        vyA2.b = 2;
                        c1435SeF = vyA2.j();
                    }
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            httpURLConnectionC.disconnect();
            TrafficStats.clearThreadStatsTag();
            int iX = AbstractC8235ym.x(c1435SeF.c);
            if (iX == 0) {
                C0589Hh1 c0589Hh1 = this.d;
                c0589Hh1.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c0589Hh1.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                C5350je c5350jeA = c5541ke.a();
                c5350jeA.d = c1435SeF.a;
                c5350jeA.g = Long.valueOf(c1435SeF.b);
                c5350jeA.h = Long.valueOf(seconds);
                return c5350jeA.i();
            }
            if (iX == 1) {
                C5350je c5350jeA2 = c5541ke.a();
                c5350jeA2.f = "BAD CONFIG";
                c5350jeA2.b = 5;
                return c5350jeA2.i();
            }
            if (iX != 2) {
                throw new YU("Firebase Installations Service is unavailable. Please try again later.");
            }
            l(null);
            C5350je c5350jeA3 = c5541ke.a();
            c5350jeA3.b = 2;
            return c5350jeA3.i();
        }
        throw new YU("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final C3892g32 d() {
        String str;
        g();
        synchronized (this) {
            str = this.j;
        }
        if (str != null) {
            return AbstractC3782fU1.e(str);
        }
        S81 s81 = new S81();
        a(new X00(s81));
        C3892g32 c3892g32 = s81.a;
        this.h.execute(new VU(this, 0));
        return c3892g32;
    }

    public final C3892g32 e() {
        g();
        S81 s81 = new S81();
        a(new W00(this.d, s81));
        this.h.execute(new VU(this, 1));
        return s81.a;
    }

    /* JADX WARN: Finally extract failed */
    public final void f(C5541ke c5541ke) {
        synchronized (m) {
            try {
                MU mu = this.a;
                mu.a();
                CC0 cc0H0 = CC0.H0(mu.a);
                try {
                    this.c.A(c5541ke);
                    if (cc0H0 != null) {
                        cc0H0.k1();
                    }
                } catch (Throwable th) {
                    if (cc0H0 != null) {
                        cc0H0.k1();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void g() {
        MU mu = this.a;
        mu.a();
        Preconditions.checkNotEmpty(mu.c.b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        mu.a();
        Preconditions.checkNotEmpty(mu.c.g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        mu.a();
        Preconditions.checkNotEmpty(mu.c.a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        mu.a();
        String str = mu.c.b;
        Pattern pattern = C0589Hh1.c;
        Preconditions.checkArgument(str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        mu.a();
        Preconditions.checkArgument(C0589Hh1.c.matcher(mu.c.a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String h(defpackage.C5541ke r3) {
        /*
            r2 = this;
            MU r0 = r2.a
            r0.a()
            java.lang.String r0 = r0.b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            MU r0 = r2.a
            r0.a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4f
        L1e:
            r0 = 1
            int r3 = r3.b
            if (r3 != r0) goto L4f
            qh0 r3 = r2.e
            java.lang.Object r3 = r3.get()
            a60 r3 = (defpackage.C2071a60) r3
            android.content.SharedPreferences r0 = r3.a
            monitor-enter(r0)
            java.lang.String r1 = r3.a()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r3 = move-exception
            goto L4d
        L38:
            java.lang.String r1 = r3.b()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L4c
            fJ0 r3 = r2.f
            r3.getClass()
            java.lang.String r1 = defpackage.C3748fJ0.a()
        L4c:
            return r1
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
        L4f:
            fJ0 r3 = r2.f
            r3.getClass()
            java.lang.String r3 = defpackage.C3748fJ0.a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.WU.h(ke):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [UU] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [Rd] */
    public final C5541ke i(C5541ke c5541ke) throws YU {
        int responseCode;
        String str = c5541ke.a;
        String string = null;
        if (str != null && str.length() == 11) {
            C2071a60 c2071a60 = (C2071a60) this.e.get();
            synchronized (c2071a60.a) {
                try {
                    String[] strArr = C2071a60.c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str2 = strArr[i];
                            String string2 = c2071a60.a.getString("|T|" + c2071a60.b + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        UU uu = this.b;
        MU mu = this.a;
        mu.a();
        String str3 = mu.c.a;
        String str4 = c5541ke.a;
        MU mu2 = this.a;
        mu2.a();
        String str5 = mu2.c.g;
        MU mu3 = this.a;
        mu3.a();
        String str6 = mu3.c.b;
        CR0 cr0 = uu.c;
        if (!cr0.b()) {
            throw new YU("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = UU.a("projects/" + str5 + "/installations");
        int i2 = 0;
        C1354Rd c1354Rd = uu;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = c1354Rd.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    UU.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    cr0.d(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    C1354Rd c1354RdE = UU.e(httpURLConnectionC);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c1354Rd = c1354RdE;
                } else {
                    try {
                        UU.b(httpURLConnectionC, str6, str3, str5);
                    } catch (IOException | AssertionError unused3) {
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i2++;
                        c1354Rd = c1354Rd;
                    }
                    if (responseCode == 429) {
                        throw new YU("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        C1354Rd c1354Rd2 = new C1354Rd(null, null, null, null, 2);
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c1354Rd = c1354Rd2;
                    } else {
                        httpURLConnectionC.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i2++;
                        c1354Rd = c1354Rd;
                    }
                }
                int iX = AbstractC8235ym.x(c1354Rd.e);
                if (iX != 0) {
                    if (iX != 1) {
                        throw new YU("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    C5350je c5350jeA = c5541ke.a();
                    c5350jeA.f = "BAD CONFIG";
                    c5350jeA.b = 5;
                    return c5350jeA.i();
                }
                String str7 = c1354Rd.b;
                String str8 = c1354Rd.c;
                C0589Hh1 c0589Hh1 = this.d;
                c0589Hh1.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c0589Hh1.a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                C1435Se c1435Se = c1354Rd.d;
                String str9 = c1435Se.a;
                long j = c1435Se.b;
                C5350je c5350jeA2 = c5541ke.a();
                c5350jeA2.c = str7;
                c5350jeA2.b = 4;
                c5350jeA2.d = str9;
                c5350jeA2.e = str8;
                c5350jeA2.g = Long.valueOf(j);
                c5350jeA2.h = Long.valueOf(seconds);
                return c5350jeA2.i();
            } finally {
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new YU("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void j(Exception exc) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((D41) it.next()).a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k(C5541ke c5541ke) {
        synchronized (this.g) {
            try {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    if (((D41) it.next()).b(c5541ke)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void l(String str) {
        this.j = str;
    }

    public final synchronized void m(C5541ke c5541ke, C5541ke c5541ke2) {
        try {
            if (this.k.size() != 0 && !TextUtils.equals(c5541ke.a, c5541ke2.a)) {
                Iterator it = this.k.iterator();
                if (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                    throw null;
                }
            }
        } finally {
        }
    }
}
