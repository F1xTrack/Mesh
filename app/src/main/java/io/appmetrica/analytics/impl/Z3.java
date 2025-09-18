package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.modulesapi.internal.client.ClientStorageProvider;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueContext;

/* loaded from: classes2.dex */
public final class Z3 implements L5 {
    public final Context a;
    public final O5 b = new O5(new C4920v0(), new C4782p5());
    public final C4828r4 c = new C4828r4(C4805q4.h().b(getContext()));

    public Z3(Context context) {
        this.a = context;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ClientStorageProvider getClientStorageProvider() {
        return this.c;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final Context getContext() {
        return this.a;
    }

    @Override // io.appmetrica.analytics.impl.L5, io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final N5 getModuleAdRevenueContext() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.ClientContext
    public final ModuleAdRevenueContext getModuleAdRevenueContext() {
        return this.b;
    }
}
