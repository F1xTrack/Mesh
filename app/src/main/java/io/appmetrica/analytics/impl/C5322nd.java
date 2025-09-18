package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.p026io.IExecutionPolicy;
import io.appmetrica.analytics.coreapi.internal.p026io.SslSocketFactoryProvider;
import io.appmetrica.analytics.modulesapi.internal.network.SimpleNetworkApi;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext;

/* renamed from: io.appmetrica.analytics.impl.nd */
/* loaded from: classes2.dex */
public final class C5322nd implements ServiceNetworkContext {

    /* renamed from: a */
    public final C5493u9 f32275a;

    /* renamed from: b */
    public final String f32276b = new C4958Ym().m20049a();

    /* renamed from: c */
    public final C5479tk f32277c = new C5479tk();

    public C5322nd(Context context) {
        this.f32275a = new C5493u9(context);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final IExecutionPolicy getExecutionPolicy() {
        return this.f32275a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SimpleNetworkApi getNetworkApi() {
        return this.f32277c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final SslSocketFactoryProvider getSslSocketFactoryProvider() {
        return C5244ka.f32038C.m20639x();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceNetworkContext
    public final String getUserAgent() {
        return this.f32276b;
    }
}
