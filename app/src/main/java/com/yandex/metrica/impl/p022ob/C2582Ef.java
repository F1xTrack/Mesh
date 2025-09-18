package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3132ag;

/* renamed from: com.yandex.metrica.impl.ob.Ef */
/* loaded from: classes2.dex */
public class C2582Ef extends AbstractC3625tf<String> {

    /* renamed from: g */
    private final InterfaceC2865Pn<String> f21116g;

    public C2582Ef(String str, String str2, InterfaceC2865Pn<String> interfaceC2865Pn, InterfaceC3660uo<String> interfaceC3660uo, AbstractC3547qf abstractC3547qf) {
        super(0, str, str2, interfaceC3660uo, abstractC3547qf);
        this.f21116g = interfaceC2865Pn;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3625tf
    /* renamed from: a */
    public void mo14044a(C3132ag.a aVar) {
        String strMo14016a = this.f21116g.mo14016a(m16866f());
        aVar.f23056e.f23059b = strMo14016a == null ? new byte[0] : strMo14016a.getBytes();
    }
}
