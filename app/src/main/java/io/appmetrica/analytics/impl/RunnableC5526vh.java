package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.vh */
/* loaded from: classes2.dex */
public final class RunnableC5526vh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f32740a;

    /* renamed from: b */
    public final /* synthetic */ C5601yh f32741b;

    public RunnableC5526vh(C5601yh c5601yh, String str) {
        this.f32741b = c5601yh;
        this.f32740a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f32741b;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).reportEvent(this.f32740a);
    }
}
