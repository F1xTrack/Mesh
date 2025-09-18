package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.I0 */
/* loaded from: classes2.dex */
public final class RunnableC4553I0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f30263a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f30264b;

    public RunnableC4553I0(C5185i1 c5185i1, boolean z) {
        this.f30264b = c5185i1;
        this.f30263a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5334o0 c5334o0 = this.f30264b.f31880a;
        boolean z = this.f30263a;
        c5334o0.getClass();
        C5309n0.m20768g().setDataSendingEnabled(z);
    }
}
