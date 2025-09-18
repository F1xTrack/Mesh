package com.yandex.metrica.impl.p022ob;

import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;

/* renamed from: com.yandex.metrica.impl.ob.Gc */
/* loaded from: classes2.dex */
public class C2629Gc extends AbstractC2530Cd<C2704Jc> {
    public C2629Gc(InterfaceC2829Oc interfaceC2829Oc, C2893R2 c2893r2) {
        super(interfaceC2829Oc, c2893r2);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC2530Cd
    /* renamed from: a */
    public String mo13966a() {
        return GplLibraryWrapper.FUSED_PROVIDER;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3596sc
    /* renamed from: b */
    public boolean mo14191b(Object obj) {
        return ((C2704Jc) obj).f21549a.f25306a;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3596sc
    /* renamed from: a */
    public boolean mo14190a(Object obj) {
        C2654Hc c2654Hc = ((C2704Jc) obj).f21550b;
        return c2654Hc != null && m13967a(c2654Hc.f21361c);
    }
}
