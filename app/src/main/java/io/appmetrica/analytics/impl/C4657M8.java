package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.M8 */
/* loaded from: classes2.dex */
public final class C4657M8 extends AbstractC4627L2 {
    @Override // io.appmetrica.analytics.impl.AbstractC4627L2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C5393q9();
    }

    /* renamed from: b */
    public final C5393q9 m19634b() {
        return new C5393q9();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4627L2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C5393q9();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5393q9 toState(byte[] bArr) throws IOException {
        return (C5393q9) MessageNano.mergeFrom(new C5393q9(), bArr);
    }
}
