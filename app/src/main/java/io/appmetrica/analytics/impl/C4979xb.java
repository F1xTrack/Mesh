package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xb */
/* loaded from: classes2.dex */
public final class C4979xb implements InterfaceC4463c {
    public final Ra a;
    public final C5038zm b = new C5038zm();

    public C4979xb(Ra ra) {
        this.a = ra;
    }

    public static final void a(C4979xb c4979xb, T t) {
        c4979xb.a.a(t);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4463c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTrace;
        C5038zm c5038zm = this.b;
        Thread threadA = ((C4966wm) c5038zm.a).a();
        try {
            stackTrace = threadA.getStackTrace();
        } catch (SecurityException unused) {
            stackTrace = null;
        }
        T t = new T((C4870sm) c5038zm.b.apply(threadA, stackTrace), c5038zm.a(threadA, null), c5038zm.c.b());
        ((C4953w9) C4805q4.h().c.a()).b.post(new io.sentry.cache.f(this, 13, t));
    }
}
