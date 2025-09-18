package p000;

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

/* renamed from: WU */
/* loaded from: classes.dex */
public final class C1415WU implements InterfaceC1478XU {

    /* renamed from: m */
    public static final Object f13201m = new Object();

    /* renamed from: a */
    public final C0786MU f13202a;

    /* renamed from: b */
    public final C1289UU f13203b;

    /* renamed from: c */
    public final ES1 f13204c;

    /* renamed from: d */
    public final C7693Hh1 f13205d;

    /* renamed from: e */
    public final C10809qh0 f13206e;

    /* renamed from: f */
    public final C9353fJ0 f13207f;

    /* renamed from: g */
    public final Object f13208g;

    /* renamed from: h */
    public final ExecutorService f13209h;

    /* renamed from: i */
    public final ExecutorC10023kY0 f13210i;

    /* renamed from: j */
    public String f13211j;

    /* renamed from: k */
    public final HashSet f13212k;

    /* renamed from: l */
    public final ArrayList f13213l;

    static {
        new AtomicInteger(1);
    }

    public C1415WU(C0786MU c0786mu, InterfaceC9347fG0 interfaceC9347fG0, ExecutorService executorService, ExecutorC10023kY0 executorC10023kY0) {
        c0786mu.m5379a();
        C1289UU c1289uu = new C1289UU(c0786mu.f7174a, interfaceC9347fG0);
        ES1 es1 = new ES1(17, c0786mu);
        if (OL0.f8373h == null) {
            OL0.f8373h = new OL0(21);
        }
        OL0 ol0 = OL0.f8373h;
        if (C7693Hh1.f4440d == null) {
            C7693Hh1.f4440d = new C7693Hh1(ol0);
        }
        C7693Hh1 c7693Hh1 = C7693Hh1.f4440d;
        C10809qh0 c10809qh0 = new C10809qh0(new C0688Kv(2, c0786mu));
        C9353fJ0 c9353fJ0 = new C9353fJ0();
        this.f13208g = new Object();
        this.f13212k = new HashSet();
        this.f13213l = new ArrayList();
        this.f13202a = c0786mu;
        this.f13203b = c1289uu;
        this.f13204c = es1;
        this.f13205d = c7693Hh1;
        this.f13206e = c10809qh0;
        this.f13207f = c9353fJ0;
        this.f13209h = executorService;
        this.f13210i = executorC10023kY0;
    }

    /* renamed from: a */
    public final void m8786a(D41 d41) {
        synchronized (this.f13208g) {
            this.f13213l.add(d41);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: b */
    public final void m8787b() {
        C6313ke c6313keM2287I;
        synchronized (f13201m) {
            try {
                C0786MU c0786mu = this.f13202a;
                c0786mu.m5379a();
                CC0 cc0M1004H0 = CC0.m1004H0(c0786mu.f7174a);
                try {
                    c6313keM2287I = this.f13204c.m2287I();
                    int i = c6313keM2287I.f36583b;
                    boolean z = true;
                    if (i != 2 && i != 1) {
                        z = false;
                    }
                    if (z) {
                        String strM8793h = m8793h(c6313keM2287I);
                        ES1 es1 = this.f13204c;
                        C6250je c6250jeM22225a = c6313keM2287I.m22225a();
                        c6250jeM22225a.f35298c = strM8793h;
                        c6250jeM22225a.f35297b = 3;
                        c6313keM2287I = c6250jeM22225a.m22079i();
                        es1.m2280A(c6313keM2287I);
                    }
                    if (cc0M1004H0 != null) {
                        cc0M1004H0.m1085k1();
                    }
                } catch (Throwable th) {
                    if (cc0M1004H0 != null) {
                        cc0M1004H0.m1085k1();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        m8796k(c6313keM2287I);
        this.f13210i.execute(new RunnableC1352VU(this, 2));
    }

    /* renamed from: c */
    public final C6313ke m8788c(C6313ke c6313ke) throws C1541YU {
        int responseCode;
        C1173Se c1173SeM8071f;
        C0786MU c0786mu = this.f13202a;
        c0786mu.m5379a();
        String str = c0786mu.f7176c.f27218a;
        c0786mu.m5379a();
        String str2 = c0786mu.f7176c.f27224g;
        String str3 = c6313ke.f36585d;
        C1289UU c1289uu = this.f13203b;
        CR0 cr0 = c1289uu.f11809c;
        if (!cr0.m1184b()) {
            throw new C1541YU("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM8067a = C1289UU.m8067a("projects/" + str2 + "/installations/" + c6313ke.f36582a + "/authTokens:generate");
        for (int i = 0; i <= 1; i++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionM8075c = c1289uu.m8075c(urlM8067a, str);
            try {
                try {
                    httpURLConnectionM8075c.setRequestMethod("POST");
                    httpURLConnectionM8075c.addRequestProperty("Authorization", "FIS_v2 " + str3);
                    httpURLConnectionM8075c.setDoOutput(true);
                    C1289UU.m8073h(httpURLConnectionM8075c);
                    responseCode = httpURLConnectionM8075c.getResponseCode();
                    cr0.m1186d(responseCode);
                } catch (Throwable th) {
                    httpURLConnectionM8075c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                c1173SeM8071f = C1289UU.m8071f(httpURLConnectionM8075c);
            } else {
                C1289UU.m8068b(httpURLConnectionM8075c, null, str, str2);
                if (responseCode == 401 || responseCode == 404) {
                    C1356VY c1356vyM7401a = C1173Se.m7401a();
                    c1356vyM7401a.f12611b = 3;
                    c1173SeM8071f = c1356vyM7401a.m8501j();
                } else {
                    if (responseCode == 429) {
                        throw new C1541YU("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        C1356VY c1356vyM7401a2 = C1173Se.m7401a();
                        c1356vyM7401a2.f12611b = 2;
                        c1173SeM8071f = c1356vyM7401a2.m8501j();
                    }
                    httpURLConnectionM8075c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            }
            httpURLConnectionM8075c.disconnect();
            TrafficStats.clearThreadStatsTag();
            int iM26247x = AbstractC7222ym.m26247x(c1173SeM8071f.f10886c);
            if (iM26247x == 0) {
                C7693Hh1 c7693Hh1 = this.f13205d;
                c7693Hh1.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c7693Hh1.f4441a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                C6250je c6250jeM22225a = c6313ke.m22225a();
                c6250jeM22225a.f35299d = c1173SeM8071f.f10884a;
                c6250jeM22225a.f35302g = Long.valueOf(c1173SeM8071f.f10885b);
                c6250jeM22225a.f35303h = Long.valueOf(seconds);
                return c6250jeM22225a.m22079i();
            }
            if (iM26247x == 1) {
                C6250je c6250jeM22225a2 = c6313ke.m22225a();
                c6250jeM22225a2.f35301f = "BAD CONFIG";
                c6250jeM22225a2.f35297b = 5;
                return c6250jeM22225a2.m22079i();
            }
            if (iM26247x != 2) {
                throw new C1541YU("Firebase Installations Service is unavailable. Please try again later.");
            }
            m8797l(null);
            C6250je c6250jeM22225a3 = c6313ke.m22225a();
            c6250jeM22225a3.f35297b = 2;
            return c6250jeM22225a3.m22079i();
        }
        throw new C1541YU("Firebase Installations Service is unavailable. Please try again later.");
    }

    /* renamed from: d */
    public final C9450g32 m8789d() {
        String str;
        m8792g();
        synchronized (this) {
            str = this.f13211j;
        }
        if (str != null) {
            return AbstractC9376fU1.m18244e(str);
        }
        S81 s81 = new S81();
        m8786a(new X00(s81));
        C9450g32 c9450g32 = s81.f10598a;
        this.f13209h.execute(new RunnableC1352VU(this, 0));
        return c9450g32;
    }

    /* renamed from: e */
    public final C9450g32 m8790e() {
        m8792g();
        S81 s81 = new S81();
        m8786a(new W00(this.f13205d, s81));
        this.f13209h.execute(new RunnableC1352VU(this, 1));
        return s81.f10598a;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: f */
    public final void m8791f(C6313ke c6313ke) {
        synchronized (f13201m) {
            try {
                C0786MU c0786mu = this.f13202a;
                c0786mu.m5379a();
                CC0 cc0M1004H0 = CC0.m1004H0(c0786mu.f7174a);
                try {
                    this.f13204c.m2280A(c6313ke);
                    if (cc0M1004H0 != null) {
                        cc0M1004H0.m1085k1();
                    }
                } catch (Throwable th) {
                    if (cc0M1004H0 != null) {
                        cc0M1004H0.m1085k1();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: g */
    public final void m8792g() {
        C0786MU c0786mu = this.f13202a;
        c0786mu.m5379a();
        Preconditions.checkNotEmpty(c0786mu.f7176c.f27219b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c0786mu.m5379a();
        Preconditions.checkNotEmpty(c0786mu.f7176c.f27224g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c0786mu.m5379a();
        Preconditions.checkNotEmpty(c0786mu.f7176c.f27218a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c0786mu.m5379a();
        String str = c0786mu.f7176c.f27219b;
        Pattern pattern = C7693Hh1.f4439c;
        Preconditions.checkArgument(str.contains(StringUtils.PROCESS_POSTFIX_DELIMITER), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        c0786mu.m5379a();
        Preconditions.checkArgument(C7693Hh1.f4439c.matcher(c0786mu.f7176c.f27218a).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x001e  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m8793h(p000.C6313ke r3) {
        /*
            r2 = this;
            MU r0 = r2.f13202a
            r0.m5379a()
            java.lang.String r0 = r0.f7175b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            MU r0 = r2.f13202a
            r0.m5379a()
            java.lang.String r1 = "[DEFAULT]"
            java.lang.String r0 = r0.f7175b
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L4f
        L1e:
            r0 = 1
            int r3 = r3.f36583b
            if (r3 != r0) goto L4f
            qh0 r3 = r2.f13206e
            java.lang.Object r3 = r3.get()
            a60 r3 = (p000.C8682a60) r3
            android.content.SharedPreferences r0 = r3.f15311a
            monitor-enter(r0)
            java.lang.String r1 = r3.m9672a()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            goto L3d
        L36:
            r3 = move-exception
            goto L4d
        L38:
            java.lang.String r1 = r3.m9673b()     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
        L3d:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L4c
            fJ0 r3 = r2.f13207f
            r3.getClass()
            java.lang.String r1 = p000.C9353fJ0.m18200a()
        L4c:
            return r1
        L4d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
        L4f:
            fJ0 r3 = r2.f13207f
            r3.getClass()
            java.lang.String r3 = p000.C9353fJ0.m18200a()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1415WU.m8793h(ke):java.lang.String");
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
    /* renamed from: i */
    public final C6313ke m8794i(C6313ke c6313ke) throws C1541YU {
        int responseCode;
        String str = c6313ke.f36582a;
        String string = null;
        if (str != null && str.length() == 11) {
            C8682a60 c8682a60 = (C8682a60) this.f13206e.get();
            synchronized (c8682a60.f15311a) {
                try {
                    String[] strArr = C8682a60.f15310c;
                    int i = 0;
                    while (true) {
                        if (i < 4) {
                            String str2 = strArr[i];
                            String string2 = c8682a60.f15311a.getString("|T|" + c8682a60.f15312b + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + str2, null);
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
        C1289UU c1289uu = this.f13203b;
        C0786MU c0786mu = this.f13202a;
        c0786mu.m5379a();
        String str3 = c0786mu.f7176c.f27218a;
        String str4 = c6313ke.f36582a;
        C0786MU c0786mu2 = this.f13202a;
        c0786mu2.m5379a();
        String str5 = c0786mu2.f7176c.f27224g;
        C0786MU c0786mu3 = this.f13202a;
        c0786mu3.m5379a();
        String str6 = c0786mu3.f7176c.f27219b;
        CR0 cr0 = c1289uu.f11809c;
        if (!cr0.m1184b()) {
            throw new C1541YU("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlM8067a = C1289UU.m8067a("projects/" + str5 + "/installations");
        int i2 = 0;
        C1109Rd c1109Rd = c1289uu;
        while (i2 <= 1) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionM8075c = c1109Rd.m8075c(urlM8067a, str3);
            try {
                try {
                    httpURLConnectionM8075c.setRequestMethod("POST");
                    httpURLConnectionM8075c.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionM8075c.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    C1289UU.m8072g(httpURLConnectionM8075c, str4, str6);
                    responseCode = httpURLConnectionM8075c.getResponseCode();
                    cr0.m1186d(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    C1109Rd c1109RdM8070e = C1289UU.m8070e(httpURLConnectionM8075c);
                    httpURLConnectionM8075c.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    c1109Rd = c1109RdM8070e;
                } else {
                    try {
                        C1289UU.m8068b(httpURLConnectionM8075c, str6, str3, str5);
                    } catch (IOException | AssertionError unused3) {
                        httpURLConnectionM8075c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i2++;
                        c1109Rd = c1109Rd;
                    }
                    if (responseCode == 429) {
                        throw new C1541YU("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        C1109Rd c1109Rd2 = new C1109Rd(null, null, null, null, 2);
                        httpURLConnectionM8075c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        c1109Rd = c1109Rd2;
                    } else {
                        httpURLConnectionM8075c.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        i2++;
                        c1109Rd = c1109Rd;
                    }
                }
                int iM26247x = AbstractC7222ym.m26247x(c1109Rd.f10342e);
                if (iM26247x != 0) {
                    if (iM26247x != 1) {
                        throw new C1541YU("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    C6250je c6250jeM22225a = c6313ke.m22225a();
                    c6250jeM22225a.f35301f = "BAD CONFIG";
                    c6250jeM22225a.f35297b = 5;
                    return c6250jeM22225a.m22079i();
                }
                String str7 = c1109Rd.f10339b;
                String str8 = c1109Rd.f10340c;
                C7693Hh1 c7693Hh1 = this.f13205d;
                c7693Hh1.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                c7693Hh1.f4441a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                C1173Se c1173Se = c1109Rd.f10341d;
                String str9 = c1173Se.f10884a;
                long j = c1173Se.f10885b;
                C6250je c6250jeM22225a2 = c6313ke.m22225a();
                c6250jeM22225a2.f35298c = str7;
                c6250jeM22225a2.f35297b = 4;
                c6250jeM22225a2.f35299d = str9;
                c6250jeM22225a2.f35300e = str8;
                c6250jeM22225a2.f35302g = Long.valueOf(j);
                c6250jeM22225a2.f35303h = Long.valueOf(seconds);
                return c6250jeM22225a2.m22079i();
            } finally {
                httpURLConnectionM8075c.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new C1541YU("Firebase Installations Service is unavailable. Please try again later.");
    }

    /* renamed from: j */
    public final void m8795j(Exception exc) {
        synchronized (this.f13208g) {
            try {
                Iterator it = this.f13213l.iterator();
                while (it.hasNext()) {
                    if (((D41) it.next()).mo1537a(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: k */
    public final void m8796k(C6313ke c6313ke) {
        synchronized (this.f13208g) {
            try {
                Iterator it = this.f13213l.iterator();
                while (it.hasNext()) {
                    if (((D41) it.next()).mo1538b(c6313ke)) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: l */
    public final synchronized void m8797l(String str) {
        this.f13211j = str;
    }

    /* renamed from: m */
    public final synchronized void m8798m(C6313ke c6313ke, C6313ke c6313ke2) {
        try {
            if (this.f13212k.size() != 0 && !TextUtils.equals(c6313ke.f36582a, c6313ke2.f36582a)) {
                Iterator it = this.f13212k.iterator();
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
