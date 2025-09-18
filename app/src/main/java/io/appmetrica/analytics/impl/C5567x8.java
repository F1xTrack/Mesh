package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.x8 */
/* loaded from: classes2.dex */
public final class C5567x8 extends C5592y8 implements ProtobufStateSerializer {
    public C5567x8(ProtobufStateSerializer<MessageNano> protobufStateSerializer, AESEncrypter aESEncrypter) {
        super(protobufStateSerializer, aESEncrypter);
    }
}
