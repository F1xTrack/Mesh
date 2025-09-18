package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.eh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4531eh implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C5009yh b;

    public RunnableC4531eh(C5009yh c5009yh, String str) {
        this.b = c5009yh;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5009yh c5009yh = this.b;
        C5009yh.a(c5009yh.a, c5009yh.d, c5009yh.e).setUserProfileID(this.a);
    }
}
