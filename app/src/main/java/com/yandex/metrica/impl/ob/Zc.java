package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
class Zc implements Runnable {
    final /* synthetic */ C2703dd a;

    public Zc(C2703dd c2703dd) {
        this.a = c2703dd;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.a.e != null) {
                this.a.e.c();
            }
        } catch (Throwable unused) {
        }
    }
}
