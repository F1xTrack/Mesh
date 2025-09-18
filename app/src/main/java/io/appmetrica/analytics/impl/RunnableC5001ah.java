package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ah */
/* loaded from: classes2.dex */
public final class RunnableC5001ah implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f31258a;

    /* renamed from: b */
    public final /* synthetic */ String f31259b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f31260c;

    /* renamed from: d */
    public final /* synthetic */ C5601yh f31261d;

    public RunnableC5001ah(C5601yh c5601yh, String str, String str2, Throwable th) {
        this.f31261d = c5601yh;
        this.f31258a = str;
        this.f31259b = str2;
        this.f31260c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5601yh c5601yh = this.f31261d;
        C5601yh.m21219a(c5601yh.f32856a, c5601yh.f32859d, c5601yh.f32860e).reportError(this.f31258a, this.f31259b, this.f31260c);
    }
}
