package com.p019vk.push.core.remote.config.omicron;

import com.p019vk.push.core.remote.config.omicron.storage.SerializationDataStorage;
import p000.AbstractC11989zx0;
import p000.C7360Ax0;

/* renamed from: com.vk.push.core.remote.config.omicron.a */
/* loaded from: classes2.dex */
public final class C2422a extends AbstractC11989zx0 {

    /* renamed from: f */
    public final /* synthetic */ C7360Ax0 f20537f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2422a(C7360Ax0 c7360Ax0, OmicronConfig omicronConfig) {
        super(c7360Ax0, omicronConfig);
        this.f20537f = c7360Ax0;
    }

    @Override // p000.AbstractC11989zx0
    /* renamed from: c */
    public final Data mo13753c() {
        SerializationDataStorage serializationDataStorage = this.f20537f.f484a;
        DataId dataId = this.f47113d;
        Data data = serializationDataStorage.getData(dataId);
        if (data != null) {
            m26592d();
            return data;
        }
        Data dataBuild = Data.newBuilder().build();
        this.f47112c.f20510f.onCacheMiss(dataId);
        return dataBuild;
    }
}
