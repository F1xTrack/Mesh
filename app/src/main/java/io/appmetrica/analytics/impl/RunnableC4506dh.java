package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.dh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4506dh implements Runnable {
    public final /* synthetic */ C5009yh a;

    public RunnableC4506dh(C5009yh c5009yh) {
        this.a = c5009yh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5009yh c5009yh = this.a;
        C5009yh.a(c5009yh.a, c5009yh.d, c5009yh.e).pauseSession();
    }
}
