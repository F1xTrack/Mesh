package io.appmetrica.analytics.impl;

/* loaded from: classes2.dex */
public final class Lh implements Runnable {
    public final /* synthetic */ Mh a;

    public Lh(Mh mh) {
        this.a = mh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b();
    }
}
