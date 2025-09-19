package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import p000.S81;

/* loaded from: classes.dex */
final class zav extends IStatusCallback.Stub {
    final /* synthetic */ S81 zaa;

    public zav(zay zayVar, S81 s81) {
        this.zaa = s81;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        TaskUtil.trySetResultOrApiException(status, Boolean.TRUE, this.zaa);
    }
}
