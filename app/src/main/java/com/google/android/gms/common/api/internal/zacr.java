package com.google.android.gms.common.api.internal;

import p000.C9946jx1;

/* loaded from: classes.dex */
final class zacr implements Runnable {
    final /* synthetic */ C9946jx1 zaa;
    final /* synthetic */ zact zab;

    public zacr(zact zactVar, C9946jx1 c9946jx1) {
        this.zab = zactVar;
        this.zaa = c9946jx1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zact.zad(this.zab, this.zaa);
    }
}
