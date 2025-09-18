package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ModuleEvent;

/* renamed from: io.appmetrica.analytics.impl.nh */
/* loaded from: classes2.dex */
public final class RunnableC5326nh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ModuleEvent f32297a;

    /* renamed from: b */
    public final /* synthetic */ C5601yh f32298b;

    public RunnableC5326nh(C5601yh c5601yh, ModuleEvent moduleEvent) {
        this.f32298b = c5601yh;
        this.f32297a = moduleEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f32298b;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).reportEvent(this.f32297a);
    }
}
