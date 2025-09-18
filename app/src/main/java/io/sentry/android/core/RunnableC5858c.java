package io.sentry.android.core;

import android.app.Activity;
import androidx.core.app.FrameMetricsAggregator;

/* renamed from: io.sentry.android.core.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5858c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f33654a;

    /* renamed from: b */
    public final /* synthetic */ C5863e f33655b;

    /* renamed from: c */
    public final /* synthetic */ Activity f33656c;

    public /* synthetic */ RunnableC5858c(C5863e c5863e, Activity activity, int i) {
        this.f33654a = i;
        this.f33655b = c5863e;
        this.f33656c = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f33654a) {
            case 0:
                this.f33655b.f33670a.f16089a.mo2450a(this.f33656c);
                break;
            default:
                FrameMetricsAggregator frameMetricsAggregator = this.f33655b.f33670a;
                frameMetricsAggregator.f16089a.mo2453l(this.f33656c);
                break;
        }
    }
}
