package io.appmetrica.analytics.adrevenue.fyber.p023v3.internal;

import io.appmetrica.analytics.adrevenue.fyber.p023v3.impl.C4283b;
import io.appmetrica.analytics.adrevenue.fyber.p023v3.impl.C4284c;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;

/* loaded from: classes2.dex */
public class FyberClientModuleEntryPoint extends ModuleClientEntryPoint<Object> {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return "ad-revenue-fyber-v3";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(ClientContext clientContext) {
        if (ReflectionUtils.detectClassExists("com.fyber.fairbid.ads.Interstitial")) {
            clientContext.getModuleAdRevenueContext().getAdRevenueProcessorsHolder().register(new C4284c(new C4283b(), clientContext));
        }
    }
}
