package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueReporter;

/* renamed from: io.appmetrica.analytics.impl.O5 */
/* loaded from: classes2.dex */
public final class C4702O5 implements InterfaceC4678N5 {

    /* renamed from: a */
    public final ModuleAdRevenueReporter f30548a;

    /* renamed from: b */
    public final C5364p5 f30549b;

    public C4702O5(ModuleAdRevenueReporter moduleAdRevenueReporter, C5364p5 c5364p5) {
        this.f30548a = moduleAdRevenueReporter;
        this.f30549b = c5364p5;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4678N5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final C5364p5 getAdRevenueProcessorsHolder() {
        return this.f30549b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4678N5, io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueReporter getAdRevenueReporter() {
        return this.f30548a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext
    public final ModuleAdRevenueProcessorsHolder getAdRevenueProcessorsHolder() {
        return this.f30549b;
    }
}
