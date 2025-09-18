package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* loaded from: classes2.dex */
public final class Dk implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4495d6 fromModel(Ek ek) {
        C4495d6 c4495d6 = new C4495d6();
        c4495d6.a = (String) WrapUtils.getOrDefault(ek.a, c4495d6.a);
        c4495d6.b = (String) WrapUtils.getOrDefault(ek.b, c4495d6.b);
        c4495d6.c = ((Integer) WrapUtils.getOrDefault(ek.c, Integer.valueOf(c4495d6.c))).intValue();
        c4495d6.f = ((Integer) WrapUtils.getOrDefault(ek.d, Integer.valueOf(c4495d6.f))).intValue();
        c4495d6.d = (String) WrapUtils.getOrDefault(ek.e, c4495d6.d);
        c4495d6.e = ((Boolean) WrapUtils.getOrDefault(ek.f, Boolean.valueOf(c4495d6.e))).booleanValue();
        return c4495d6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Ek a(C4495d6 c4495d6) {
        throw new UnsupportedOperationException();
    }
}
