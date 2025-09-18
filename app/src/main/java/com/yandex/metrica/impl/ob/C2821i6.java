package com.yandex.metrica.impl.ob;

import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.i6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2821i6 implements InterfaceC2725ea<C2796h6, C2731eg> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2731eg b(C2796h6 c2796h6) {
        C2731eg c2731eg = new C2731eg();
        c2731eg.e = new int[c2796h6.b().size()];
        Iterator<Integer> it = c2796h6.b().iterator();
        int i = 0;
        while (it.hasNext()) {
            c2731eg.e[i] = it.next().intValue();
            i++;
        }
        c2731eg.d = c2796h6.c();
        c2731eg.c = c2796h6.d();
        c2731eg.b = c2796h6.e();
        return c2731eg;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2796h6 a(C2731eg c2731eg) {
        return new C2796h6(c2731eg.b, c2731eg.c, c2731eg.d, U2.a(c2731eg.e));
    }
}
