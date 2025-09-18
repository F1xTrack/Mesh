package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import p000.S81;

/* loaded from: classes.dex */
final class zas extends zaa {
    final /* synthetic */ S81 zaa;

    public zas(zay zayVar, S81 s81) {
        this.zaa = s81;
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zab(Status status) {
        TaskUtil.trySetResultOrApiException(status, null, this.zaa);
    }
}
