package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.g1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4563g1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;
    public final /* synthetic */ C4611i1 d;

    public RunnableC4563g1(C4611i1 c4611i1, String str, String str2, Throwable th) {
        this.d = c4611i1;
        this.a = str;
        this.b = str2;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4611i1.a(this.d).reportError(this.a, this.b, this.c);
    }
}
