package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class R0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C4611i1 c;

    public R0(C4611i1 c4611i1, String str, String str2) {
        this.c = c4611i1;
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4753o0 c4753o0 = this.c.a;
        String str = this.a;
        String str2 = this.b;
        c4753o0.getClass();
        C4729n0.g().a(str, str2);
    }
}
