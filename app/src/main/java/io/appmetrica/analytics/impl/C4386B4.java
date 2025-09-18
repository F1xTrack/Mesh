package io.appmetrica.analytics.impl;

import p000.AbstractC7222ym;

/* renamed from: io.appmetrica.analytics.impl.B4 */
/* loaded from: classes2.dex */
public final class C4386B4 extends C5412r3 {

    /* renamed from: b */
    public final int f29893b;

    public C4386B4(int i, int i2) {
        super(i2);
        this.f29893b = i;
    }

    @Override // io.appmetrica.analytics.impl.C5412r3
    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionTrimInfo{itemsDropped=");
        sb.append(this.f29893b);
        sb.append(", bytesTruncated=");
        return AbstractC7222ym.m26235l(sb, this.f32496a, '}');
    }
}
