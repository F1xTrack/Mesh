package com.p019vk.push.core.remote.config.omicron;

import com.p019vk.push.core.remote.config.omicron.retriever.DataQuery;
import com.p019vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import java.util.concurrent.ExecutorService;
import p000.AbstractC11989zx0;
import p000.C7360Ax0;
import p000.RunnableC1096RQ;

/* renamed from: com.vk.push.core.remote.config.omicron.b */
/* loaded from: classes2.dex */
public final class C2423b extends AbstractC11989zx0 {

    /* renamed from: f */
    public final ExecutorService f20538f;

    /* renamed from: g */
    public final /* synthetic */ C7360Ax0 f20539g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2423b(C7360Ax0 c7360Ax0, OmicronConfig omicronConfig) {
        super(c7360Ax0, omicronConfig);
        this.f20539g = c7360Ax0;
        this.f20538f = c7360Ax0.f488e.newSingleThreadExecutor();
    }

    @Override // p000.AbstractC11989zx0
    /* renamed from: c */
    public final Data mo13753c() {
        DataQuery dataQueryM26591b;
        SerializationDataStorage serializationDataStorage = this.f20539g.f484a;
        DataId dataId = this.f47113d;
        Data data = serializationDataStorage.getData(dataId);
        if (data == null) {
            data = Data.newBuilder().build();
            dataQueryM26591b = m26590a();
            this.f47112c.f20510f.onCacheMiss(dataId);
        } else {
            dataQueryM26591b = m26591b(data);
            m26592d();
        }
        this.f20538f.execute(new RunnableC1096RQ(this, 21, dataQueryM26591b));
        return data;
    }
}
