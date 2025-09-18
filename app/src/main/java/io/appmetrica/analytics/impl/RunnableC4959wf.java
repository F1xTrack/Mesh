package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wf */
/* loaded from: classes2.dex */
public final class RunnableC4959wf implements Runnable {
    public final /* synthetic */ Ef a;
    public final /* synthetic */ C4983xf b;

    public RunnableC4959wf(C4983xf c4983xf, Ef ef) {
        this.b = c4983xf;
        this.a = ef;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a(this.a);
    }
}
