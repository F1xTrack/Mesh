package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.AbstractC2942T1;
import p000.AbstractC1374Vq;

/* renamed from: com.yandex.metrica.impl.ob.I9 */
/* loaded from: classes2.dex */
public class C2676I9 extends AbstractC2651H9 implements InterfaceC2859Ph {

    /* renamed from: c */
    static final C3754ye f21405c = new C3754ye("LOCATION_TRACKING_ENABLED", null);

    /* renamed from: d */
    static final C3754ye f21406d = new C3754ye("PREF_KEY_OFFSET", null);

    /* renamed from: e */
    static final C3754ye f21407e = new C3754ye("UNCHECKED_TIME", null);

    /* renamed from: f */
    static final C3754ye f21408f = new C3754ye("STATISTICS_RESTRICTED_IN_MAIN", null);

    /* renamed from: g */
    static final C3754ye f21409g;

    /* renamed from: h */
    static final C3754ye f21410h;

    /* renamed from: i */
    static final C3754ye f21411i;

    /* renamed from: j */
    static final C3754ye f21412j;

    /* renamed from: k */
    static final C3754ye f21413k;

    /* renamed from: l */
    static final C3754ye f21414l;

    /* renamed from: m */
    static final C3754ye f21415m;

    /* renamed from: n */
    private static final C3754ye f21416n;

    /* renamed from: o */
    static final C3754ye f21417o;

    /* renamed from: p */
    static final C3754ye f21418p;

    /* renamed from: q */
    static final C3754ye f21419q;

    /* renamed from: r */
    static final C3754ye f21420r;

    /* renamed from: s */
    static final C3754ye f21421s;

    /* renamed from: t */
    static final C3754ye f21422t;

    /* renamed from: u */
    static final C3754ye f21423u;

    /* renamed from: v */
    static final C3754ye f21424v;

    static {
        new C3754ye("SDKFCE", null);
        new C3754ye("FST", null);
        new C3754ye("LSST", null);
        new C3754ye("FSDKFCO", null);
        new C3754ye("SRSDKFC", null);
        new C3754ye("LSDKFCAT", null);
        f21409g = new C3754ye("LAST_IDENTITY_LIGHT_SEND_TIME", null);
        f21410h = new C3754ye("NEXT_REPORT_SEND_ATTEMPT_NUMBER", null);
        f21411i = new C3754ye("NEXT_LOCATION_SEND_ATTEMPT_NUMBER", null);
        f21412j = new C3754ye("NEXT_STARTUP_SEND_ATTEMPT_NUMBER", null);
        f21413k = new C3754ye("LAST_REPORT_SEND_ATTEMPT_TIME", null);
        f21414l = new C3754ye("LAST_LOCATION_SEND_ATTEMPT_TIME", null);
        f21415m = new C3754ye("LAST_STARTUP_SEND_ATTEMPT_TIME", null);
        f21416n = new C3754ye("LAST_MIGRATION_VERSION", null);
        f21417o = new C3754ye("LAST_WIFI_SCANNING_ATTEMPT_TIME", null);
        f21418p = new C3754ye("LAST_LBS_SCANNING_ATTEMPT_TIME", null);
        f21419q = new C3754ye("LAST_GPS_SCANNING_ATTEMPT_TIME", null);
        f21420r = new C3754ye("LAST_FUSED_SCANNING_ATTEMPT_TIME", null);
        f21421s = new C3754ye("SATELLITE_PRELOAD_INFO_CHECKED", null);
        f21422t = new C3754ye("SATELLITE_CLIDS_CHECKED", null);
        f21423u = new C3754ye("CERTIFICATE_REQUEST_ETAG", null);
        f21424v = new C3754ye("CERTIFICATE_REQUEST_NEXT_ATTEMPT_TIME", null);
    }

    public C2676I9(InterfaceC3774z8 interfaceC3774z8) {
        super(interfaceC3774z8);
    }

    @Deprecated
    /* renamed from: a */
    public int m14305a(int i) {
        return m14246a(f21416n.m17234a(), i);
    }

    /* renamed from: b */
    public long m14313b(int i) {
        return m14247a(f21406d.m17234a(), i);
    }

    /* renamed from: c */
    public C2676I9 m14320c(boolean z) {
        return (C2676I9) m14255b(f21407e.m17234a(), z);
    }

    /* renamed from: d */
    public void m14322d(boolean z) {
        m14255b(f21405c.m17234a(), z).m14258c();
    }

    /* renamed from: e */
    public Boolean m14324e() {
        C3754ye c3754ye = f21408f;
        if (m14256b(c3754ye.m17234a())) {
            return Boolean.valueOf(m14250a(c3754ye.m17234a(), true));
        }
        return null;
    }

    /* renamed from: f */
    public boolean m14326f() {
        return m14250a(f21405c.m17234a(), false);
    }

    /* renamed from: g */
    public C2676I9 m14328g(long j) {
        return (C2676I9) m14252b(f21420r.m17234a(), j);
    }

    /* renamed from: h */
    public C2676I9 m14330h(long j) {
        return (C2676I9) m14252b(f21419q.m17234a(), j);
    }

    /* renamed from: i */
    public C2676I9 m14332i(long j) {
        return (C2676I9) m14252b(f21409g.m17234a(), j);
    }

    /* renamed from: j */
    public C2676I9 m14333j(long j) {
        return (C2676I9) m14252b(f21418p.m17234a(), j);
    }

    /* renamed from: k */
    public C2676I9 m14335k(long j) {
        return (C2676I9) m14252b(f21417o.m17234a(), j);
    }

    /* renamed from: l */
    public C2676I9 m14337l(long j) {
        return (C2676I9) m14252b(f21406d.m17234a(), j);
    }

    /* renamed from: a */
    public boolean m14312a(boolean z) {
        return m14250a(f21407e.m17234a(), z);
    }

    /* renamed from: b */
    public C2676I9 m14317b(boolean z) {
        return (C2676I9) m14255b(f21408f.m17234a(), z);
    }

    /* renamed from: c */
    public long m14319c(long j) {
        return m14247a(f21419q.m17234a(), j);
    }

    /* renamed from: d */
    public long m14321d(long j) {
        return m14247a(f21409g.m17234a(), j);
    }

    /* renamed from: f */
    public long m14325f(long j) {
        return m14247a(f21417o.m17234a(), j);
    }

    /* renamed from: g */
    public C2676I9 m14327g() {
        return (C2676I9) m14255b(f21422t.m17234a(), true);
    }

    /* renamed from: h */
    public C2676I9 m14329h() {
        return (C2676I9) m14255b(f21421s.m17234a(), true);
    }

    @Deprecated
    /* renamed from: i */
    public C2676I9 m14331i() {
        return (C2676I9) m14261e(f21416n.m17234a());
    }

    /* renamed from: j */
    public boolean m14334j() {
        return m14250a(f21421s.m17234a(), false);
    }

    /* renamed from: k */
    public boolean m14336k() {
        return m14250a(f21422t.m17234a(), false);
    }

    /* renamed from: a */
    public int m14306a(AbstractC2942T1.a aVar, int i) {
        C3754ye c3754yeM14304b = m14304b(aVar);
        return c3754yeM14304b == null ? i : m14246a(c3754yeM14304b.m17234a(), i);
    }

    /* renamed from: b */
    public C2676I9 m14315b(AbstractC2942T1.a aVar, int i) {
        C3754ye c3754yeM14304b = m14304b(aVar);
        return c3754yeM14304b != null ? (C2676I9) m14251b(c3754yeM14304b.m17234a(), i) : this;
    }

    /* renamed from: e */
    public long m14323e(long j) {
        return m14247a(f21418p.m17234a(), j);
    }

    /* renamed from: a */
    public long m14308a(AbstractC2942T1.a aVar, long j) {
        C3754ye c3754yeM14303a = m14303a(aVar);
        return c3754yeM14303a == null ? j : m14247a(c3754yeM14303a.m17234a(), j);
    }

    /* renamed from: b */
    public C2676I9 m14316b(AbstractC2942T1.a aVar, long j) {
        C3754ye c3754yeM14303a = m14303a(aVar);
        return c3754yeM14303a != null ? (C2676I9) m14252b(c3754yeM14303a.m17234a(), j) : this;
    }

    /* renamed from: a */
    public C2676I9 m14309a(String str, String str2, String str3) {
        return (C2676I9) m14253b(new C3754ye(AbstractC1374Vq.m8590i("LAST_SOCKET_REPORT_TIMES_", str, "_", str2), null).m17234a(), str3);
    }

    /* renamed from: b */
    public long m14314b(long j) {
        return m14247a(f21420r.m17234a(), j);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2859Ph
    /* renamed from: b */
    public String mo14318b() {
        return m14248a(f21423u.m17234a(), (String) null);
    }

    /* renamed from: b */
    private C3754ye m14304b(AbstractC2942T1.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            return f21410h;
        }
        if (iOrdinal == 1) {
            return f21411i;
        }
        if (iOrdinal != 2) {
            return null;
        }
        return f21412j;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2859Ph
    /* renamed from: a */
    public InterfaceC2859Ph mo14311a(String str) {
        return (InterfaceC2859Ph) m14253b(f21423u.m17234a(), str);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2859Ph
    /* renamed from: a */
    public long mo14307a() {
        return m14247a(f21424v.m17234a(), 0L);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2859Ph
    /* renamed from: a */
    public InterfaceC2859Ph mo14310a(long j) {
        return (InterfaceC2859Ph) m14252b(f21424v.m17234a(), j);
    }

    /* renamed from: a */
    private C3754ye m14303a(AbstractC2942T1.a aVar) {
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            return f21413k;
        }
        if (iOrdinal == 1) {
            return f21414l;
        }
        if (iOrdinal != 2) {
            return null;
        }
        return f21415m;
    }
}
