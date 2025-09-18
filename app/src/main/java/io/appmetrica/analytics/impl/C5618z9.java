package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.z9 */
/* loaded from: classes2.dex */
public final class C5618z9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5455sl fromModel(C5593y9 c5593y9) {
        C5455sl c5455sl = new C5455sl();
        if (c5593y9 != null) {
            c5455sl.f32579a = c5593y9.f32852a;
        }
        return c5455sl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C5593y9(((C5455sl) obj).f32579a);
    }

    /* renamed from: a */
    public final C5593y9 m21234a(C5455sl c5455sl) {
        return new C5593y9(c5455sl.f32579a);
    }
}
