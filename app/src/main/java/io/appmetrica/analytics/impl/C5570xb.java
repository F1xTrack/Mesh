package io.appmetrica.analytics.impl;

import io.sentry.cache.RunnableC5994f;

/* renamed from: io.appmetrica.analytics.impl.xb */
/* loaded from: classes2.dex */
public final class C5570xb implements InterfaceC5033c {

    /* renamed from: a */
    public final InterfaceC4778Ra f32819a;

    /* renamed from: b */
    public final C5631zm f32820b = new C5631zm();

    public C5570xb(InterfaceC4778Ra interfaceC4778Ra) {
        this.f32819a = interfaceC4778Ra;
    }

    /* renamed from: a */
    public static final void m21205a(C5570xb c5570xb, C4815T c4815t) {
        c5570xb.f32819a.mo19684a(c4815t);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5033c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTrace;
        C5631zm c5631zm = this.f32820b;
        Thread threadM21188a = ((C5556wm) c5631zm.f32938a).m21188a();
        try {
            stackTrace = threadM21188a.getStackTrace();
        } catch (SecurityException unused) {
            stackTrace = null;
        }
        C4815T c4815t = new C4815T((C5456sm) c5631zm.f32939b.apply(threadM21188a, stackTrace), c5631zm.m21249a(threadM21188a, null), c5631zm.f32940c.m19886b());
        ((C5543w9) C5388q4.m20928h().f32420c.m20407a()).f32761b.post(new RunnableC5994f(this, 13, c4815t));
    }
}
