package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import java.util.concurrent.atomic.AtomicReference;
import p000.S81;

/* loaded from: classes.dex */
final class zau extends zaa {
    final /* synthetic */ AtomicReference zaa;
    final /* synthetic */ S81 zab;
    final /* synthetic */ InstallStatusListener zac;
    final /* synthetic */ zay zad;

    public zau(zay zayVar, AtomicReference atomicReference, S81 s81, InstallStatusListener installStatusListener) {
        this.zad = zayVar;
        this.zaa = atomicReference;
        this.zab = s81;
        this.zac = installStatusListener;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(Status status, ModuleInstallResponse moduleInstallResponse) {
        if (moduleInstallResponse != null) {
            this.zaa.set(moduleInstallResponse);
        }
        TaskUtil.trySetResultOrApiException(status, null, this.zab);
        if (!status.isSuccess() || (moduleInstallResponse != null && moduleInstallResponse.zaa())) {
            this.zad.doUnregisterEventListener(ListenerHolders.createListenerKey(this.zac, "InstallStatusListener"), 27306);
        }
    }
}
