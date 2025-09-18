package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.al */
/* loaded from: classes2.dex */
class C3137al {

    /* renamed from: a */
    private final C3683vl f23068a;

    /* renamed from: b */
    private final C2763Ll f23069b;

    /* renamed from: c */
    private final C2763Ll f23070c;

    /* renamed from: d */
    private final C2763Ll f23071d;

    public C3137al(C2688Il c2688Il) {
        this(new C3683vl(c2688Il == null ? null : c2688Il.f21452e), new C2763Ll(c2688Il == null ? null : c2688Il.f21453f), new C2763Ll(c2688Il == null ? null : c2688Il.f21455h), new C2763Ll(c2688Il != null ? c2688Il.f21454g : null));
    }

    /* renamed from: a */
    public void m15618a(C2688Il c2688Il) {
        this.f23068a.m15561d(c2688Il.f21452e);
        this.f23069b.m15561d(c2688Il.f21453f);
        this.f23070c.m15561d(c2688Il.f21455h);
        this.f23071d.m15561d(c2688Il.f21454g);
    }

    /* renamed from: b */
    public AbstractC3111Zk<?> m15619b() {
        return this.f23069b;
    }

    /* renamed from: c */
    public AbstractC3111Zk<?> m15620c() {
        return this.f23068a;
    }

    /* renamed from: d */
    public AbstractC3111Zk<?> m15621d() {
        return this.f23070c;
    }

    /* renamed from: a */
    public synchronized AbstractC3111Zk<?> m15617a() {
        return this.f23071d;
    }

    public C3137al(C3683vl c3683vl, C2763Ll c2763Ll, C2763Ll c2763Ll2, C2763Ll c2763Ll3) {
        this.f23068a = c3683vl;
        this.f23069b = c2763Ll;
        this.f23070c = c2763Ll2;
        this.f23071d = c2763Ll3;
    }
}
