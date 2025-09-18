package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* loaded from: classes2.dex */
public final class Pj extends L2 {
    @Override // io.appmetrica.analytics.impl.L2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new Nj();
    }

    public final Nj b() {
        return new Nj();
    }

    @Override // io.appmetrica.analytics.impl.L2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new Nj();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Nj toState(byte[] bArr) {
        return (Nj) MessageNano.mergeFrom(new Nj(), bArr);
    }
}
