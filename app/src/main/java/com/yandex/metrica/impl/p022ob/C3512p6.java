package com.yandex.metrica.impl.p022ob;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;
import p000.AbstractC11153tN0;
import p000.AbstractC7222ym;

/* renamed from: com.yandex.metrica.impl.ob.p6 */
/* loaded from: classes2.dex */
public class C3512p6 {

    /* renamed from: a */
    private final C3250f4 f24409a;

    /* renamed from: b */
    private final InterfaceC3720x6 f24410b;

    /* renamed from: c */
    private final C3564r6 f24411c;

    /* renamed from: d */
    private long f24412d;

    /* renamed from: e */
    private long f24413e;

    /* renamed from: f */
    private AtomicLong f24414f;

    /* renamed from: g */
    private boolean f24415g;

    /* renamed from: h */
    private volatile a f24416h;

    /* renamed from: i */
    private long f24417i;

    /* renamed from: j */
    private long f24418j;

    /* renamed from: k */
    private C2814Nm f24419k;

    /* renamed from: com.yandex.metrica.impl.ob.p6$a */
    public static class a {

        /* renamed from: a */
        private final String f24420a;

        /* renamed from: b */
        private final String f24421b;

        /* renamed from: c */
        private final String f24422c;

        /* renamed from: d */
        private final String f24423d;

        /* renamed from: e */
        private final String f24424e;

        /* renamed from: f */
        private final int f24425f;

        /* renamed from: g */
        private final int f24426g;

        public a(JSONObject jSONObject) {
            this.f24420a = jSONObject.optString("analyticsSdkVersionName", null);
            this.f24421b = jSONObject.optString("kitBuildNumber", null);
            this.f24422c = jSONObject.optString("appVer", null);
            this.f24423d = jSONObject.optString("appBuild", null);
            this.f24424e = jSONObject.optString("osVer", null);
            this.f24425f = jSONObject.optInt("osApiLev", -1);
            this.f24426g = jSONObject.optInt("attribution_id", 0);
        }

        /* renamed from: a */
        public boolean m16572a(C3367jh c3367jh) {
            c3367jh.getClass();
            return TextUtils.equals("5.0.0", this.f24420a) && TextUtils.equals("45001354", this.f24421b) && TextUtils.equals(c3367jh.m15782f(), this.f24422c) && TextUtils.equals(c3367jh.m15774b(), this.f24423d) && TextUtils.equals(c3367jh.m15792p(), this.f24424e) && this.f24425f == c3367jh.m15791o() && this.f24426g == c3367jh.m16130D();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("SessionRequestParams{mKitVersionName='");
            sb.append(this.f24420a);
            sb.append("', mKitBuildNumber='");
            sb.append(this.f24421b);
            sb.append("', mAppVersion='");
            sb.append(this.f24422c);
            sb.append("', mAppBuild='");
            sb.append(this.f24423d);
            sb.append("', mOsVersion='");
            sb.append(this.f24424e);
            sb.append("', mApiLevel=");
            sb.append(this.f24425f);
            sb.append(", mAttributionId=");
            return AbstractC7222ym.m26235l(sb, this.f24426g, '}');
        }
    }

    public C3512p6(C3250f4 c3250f4, InterfaceC3720x6 interfaceC3720x6, C3564r6 c3564r6, C2814Nm c2814Nm) {
        this.f24409a = c3250f4;
        this.f24410b = interfaceC3720x6;
        this.f24411c = c3564r6;
        this.f24419k = c2814Nm;
        m16560g();
    }

    /* renamed from: g */
    private void m16560g() {
        C3564r6 c3564r6 = this.f24411c;
        this.f24419k.getClass();
        this.f24413e = c3564r6.m16654a(SystemClock.elapsedRealtime());
        this.f24412d = this.f24411c.m16658c(-1L);
        this.f24414f = new AtomicLong(this.f24411c.m16657b(0L));
        this.f24415g = this.f24411c.m16656a(true);
        long jM16660e = this.f24411c.m16660e(0L);
        this.f24417i = jM16660e;
        this.f24418j = this.f24411c.m16659d(jM16660e - this.f24413e);
    }

    /* renamed from: a */
    public long m16561a(long j) {
        InterfaceC3720x6 interfaceC3720x6 = this.f24410b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j - this.f24413e);
        this.f24418j = seconds;
        ((C3746y6) interfaceC3720x6).m17219b(seconds);
        return this.f24418j;
    }

    /* renamed from: b */
    public long m16563b() {
        return Math.max(this.f24417i - TimeUnit.MILLISECONDS.toSeconds(this.f24413e), this.f24418j);
    }

    /* renamed from: c */
    public long m16565c() {
        return this.f24412d;
    }

    /* renamed from: d */
    public long m16567d() {
        return this.f24418j;
    }

    /* renamed from: e */
    public long m16568e() {
        long andIncrement = this.f24414f.getAndIncrement();
        ((C3746y6) this.f24410b).m17221c(this.f24414f.get()).m17220b();
        return andIncrement;
    }

    /* renamed from: f */
    public EnumC3772z6 m16569f() {
        return this.f24411c.m16655a();
    }

    /* renamed from: h */
    public boolean m16570h() {
        return this.f24415g && this.f24412d > 0;
    }

    /* renamed from: i */
    public synchronized void m16571i() {
        ((C3746y6) this.f24410b).m17218a();
        this.f24416h = null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Session{mId=");
        sb.append(this.f24412d);
        sb.append(", mInitTime=");
        sb.append(this.f24413e);
        sb.append(", mCurrentReportId=");
        sb.append(this.f24414f);
        sb.append(", mSessionRequestParams=");
        sb.append(this.f24416h);
        sb.append(", mSleepStartSeconds=");
        return AbstractC11153tN0.m24913y(sb, this.f24417i, '}');
    }

    /* renamed from: b */
    public boolean m16564b(long j) {
        boolean z = this.f24412d >= 0;
        boolean zM16559a = m16559a();
        this.f24419k.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.f24417i;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return z && zM16559a && !(((timeUnit.toSeconds(jElapsedRealtime) > j2 ? 1 : (timeUnit.toSeconds(jElapsedRealtime) == j2 ? 0 : -1)) < 0) || ((timeUnit.toSeconds(j) - j2) > ((long) this.f24411c.m16653a(this.f24409a.m15914m().m16141O())) ? 1 : ((timeUnit.toSeconds(j) - j2) == ((long) this.f24411c.m16653a(this.f24409a.m15914m().m16141O())) ? 0 : -1)) >= 0 || (timeUnit.toSeconds(j - this.f24413e) > C3590s6.f24652b ? 1 : (timeUnit.toSeconds(j - this.f24413e) == C3590s6.f24652b ? 0 : -1)) >= 0);
    }

    /* renamed from: c */
    public void m16566c(long j) {
        InterfaceC3720x6 interfaceC3720x6 = this.f24410b;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        this.f24417i = seconds;
        ((C3746y6) interfaceC3720x6).m17225e(seconds).m17220b();
    }

    /* renamed from: a */
    public void m16562a(boolean z) {
        if (this.f24415g != z) {
            this.f24415g = z;
            ((C3746y6) this.f24410b).m17217a(z).m17220b();
        }
    }

    /* renamed from: a */
    private boolean m16559a() {
        if (this.f24416h == null) {
            synchronized (this) {
                if (this.f24416h == null) {
                    try {
                        String asString = this.f24409a.m15910i().m16830a(this.f24412d, this.f24411c.m16655a()).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            this.f24416h = new a(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        a aVar = this.f24416h;
        if (aVar != null) {
            return aVar.m16572a(this.f24409a.m15914m());
        }
        return false;
    }
}
