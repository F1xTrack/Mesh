package io.appmetrica.analytics.adrevenue.admob.v23.impl;

import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;

/* renamed from: io.appmetrica.analytics.adrevenue.admob.v23.impl.e */
/* loaded from: classes2.dex */
public abstract class AbstractC4272e implements ModuleAdRevenueProcessor {

    /* renamed from: a */
    protected final C4269b f29548a;

    /* renamed from: b */
    public final ClientContext f29549b;

    public AbstractC4272e(C4269b c4269b, ClientContext clientContext) {
        this.f29548a = c4269b;
        this.f29549b = clientContext;
    }

    /* renamed from: a */
    public final void m19152a(ModuleAdRevenue moduleAdRevenue) {
        this.f29549b.getModuleAdRevenueContext().getAdRevenueReporter().reportAutoAdRevenue(moduleAdRevenue);
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AdMob was reported", new Object[0]);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return "AdMob";
    }
}
