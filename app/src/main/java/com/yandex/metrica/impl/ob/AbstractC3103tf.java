package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2631ag;

/* renamed from: com.yandex.metrica.impl.ob.tf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3103tf<T> extends AbstractC3233yf {
    private final T f;

    public AbstractC3103tf(int i, String str, T t, uo<String> uoVar, AbstractC3029qf abstractC3029qf) {
        super(i, str, uoVar, abstractC3029qf);
        this.f = t;
    }

    @Override // com.yandex.metrica.impl.ob.Hf
    public void a(Gf gf) {
        C2631ag.a aVarA;
        if (!e() || (aVarA = b().a(gf, gf.a(d(), c()), this)) == null) {
            return;
        }
        a(aVarA);
    }

    public abstract void a(C2631ag.a aVar);

    public T f() {
        return this.f;
    }
}
