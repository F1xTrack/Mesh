package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.n9 */
/* loaded from: classes2.dex */
public final class C5318n9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5268l9 fromModel(C5293m9 c5293m9) {
        C5268l9 c5268l9 = new C5268l9();
        String str = c5293m9.f32189a;
        if (str != null) {
            c5268l9.f32143a = str.getBytes();
        }
        return c5268l9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5293m9 toModel(C5268l9 c5268l9) {
        return new C5293m9(new String(c5268l9.f32143a));
    }
}
