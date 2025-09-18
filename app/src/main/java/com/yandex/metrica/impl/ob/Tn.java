package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Tn extends Sn {
    public Tn(int i, int i2) {
        this(i, new Un(i2));
    }

    @Override // com.yandex.metrica.impl.ob.Sn
    public int b(Object obj) {
        return O2.c((String) obj).length;
    }

    public Tn(int i, Un un) {
        super(i, un);
    }
}
