package io.sentry.android.core;

import android.app.Activity;
import androidx.core.app.FrameMetricsAggregator;

/* renamed from: io.sentry.android.core.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5086c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ C5088e b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ RunnableC5086c(C5088e c5088e, Activity activity, int i) {
        this.a = i;
        this.b = c5088e;
        this.c = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a.a.a(this.c);
                break;
            default:
                FrameMetricsAggregator frameMetricsAggregator = this.b.a;
                frameMetricsAggregator.a.l(this.c);
                break;
        }
    }
}
