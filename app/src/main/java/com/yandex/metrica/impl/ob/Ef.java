package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2631ag;

/* loaded from: classes2.dex */
public class Ef extends AbstractC3103tf<String> {
    private final Pn<String> g;

    public Ef(String str, String str2, Pn<String> pn, uo<String> uoVar, AbstractC3029qf abstractC3029qf) {
        super(0, str, str2, uoVar, abstractC3029qf);
        this.g = pn;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3103tf
    public void a(C2631ag.a aVar) {
        String strA = this.g.a(f());
        aVar.e.b = strA == null ? new byte[0] : strA.getBytes();
    }
}
