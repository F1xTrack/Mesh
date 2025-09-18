package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class b0 extends io.sentry.android.core.performance.a {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ SentryPerformanceProvider b;

    public b0(SentryPerformanceProvider sentryPerformanceProvider, AtomicBoolean atomicBoolean) {
        this.b = sentryPerformanceProvider;
        this.a = atomicBoolean;
    }

    @Override // io.sentry.android.core.performance.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.a.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            final int i = 0;
            io.sentry.android.core.internal.util.f.a(activity, new Runnable(this) { // from class: io.sentry.android.core.a0
                public final /* synthetic */ b0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            this.b.b.a();
                            break;
                        default:
                            this.b.b.a();
                            break;
                    }
                }
            }, this.b.e);
        } else {
            final int i2 = 1;
            new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.a0
                public final /* synthetic */ b0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.b.b.a();
                            break;
                        default:
                            this.b.b.a();
                            break;
                    }
                }
            });
        }
    }
}
