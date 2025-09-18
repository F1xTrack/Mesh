package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.g1 */
/* loaded from: classes2.dex */
public final class RunnableC5135g1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f31715a;

    /* renamed from: b */
    public final /* synthetic */ String f31716b;

    /* renamed from: c */
    public final /* synthetic */ Throwable f31717c;

    /* renamed from: d */
    public final /* synthetic */ C5185i1 f31718d;

    public RunnableC5135g1(C5185i1 c5185i1, String str, String str2, Throwable th) {
        this.f31718d = c5185i1;
        this.f31715a = str;
        this.f31716b = str2;
        this.f31717c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5185i1.m20518a(this.f31718d).reportError(this.f31715a, this.f31716b, this.f31717c);
    }
}
