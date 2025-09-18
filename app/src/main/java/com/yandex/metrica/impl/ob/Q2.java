package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.InterfaceC2843j4;

/* loaded from: classes2.dex */
public class Q2<C extends InterfaceC2843j4> implements F2 {
    private C a;
    final Object b = new Object();
    boolean c = false;
    private final Zi d;

    public Q2(C c, Zi zi) {
        this.a = c;
        this.d = zi;
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public void a() {
        synchronized (this.b) {
            try {
                if (this.c) {
                    this.c = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.yandex.metrica.impl.ob.F2
    public void b() {
        synchronized (this.b) {
            try {
                if (!this.c) {
                    c();
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c() {
    }

    public void d() {
        synchronized (this.b) {
            if (!this.c) {
                synchronized (this.b) {
                    try {
                        if (!this.c) {
                            f();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c();
            }
        }
    }

    public C e() {
        return this.a;
    }

    public void f() {
        this.d.a();
    }
}
