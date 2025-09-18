package com.yandex.metrica.impl.ob;

/* loaded from: classes2.dex */
public class Dd {
    private final C2703dd a;
    private final C3238yk b;
    private final C2643b3 c;
    private final Yc d;
    private final I9 e;

    public Dd(C2703dd c2703dd, C2643b3 c2643b3, I9 i9) {
        this(c2703dd, P0.i().w(), c2643b3, i9, P0.i().k());
    }

    private void a() {
        boolean zF = this.e.f();
        this.a.a(zF);
        this.c.a(zF);
        this.b.a(zF);
        this.d.c();
    }

    public void b(Object obj) {
        this.a.b(obj);
        this.b.b();
    }

    public Dd(C2703dd c2703dd, C3238yk c3238yk, C2643b3 c2643b3, I9 i9, Yc yc) {
        this.a = c2703dd;
        this.b = c3238yk;
        this.c = c2643b3;
        this.e = i9;
        this.d = yc;
        yc.a(c3238yk);
        a();
    }

    public void a(Object obj) {
        this.a.a(obj);
        this.b.a();
    }

    public void a(boolean z) {
        this.a.a(z);
        this.b.a(z);
        this.c.a(z);
        this.e.d(z);
    }

    public void a(Qi qi) {
        this.d.a(qi);
        this.c.a(qi);
        this.b.a(qi);
    }
}
