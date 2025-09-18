package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.Y */
/* loaded from: classes2.dex */
public final class C4935Y implements ProtobufConverter {

    /* renamed from: a */
    public final C4839U f31078a;

    /* renamed from: b */
    public final C5240k6 f31079b;

    public C4935Y() {
        this(new C4839U(new C5481tm()), new C5240k6());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4893W5 fromModel(C4911X c4911x) {
        C4893W5 c4893w5 = new C4893W5();
        c4893w5.f30921a = this.f31078a.fromModel(c4911x.f30993a);
        String str = c4911x.f30994b;
        if (str != null) {
            c4893w5.f30922b = str;
        }
        c4893w5.f30923c = this.f31079b.m19468a(c4911x.f30995c);
        return c4893w5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4935Y(C4839U c4839u, C5240k6 c5240k6) {
        this.f31078a = c4839u;
        this.f31079b = c5240k6;
    }

    /* renamed from: a */
    public final C4911X m20012a(C4893W5 c4893w5) {
        throw new UnsupportedOperationException();
    }
}
