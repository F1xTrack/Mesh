package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
class B implements Runnable {
    final /* synthetic */ Y1 a;
    final /* synthetic */ C3038r0 b;

    public B(C c, Y1 y1, C3038r0 c3038r0) {
        this.a = y1;
        this.b = c3038r0;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.a.b(this.b);
    }
}
