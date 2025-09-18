package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes2.dex */
public final class Fl implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4965wl fromModel(El el) {
        C4965wl c4965wl = new C4965wl();
        c4965wl.a = el.a;
        return c4965wl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new El(((C4965wl) obj).a);
    }

    public final El a(C4965wl c4965wl) {
        return new El(c4965wl.a);
    }
}
