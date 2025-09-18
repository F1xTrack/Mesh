package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Zg */
/* loaded from: classes2.dex */
public final class RunnableC4976Zg implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f31198a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f31199b;

    /* renamed from: c */
    public final /* synthetic */ C5601yh f31200c;

    public RunnableC4976Zg(C5601yh c5601yh, String str, Throwable th) {
        this.f31200c = c5601yh;
        this.f31198a = str;
        this.f31199b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f31200c;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).reportError(this.f31198a, this.f31199b);
    }
}
