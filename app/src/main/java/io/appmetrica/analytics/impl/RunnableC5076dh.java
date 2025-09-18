package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dh */
/* loaded from: classes2.dex */
public final class RunnableC5076dh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5601yh f31489a;

    public RunnableC5076dh(C5601yh c5601yh) {
        this.f31489a = c5601yh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f31489a;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).pauseSession();
    }
}
