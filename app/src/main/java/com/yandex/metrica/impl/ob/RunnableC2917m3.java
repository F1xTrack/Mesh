package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.m3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class RunnableC2917m3 implements Runnable {
    final /* synthetic */ C2892l3 a;

    /* renamed from: com.yandex.metrica.impl.ob.m3$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Oh.a(RunnableC2917m3.this.a.a);
        }
    }

    public RunnableC2917m3(C2892l3 c2892l3) {
        this.a = c2892l3;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((C3061rn) this.a.e.a()).execute(new a());
    }
}
