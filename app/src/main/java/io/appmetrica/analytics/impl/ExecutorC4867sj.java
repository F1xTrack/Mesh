package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.sj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC4867sj implements Executor {
    public final /* synthetic */ Handler a;

    public ExecutorC4867sj(Handler handler) {
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
