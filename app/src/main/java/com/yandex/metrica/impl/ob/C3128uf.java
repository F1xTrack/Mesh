package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2631ag;

/* renamed from: com.yandex.metrica.impl.ob.uf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3128uf extends AbstractC3103tf<Double> {
    public C3128uf(String str, double d) {
        super(2, str, Double.valueOf(d), new C3183wf(), new C3078sf(new C3208xf(new Gn(100))));
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC3103tf
    public void a(C2631ag.a aVar) {
        C2631ag.c cVar = aVar.e;
        cVar.d = f().doubleValue() + cVar.d;
    }
}
