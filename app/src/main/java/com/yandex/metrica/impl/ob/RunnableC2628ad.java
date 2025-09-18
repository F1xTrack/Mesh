package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.ad, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class RunnableC2628ad implements Runnable {
    final /* synthetic */ C2703dd a;

    public RunnableC2628ad(C2703dd c2703dd) {
        this.a = c2703dd;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.e != null) {
            this.a.e.e();
        }
    }
}
