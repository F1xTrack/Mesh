package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class M8 extends L2 {
    @Override // io.appmetrica.analytics.impl.L2
    /* renamed from: a */
    public final MessageNano defaultValue() {
        return new C4810q9();
    }

    public final C4810q9 b() {
        return new C4810q9();
    }

    @Override // io.appmetrica.analytics.impl.L2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final Object defaultValue() {
        return new C4810q9();
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4810q9 toState(byte[] bArr) throws IOException {
        return (C4810q9) MessageNano.mergeFrom(new C4810q9(), bArr);
    }
}
