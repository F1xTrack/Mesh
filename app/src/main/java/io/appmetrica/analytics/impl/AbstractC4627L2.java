package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.L2 */
/* loaded from: classes2.dex */
public abstract class AbstractC4627L2 implements ProtobufStateSerializer {
    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public abstract MessageNano defaultValue();

    /* renamed from: a */
    public final byte[] m19562a(MessageNano messageNano) {
        return MessageNano.toByteArray(messageNano);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.StateSerializer
    public final byte[] toByteArray(Object obj) {
        return MessageNano.toByteArray((MessageNano) obj);
    }
}
