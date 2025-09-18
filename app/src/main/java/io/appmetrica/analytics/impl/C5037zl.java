package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.zl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5037zl extends L2 {
    @Override // io.appmetrica.analytics.impl.L2, io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5013yl defaultValue() {
        C5013yl c5013yl = new C5013yl();
        c5013yl.i = new C4893tl();
        return c5013yl;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5013yl toState(byte[] bArr) throws IOException {
        return (C5013yl) MessageNano.mergeFrom(new C5013yl(), bArr);
    }
}
