package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import io.sentry.android.core.internal.util.ViewTreeObserverOnDrawListenerC5886f;
import io.sentry.android.core.performance.AbstractC5901a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: io.sentry.android.core.b0 */
/* loaded from: classes2.dex */
public final class C5857b0 extends AbstractC5901a {

    /* renamed from: a */
    public final /* synthetic */ AtomicBoolean f33652a;

    /* renamed from: b */
    public final /* synthetic */ SentryPerformanceProvider f33653b;

    public C5857b0(SentryPerformanceProvider sentryPerformanceProvider, AtomicBoolean atomicBoolean) {
        this.f33653b = sentryPerformanceProvider;
        this.f33652a = atomicBoolean;
    }

    @Override // io.sentry.android.core.performance.AbstractC5901a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f33652a.get()) {
            return;
        }
        if (activity.getWindow() != null) {
            final int i = 0;
            ViewTreeObserverOnDrawListenerC5886f.m21584a(activity, new Runnable(this) { // from class: io.sentry.android.core.a0

                /* renamed from: b */
                public final /* synthetic */ C5857b0 f33640b;

                {
                    this.f33640b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            this.f33640b.f33653b.m21542a();
                            break;
                        default:
                            this.f33640b.f33653b.m21542a();
                            break;
                    }
                }
            }, this.f33653b.f33608e);
        } else {
            final int i2 = 1;
            new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: io.sentry.android.core.a0

                /* renamed from: b */
                public final /* synthetic */ C5857b0 f33640b;

                {
                    this.f33640b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            this.f33640b.f33653b.m21542a();
                            break;
                        default:
                            this.f33640b.f33653b.m21542a();
                            break;
                    }
                }
            });
        }
    }
}
