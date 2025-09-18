package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.network.NetworkClientWithCacheControl;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.networktasks.internal.CacheControlHttpsConnectionPerformer;

/* renamed from: io.appmetrica.analytics.impl.tk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4892tk implements SimpleNetworkApi {
    public final CacheControlHttpsConnectionPerformer a = new CacheControlHttpsConnectionPerformer(((Bk) C4667ka.h().x()).getSslSocketFactory());

    @Override // io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi
    public final void performRequestWithCacheControl(String str, NetworkClientWithCacheControl networkClientWithCacheControl) {
        this.a.performConnection(str, new C4923v3(networkClientWithCacheControl));
    }
}
