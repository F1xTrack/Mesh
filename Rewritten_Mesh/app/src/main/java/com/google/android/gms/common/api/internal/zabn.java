package com.google.android.gms.common.api.internal;

/* loaded from: classes.dex */
final class zabn implements Runnable {
    final /* synthetic */ int zaa;
    final /* synthetic */ zabq zab;

    public zabn(zabq zabqVar, int i) {
        this.zab = zabqVar;
        this.zaa = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zab.zaI(this.zaa);
    }
}
