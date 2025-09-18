package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.P3 */
/* loaded from: classes2.dex */
public final class C4724P3 extends AbstractC4627L2 {
    @Override // io.appmetrica.analytics.impl.AbstractC4627L2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C4700O3();
    }

    /* renamed from: b */
    public final C4700O3 m19706b() {
        return new C4700O3();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4627L2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C4700O3();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4700O3 toState(byte[] bArr) {
        return (C4700O3) MessageNano.mergeFrom(new C4700O3(), bArr);
    }
}
