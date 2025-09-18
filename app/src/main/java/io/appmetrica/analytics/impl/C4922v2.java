package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.v2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4922v2 extends L2 {
    @Override // io.appmetrica.analytics.impl.L2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C4898u2();
    }

    public final C4898u2 b() {
        return new C4898u2();
    }

    @Override // io.appmetrica.analytics.impl.L2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C4898u2();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4898u2 toState(byte[] bArr) throws IOException {
        return (C4898u2) MessageNano.mergeFrom(new C4898u2(), bArr);
    }
}
