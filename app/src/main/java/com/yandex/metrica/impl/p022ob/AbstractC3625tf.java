package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3132ag;

/* renamed from: com.yandex.metrica.impl.ob.tf */
/* loaded from: classes2.dex */
public abstract class AbstractC3625tf<T> extends AbstractC3755yf {

    /* renamed from: f */
    private final T f24854f;

    public AbstractC3625tf(int i, String str, T t, InterfaceC3660uo<String> interfaceC3660uo, AbstractC3547qf abstractC3547qf) {
        super(i, str, interfaceC3660uo, abstractC3547qf);
        this.f24854f = t;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2657Hf
    /* renamed from: a */
    public void mo13933a(C2632Gf c2632Gf) {
        C3132ag.a aVarMo13861a;
        if (!m17242e() || (aVarMo13861a = m17239b().mo13861a(c2632Gf, c2632Gf.m14198a(m17241d(), m17240c()), this)) == null) {
            return;
        }
        mo14044a(aVarMo13861a);
    }

    /* renamed from: a */
    public abstract void mo14044a(C3132ag.a aVar);

    /* renamed from: f */
    public T m16866f() {
        return this.f24854f;
    }
}
