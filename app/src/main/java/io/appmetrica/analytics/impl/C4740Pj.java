package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.Pj */
/* loaded from: classes2.dex */
public final class C4740Pj extends AbstractC4627L2 {
    @Override // io.appmetrica.analytics.impl.AbstractC4627L2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C4692Nj();
    }

    /* renamed from: b */
    public final C4692Nj m19709b() {
        return new C4692Nj();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4627L2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C4692Nj();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4692Nj toState(byte[] bArr) {
        return (C4692Nj) MessageNano.mergeFrom(new C4692Nj(), bArr);
    }
}
