package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.gb */
/* loaded from: classes2.dex */
public final class C5145gb implements Converter {

    /* renamed from: a */
    public final C5571xc f31758a;

    public C5145gb() {
        this(new C5571xc(new C4695Nm()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(C4671Mm c4671Mm) {
        return MessageNano.toByteArray((MessageNano) this.f31758a.f32821a.fromModel(c4671Mm));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5145gb(C5571xc c5571xc) {
        this.f31758a = c5571xc;
    }

    /* renamed from: a */
    public final C4671Mm m20449a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
