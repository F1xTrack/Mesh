package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.wh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4961wh implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C5009yh c;

    public RunnableC4961wh(C5009yh c5009yh, String str, String str2) {
        this.c = c5009yh;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5009yh c5009yh = this.c;
        C5009yh.a(c5009yh.a, c5009yh.d, c5009yh.e).reportEvent(this.a, this.b);
    }
}
