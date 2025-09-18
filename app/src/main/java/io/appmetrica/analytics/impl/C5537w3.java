package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.w3 */
/* loaded from: classes2.dex */
public final class C5537w3 implements ProtobufConverter {
    /* renamed from: a */
    public final C5405ql m21167a(C5487u3 c5487u3) {
        C5405ql c5405ql = new C5405ql();
        c5405ql.f32471a = c5487u3.f32671a;
        return c5405ql;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C5405ql c5405ql = new C5405ql();
        c5405ql.f32471a = ((C5487u3) obj).f32671a;
        return c5405ql;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C5487u3(((C5405ql) obj).f32471a);
    }

    /* renamed from: a */
    public final C5487u3 m21168a(C5405ql c5405ql) {
        return new C5487u3(c5405ql.f32471a);
    }
}
