package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.v2 */
/* loaded from: classes2.dex */
public final class C5511v2 extends AbstractC4627L2 {
    @Override // io.appmetrica.analytics.impl.AbstractC4627L2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C5486u2();
    }

    /* renamed from: b */
    public final C5486u2 m21154b() {
        return new C5486u2();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4627L2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C5486u2();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5486u2 toState(byte[] bArr) throws IOException {
        return (C5486u2) MessageNano.mergeFrom(new C5486u2(), bArr);
    }
}
