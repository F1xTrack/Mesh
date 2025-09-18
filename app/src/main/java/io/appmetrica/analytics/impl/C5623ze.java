package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ze */
/* loaded from: classes2.dex */
public final class C5623ze extends AbstractC4627L2 {
    @Override // io.appmetrica.analytics.impl.AbstractC4627L2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C4471Ee();
    }

    /* renamed from: b */
    public final C4471Ee m21238b() {
        return new C4471Ee();
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4627L2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C4471Ee();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4471Ee toState(byte[] bArr) throws IOException {
        return (C4471Ee) MessageNano.mergeFrom(new C4471Ee(), bArr);
    }
}
