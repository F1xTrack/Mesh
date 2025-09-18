package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;

/* renamed from: io.appmetrica.analytics.impl.Z3 */
/* loaded from: classes2.dex */
public final class C4963Z3 implements InterfaceC4630L5 {

    /* renamed from: a */
    public final Context f31141a;

    /* renamed from: b */
    public final C4702O5 f31142b = new C4702O5(new C5509v0(), new C5364p5());

    /* renamed from: c */
    public final C5413r4 f31143c = new C5413r4(C5388q4.m20928h().m20932b(getContext()));

    public C4963Z3(Context context) {
        this.f31141a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ClientStorageProvider getClientStorageProvider() {
        return this.f31143c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final Context getContext() {
        return this.f31141a;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4630L5, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final InterfaceC4678N5 getModuleAdRevenueContext() {
        return this.f31142b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.f31142b;
    }
}
