package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class Q1 implements Runnable {
    public final /* synthetic */ InterfaceC4933vd a;
    public final /* synthetic */ C5023z7 b;

    public Q1(S1 s1, C5023z7 c5023z7) {
        this.a = s1;
        this.b = c5023z7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.consume(this.b);
    }
}
