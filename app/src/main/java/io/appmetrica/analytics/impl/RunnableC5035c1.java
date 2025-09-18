package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c1 */
/* loaded from: classes2.dex */
public final class RunnableC5035c1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f31347a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f31348b;

    public RunnableC5035c1(C5185i1 c5185i1, String str) {
        this.f31348b = c5185i1;
        this.f31347a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5185i1.m20518a(this.f31348b).reportEvent(this.f31347a);
    }
}
