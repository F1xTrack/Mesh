package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.z9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5025z9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4869sl fromModel(C5001y9 c5001y9) {
        C4869sl c4869sl = new C4869sl();
        if (c5001y9 != null) {
            c4869sl.a = c5001y9.a;
        }
        return c4869sl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C5001y9(((C4869sl) obj).a);
    }

    public final C5001y9 a(C4869sl c4869sl) {
        return new C5001y9(c4869sl.a);
    }
}
