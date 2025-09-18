package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Yi implements Zi {
    private final Si a;

    public Yi(Si si) {
        this.a = si;
    }

    @Override // com.yandex.metrica.impl.ob.Zi
    public void a() {
        K2 k2B;
        R1 r1L = P0.i().l();
        if (r1L == null || (k2B = this.a.b()) == null) {
            return;
        }
        r1L.b(k2B);
    }
}
