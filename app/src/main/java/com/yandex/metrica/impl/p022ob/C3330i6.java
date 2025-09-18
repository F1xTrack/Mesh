package com.yandex.metrica.impl.p022ob;

import java.util.Iterator;

/* renamed from: com.yandex.metrica.impl.ob.i6 */
/* loaded from: classes2.dex */
class C3330i6 implements InterfaceC3230ea<C3304h6, C3236eg> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3236eg mo13847b(C3304h6 c3304h6) {
        C3236eg c3236eg = new C3236eg();
        c3236eg.f23364e = new int[c3304h6.m16033b().size()];
        Iterator<Integer> it = c3304h6.m16033b().iterator();
        int i = 0;
        while (it.hasNext()) {
            c3236eg.f23364e[i] = it.next().intValue();
            i++;
        }
        c3236eg.f23363d = c3304h6.m16035c();
        c3236eg.f23362c = c3304h6.m16036d();
        c3236eg.f23361b = c3304h6.m16037e();
        return c3236eg;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3304h6 mo13846a(C3236eg c3236eg) {
        return new C3304h6(c3236eg.f23361b, c3236eg.f23362c, c3236eg.f23363d, C2968U2.m15238a(c3236eg.f23364e));
    }
}
