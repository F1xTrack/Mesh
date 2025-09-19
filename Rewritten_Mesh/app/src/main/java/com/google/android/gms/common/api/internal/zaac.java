package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.Task;
import p000.InterfaceC8036Nx0;
import p000.S81;

/* loaded from: classes.dex */
final class zaac implements InterfaceC8036Nx0 {
    final /* synthetic */ S81 zaa;
    final /* synthetic */ zaad zab;

    public zaac(zaad zaadVar, S81 s81) {
        this.zab = zaadVar;
        this.zaa = s81;
    }

    @Override // p000.InterfaceC8036Nx0
    public final void onComplete(Task task) {
        this.zab.zab.remove(this.zaa);
    }
}
