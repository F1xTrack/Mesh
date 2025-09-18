package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4454bf implements ProtobufStateStorage {
    public final String a;
    public final IBinaryDataHelper b;
    public final ProtobufStateSerializer c;
    public final ProtobufConverter d;

    public C4454bf(String str, IBinaryDataHelper iBinaryDataHelper, ProtobufStateSerializer<MessageNano> protobufStateSerializer, ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.a = str;
        this.b = iBinaryDataHelper;
        this.c = protobufStateSerializer;
        this.d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.b.remove(this.a);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final Object read() {
        try {
            byte[] bArr = this.b.get(this.a);
            if (bArr != null && bArr.length != 0) {
                return this.d.toModel((MessageNano) this.c.toState(bArr));
            }
            return this.d.toModel((MessageNano) this.c.defaultValue());
        } catch (Throwable unused) {
            return this.d.toModel((MessageNano) this.c.defaultValue());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(Object obj) {
        this.b.insert(this.a, this.c.toByteArray((MessageNano) this.d.fromModel(obj)));
    }
}
