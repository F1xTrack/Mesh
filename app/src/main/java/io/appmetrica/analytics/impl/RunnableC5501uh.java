package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.uh */
/* loaded from: classes2.dex */
public final class RunnableC5501uh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5601yh f32691a;

    public RunnableC5501uh(C5601yh c5601yh) {
        this.f32691a = c5601yh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f32691a;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).clearAppEnvironment();
    }
}
