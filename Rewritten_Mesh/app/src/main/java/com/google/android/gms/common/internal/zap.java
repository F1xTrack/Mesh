package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import java.util.concurrent.TimeUnit;
import p000.S81;

/* loaded from: classes.dex */
final class zap implements PendingResult.StatusListener {
    final /* synthetic */ PendingResult zaa;
    final /* synthetic */ S81 zab;
    final /* synthetic */ PendingResultUtil.ResultConverter zac;
    final /* synthetic */ zas zad;

    public zap(PendingResult pendingResult, S81 s81, PendingResultUtil.ResultConverter resultConverter, zas zasVar) {
        this.zaa = pendingResult;
        this.zab = s81;
        this.zac = resultConverter;
        this.zad = zasVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        if (!status.isSuccess()) {
            this.zab.m7183a(ApiExceptionUtil.fromStatus(status));
        } else {
            this.zab.m7184b(this.zac.convert(this.zaa.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
