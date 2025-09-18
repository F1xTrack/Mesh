package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Mf;

/* renamed from: com.yandex.metrica.impl.ob.u7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3120u7 implements InterfaceC2725ea<C2797h7, Mf> {
    private final A7 a;

    public C3120u7() {
        this(new A7());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2797h7 a(Mf mf) {
        throw new UnsupportedOperationException();
    }

    public C3120u7(A7 a7) {
        this.a = a7;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Mf b(C2797h7 c2797h7) {
        Mf mfB = this.a.b(c2797h7.a);
        mfB.h = 1;
        Mf.a aVar = new Mf.a();
        mfB.i = aVar;
        aVar.b = c2797h7.b;
        return mfB;
    }
}
