package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.T1;
import defpackage.AbstractC1705Vq;

/* loaded from: classes2.dex */
public class I9 extends H9 implements Ph {
    static final C3232ye c = new C3232ye("LOCATION_TRACKING_ENABLED", null);
    static final C3232ye d = new C3232ye("PREF_KEY_OFFSET", null);
    static final C3232ye e = new C3232ye("UNCHECKED_TIME", null);
    static final C3232ye f = new C3232ye("STATISTICS_RESTRICTED_IN_MAIN", null);
    static final C3232ye g;
    static final C3232ye h;
    static final C3232ye i;
    static final C3232ye j;
    static final C3232ye k;
    static final C3232ye l;
    static final C3232ye m;
    private static final C3232ye n;
    static final C3232ye o;
    static final C3232ye p;
    static final C3232ye q;
    static final C3232ye r;
    static final C3232ye s;
    static final C3232ye t;
    static final C3232ye u;
    static final C3232ye v;

    static {
        new C3232ye("SDKFCE", null);
        new C3232ye("FST", null);
        new C3232ye("LSST", null);
        new C3232ye("FSDKFCO", null);
        new C3232ye("SRSDKFC", null);
        new C3232ye("LSDKFCAT", null);
        g = new C3232ye("LAST_IDENTITY_LIGHT_SEND_TIME", null);
        h = new C3232ye("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);
        i = new C3232ye("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);
        j = new C3232ye("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);
        k = new C3232ye("LAST_REPORT_SEND_ATTEMPT_TIME", null);
        l = new C3232ye("LAST_LOCATION_SEND_ATTEMPT_TIME", null);
        m = new C3232ye("LAST_STARTUP_SEND_ATTEMPT_TIME", null);
        n = new C3232ye("LAST_MIGRATION_VERSION", null);
        o = new C3232ye("LAST_WIFI_SCANNING_ATTEMPT_TIME", null);
        p = new C3232ye("LAST_LBS_SCANNING_ATTEMPT_TIME", null);
        q = new C3232ye("LAST_GPS_SCANNING_ATTEMPT_TIME", null);
        r = new C3232ye("LAST_FUSED_SCANNING_ATTEMPT_TIME", null);
        s = new C3232ye("SATELLITE_PRELOAD_INFO_CHECKED", null);
        t = new C3232ye("SATELLITE_CLIDS_CHECKED", null);
        u = new C3232ye("CERTIFICATE_REQUEST_ETAG", null);
        v = new C3232ye("CERTIFICATE_REQUEST_NEXT_ATTEMPT_TIME", null);
    }

    public I9(InterfaceC3251z8 interfaceC3251z8) {
        super(interfaceC3251z8);
    }

    @Deprecated
    public int a(int i2) {
        return a(n.a(), i2);
    }

    public long b(int i2) {
        return a(d.a(), i2);
    }

    public I9 c(boolean z) {
        return (I9) b(e.a(), z);
    }

    public void d(boolean z) {
        b(c.a(), z).c();
    }

    public Boolean e() {
        C3232ye c3232ye = f;
        if (b(c3232ye.a())) {
            return Boolean.valueOf(a(c3232ye.a(), true));
        }
        return null;
    }

    public boolean f() {
        return a(c.a(), false);
    }

    public I9 g(long j2) {
        return (I9) b(r.a(), j2);
    }

    public I9 h(long j2) {
        return (I9) b(q.a(), j2);
    }

    public I9 i(long j2) {
        return (I9) b(g.a(), j2);
    }

    public I9 j(long j2) {
        return (I9) b(p.a(), j2);
    }

    public I9 k(long j2) {
        return (I9) b(o.a(), j2);
    }

    public I9 l(long j2) {
        return (I9) b(d.a(), j2);
    }

    public boolean a(boolean z) {
        return a(e.a(), z);
    }

    public I9 b(boolean z) {
        return (I9) b(f.a(), z);
    }

    public long c(long j2) {
        return a(q.a(), j2);
    }

    public long d(long j2) {
        return a(g.a(), j2);
    }

    public long f(long j2) {
        return a(o.a(), j2);
    }

    public I9 g() {
        return (I9) b(t.a(), true);
    }

    public I9 h() {
        return (I9) b(s.a(), true);
    }

    @Deprecated
    public I9 i() {
        return (I9) e(n.a());
    }

    public boolean j() {
        return a(s.a(), false);
    }

    public boolean k() {
        return a(t.a(), false);
    }

    public int a(T1.a aVar, int i2) {
        C3232ye c3232yeB = b(aVar);
        return c3232yeB == null ? i2 : a(c3232yeB.a(), i2);
    }

    public I9 b(T1.a aVar, int i2) {
        C3232ye c3232yeB = b(aVar);
        return c3232yeB != null ? (I9) b(c3232yeB.a(), i2) : this;
    }

    public long e(long j2) {
        return a(p.a(), j2);
    }

    public long a(T1.a aVar, long j2) {
        C3232ye c3232yeA = a(aVar);
        return c3232yeA == null ? j2 : a(c3232yeA.a(), j2);
    }

    public I9 b(T1.a aVar, long j2) {
        C3232ye c3232yeA = a(aVar);
        return c3232yeA != null ? (I9) b(c3232yeA.a(), j2) : this;
    }

    public I9 a(String str, String str2, String str3) {
        return (I9) b(new C3232ye(AbstractC1705Vq.i("LAST_SOCKET_REPORT_TIMES_", str, "_", str2), null).a(), str3);
    }

    public long b(long j2) {
        return a(r.a(), j2);
    }

    @Override // com.yandex.metrica.impl.ob.Ph
    public String b() {
        return a(u.a(), (String) null);
    }

    private C3232ye b(T1.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            return h;
        }
        if (iOrdinal == 1) {
            return i;
        }
        if (iOrdinal != 2) {
            return null;
        }
        return j;
    }

    @Override // com.yandex.metrica.impl.ob.Ph
    public Ph a(String str) {
        return (Ph) b(u.a(), str);
    }

    @Override // com.yandex.metrica.impl.ob.Ph
    public long a() {
        return a(v.a(), 0L);
    }

    @Override // com.yandex.metrica.impl.ob.Ph
    public Ph a(long j2) {
        return (Ph) b(v.a(), j2);
    }

    private C3232ye a(T1.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            return k;
        }
        if (iOrdinal == 1) {
            return l;
        }
        if (iOrdinal != 2) {
            return null;
        }
        return m;
    }
}
