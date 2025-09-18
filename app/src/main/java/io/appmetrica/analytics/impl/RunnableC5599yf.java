package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.yf */
/* loaded from: classes2.dex */
public final class RunnableC5599yf implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC4592Jf f32854a;

    /* renamed from: b */
    public final /* synthetic */ Throwable f32855b;

    public RunnableC5599yf(InterfaceC4592Jf interfaceC4592Jf, Throwable th) {
        this.f32854a = interfaceC4592Jf;
        this.f32855b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f32854a.mo19535a(this.f32855b);
    }
}
