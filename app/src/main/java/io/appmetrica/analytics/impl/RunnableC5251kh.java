package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.kh */
/* loaded from: classes2.dex */
public final class RunnableC5251kh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f32078a;

    /* renamed from: b */
    public final /* synthetic */ C5601yh f32079b;

    public RunnableC5251kh(C5601yh c5601yh, boolean z) {
        this.f32079b = c5601yh;
        this.f32078a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f32079b;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).setDataSendingEnabled(this.f32078a);
    }
}
