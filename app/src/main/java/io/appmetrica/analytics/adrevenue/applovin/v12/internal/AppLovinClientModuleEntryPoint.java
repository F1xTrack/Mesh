package io.appmetrica.analytics.adrevenue.applovin.v12.internal;

import io.appmetrica.analytics.adrevenue.applovin.v12.impl.C4278a;
import io.appmetrica.analytics.adrevenue.applovin.v12.impl.C4279b;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint;
import kotlin.Metadata;

@Metadata(m22266d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\n8\u0016X\u0096D¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m22267d2 = {"Lio/appmetrica/analytics/adrevenue/applovin/v12/internal/AppLovinClientModuleEntryPoint;", "Lio/appmetrica/analytics/modulesapi/internal/client/ModuleClientEntryPoint;", "", "<init>", "()V", "Lio/appmetrica/analytics/modulesapi/internal/client/ClientContext;", "clientContext", "LTf1;", "initClientSide", "(Lio/appmetrica/analytics/modulesapi/internal/client/ClientContext;)V", "", "a", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "ad-revenue-applovin-v12_release"}, m22268k = 1, m22269mv = {1, 6, 0})
/* loaded from: classes2.dex */
public final class AppLovinClientModuleEntryPoint extends ModuleClientEntryPoint<Object> {

    /* renamed from: a, reason: from kotlin metadata */
    private final String identifier = "ad-revenue-applovin-v12";

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public String getIdentifier() {
        return this.identifier;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ModuleClientEntryPoint
    public void initClientSide(ClientContext clientContext) {
        if (ReflectionUtils.detectClassExists("com.applovin.sdk.AppLovinSdk")) {
            clientContext.getModuleAdRevenueContext().getAdRevenueProcessorsHolder().register(new C4279b(new C4278a(), clientContext));
        }
    }
}
