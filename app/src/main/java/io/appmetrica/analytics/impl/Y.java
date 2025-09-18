package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes2.dex */
public final class Y implements ProtobufConverter {
    public final U a;
    public final C4663k6 b;

    public Y() {
        this(new U(new C4894tm()), new C4663k6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final W5 fromModel(X x) {
        W5 w5 = new W5();
        w5.a = this.a.fromModel(x.a);
        String str = x.b;
        if (str != null) {
            w5.b = str;
        }
        w5.c = this.b.a(x.c);
        return w5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Y(U u, C4663k6 c4663k6) {
        this.a = u;
        this.b = c4663k6;
    }

    public final X a(W5 w5) {
        throw new UnsupportedOperationException();
    }
}
