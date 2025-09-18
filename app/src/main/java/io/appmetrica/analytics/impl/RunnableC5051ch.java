package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ch */
/* loaded from: classes2.dex */
public final class RunnableC5051ch implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5601yh f31414a;

    public RunnableC5051ch(C5601yh c5601yh) {
        this.f31414a = c5601yh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f31414a;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).resumeSession();
    }
}
