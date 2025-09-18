package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.n9, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4738n9 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4690l9 fromModel(C4714m9 c4714m9) {
        C4690l9 c4690l9 = new C4690l9();
        String str = c4714m9.a;
        if (str != null) {
            c4690l9.a = str.getBytes();
        }
        return c4690l9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4714m9 toModel(C4690l9 c4690l9) {
        return new C4714m9(new String(c4690l9.a));
    }
}
