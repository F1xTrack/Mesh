package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.Sc */
/* loaded from: classes2.dex */
public class C2928Sc extends AbstractC3700wc {

    /* renamed from: com.yandex.metrica.impl.ob.Sc$a */
    public class a implements InterfaceC2829Oc {
        public a() {
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2829Oc
        /* renamed from: a */
        public long mo14531a() {
            return C2928Sc.this.f25170a.m14323e(0L);
        }

        @Override // com.yandex.metrica.impl.p022ob.InterfaceC2829Oc
        /* renamed from: a */
        public void mo14532a(long j) {
            C2928Sc.this.f25170a.m14333j(j);
        }
    }

    public C2928Sc(C3389kd c3389kd, C2676I9 c2676i9) {
        this(c3389kd, c2676i9, new C3118a2());
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3700wc
    /* renamed from: a */
    public InterfaceC2829Oc mo14619a() {
        return new a();
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3700wc
    /* renamed from: b */
    public String mo14621b() {
        return "network";
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3700wc
    /* renamed from: c */
    public String mo14622c() {
        return "lbs";
    }

    public C2928Sc(C3389kd c3389kd, C2676I9 c2676i9, C3118a2 c3118a2) {
        super(c3389kd, c2676i9, c3118a2);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3700wc
    /* renamed from: a */
    public InterfaceC3286ge mo14620a(C3260fe c3260fe) {
        return this.f25172c.m15595a(c3260fe);
    }
}
