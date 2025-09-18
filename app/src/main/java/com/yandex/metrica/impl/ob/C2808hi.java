package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.hi, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2808hi {
    private final Mm a;
    private final long b;
    private long c;
    private long d;
    private long e;

    public C2808hi(Om om, Mm mm) {
        this.b = ((Nm) om).a();
        this.a = mm;
    }

    public void a() {
        this.c = this.a.b(this.b, TimeUnit.MILLISECONDS);
    }

    public void b() {
        this.d = this.a.b(this.b, TimeUnit.MILLISECONDS);
    }

    public void c() {
        this.e = this.a.b(this.b, TimeUnit.MILLISECONDS);
    }

    public long d() {
        return this.c;
    }

    public long e() {
        return this.d;
    }

    public long f() {
        return this.e;
    }
}
