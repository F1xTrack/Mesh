package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
class Tg implements Runnable {
    final /* synthetic */ Xg a;
    final /* synthetic */ Throwable b;

    public Tg(Sg sg, Xg xg, Throwable th) {
        this.a = xg;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.a(this.b);
    }
}
