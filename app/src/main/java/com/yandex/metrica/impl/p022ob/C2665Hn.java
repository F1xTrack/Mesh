package com.yandex.metrica.impl.p022ob;

import p000.AbstractC7222ym;

/* renamed from: com.yandex.metrica.impl.ob.Hn */
/* loaded from: classes2.dex */
public class C2665Hn extends C2590En {

    /* renamed from: b */
    public final int f21381b;

    public C2665Hn(int i, int i2) {
        super(i2);
        this.f21381b = i;
    }

    @Override // com.yandex.metrica.impl.p022ob.C2590En
    public String toString() {
        StringBuilder sb = new StringBuilder("CollectionTrimInfo{itemsDropped=");
        sb.append(this.f21381b);
        sb.append(", bytesTruncated=");
        return AbstractC7222ym.m26235l(sb, this.f21158a, '}');
    }
}
