package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* loaded from: classes2.dex */
public final class V implements Converter {
    public final C4951w7 a;
    public final C4787pa b;

    public V() {
        this(new C4951w7(), new C4787pa(20));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Th fromModel(W w) {
        C4422a8 c4422a8 = new C4422a8();
        c4422a8.b = this.a.fromModel(w.a);
        Im imA = this.b.a(w.b);
        c4422a8.a = StringUtils.getUTF8Bytes((String) imA.a);
        return new Th(c4422a8, new C4827r3(C4827r3.b(imA)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public V(C4951w7 c4951w7, C4787pa c4787pa) {
        this.a = c4951w7;
        this.b = c4787pa;
    }

    public final W a(Th th) {
        throw new UnsupportedOperationException();
    }
}
