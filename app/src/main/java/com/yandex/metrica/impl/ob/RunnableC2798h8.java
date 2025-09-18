package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.h8 */
/* loaded from: classes2.dex */
class RunnableC2798h8 implements Runnable {
    final /* synthetic */ Vm a;
    final /* synthetic */ C2773g8 b;

    public RunnableC2798h8(C2773g8 c2773g8, Vm vm) {
        this.b = c2773g8;
        this.a = vm;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.b.a(this.a);
    }
}
