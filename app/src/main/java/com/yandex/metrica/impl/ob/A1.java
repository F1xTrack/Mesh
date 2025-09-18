package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
class A1 implements Runnable {
    final /* synthetic */ C6 a;

    public A1(B1 b1, C6 c6) {
        this.a = c6;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.a.a();
        } catch (Throwable unused) {
        }
    }
}
