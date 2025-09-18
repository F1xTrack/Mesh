package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wh */
/* loaded from: classes2.dex */
public final class RunnableC5551wh implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f32776a;

    /* renamed from: b */
    public final /* synthetic */ String f32777b;

    /* renamed from: c */
    public final /* synthetic */ C5601yh f32778c;

    public RunnableC5551wh(C5601yh c5601yh, String str, String str2) {
        this.f32778c = c5601yh;
        this.f32776a = str;
        this.f32777b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f32778c;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).reportEvent(this.f32776a, this.f32777b);
    }
}
