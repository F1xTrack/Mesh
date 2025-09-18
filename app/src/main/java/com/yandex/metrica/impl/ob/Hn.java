package com.yandex.metrica.impl.ob;

import defpackage.AbstractC8235ym;

/* loaded from: classes2.dex */
public class Hn extends En {
    public final int b;

    public Hn(int i, int i2) {
        super(i2);
        this.b = i;
    }

    @Override // com.yandex.metrica.impl.ob.En
    public String toString() {
        StringBuilder sb = new StringBuilder("CollectionTrimInfo{itemsDropped=");
        sb.append(this.b);
        sb.append(", bytesTruncated=");
        return AbstractC8235ym.l(sb, this.a, '}');
    }
}
