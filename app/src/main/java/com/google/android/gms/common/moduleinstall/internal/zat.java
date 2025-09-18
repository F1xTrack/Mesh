package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import p000.S81;

/* loaded from: classes.dex */
final class zat extends zaa {
    final /* synthetic */ S81 zaa;

    public zat(zay zayVar, S81 s81) {
        this.zaa = s81;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zad(Status status, ModuleInstallResponse moduleInstallResponse) {
        TaskUtil.trySetResultOrApiException(status, moduleInstallResponse, this.zaa);
    }
}
