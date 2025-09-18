package io.sentry.android.core;

import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class N extends TimerTask {
    public final /* synthetic */ LifecycleWatcher a;

    public N(LifecycleWatcher lifecycleWatcher) {
        this.a = lifecycleWatcher;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        LifecycleWatcher lifecycleWatcher = this.a;
        boolean z = lifecycleWatcher.h;
        io.sentry.E e = lifecycleWatcher.g;
        if (z) {
            e.D();
        }
        e.A().getReplayController().stop();
    }
}
