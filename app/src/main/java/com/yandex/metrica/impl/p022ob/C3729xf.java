package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3132ag;

/* renamed from: com.yandex.metrica.impl.ob.xf */
/* loaded from: classes2.dex */
public class C3729xf implements InterfaceC3521pf {

    /* renamed from: a */
    private final C2640Gn f25249a;

    public C3729xf(C2640Gn c2640Gn) {
        this.f25249a = c2640Gn;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3521pf
    /* renamed from: a */
    public C3132ag.a mo13998a(C2632Gf c2632Gf, C3132ag.a aVar) {
        if (c2632Gf.m14197a() == this.f25249a.m14213a()) {
            if (c2632Gf.m14198a(aVar.f23054c, new String(aVar.f23053b)) != null) {
                c2632Gf.m14199a(aVar);
            }
        } else if (c2632Gf.m14197a() < this.f25249a.m14213a()) {
            c2632Gf.m14199a(aVar);
            c2632Gf.m14200b();
        }
        return aVar;
    }
}
