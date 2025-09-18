package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ze, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5030ze extends L2 {
    @Override // io.appmetrica.analytics.impl.L2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new Ee();
    }

    public final Ee b() {
        return new Ee();
    }

    @Override // io.appmetrica.analytics.impl.L2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new Ee();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Ee toState(byte[] bArr) throws IOException {
        return (Ee) MessageNano.mergeFrom(new Ee(), bArr);
    }
}
