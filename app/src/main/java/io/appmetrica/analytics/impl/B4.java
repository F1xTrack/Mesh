package io.appmetrica.analytics.impl;

import defpackage.AbstractC8235ym;

/* loaded from: classes2.dex */
public final class B4 extends C4827r3 {
    public final int b;

    public B4(int i, int i2) {
        super(i2);
        this.b = i;
    }

    @Override // io.appmetrica.analytics.impl.C4827r3
    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionTrimInfo{itemsDropped=");
        sb.append(this.b);
        sb.append(", bytesTruncated=");
        return AbstractC8235ym.l(sb, this.a, '}');
    }
}
