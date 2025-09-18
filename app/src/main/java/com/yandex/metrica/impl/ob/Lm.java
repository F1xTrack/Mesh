package com.yandex.metrica.impl.ob;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class Lm implements InterfaceC2616a1 {
    private volatile long a;
    private I9 b;
    private Om c;

    public static class b {
        static Lm a = new Lm();
    }

    public /* synthetic */ Lm(a aVar) {
        this();
    }

    public static Lm c() {
        return b.a;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2616a1
    public synchronized long a() {
        return this.a;
    }

    public synchronized void b() {
        this.b.c(false);
        this.b.c();
    }

    public synchronized void d() {
        I9 i9U = P0.i().u();
        Nm nm = new Nm();
        this.b = i9U;
        this.a = i9U.b(0);
        this.c = nm;
    }

    public synchronized boolean e() {
        return this.b.a(true);
    }

    private Lm() {
    }

    public synchronized void a(long j, Long l) {
        try {
            this.a = (j - this.c.a()) / 1000;
            boolean z = true;
            if (this.b.a(true)) {
                if (l != null) {
                    long jAbs = Math.abs(j - this.c.a());
                    I9 i9 = this.b;
                    if (jAbs <= TimeUnit.SECONDS.toMillis(l.longValue())) {
                        z = false;
                    }
                    i9.c(z);
                } else {
                    this.b.c(false);
                }
            }
            this.b.l(this.a);
            this.b.c();
        } catch (Throwable th) {
            throw th;
        }
    }
}
