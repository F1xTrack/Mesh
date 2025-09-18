package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.V */
/* loaded from: classes2.dex */
public final class C4863V implements Converter {

    /* renamed from: a */
    public final C5541w7 f30834a;

    /* renamed from: b */
    public final C5369pa f30835b;

    public C4863V() {
        this(new C5541w7(), new C5369pa(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4833Th fromModel(C4887W c4887w) {
        C4992a8 c4992a8 = new C4992a8();
        c4992a8.f31249b = this.f30834a.fromModel(c4887w.f30877a);
        C4575Im c4575ImMo19520a = this.f30835b.mo19520a(c4887w.f30878b);
        c4992a8.f31248a = StringUtils.getUTF8Bytes((String) c4575ImMo19520a.f30323a);
        return new C4833Th(c4992a8, new C5412r3(C5412r3.m21006b(c4575ImMo19520a)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4863V(C5541w7 c5541w7, C5369pa c5369pa) {
        this.f30834a = c5541w7;
        this.f30835b = c5369pa;
    }

    /* renamed from: a */
    public final C4887W m19898a(C4833Th c4833Th) {
        throw new UnsupportedOperationException();
    }
}
