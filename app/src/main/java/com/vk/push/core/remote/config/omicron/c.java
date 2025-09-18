package com.vk.push.core.remote.config.omicron;

import com.vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import defpackage.AbstractC8459zx0;
import defpackage.C0090Ax0;
import defpackage.DE;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class c extends AbstractC8459zx0 {
    public final ExecutorService f;
    public final /* synthetic */ C0090Ax0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C0090Ax0 c0090Ax0, OmicronConfig omicronConfig) {
        super(c0090Ax0, omicronConfig);
        this.g = c0090Ax0;
        this.f = c0090Ax0.e.newSingleThreadExecutor();
    }

    @Override // defpackage.AbstractC8459zx0
    public final Data c() {
        SerializationDataStorage serializationDataStorage = this.g.a;
        DataId dataId = this.d;
        Data data = serializationDataStorage.getData(dataId);
        if (data == null) {
            data = Data.newBuilder().build();
            this.c.f.onCacheMiss(dataId);
        } else {
            d();
        }
        this.f.execute(new DE(28, this));
        return data;
    }
}
