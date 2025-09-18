package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* renamed from: io.appmetrica.analytics.remotepermissions.impl.b */
/* loaded from: classes2.dex */
public final class C5690b implements Converter {

    /* renamed from: a */
    public final C5691c f33185a = new C5691c();

    /* renamed from: a */
    public final byte[] m21300a(C5689a c5689a) {
        return MessageNano.toByteArray(this.f33185a.fromModel(c5689a));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f33185a.fromModel((C5689a) obj));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5689a toModel(byte[] bArr) {
        return this.f33185a.toModel((C5694f) MessageNano.mergeFrom(new C5694f(), bArr));
    }
}
