package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bh */
/* loaded from: classes2.dex */
public final class RunnableC5026bh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Throwable f31324a;

    /* renamed from: b */
    public final /* synthetic */ C5601yh f31325b;

    public RunnableC5026bh(C5601yh c5601yh, Throwable th) {
        this.f31325b = c5601yh;
        this.f31324a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f31325b;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).reportUnhandledException(this.f31324a);
    }
}
