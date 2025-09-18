package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC4465c1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C4611i1 b;

    public RunnableC4465c1(C4611i1 c4611i1, String str) {
        this.b = c4611i1;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4611i1.a(this.b).reportEvent(this.a);
    }
}
