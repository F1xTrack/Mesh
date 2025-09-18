package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: io.appmetrica.analytics.impl.sj */
/* loaded from: classes2.dex */
public final class ExecutorC5453sj implements Executor {

    /* renamed from: a */
    public final /* synthetic */ Handler f32575a;

    public ExecutorC5453sj(Handler handler) {
        this.f32575a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f32575a.post(runnable);
    }
}
