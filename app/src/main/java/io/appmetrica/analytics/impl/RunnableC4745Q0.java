package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* renamed from: io.appmetrica.analytics.impl.Q0 */
/* loaded from: classes2.dex */
public final class RunnableC4745Q0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ DeferredDeeplinkListener f30637a;

    /* renamed from: b */
    public final /* synthetic */ C5185i1 f30638b;

    public RunnableC4745Q0(C5185i1 c5185i1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f30638b = c5185i1;
        this.f30637a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30638b.f31880a.getClass();
        C5309n0 c5309n0 = C5309n0.f32234e;
        c5309n0.m20789k().mo20991a(this.f30637a);
    }
}
