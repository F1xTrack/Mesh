package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.M0 */
/* loaded from: classes2.dex */
public final class RunnableC4649M0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5185i1 f30454a;

    public RunnableC4649M0(C5185i1 c5185i1) {
        this.f30454a = c5185i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5185i1.m20518a(this.f30454a).sendEventsBuffer();
    }
}
