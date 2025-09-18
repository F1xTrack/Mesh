package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.cd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class RunnableC2678cd implements Runnable {
    final /* synthetic */ C2703dd a;

    public RunnableC2678cd(C2703dd c2703dd) {
        this.a = c2703dd;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.a.e != null) {
            this.a.e.a();
        }
        C2703dd.b(this.a);
    }
}
