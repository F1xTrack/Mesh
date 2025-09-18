package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* renamed from: io.appmetrica.analytics.impl.Dk */
/* loaded from: classes2.dex */
public final class C4452Dk implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5065d6 fromModel(C4477Ek c4477Ek) {
        C5065d6 c5065d6 = new C5065d6();
        c5065d6.f31464a = (String) WrapUtils.getOrDefault(c4477Ek.f30105a, c5065d6.f31464a);
        c5065d6.f31465b = (String) WrapUtils.getOrDefault(c4477Ek.f30106b, c5065d6.f31465b);
        c5065d6.f31466c = ((Integer) WrapUtils.getOrDefault(c4477Ek.f30107c, Integer.valueOf(c5065d6.f31466c))).intValue();
        c5065d6.f31469f = ((Integer) WrapUtils.getOrDefault(c4477Ek.f30108d, Integer.valueOf(c5065d6.f31469f))).intValue();
        c5065d6.f31467d = (String) WrapUtils.getOrDefault(c4477Ek.f30109e, c5065d6.f31467d);
        c5065d6.f31468e = ((Boolean) WrapUtils.getOrDefault(c4477Ek.f30110f, Boolean.valueOf(c5065d6.f31468e))).booleanValue();
        return c5065d6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final C4477Ek m19332a(C5065d6 c5065d6) {
        throw new UnsupportedOperationException();
    }
}
