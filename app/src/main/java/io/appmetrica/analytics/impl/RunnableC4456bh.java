package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4456bh implements Runnable {
    public final /* synthetic */ Throwable a;
    public final /* synthetic */ C5009yh b;

    public RunnableC4456bh(C5009yh c5009yh, Throwable th) {
        this.b = c5009yh;
        this.a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5009yh c5009yh = this.b;
        C5009yh.a(c5009yh.a, c5009yh.d, c5009yh.e).reportUnhandledException(this.a);
    }
}
