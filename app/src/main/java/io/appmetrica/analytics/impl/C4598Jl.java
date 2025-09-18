package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.Jl */
/* loaded from: classes2.dex */
public final class C4598Jl implements ProtobufConverter {
    /* renamed from: a */
    public final C5580xl m19540a(C4574Il c4574Il) {
        C5580xl c5580xl = new C5580xl();
        c5580xl.f32832a = c4574Il.f30322a;
        return c5580xl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C5580xl c5580xl = new C5580xl();
        c5580xl.f32832a = ((C4574Il) obj).f30322a;
        return c5580xl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C4574Il(((C5580xl) obj).f32832a);
    }

    /* renamed from: a */
    public final C4574Il m19539a(C5580xl c5580xl) {
        return new C4574Il(c5580xl.f32832a);
    }
}
