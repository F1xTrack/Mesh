package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.Fl */
/* loaded from: classes2.dex */
public final class C4502Fl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5555wl fromModel(C4478El c4478El) {
        C5555wl c5555wl = new C5555wl();
        c5555wl.f32781a = c4478El.f30111a;
        return c5555wl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C4478El(((C5555wl) obj).f32781a);
    }

    /* renamed from: a */
    public final C4478El m19421a(C5555wl c5555wl) {
        return new C4478El(c5555wl.f32781a);
    }
}
