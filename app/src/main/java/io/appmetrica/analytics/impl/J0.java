package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class J0 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ C4611i1 b;

    public J0(C4611i1 c4611i1, String str) {
        this.b = c4611i1;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4753o0 c4753o0 = this.b.a;
        String str = this.a;
        c4753o0.getClass();
        C4729n0.g().setUserProfileID(str);
    }
}
