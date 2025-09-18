package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.f1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4539f1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ C4611i1 c;

    public RunnableC4539f1(C4611i1 c4611i1, String str, Throwable th) {
        this.c = c4611i1;
        this.a = str;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4611i1.a(this.c).reportError(this.a, this.b);
    }
}
