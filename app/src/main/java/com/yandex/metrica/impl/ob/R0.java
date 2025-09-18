package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class R0 {
    private final InterfaceExecutorC3086sn a;
    private final T0 b;
    private final d c;
    private final Runnable d = new a();
    private final Runnable e = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            R0.this.b.a();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((P2) R0.this.c).b()) {
                R0.this.d.run();
            }
        }
    }

    public static class c {
        public R0 a(InterfaceExecutorC3086sn interfaceExecutorC3086sn, T0 t0, d dVar) {
            return new R0(interfaceExecutorC3086sn, t0, dVar);
        }
    }

    public interface d {
    }

    public R0(InterfaceExecutorC3086sn interfaceExecutorC3086sn, T0 t0, d dVar) {
        this.a = interfaceExecutorC3086sn;
        this.b = t0;
        this.c = dVar;
    }

    public void a() {
        ((C3061rn) this.a).a(this.d);
        ((C3061rn) this.a).a(this.d, 90L, TimeUnit.SECONDS);
    }

    public void b() {
        ((C3061rn) this.a).execute(this.e);
    }

    public void c() {
        ((C3061rn) this.a).a(this.d);
        ((C3061rn) this.a).a(this.e);
    }
}
