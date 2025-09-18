package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2466A;
import io.appmetrica.analytics.impl.C5323ne;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.G9 */
/* loaded from: classes2.dex */
public class C2626G9 extends AbstractC2651H9 {

    /* renamed from: c */
    private static final C3754ye f21289c = new C3754ye("IDENTITY_SEND_TIME", null);

    /* renamed from: d */
    private static final C3754ye f21290d = new C3754ye("PERMISSIONS_CHECK_TIME", null);

    /* renamed from: e */
    private static final C3754ye f21291e = new C3754ye("USER_INFO", null);

    /* renamed from: f */
    private static final C3754ye f21292f = new C3754ye("PROFILE_ID", null);

    /* renamed from: g */
    private static final C3754ye f21293g = new C3754ye("APP_ENVIRONMENT", null);

    /* renamed from: h */
    private static final C3754ye f21294h = new C3754ye("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: i */
    private static final C3754ye f21295i = new C3754ye("LAST_MIGRATION_VERSION", null);

    /* renamed from: j */
    private static final C3754ye f21296j = new C3754ye("LAST_APP_VERSION_WITH_FEATURES", null);

    /* renamed from: k */
    private static final C3754ye f21297k = new C3754ye("APPLICATION_FEATURES", null);

    /* renamed from: l */
    private static final C3754ye f21298l = new C3754ye("LAST_STAT_SENDING_DISABLED_REPORTING_TIMESTAMP", null);

    /* renamed from: m */
    private static final C3754ye f21299m = new C3754ye("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* renamed from: n */
    static final C3754ye f21300n = new C3754ye("DEPRECATED_NATIVE_CRASHES_CHECKED", null);

    /* renamed from: o */
    private static final C3754ye f21301o = new C3754ye("REFERRER_HANDLED", null);

    public C2626G9(InterfaceC3774z8 interfaceC3774z8) {
        super(interfaceC3774z8);
    }

    /* renamed from: a */
    public C2626G9 m14164a(C2466A.a aVar) {
        synchronized (this) {
            m14253b(f21293g.m17234a(), aVar.f20825a);
            m14252b(f21294h.m17234a(), aVar.f20826b);
        }
        return this;
    }

    /* renamed from: b */
    public long m14166b(long j) {
        return m14247a(f21289c.m17234a(), j);
    }

    /* renamed from: c */
    public C2626G9 m14167c(long j) {
        return (C2626G9) m14252b(f21289c.m17234a(), j);
    }

    /* renamed from: d */
    public C2626G9 m14169d(long j) {
        return (C2626G9) m14252b(f21298l.m17234a(), j);
    }

    /* renamed from: e */
    public C2466A.a m14170e() {
        C2466A.a aVar;
        synchronized (this) {
            aVar = new C2466A.a(m14248a(f21293g.m17234a(), "{}"), m14247a(f21294h.m17234a(), 0L));
        }
        return aVar;
    }

    /* renamed from: f */
    public String m14172f() {
        return m14248a(f21297k.m17234a(), "");
    }

    /* renamed from: g */
    public C2626G9 m14174g(String str) {
        return (C2626G9) m14253b(f21297k.m17234a(), str);
    }

    /* renamed from: h */
    public int m14176h() {
        return m14246a(f21296j.m17234a(), -1);
    }

    /* renamed from: i */
    public C2626G9 m14178i(String str) {
        return (C2626G9) m14253b(f21291e.m17234a(), str);
    }

    /* renamed from: j */
    public long m14180j() {
        return m14247a(f21298l.m17234a(), 0L);
    }

    /* renamed from: k */
    public long m14181k() {
        return m14247a(f21290d.m17234a(), 0L);
    }

    /* renamed from: l */
    public String m14182l() {
        return m14259d(f21292f.m17234a());
    }

    /* renamed from: m */
    public String m14183m() {
        return m14248a(f21291e.m17234a(), (String) null);
    }

    /* renamed from: n */
    public boolean m14184n() {
        return m14250a(f21300n.m17234a(), false);
    }

    /* renamed from: o */
    public C2626G9 m14185o() {
        return (C2626G9) m14255b(f21300n.m17234a(), true);
    }

    @Deprecated
    /* renamed from: p */
    public C2626G9 m14186p() {
        return (C2626G9) m14255b(f21301o.m17234a(), true);
    }

    @Deprecated
    /* renamed from: q */
    public C2626G9 m14187q() {
        return (C2626G9) m14261e(f21295i.m17234a());
    }

    @Deprecated
    /* renamed from: r */
    public C2626G9 m14188r() {
        return (C2626G9) m14261e(f21301o.m17234a());
    }

    @Deprecated
    /* renamed from: s */
    public Boolean m14189s() {
        C3754ye c3754ye = f21301o;
        if (m14256b(c3754ye.m17234a())) {
            return Boolean.valueOf(m14250a(c3754ye.m17234a(), false));
        }
        return null;
    }

    /* renamed from: c */
    public C2626G9 m14168c(String str, String str2) {
        return (C2626G9) m14253b(new C3754ye(C5323ne.f32291q, str).m17234a(), str2);
    }

    /* renamed from: f */
    public String m14173f(String str) {
        return m14248a(new C3754ye(C5323ne.f32291q, str).m17234a(), "");
    }

    /* renamed from: g */
    public List<String> m14175g() {
        return m14249a(f21299m.m17234a(), Collections.emptyList());
    }

    /* renamed from: h */
    public C2626G9 m14177h(String str) {
        return (C2626G9) m14253b(f21292f.m17234a(), str);
    }

    @Deprecated
    /* renamed from: i */
    public Integer m14179i() {
        C3754ye c3754ye = f21295i;
        if (m14256b(c3754ye.m17234a())) {
            return Integer.valueOf((int) m14247a(c3754ye.m17234a(), 0L));
        }
        return null;
    }

    /* renamed from: a */
    public C2626G9 m14163a(int i) {
        return (C2626G9) m14251b(f21296j.m17234a(), i);
    }

    /* renamed from: a */
    public C2626G9 m14165a(List<String> list) {
        return (C2626G9) m14254b(f21299m.m17234a(), list);
    }

    /* renamed from: e */
    public C2626G9 m14171e(long j) {
        return (C2626G9) m14252b(f21290d.m17234a(), j);
    }
}
