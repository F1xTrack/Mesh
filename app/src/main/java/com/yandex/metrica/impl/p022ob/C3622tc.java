package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.tc */
/* loaded from: classes2.dex */
public class C3622tc extends AbstractC2530Cd<C2579Ec> {

    /* renamed from: c */
    private final String f24818c;

    public C3622tc(InterfaceC2829Oc interfaceC2829Oc, String str) {
        this(interfaceC2829Oc, str, new C2893R2());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3596sc
    /* renamed from: a */
    public boolean mo14190a(Object obj) {
        C2554Dc c2554Dc = ((C2579Ec) obj).f21112b;
        return c2554Dc != null && m13967a(c2554Dc.f21018b);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3596sc
    /* renamed from: b */
    public boolean mo14191b(Object obj) {
        return ((C2579Ec) obj).f21111a.f25306a;
    }

    public C3622tc(InterfaceC2829Oc interfaceC2829Oc, String str, C2893R2 c2893r2) {
        super(interfaceC2829Oc, c2893r2);
        this.f24818c = str;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2530Cd
    /* renamed from: a */
    public String mo13966a() {
        return this.f24818c;
    }
}
