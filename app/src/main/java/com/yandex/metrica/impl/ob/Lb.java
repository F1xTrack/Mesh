package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Lb extends Sn {
    public Lb(int i) {
        super(i);
    }

    @Override // com.yandex.metrica.impl.ob.Sn
    public int b(Object obj) {
        C3229yb c3229yb = (C3229yb) obj;
        if (c3229yb == null) {
            return 0;
        }
        return O2.c(c3229yb.b).length + 12;
    }
}
