package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Yl */
/* loaded from: classes2.dex */
public final class C4957Yl extends AbstractC4533H4 {

    /* renamed from: g */
    public final InterfaceC4551Hm f31133g;

    public C4957Yl(String str, String str2, InterfaceC4551Hm interfaceC4551Hm, InterfaceC5357on interfaceC5357on, AbstractC4770R2 abstractC4770R2) {
        super(0, str, str2, interfaceC5357on, abstractC4770R2);
        this.f31133g = interfaceC4551Hm;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4533H4
    /* renamed from: a */
    public final void mo19197a(C5032bn c5032bn) {
        String str = (String) this.f31133g.mo19479a((String) this.f30235f);
        c5032bn.f31345d.f31501a = str == null ? new byte[0] : str.getBytes();
    }

    /* renamed from: h */
    public final InterfaceC4551Hm m20048h() {
        return this.f31133g;
    }
}
