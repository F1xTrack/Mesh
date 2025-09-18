package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider;

/* renamed from: io.appmetrica.analytics.impl.B7 */
/* loaded from: classes2.dex */
public final class C4389B7 implements AskForPermissionStrategyModuleProvider {

    /* renamed from: a */
    public final C5422rd f29896a = new C5422rd();

    @Override // io.appmetrica.analytics.modulesapi.internal.common.AskForPermissionStrategyModuleProvider
    public final PermissionStrategy getAskForPermissionStrategy() {
        return this.f29896a;
    }
}
