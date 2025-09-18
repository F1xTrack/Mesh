package com.p019vk.push.core.remote.config.omicron;

import com.p019vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import java.util.concurrent.ExecutorService;
import p000.AbstractC11989zx0;
import p000.C7360Ax0;
import p000.RunnableC0204DE;

/* renamed from: com.vk.push.core.remote.config.omicron.c */
/* loaded from: classes2.dex */
public final class C2424c extends AbstractC11989zx0 {

    /* renamed from: f */
    public final ExecutorService f20540f;

    /* renamed from: g */
    public final /* synthetic */ C7360Ax0 f20541g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2424c(C7360Ax0 c7360Ax0, OmicronConfig omicronConfig) {
        super(c7360Ax0, omicronConfig);
        this.f20541g = c7360Ax0;
        this.f20540f = c7360Ax0.f488e.newSingleThreadExecutor();
    }

    @Override // p000.AbstractC11989zx0
    /* renamed from: c */
    public final Data mo13753c() {
        SerializationDataStorage serializationDataStorage = this.f20541g.f484a;
        DataId dataId = this.f47113d;
        Data data = serializationDataStorage.getData(dataId);
        if (data == null) {
            data = Data.newBuilder().build();
            this.f47112c.f20510f.onCacheMiss(dataId);
        } else {
            m26592d();
        }
        this.f20540f.execute(new RunnableC0204DE(28, this));
        return data;
    }
}
