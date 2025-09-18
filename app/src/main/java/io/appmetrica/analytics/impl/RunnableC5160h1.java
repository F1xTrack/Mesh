package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.h1 */
/* loaded from: classes2.dex */
public final class RunnableC5160h1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Throwable f31819a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f31820b;

    public RunnableC5160h1(C5185i1 c5185i1, Throwable th) {
        this.f31820b = c5185i1;
        this.f31819a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5185i1.m20518a(this.f31820b).reportUnhandledException(this.f31819a);
    }
}
