package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class D0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C4611i1 b;

    public D0(C4611i1 c4611i1, String str) {
        this.b = c4611i1;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d().b.a(this.a, false);
    }
}
