package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes2.dex */
public final class Jl implements ProtobufConverter {
    public final C4989xl a(Il il) {
        C4989xl c4989xl = new C4989xl();
        c4989xl.a = il.a;
        return c4989xl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C4989xl c4989xl = new C4989xl();
        c4989xl.a = ((Il) obj).a;
        return c4989xl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new Il(((C4989xl) obj).a);
    }

    public final Il a(C4989xl c4989xl) {
        return new Il(c4989xl.a);
    }
}
