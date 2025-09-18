package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateSerializer;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.impl.bf */
/* loaded from: classes2.dex */
public final class C5024bf implements ProtobufStateStorage {

    /* renamed from: a */
    public final String f31318a;

    /* renamed from: b */
    public final IBinaryDataHelper f31319b;

    /* renamed from: c */
    public final ProtobufStateSerializer f31320c;

    /* renamed from: d */
    public final ProtobufConverter f31321d;

    public C5024bf(String str, IBinaryDataHelper iBinaryDataHelper, ProtobufStateSerializer<MessageNano> protobufStateSerializer, ProtobufConverter<Object, MessageNano> protobufConverter) {
        this.f31318a = str;
        this.f31319b = iBinaryDataHelper;
        this.f31320c = protobufStateSerializer;
        this.f31321d = protobufConverter;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void delete() {
        this.f31319b.remove(this.f31318a);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final Object read() {
        try {
            byte[] bArr = this.f31319b.get(this.f31318a);
            if (bArr != null && bArr.length != 0) {
                return this.f31321d.toModel((MessageNano) this.f31320c.toState(bArr));
            }
            return this.f31321d.toModel((MessageNano) this.f31320c.defaultValue());
        } catch (Throwable unused) {
            return this.f31321d.toModel((MessageNano) this.f31320c.defaultValue());
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage
    public final void save(Object obj) {
        this.f31319b.insert(this.f31318a, this.f31320c.toByteArray((MessageNano) this.f31321d.fromModel(obj)));
    }
}
