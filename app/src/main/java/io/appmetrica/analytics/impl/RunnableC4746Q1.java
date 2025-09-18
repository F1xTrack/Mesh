package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.Q1 */
/* loaded from: classes2.dex */
public final class RunnableC4746Q1 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC5522vd f30639a;

    /* renamed from: b */
    public final /* synthetic */ C5616z7 f30640b;

    public RunnableC4746Q1(C4793S1 c4793s1, C5616z7 c5616z7) {
        this.f30639a = c4793s1;
        this.f30640b = c5616z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30639a.consume(this.f30640b);
    }
}
