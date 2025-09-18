package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.R0;

/* loaded from: classes2.dex */
public abstract class Q0<T> implements R0.d {
    protected final O<T> a;
    private R0 b;

    public Q0(long j, long j2) {
        this.a = new O<>(j, j2);
    }

    public abstract long a(C3007pi c3007pi);

    public T a() {
        R0 r0;
        if (b() && (r0 = this.b) != null) {
            r0.b();
        }
        if (this.a.c()) {
            this.a.a(null);
        }
        return this.a.a();
    }

    public abstract boolean a(T t);

    public abstract long b(C3007pi c3007pi);

    public void b(T t) {
        if (a((Q0<T>) t)) {
            this.a.a(t);
            R0 r0 = this.b;
            if (r0 != null) {
                r0.a();
            }
        }
    }

    public abstract boolean b();

    public void c(C3007pi c3007pi) {
        this.a.a(b(c3007pi), a(c3007pi));
    }

    public void a(R0 r0) {
        this.b = r0;
    }
}
