package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4587h1 implements Runnable {
    public final /* synthetic */ Throwable a;
    public final /* synthetic */ C4611i1 b;

    public RunnableC4587h1(C4611i1 c4611i1, Throwable th) {
        this.b = c4611i1;
        this.a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4611i1.a(this.b).reportUnhandledException(this.a);
    }
}
