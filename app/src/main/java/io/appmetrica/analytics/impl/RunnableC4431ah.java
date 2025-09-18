package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ah, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4431ah implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;
    public final /* synthetic */ C5009yh d;

    public RunnableC4431ah(C5009yh c5009yh, String str, String str2, Throwable th) {
        this.d = c5009yh;
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5009yh c5009yh = this.d;
        C5009yh.a(c5009yh.a, c5009yh.d, c5009yh.e).reportError(this.a, this.b, this.c);
    }
}
