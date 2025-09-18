package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.ii, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2832ii {
    private long a;
    private long b;
    private final Om c;
    private final Mm d;

    public C2832ii() {
        this(new Nm(), new Mm());
    }

    public synchronized double a() {
        return this.d.b(this.b, TimeUnit.MILLISECONDS);
    }

    public synchronized double b() {
        return this.d.b(this.a, TimeUnit.MILLISECONDS);
    }

    public synchronized void c() {
        this.b = this.c.a();
    }

    public synchronized void d() {
        this.a = this.c.a();
    }

    public synchronized void e() {
        this.b = 0L;
    }

    public C2832ii(Om om, Mm mm) {
        this.c = om;
        this.d = mm;
    }
}
