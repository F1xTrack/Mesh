package com.google.android.gms.common.util.concurrent;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.concurrent.Executor;
import p000.NM1;

@KeepForSdk
/* loaded from: classes.dex */
public class HandlerExecutor implements Executor {
    private final Handler zza;

    @KeepForSdk
    public HandlerExecutor(Looper looper) {
        this.zza = new NM1(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
