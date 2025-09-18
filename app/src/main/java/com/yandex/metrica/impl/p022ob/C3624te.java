package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import com.yandex.metrica.impl.p022ob.C2466A;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.te */
/* loaded from: classes2.dex */
public class C3624te extends AbstractC3572re {

    /* renamed from: f */
    private C3754ye f24839f;

    /* renamed from: g */
    private C3754ye f24840g;

    /* renamed from: h */
    private C3754ye f24841h;

    /* renamed from: i */
    private C3754ye f24842i;

    /* renamed from: j */
    private C3754ye f24843j;

    /* renamed from: k */
    private C3754ye f24844k;

    /* renamed from: l */
    private C3754ye f24845l;

    /* renamed from: m */
    private C3754ye f24846m;

    /* renamed from: n */
    private C3754ye f24847n;

    /* renamed from: o */
    private C3754ye f24848o;

    /* renamed from: p */
    private C3754ye f24849p;

    /* renamed from: q */
    private C3754ye f24850q;

    /* renamed from: r */
    private C3754ye f24851r;

    /* renamed from: s */
    private C3754ye f24852s;

    /* renamed from: t */
    private C3754ye f24853t;

    /* renamed from: u */
    private static final C3754ye f24833u = new C3754ye("SESSION_SLEEP_START_", null);

    /* renamed from: v */
    private static final C3754ye f24834v = new C3754ye("SESSION_ID_", null);

    /* renamed from: w */
    private static final C3754ye f24835w = new C3754ye("SESSION_COUNTER_ID_", null);

    /* renamed from: x */
    private static final C3754ye f24836x = new C3754ye("SESSION_INIT_TIME_", null);

    /* renamed from: y */
    private static final C3754ye f24837y = new C3754ye("SESSION_ALIVE_TIME_", null);

    /* renamed from: z */
    private static final C3754ye f24838z = new C3754ye("SESSION_IS_ALIVE_REPORT_NEEDED_", null);

    /* renamed from: A */
    private static final C3754ye f24822A = new C3754ye("BG_SESSION_ID_", null);

    /* renamed from: B */
    private static final C3754ye f24823B = new C3754ye("BG_SESSION_SLEEP_START_", null);

    /* renamed from: C */
    private static final C3754ye f24824C = new C3754ye("BG_SESSION_COUNTER_ID_", null);

    /* renamed from: D */
    private static final C3754ye f24825D = new C3754ye("BG_SESSION_INIT_TIME_", null);

    /* renamed from: E */
    private static final C3754ye f24826E = new C3754ye("IDENTITY_SEND_TIME_", null);

    /* renamed from: F */
    private static final C3754ye f24827F = new C3754ye("USER_INFO_", null);

    /* renamed from: G */
    private static final C3754ye f24828G = new C3754ye("REFERRER_", null);

    /* renamed from: H */
    @Deprecated
    public static final C3754ye f24829H = new C3754ye("APP_ENVIRONMENT", null);

    /* renamed from: I */
    @Deprecated
    public static final C3754ye f24830I = new C3754ye("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: J */
    private static final C3754ye f24831J = new C3754ye("APP_ENVIRONMENT_", null);

    /* renamed from: K */
    private static final C3754ye f24832K = new C3754ye("APP_ENVIRONMENT_REVISION_", null);

    public C3624te(Context context, String str) {
        super(context, str);
        this.f24839f = new C3754ye(f24833u.m17236b(), m16691c());
        this.f24840g = new C3754ye(f24834v.m17236b(), m16691c());
        this.f24841h = new C3754ye(f24835w.m17236b(), m16691c());
        this.f24842i = new C3754ye(f24836x.m17236b(), m16691c());
        this.f24843j = new C3754ye(f24837y.m17236b(), m16691c());
        this.f24844k = new C3754ye(f24838z.m17236b(), m16691c());
        this.f24845l = new C3754ye(f24822A.m17236b(), m16691c());
        this.f24846m = new C3754ye(f24823B.m17236b(), m16691c());
        this.f24847n = new C3754ye(f24824C.m17236b(), m16691c());
        this.f24848o = new C3754ye(f24825D.m17236b(), m16691c());
        this.f24849p = new C3754ye(f24826E.m17236b(), m16691c());
        this.f24850q = new C3754ye(f24827F.m17236b(), m16691c());
        this.f24851r = new C3754ye(f24828G.m17236b(), m16691c());
        this.f24852s = new C3754ye(f24831J.m17236b(), m16691c());
        this.f24853t = new C3754ye(f24832K.m17236b(), m16691c());
        m16847a(-1);
        m16849c(0);
        m16848b(0);
    }

    /* renamed from: a */
    public long m16850a(long j) {
        return this.f24614b.getLong(this.f24848o.m17234a(), j);
    }

    /* renamed from: b */
    public long m16853b(long j) {
        return this.f24614b.getLong(this.f24847n.m17234a(), j);
    }

    /* renamed from: c */
    public long m16855c(long j) {
        return this.f24614b.getLong(this.f24845l.m17234a(), j);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3572re
    /* renamed from: d */
    public String mo16612d() {
        return "_boundentrypreferences";
    }

    /* renamed from: e */
    public long m16857e(long j) {
        return this.f24614b.getLong(this.f24842i.m17234a(), j);
    }

    /* renamed from: f */
    public long m16858f(long j) {
        return this.f24614b.getLong(this.f24841h.m17234a(), j);
    }

    /* renamed from: g */
    public long m16860g(long j) {
        return this.f24614b.getLong(this.f24840g.m17234a(), j);
    }

    /* renamed from: h */
    public long m16862h(long j) {
        return this.f24614b.getLong(this.f24839f.m17234a(), j);
    }

    /* renamed from: i */
    public long m16864i(long j) {
        return this.f24614b.getLong(this.f24849p.m17234a(), j);
    }

    /* renamed from: d */
    public long m16856d(long j) {
        return this.f24614b.getLong(this.f24846m.m17234a(), j);
    }

    /* renamed from: c */
    private void m16849c(int i) {
        C3323i.m16065a(this.f24614b, this.f24839f.m17234a(), i);
    }

    /* renamed from: a */
    public Boolean m16852a(boolean z) {
        return Boolean.valueOf(this.f24614b.getBoolean(this.f24844k.m17234a(), z));
    }

    /* renamed from: b */
    public String m16854b(String str) {
        return this.f24614b.getString(this.f24850q.m17234a(), null);
    }

    /* renamed from: f */
    public C2466A.a m16859f() {
        synchronized (this) {
            try {
                if (!this.f24614b.contains(this.f24852s.m17234a()) || !this.f24614b.contains(this.f24853t.m17234a())) {
                    return null;
                }
                return new C2466A.a(this.f24614b.getString(this.f24852s.m17234a(), "{}"), this.f24614b.getLong(this.f24853t.m17234a(), 0L));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public boolean m16861g() {
        return this.f24614b.contains(this.f24842i.m17234a()) || this.f24614b.contains(this.f24843j.m17234a()) || this.f24614b.contains(this.f24844k.m17234a()) || this.f24614b.contains(this.f24839f.m17234a()) || this.f24614b.contains(this.f24840g.m17234a()) || this.f24614b.contains(this.f24841h.m17234a()) || this.f24614b.contains(this.f24848o.m17234a()) || this.f24614b.contains(this.f24846m.m17234a()) || this.f24614b.contains(this.f24845l.m17234a()) || this.f24614b.contains(this.f24847n.m17234a()) || this.f24614b.contains(this.f24852s.m17234a()) || this.f24614b.contains(this.f24850q.m17234a()) || this.f24614b.contains(this.f24851r.m17234a()) || this.f24614b.contains(this.f24849p.m17234a());
    }

    /* renamed from: h */
    public void m16863h() {
        this.f24614b.edit().remove(this.f24848o.m17234a()).remove(this.f24847n.m17234a()).remove(this.f24845l.m17234a()).remove(this.f24846m.m17234a()).remove(this.f24842i.m17234a()).remove(this.f24841h.m17234a()).remove(this.f24840g.m17234a()).remove(this.f24839f.m17234a()).remove(this.f24844k.m17234a()).remove(this.f24843j.m17234a()).remove(this.f24850q.m17234a()).remove(this.f24852s.m17234a()).remove(this.f24853t.m17234a()).remove(this.f24851r.m17234a()).remove(this.f24849p.m17234a()).apply();
    }

    /* renamed from: i */
    public C3624te m16865i() {
        return (C3624te) m16688a(this.f24851r.m17234a());
    }

    /* renamed from: b */
    private void m16848b(int i) {
        C3323i.m16065a(this.f24614b, this.f24841h.m17234a(), i);
    }

    /* renamed from: a */
    public C3624te m16851a(C2466A.a aVar) {
        synchronized (this) {
            m16689a(this.f24852s.m17234a(), aVar.f20825a);
            m16689a(this.f24853t.m17234a(), Long.valueOf(aVar.f20826b));
        }
        return this;
    }

    /* renamed from: a */
    private void m16847a(int i) {
        C3323i.m16065a(this.f24614b, this.f24843j.m17234a(), i);
    }
}
