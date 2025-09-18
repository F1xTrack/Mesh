package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.rh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4841rh implements Runnable {
    public final /* synthetic */ T a;
    public final /* synthetic */ C5009yh b;

    public RunnableC4841rh(C5009yh c5009yh, T t) {
        this.b = c5009yh;
        this.a = t;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5009yh c5009yh = this.b;
        C5009yh.a(c5009yh.a, c5009yh.d, c5009yh.e).a(this.a);
    }
}
