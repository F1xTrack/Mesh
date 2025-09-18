package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.v6 */
/* loaded from: classes2.dex */
public class C3144v6 {
    private final C2744f4 a;
    private final C3119u6 b;
    private final a c;
    private final K0 d;
    private final InterfaceC2970o6<C3020q6> e;
    private final InterfaceC2970o6<C3020q6> f;
    private C2995p6 g;
    private b h;

    /* renamed from: com.yandex.metrica.impl.ob.v6$a */
    public interface a {
        void a(C2864k0 c2864k0, C3174w6 c3174w6);
    }

    /* renamed from: com.yandex.metrica.impl.ob.v6$b */
    public enum b {
        EMPTY,
        BACKGROUND,
        FOREGROUND
    }

    public C3144v6(C2744f4 c2744f4, C3119u6 c3119u6, a aVar) {
        this(c2744f4, c3119u6, aVar, new C2945n6(c2744f4, c3119u6), new C2920m6(c2744f4, c3119u6), new K0(c2744f4.g()));
    }

    private void e(C2864k0 c2864k0) {
        if (this.h == null) {
            C2995p6 c2995p6B = ((AbstractC2895l6) this.e).b();
            if (a(c2995p6B, c2864k0)) {
                this.g = c2995p6B;
                this.h = b.FOREGROUND;
                return;
            }
            C2995p6 c2995p6B2 = ((AbstractC2895l6) this.f).b();
            if (a(c2995p6B2, c2864k0)) {
                this.g = c2995p6B2;
                this.h = b.BACKGROUND;
            } else {
                this.g = null;
                this.h = b.EMPTY;
            }
        }
    }

    public synchronized long a() {
        C2995p6 c2995p6;
        c2995p6 = this.g;
        return c2995p6 == null ? 10000000000L : c2995p6.c() - 1;
    }

    public C3174w6 b(C2864k0 c2864k0) {
        return a(c(c2864k0), c2864k0.e());
    }

    public synchronized C2995p6 c(C2864k0 c2864k0) {
        try {
            e(c2864k0);
            b bVar = this.h;
            b bVar2 = b.EMPTY;
            if (bVar != bVar2 && !a(this.g, c2864k0)) {
                this.h = bVar2;
                this.g = null;
            }
            int iOrdinal = this.h.ordinal();
            if (iOrdinal == 1) {
                this.g.c(c2864k0.e());
                return this.g;
            }
            if (iOrdinal == 2) {
                return this.g;
            }
            this.h = b.BACKGROUND;
            long jE = c2864k0.e();
            C2995p6 c2995p6A = ((AbstractC2895l6) this.f).a(new C3020q6(jE, c2864k0.f()));
            if (this.a.w().m()) {
                this.c.a(C2864k0.a(c2864k0, this.d), a(c2995p6A, c2864k0.e()));
            } else if (c2864k0.n() == EnumC2865k1.EVENT_TYPE_FIRST_ACTIVATION.b()) {
                this.c.a(c2864k0, a(c2995p6A, jE));
                this.c.a(C2864k0.a(c2864k0, this.d), a(c2995p6A, jE));
            }
            this.g = c2995p6A;
            return c2995p6A;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void d(C2864k0 c2864k0) {
        try {
            e(c2864k0);
            int iOrdinal = this.h.ordinal();
            if (iOrdinal == 0) {
                this.g = a(c2864k0);
            } else if (iOrdinal == 1) {
                b(this.g, c2864k0);
                this.g = a(c2864k0);
            } else if (iOrdinal == 2) {
                if (a(this.g, c2864k0)) {
                    this.g.c(c2864k0.e());
                } else {
                    this.g = a(c2864k0);
                }
            }
        } finally {
        }
    }

    public C3174w6 f(C2864k0 c2864k0) {
        C2995p6 c2995p6B;
        if (this.h == null) {
            c2995p6B = ((AbstractC2895l6) this.e).b();
            if (c2995p6B == null ? false : c2995p6B.b(c2864k0.e())) {
                c2995p6B = ((AbstractC2895l6) this.f).b();
                if (c2995p6B != null ? c2995p6B.b(c2864k0.e()) : false) {
                    c2995p6B = null;
                }
            }
        } else {
            c2995p6B = this.g;
        }
        if (c2995p6B != null) {
            return new C3174w6().c(c2995p6B.c()).a(c2995p6B.e()).b(c2995p6B.d()).a(c2995p6B.f());
        }
        long jF = c2864k0.f();
        long jA = this.b.a();
        C3096t8 c3096t8I = this.a.i();
        EnumC3249z6 enumC3249z6 = EnumC3249z6.BACKGROUND;
        c3096t8I.a(jA, enumC3249z6, jF);
        return new C3174w6().c(jA).a(enumC3249z6).a(0L).b(0L);
    }

    public synchronized void g(C2864k0 c2864k0) {
        try {
            c(c2864k0).a(false);
            b bVar = this.h;
            b bVar2 = b.EMPTY;
            if (bVar != bVar2) {
                b(this.g, c2864k0);
            }
            this.h = bVar2;
        } catch (Throwable th) {
            throw th;
        }
    }

    private C2995p6 a(C2864k0 c2864k0) {
        long jE = c2864k0.e();
        C2995p6 c2995p6A = ((AbstractC2895l6) this.e).a(new C3020q6(jE, c2864k0.f()));
        this.h = b.FOREGROUND;
        this.a.l().c();
        this.c.a(C2864k0.a(c2864k0, this.d), a(c2995p6A, jE));
        return c2995p6A;
    }

    private void b(C2995p6 c2995p6, C2864k0 c2864k0) {
        if (c2995p6.h()) {
            this.c.a(C2864k0.a(c2864k0), new C3174w6().c(c2995p6.c()).a(c2995p6.f()).a(c2995p6.e()).b(c2995p6.b()));
            c2995p6.a(false);
        }
        c2995p6.i();
    }

    public C3144v6(C2744f4 c2744f4, C3119u6 c3119u6, a aVar, InterfaceC2970o6<C3020q6> interfaceC2970o6, InterfaceC2970o6<C3020q6> interfaceC2970o62, K0 k0) {
        this.h = null;
        this.a = c2744f4;
        this.c = aVar;
        this.e = interfaceC2970o6;
        this.f = interfaceC2970o62;
        this.b = c3119u6;
        this.d = k0;
    }

    private boolean a(C2995p6 c2995p6, C2864k0 c2864k0) {
        if (c2995p6 == null) {
            return false;
        }
        if (c2995p6.b(c2864k0.e())) {
            return true;
        }
        b(c2995p6, c2864k0);
        return false;
    }

    private C3174w6 a(C2995p6 c2995p6, long j) {
        return new C3174w6().c(c2995p6.c()).a(c2995p6.e()).b(c2995p6.a(j)).a(c2995p6.f());
    }
}
