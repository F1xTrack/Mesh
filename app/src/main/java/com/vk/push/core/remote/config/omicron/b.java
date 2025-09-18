package com.vk.push.core.remote.config.omicron;

import com.vk.push.core.remote.config.omicron.retriever.DataQuery;
import com.vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import defpackage.AbstractC8459zx0;
import defpackage.C0090Ax0;
import defpackage.RQ;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class b extends AbstractC8459zx0 {
    public final ExecutorService f;
    public final /* synthetic */ C0090Ax0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C0090Ax0 c0090Ax0, OmicronConfig omicronConfig) {
        super(c0090Ax0, omicronConfig);
        this.g = c0090Ax0;
        this.f = c0090Ax0.e.newSingleThreadExecutor();
    }

    @Override // defpackage.AbstractC8459zx0
    public final Data c() {
        DataQuery dataQueryB;
        SerializationDataStorage serializationDataStorage = this.g.a;
        DataId dataId = this.d;
        Data data = serializationDataStorage.getData(dataId);
        if (data == null) {
            data = Data.newBuilder().build();
            dataQueryB = a();
            this.c.f.onCacheMiss(dataId);
        } else {
            dataQueryB = b(data);
            d();
        }
        this.f.execute(new RQ(this, 21, dataQueryB));
        return data;
    }
}
