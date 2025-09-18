package com.yandex.metrica.impl.ob;

import java.util.List;

/* loaded from: classes2.dex */
class Ll extends Zk<Kl> {
    public Ll(Kl kl) {
        this(kl, new Wk(102400, 200));
    }

    @Override // com.yandex.metrica.impl.ob.Zk
    public List a(Kl kl) {
        return kl.p;
    }

    @Override // com.yandex.metrica.impl.ob.Zk
    public int b(Kl kl) {
        return kl.k;
    }

    public Ll(Kl kl, Wk wk) {
        super(kl, wk);
    }
}
