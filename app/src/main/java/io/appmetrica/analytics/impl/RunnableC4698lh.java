package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* renamed from: io.appmetrica.analytics.impl.lh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4698lh implements Runnable {
    public final /* synthetic */ ReporterConfig a;
    public final /* synthetic */ C5009yh b;

    public RunnableC4698lh(C5009yh c5009yh, ReporterConfig reporterConfig) {
        this.b = c5009yh;
        this.a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5009yh c5009yh = this.b;
        ReporterConfig reporterConfig = this.a;
        C4753o0 c4753o0 = c5009yh.a;
        Context context = c5009yh.d;
        c4753o0.getClass();
        C4729n0.a(context, false).k().a(reporterConfig);
    }
}
