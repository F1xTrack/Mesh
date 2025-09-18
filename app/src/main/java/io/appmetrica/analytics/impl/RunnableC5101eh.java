package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.eh */
/* loaded from: classes2.dex */
public final class RunnableC5101eh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f31602a;

    /* renamed from: b */
    public final /* synthetic */ C5601yh f31603b;

    public RunnableC5101eh(C5601yh c5601yh, String str) {
        this.f31603b = c5601yh;
        this.f31602a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f31603b;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).setUserProfileID(this.f31602a);
    }
}
