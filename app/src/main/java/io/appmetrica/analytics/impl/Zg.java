package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class Zg implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ C5009yh c;

    public Zg(C5009yh c5009yh, String str, Throwable th) {
        this.c = c5009yh;
        this.a = str;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5009yh c5009yh = this.c;
        C5009yh.a(c5009yh.a, c5009yh.d, c5009yh.e).reportError(this.a, this.b);
    }
}
