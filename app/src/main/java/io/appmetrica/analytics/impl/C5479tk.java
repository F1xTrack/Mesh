package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;

/* renamed from: io.appmetrica.analytics.impl.tk */
/* loaded from: classes2.dex */
public final class C5479tk implements SimpleNetworkApi {

    /* renamed from: a */
    public final CacheControlHttpsConnectionPerformer f32647a = new CacheControlHttpsConnectionPerformer(((C4402Bk) C5244ka.m20614h().m20639x()).getSslSocketFactory());

    @Override // io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi
    public final void performRequestWithCacheControl(String str, NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.f32647a.performConnection(str, new C5512v3(networkClientWithCacheControl));
    }
}
