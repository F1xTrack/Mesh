package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.zl */
/* loaded from: classes2.dex */
public final class C5630zl extends AbstractC4627L2 {
    @Override // io.appmetrica.analytics.impl.AbstractC4627L2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5605yl defaultValue() {
        C5605yl c5605yl = new C5605yl();
        c5605yl.f32879i = new C5480tl();
        return c5605yl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5605yl toState(byte[] bArr) throws IOException {
        return (C5605yl) MessageNano.mergeFrom(new C5605yl(), bArr);
    }
}
