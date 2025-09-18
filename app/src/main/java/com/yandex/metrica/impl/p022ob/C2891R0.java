package com.yandex.metrica.impl.p022ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.R0 */
/* loaded from: classes2.dex */
public class C2891R0 {

    /* renamed from: a */
    private final InterfaceExecutorC3607sn f22086a;

    /* renamed from: b */
    private final InterfaceC2941T0 f22087b;

    /* renamed from: c */
    private final d f22088c;

    /* renamed from: d */
    private final Runnable f22089d = new a();

    /* renamed from: e */
    private final Runnable f22090e = new b();

    /* renamed from: com.yandex.metrica.impl.ob.R0$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C2891R0.this.f22087b.mo14192a();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.R0$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((AbstractC2844P2) C2891R0.this.f22088c).mo14759b()) {
                C2891R0.this.f22089d.run();
            }
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.R0$c */
    public static class c {
        /* renamed from: a */
        public C2891R0 m14965a(InterfaceExecutorC3607sn interfaceExecutorC3607sn, InterfaceC2941T0 interfaceC2941T0, d dVar) {
            return new C2891R0(interfaceExecutorC3607sn, interfaceC2941T0, dVar);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.R0$d */
    public interface d {
    }

    public C2891R0(InterfaceExecutorC3607sn interfaceExecutorC3607sn, InterfaceC2941T0 interfaceC2941T0, d dVar) {
        this.f22086a = interfaceExecutorC3607sn;
        this.f22087b = interfaceC2941T0;
        this.f22088c = dVar;
    }

    /* renamed from: a */
    public void m14962a() {
        ((C3581rn) this.f22086a).m16703a(this.f22089d);
        ((C3581rn) this.f22086a).m16705a(this.f22089d, 90L, TimeUnit.SECONDS);
    }

    /* renamed from: b */
    public void m14963b() {
        ((C3581rn) this.f22086a).execute(this.f22090e);
    }

    /* renamed from: c */
    public void m14964c() {
        ((C3581rn) this.f22086a).m16703a(this.f22089d);
        ((C3581rn) this.f22086a).m16703a(this.f22090e);
    }
}
