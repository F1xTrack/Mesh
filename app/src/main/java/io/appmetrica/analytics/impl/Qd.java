package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes2.dex */
public final class Qd implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4941vl fromModel(Pd pd) {
        C4941vl c4941vl = new C4941vl();
        c4941vl.a = pd.a;
        c4941vl.b = pd.b;
        return c4941vl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C4941vl c4941vl = (C4941vl) obj;
        return new Pd(c4941vl.a, c4941vl.b);
    }

    public final Pd a(C4941vl c4941vl) {
        return new Pd(c4941vl.a, c4941vl.b);
    }
}
