package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4818qh implements Runnable {
    public final /* synthetic */ Mm a;
    public final /* synthetic */ C5009yh b;

    public RunnableC4818qh(C5009yh c5009yh, Mm mm) {
        this.b = c5009yh;
        this.a = mm;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5009yh c5009yh = this.b;
        C5009yh.a(c5009yh.a, c5009yh.d, c5009yh.e).a(this.a);
    }
}
