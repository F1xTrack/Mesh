package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.m3 */
/* loaded from: classes2.dex */
class RunnableC3431m3 implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3405l3 f24241a;

    /* renamed from: com.yandex.metrica.impl.ob.m3$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2834Oh.m14712a(RunnableC3431m3.this.f24241a.f24164a);
        }
    }

    public RunnableC3431m3(C3405l3 c3405l3) {
        this.f24241a = c3405l3;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((C3581rn) this.f24241a.f24168e.m16637a()).execute(new a());
    }
}
