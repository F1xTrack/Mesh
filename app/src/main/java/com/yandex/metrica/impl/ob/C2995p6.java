package com.yandex.metrica.impl.ob;

import android.os.SystemClock;
import android.text.TextUtils;
import defpackage.AbstractC7209tN0;
import defpackage.AbstractC8235ym;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.p6 */
/* loaded from: classes2.dex */
public class C2995p6 {
    private final C2744f4 a;
    private final InterfaceC3199x6 b;
    private final C3044r6 c;
    private long d;
    private long e;
    private AtomicLong f;
    private boolean g;
    private volatile a h;
    private long i;
    private long j;
    private Nm k;

    /* renamed from: com.yandex.metrica.impl.ob.p6$a */
    public static class a {
        private final String a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;
        private final int f;
        private final int g;

        public a(JSONObject jSONObject) {
            this.a = jSONObject.optString("analyticsSdkVersionName", null);
            this.b = jSONObject.optString("kitBuildNumber", null);
            this.c = jSONObject.optString("appVer", null);
            this.d = jSONObject.optString("appBuild", null);
            this.e = jSONObject.optString("osVer", null);
            this.f = jSONObject.optInt("osApiLev", -1);
            this.g = jSONObject.optInt("attribution_id", 0);
        }

        public boolean a(C2856jh c2856jh) {
            c2856jh.getClass();
            return TextUtils.equals("5.0.0", this.a) && TextUtils.equals("45001354", this.b) && TextUtils.equals(c2856jh.f(), this.c) && TextUtils.equals(c2856jh.b(), this.d) && TextUtils.equals(c2856jh.p(), this.e) && this.f == c2856jh.o() && this.g == c2856jh.D();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SessionRequestParams{mKitVersionName='");
            sb.append(this.a);
            sb.append("', mKitBuildNumber='");
            sb.append(this.b);
            sb.append("', mAppVersion='");
            sb.append(this.c);
            sb.append("', mAppBuild='");
            sb.append(this.d);
            sb.append("', mOsVersion='");
            sb.append(this.e);
            sb.append("', mApiLevel=");
            sb.append(this.f);
            sb.append(", mAttributionId=");
            return AbstractC8235ym.l(sb, this.g, '}');
        }
    }

    public C2995p6(C2744f4 c2744f4, InterfaceC3199x6 interfaceC3199x6, C3044r6 c3044r6, Nm nm) {
        this.a = c2744f4;
        this.b = interfaceC3199x6;
        this.c = c3044r6;
        this.k = nm;
        g();
    }

    private void g() {
        C3044r6 c3044r6 = this.c;
        this.k.getClass();
        this.e = c3044r6.a(SystemClock.elapsedRealtime());
        this.d = this.c.c(-1L);
        this.f = new AtomicLong(this.c.b(0L));
        this.g = this.c.a(true);
        long jE = this.c.e(0L);
        this.i = jE;
        this.j = this.c.d(jE - this.e);
    }

    public long a(long j) {
        InterfaceC3199x6 interfaceC3199x6 = this.b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j - this.e);
        this.j = seconds;
        ((C3224y6) interfaceC3199x6).b(seconds);
        return this.j;
    }

    public long b() {
        return Math.max(this.i - TimeUnit.MILLISECONDS.toSeconds(this.e), this.j);
    }

    public long c() {
        return this.d;
    }

    public long d() {
        return this.j;
    }

    public long e() {
        long andIncrement = this.f.getAndIncrement();
        ((C3224y6) this.b).c(this.f.get()).b();
        return andIncrement;
    }

    public EnumC3249z6 f() {
        return this.c.a();
    }

    public boolean h() {
        return this.g && this.d > 0;
    }

    public synchronized void i() {
        ((C3224y6) this.b).a();
        this.h = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Session{mId=");
        sb.append(this.d);
        sb.append(", mInitTime=");
        sb.append(this.e);
        sb.append(", mCurrentReportId=");
        sb.append(this.f);
        sb.append(", mSessionRequestParams=");
        sb.append(this.h);
        sb.append(", mSleepStartSeconds=");
        return AbstractC7209tN0.y(sb, this.i, '}');
    }

    public boolean b(long j) {
        boolean z = this.d >= 0;
        boolean zA = a();
        this.k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return z && zA && !(((timeUnit.toSeconds(jElapsedRealtime) > j2 ? 1 : (timeUnit.toSeconds(jElapsedRealtime) == j2 ? 0 : -1)) < 0) || ((timeUnit.toSeconds(j) - j2) > ((long) this.c.a(this.a.m().O())) ? 1 : ((timeUnit.toSeconds(j) - j2) == ((long) this.c.a(this.a.m().O())) ? 0 : -1)) >= 0 || (timeUnit.toSeconds(j - this.e) > C3069s6.b ? 1 : (timeUnit.toSeconds(j - this.e) == C3069s6.b ? 0 : -1)) >= 0);
    }

    public void c(long j) {
        InterfaceC3199x6 interfaceC3199x6 = this.b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        this.i = seconds;
        ((C3224y6) interfaceC3199x6).e(seconds).b();
    }

    public void a(boolean z) {
        if (this.g != z) {
            this.g = z;
            ((C3224y6) this.b).a(z).b();
        }
    }

    private boolean a() {
        if (this.h == null) {
            synchronized (this) {
                if (this.h == null) {
                    try {
                        String asString = this.a.i().a(this.d, this.c.a()).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            this.h = new a(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        a aVar = this.h;
        if (aVar != null) {
            return aVar.a(this.a.m());
        }
        return false;
    }
}
