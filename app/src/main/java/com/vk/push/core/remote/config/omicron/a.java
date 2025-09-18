package com.vk.push.core.remote.config.omicron;

import com.vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import defpackage.AbstractC8459zx0;
import defpackage.C0090Ax0;

/* loaded from: classes2.dex */
public final class a extends AbstractC8459zx0 {
    public final /* synthetic */ C0090Ax0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C0090Ax0 c0090Ax0, OmicronConfig omicronConfig) {
        super(c0090Ax0, omicronConfig);
        this.f = c0090Ax0;
    }

    @Override // defpackage.AbstractC8459zx0
    public final Data c() {
        SerializationDataStorage serializationDataStorage = this.f.a;
        DataId dataId = this.d;
        Data data = serializationDataStorage.getData(dataId);
        if (data != null) {
            d();
            return data;
        }
        Data dataBuild = Data.newBuilder().build();
        this.c.f.onCacheMiss(dataId);
        return dataBuild;
    }
}
