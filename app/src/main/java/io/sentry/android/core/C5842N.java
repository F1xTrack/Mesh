package io.sentry.android.core;

import io.sentry.C5760E;
import java.util.TimerTask;

/* renamed from: io.sentry.android.core.N */
/* loaded from: classes2.dex */
public final class C5842N extends TimerTask {

    /* renamed from: a */
    public final /* synthetic */ LifecycleWatcher f33564a;

    public C5842N(LifecycleWatcher lifecycleWatcher) {
        this.f33564a = lifecycleWatcher;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        LifecycleWatcher lifecycleWatcher = this.f33564a;
        boolean z = lifecycleWatcher.f33559h;
        C5760E c5760e = lifecycleWatcher.f33558g;
        if (z) {
            c5760e.mo21367D();
        }
        c5760e.mo21364A().getReplayController().stop();
    }
}
