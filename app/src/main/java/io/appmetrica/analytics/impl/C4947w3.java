package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.w3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4947w3 implements ProtobufConverter {
    public final C4822ql a(C4899u3 c4899u3) {
        C4822ql c4822ql = new C4822ql();
        c4822ql.a = c4899u3.a;
        return c4822ql;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        C4822ql c4822ql = new C4822ql();
        c4822ql.a = ((C4899u3) obj).a;
        return c4822ql;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        return new C4899u3(((C4822ql) obj).a);
    }

    public final C4899u3 a(C4822ql c4822ql) {
        return new C4899u3(c4822ql.a);
    }
}
