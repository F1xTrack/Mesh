package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.f1 */
/* loaded from: classes2.dex */
public final class RunnableC5110f1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f31647a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f31648b;

    /* renamed from: c */
    public final /* synthetic */ C5185i1 f31649c;

    public RunnableC5110f1(C5185i1 c5185i1, String str, Throwable th) {
        this.f31649c = c5185i1;
        this.f31647a = str;
        this.f31648b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5185i1.m20518a(this.f31649c).reportError(this.f31647a, this.f31648b);
    }
}
