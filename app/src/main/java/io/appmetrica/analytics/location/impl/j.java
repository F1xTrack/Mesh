package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* loaded from: classes2.dex */
public final class j implements Runnable {
    public final /* synthetic */ i a;
    public final /* synthetic */ k b;

    public j(k kVar, i iVar) {
        this.b = kVar;
        this.a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.b.c;
        i iVar = this.a;
        pVar.a = iVar;
        CacheArguments cacheArguments = iVar.b;
        pVar.b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
