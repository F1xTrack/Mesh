package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
class Mk {
    private final F9 a;
    private long b;

    public Mk(F9 f9) {
        this.a = f9;
        this.b = f9.c(-1L);
    }

    public long a() {
        F9 f9 = this.a;
        long j = this.b + 1;
        this.b = j;
        f9.f(j);
        return this.b;
    }
}
