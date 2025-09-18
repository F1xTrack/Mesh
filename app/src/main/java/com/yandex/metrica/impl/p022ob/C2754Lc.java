package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Lc */
/* loaded from: classes2.dex */
public class C2754Lc {

    /* renamed from: a */
    private final C2676I9 f21623a;

    /* renamed from: b */
    private final C3389kd f21624b;

    /* renamed from: c */
    private final InterfaceC2829Oc f21625c;

    /* renamed from: d */
    private final C2679Ic f21626d;

    /* renamed from: e */
    private final C2629Gc f21627e;

    /* renamed from: f */
    private final C2729Kc f21628f;

    /* renamed from: com.yandex.metrica.impl.ob.Lc$a */
    public class a implements InterfaceC2829Oc {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2829Oc
        /* renamed from: a */
        public long mo14531a() {
            return C2754Lc.this.f21623a.m14314b(0L);
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2829Oc
        /* renamed from: a */
        public void mo14532a(long j) {
            C2754Lc.this.f21623a.m14328g(j);
        }
    }

    public C2754Lc(C3389kd c3389kd, C2676I9 c2676i9, C3727xd c3727xd) {
        this.f21624b = c3389kd;
        this.f21623a = c2676i9;
        InterfaceC2829Oc interfaceC2829OcM14529b = m14529b();
        this.f21625c = interfaceC2829OcM14529b;
        this.f21627e = m14525a(interfaceC2829OcM14529b);
        this.f21626d = m14527a();
        this.f21628f = m14528a(c3727xd);
    }

    /* renamed from: b */
    private InterfaceC2829Oc m14529b() {
        return new a();
    }

    /* renamed from: a */
    private C2679Ic m14527a() {
        return new C2679Ic(this.f21624b.f23918a.f25416b);
    }

    /* renamed from: a */
    private C2629Gc m14525a(InterfaceC2829Oc interfaceC2829Oc) {
        return new C2629Gc(interfaceC2829Oc, new C2893R2());
    }

    /* renamed from: a */
    private C2729Kc m14528a(C3727xd c3727xd) {
        C3778zc c3778zc = this.f21624b.f23918a;
        return new C2729Kc(c3778zc.f25415a, c3727xd, c3778zc.f25416b, c3778zc.f25417c);
    }

    /* renamed from: a */
    public C3441md<C2704Jc> m14530a(C2704Jc c2704Jc) {
        return new C3441md<>(this.f21628f, this.f21627e, new C3674vc(this.f21625c, new C2814Nm()), this.f21626d, c2704Jc);
    }
}
