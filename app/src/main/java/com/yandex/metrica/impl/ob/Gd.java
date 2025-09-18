package com.yandex.metrica.impl.ob;

import android.content.Context;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class Gd implements T0 {
    private final I9 a;
    private final R2 b;
    private Ec c;
    private final C2643b3 d;
    private final Om e;
    private final a f;
    private final Fd g;

    public static class a {
    }

    public Gd(Context context, Ec ec) {
        this(ec, C2643b3.a(context));
    }

    public void a(Ec ec) {
        if (U2.a(this.c, ec)) {
            return;
        }
        this.c = ec;
        if (ec == null || !ec.a.a) {
            return;
        }
        this.g.a(this.d.b());
    }

    public void b() {
        Ec ec = this.c;
        if (ec == null || ec.b == null || !this.b.b(this.a.f(0L), this.c.b.b, "last wifi scan attempt time")) {
            return;
        }
        this.f.getClass();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        if (this.d.a(countDownLatch, this.g)) {
            this.a.k(this.e.b());
            try {
                countDownLatch.await(5L, TimeUnit.SECONDS);
            } catch (Throwable unused) {
            }
        }
    }

    private Gd(Ec ec, C2643b3 c2643b3) {
        this(c2643b3, P0.i().u(), new R2(), new Nm(), new a(), ec, new Fd(null, c2643b3.a()));
    }

    public Gd(C2643b3 c2643b3, I9 i9, R2 r2, Om om, a aVar, Ec ec, Fd fd) {
        this.d = c2643b3;
        this.a = i9;
        this.b = r2;
        this.f = aVar;
        this.c = ec;
        this.e = om;
        this.g = fd;
    }

    @Override // com.yandex.metrica.impl.ob.T0
    public void a() {
        Ec ec = this.c;
        if (ec == null || !ec.a.a) {
            return;
        }
        this.g.a(this.d.b());
    }
}
