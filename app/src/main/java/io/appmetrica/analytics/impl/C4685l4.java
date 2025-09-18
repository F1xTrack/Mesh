package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig;

/* renamed from: io.appmetrica.analytics.impl.l4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4685l4 implements ModuleServiceConfig {
    public final SdkIdentifiers a;
    public final Object b;

    public C4685l4(SdkIdentifiers sdkIdentifiers, Object obj) {
        this.a = sdkIdentifiers;
        this.b = obj;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final Object getFeaturesConfig() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleServiceConfig
    public final SdkIdentifiers getIdentifiers() {
        return this.a;
    }
}
