package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueReporter;

/* loaded from: classes2.dex */
public final class O5 implements N5 {
    public final ModuleAdRevenueReporter a;
    public final C4782p5 b;

    public O5(ModuleAdRevenueReporter moduleAdRevenueReporter, C4782p5 c4782p5) {
        this.a = moduleAdRevenueReporter;
        this.b = c4782p5;
    }

    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final C4782p5 getAdRevenueProcessorsHolder() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.N5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueReporter getAdRevenueReporter() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.b;
    }
}
