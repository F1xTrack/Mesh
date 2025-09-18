package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class U0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C4611i1 b;

    public U0(C4611i1 c4611i1, String str) {
        this.b = c4611i1;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4611i1.a(this.b).a(this.a);
    }
}
