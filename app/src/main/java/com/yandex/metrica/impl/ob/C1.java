package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
class C1 implements G3<K3> {
    final /* synthetic */ B1 a;

    public C1(B1 b1) {
        this.a = b1;
    }

    @Override // com.yandex.metrica.impl.ob.G3
    public boolean a(H3 h3) {
        return !this.a.c.getPackageName().equals(((K3) h3).a);
    }
}
