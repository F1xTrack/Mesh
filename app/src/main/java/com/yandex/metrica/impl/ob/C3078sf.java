package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2631ag;

/* renamed from: com.yandex.metrica.impl.ob.sf */
/* loaded from: classes2.dex */
public class C3078sf extends AbstractC3029qf {
    public C3078sf(InterfaceC3004pf interfaceC3004pf) {
        super(interfaceC3004pf);
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3029qf
    public C2631ag.a a(Gf gf, C2631ag.a aVar, InterfaceC2979of interfaceC2979of) {
        if (aVar == null || aVar.d.c) {
            return a().a(gf, ((AbstractC3233yf) interfaceC2979of).a());
        }
        aVar.d = new C2631ag.b();
        return aVar;
    }
}
