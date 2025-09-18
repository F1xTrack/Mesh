package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.yf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC5007yf implements Runnable {
    public final /* synthetic */ Jf a;
    public final /* synthetic */ Throwable b;

    public RunnableC5007yf(Jf jf, Throwable th) {
        this.a = jf;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a(this.b);
    }
}
