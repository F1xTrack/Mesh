package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.gb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4573gb implements Converter {
    public final C4980xc a;

    public C4573gb() {
        this(new C4980xc(new Nm()));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(Mm mm) {
        return MessageNano.toByteArray((MessageNano) this.a.a.fromModel(mm));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4573gb(C4980xc c4980xc) {
        this.a = c4980xc;
    }

    public final Mm a(byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
