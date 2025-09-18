package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Z1 */
/* loaded from: classes2.dex */
public final class C4961Z1 extends AbstractC4627L2 {
    @Override // io.appmetrica.analytics.impl.AbstractC4627L2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C4937Y1();
    }

    /* renamed from: b */
    public final C4937Y1 m20052b() {
        return new C4937Y1();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4627L2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C4937Y1();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4937Y1 toState(byte[] bArr) throws IOException {
        return (C4937Y1) MessageNano.mergeFrom(new C4937Y1(), bArr);
    }
}
