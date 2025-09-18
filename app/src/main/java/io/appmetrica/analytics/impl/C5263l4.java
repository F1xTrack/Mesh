package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;

/* renamed from: io.appmetrica.analytics.impl.l4 */
/* loaded from: classes2.dex */
public final class C5263l4 implements ModuleServiceConfig {

    /* renamed from: a */
    public final SdkIdentifiers f32119a;

    /* renamed from: b */
    public final Object f32120b;

    public C5263l4(SdkIdentifiers sdkIdentifiers, Object obj) {
        this.f32119a = sdkIdentifiers;
        this.f32120b = obj;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final Object getFeaturesConfig() {
        return this.f32120b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.f32119a;
    }
}
