package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;

/* renamed from: io.appmetrica.analytics.impl.mh */
/* loaded from: classes2.dex */
public final class RunnableC5301mh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ReporterConfig f32227a;

    /* renamed from: b */
    public final /* synthetic */ C5601yh f32228b;

    public RunnableC5301mh(C5601yh c5601yh, ReporterConfig reporterConfig) {
        this.f32228b = c5601yh;
        this.f32227a = reporterConfig;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f32228b;
        ReporterConfig reporterConfig = this.f32227a;
        C5334o0 c5334o0 = c5601yh.f32856a;
        Context context = c5601yh.f32859d;
        c5334o0.getClass();
        C5309n0.m20763a(context, false).m20789k().mo20993a(reporterConfig);
    }
}
