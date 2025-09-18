package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.Qd */
/* loaded from: classes2.dex */
public final class C4758Qd implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5530vl fromModel(C4734Pd c4734Pd) {
        C5530vl c5530vl = new C5530vl();
        c5530vl.f32743a = c4734Pd.f30616a;
        c5530vl.f32744b = c4734Pd.f30617b;
        return c5530vl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C5530vl c5530vl = (C5530vl) obj;
        return new C4734Pd(c5530vl.f32743a, c5530vl.f32744b);
    }

    /* renamed from: a */
    public final C4734Pd m19744a(C5530vl c5530vl) {
        return new C4734Pd(c5530vl.f32743a, c5530vl.f32744b);
    }
}
