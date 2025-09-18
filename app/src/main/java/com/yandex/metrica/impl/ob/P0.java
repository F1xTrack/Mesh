package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.content.Context;
import com.yandex.metrica.impl.ob.C2727ec;
import com.yandex.metrica.impl.ob.C2905lg;
import com.yandex.metrica.impl.ob.M2;
import com.yandex.metrica.impl.ob.Ma;
import defpackage.O90;

/* loaded from: classes2.dex */
public final class P0 {

    @SuppressLint({"StaticFieldLeak"})
    private static volatile P0 y;
    private final Context a;
    private volatile Ug b;
    private volatile Kh c;
    private volatile C2905lg d;
    private volatile Pb e;
    private volatile M2 f;
    private volatile Dh h;
    private volatile M0 i;
    private volatile C3238yk k;
    private volatile M l;
    private volatile D2 m;
    private volatile R1 n;
    private volatile Yc o;
    private volatile C2727ec p;
    private volatile C2827ic q;
    private volatile C2667c2 r;
    private volatile Q s;
    private volatile I9 t;
    private volatile K8 u;
    private C2965o1 w;
    private Zd x;
    private volatile C3266zn j = new C3266zn();
    private C3167w g = new C3167w();
    private C3220y2 v = new C3220y2();

    private P0(Context context) {
        this.a = context;
        this.w = new C2965o1(context, this.j.b());
        this.l = new M(this.j.b(), this.w.b());
    }

    private void A() {
        if (this.r == null) {
            synchronized (this) {
                try {
                    if (this.r == null) {
                        Q9 q9A = Ma.b.a(Be.class).a(this.a);
                        Be be = (Be) q9A.b();
                        Context context = this.a;
                        Ie ie = new Ie();
                        Ae ae = new Ae(be);
                        Ne ne = new Ne();
                        He he = new He(this.a);
                        P0 p0I = i();
                        O90.e(p0I, "GlobalServiceLocator.getInstance()");
                        I9 i9U = p0I.u();
                        O90.e(i9U, "GlobalServiceLocator.get…ance().servicePreferences");
                        this.r = new C2667c2(context, q9A, ie, ae, ne, he, new Je(i9U), new Ce(), be, "[PreloadInfoStorage]");
                    }
                } finally {
                }
            }
        }
    }

    public static void a(Context context) {
        if (y == null) {
            synchronized (P0.class) {
                try {
                    if (y == null) {
                        y = new P0(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
    }

    public static P0 i() {
        return y;
    }

    public C2827ic b() {
        if (this.q == null) {
            synchronized (this) {
                try {
                    if (this.q == null) {
                        this.q = new C2827ic(this.a, C2851jc.a());
                    }
                } finally {
                }
            }
        }
        return this.q;
    }

    public E c() {
        return this.w.a();
    }

    public M d() {
        return this.l;
    }

    public Q e() {
        if (this.s == null) {
            synchronized (this) {
                try {
                    if (this.s == null) {
                        Q9 q9A = Ma.b.a(P3.class).a(this.a);
                        this.s = new Q(this.a, q9A, new Q3(), new L3(), new S3(), new C3115u2(this.a), new R3(u()), new M3(), (P3) q9A.b(), "[ClidsInfoStorage]");
                    }
                } finally {
                }
            }
        }
        return this.s;
    }

    public Context f() {
        return this.a;
    }

    public Pb g() {
        if (this.e == null) {
            synchronized (this) {
                try {
                    if (this.e == null) {
                        this.e = new Pb(this.w.a(), new Nb());
                    }
                } finally {
                }
            }
        }
        return this.e;
    }

    public M0 h() {
        if (this.i == null) {
            synchronized (this) {
                try {
                    if (this.i == null) {
                        this.i = new M0();
                    }
                } finally {
                }
            }
        }
        return this.i;
    }

    public C2965o1 j() {
        return this.w;
    }

    public Yc k() {
        Yc yc = this.o;
        if (yc == null) {
            synchronized (this) {
                try {
                    yc = this.o;
                    if (yc == null) {
                        yc = new Yc(this.a);
                        this.o = yc;
                    }
                } finally {
                }
            }
        }
        return yc;
    }

    public R1 l() {
        return this.n;
    }

    public C2667c2 m() {
        A();
        return this.r;
    }

    public C2905lg n() {
        if (this.d == null) {
            synchronized (this) {
                try {
                    if (this.d == null) {
                        Context context = this.a;
                        Q9 q9A = Ma.b.a(C2905lg.e.class).a(this.a);
                        M2 m2V = v();
                        if (this.c == null) {
                            synchronized (this) {
                                if (this.c == null) {
                                    this.c = new Kh();
                                }
                            }
                        }
                        this.d = new C2905lg(context, q9A, m2V, this.c, this.j.h(), new C3060rm());
                    }
                } catch (Throwable th) {
                    throw th;
                } finally {
                }
            }
        }
        return this.d;
    }

    public Ug o() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = new Ug(this.a);
                    }
                } finally {
                }
            }
        }
        return this.b;
    }

    public C3220y2 p() {
        return this.v;
    }

    public Dh q() {
        if (this.h == null) {
            synchronized (this) {
                try {
                    if (this.h == null) {
                        this.h = new Dh(this.a, this.j.h());
                    }
                } finally {
                }
            }
        }
        return this.h;
    }

    public synchronized D2 r() {
        return this.m;
    }

    public C3266zn s() {
        return this.j;
    }

    public C2727ec t() {
        if (this.p == null) {
            synchronized (this) {
                try {
                    if (this.p == null) {
                        this.p = new C2727ec(new C2727ec.h(), new C2727ec.d(), new C2727ec.c(), this.j.b(), "ServiceInternal");
                    }
                } finally {
                }
            }
        }
        return this.p;
    }

    public I9 u() {
        if (this.t == null) {
            synchronized (this) {
                try {
                    if (this.t == null) {
                        this.t = new I9(Qa.a(this.a).i());
                    }
                } finally {
                }
            }
        }
        return this.t;
    }

    public M2 v() {
        if (this.f == null) {
            synchronized (this) {
                try {
                    if (this.f == null) {
                        this.f = new M2(new M2.b(u()));
                    }
                } finally {
                }
            }
        }
        return this.f;
    }

    public C3238yk w() {
        if (this.k == null) {
            synchronized (this) {
                try {
                    if (this.k == null) {
                        this.k = new C3238yk(this.a, this.j.j());
                    }
                } finally {
                }
            }
        }
        return this.k;
    }

    public synchronized Zd x() {
        try {
            if (this.x == null) {
                this.x = new Zd(this.a, new Yd(), new Xd());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.x;
    }

    public synchronized K8 y() {
        try {
            if (this.u == null) {
                this.u = new K8(this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.u;
    }

    public synchronized void z() {
        try {
            n().a();
            A();
            if (this.n == null) {
                R1 r1 = new R1(this.a, this.j.i(), u());
                r1.setName(ThreadFactoryC3191wn.a("YMM-NC"));
                this.w.a(r1);
                r1.start();
                this.n = r1;
            }
            k().b();
        } catch (Throwable th) {
            throw th;
        }
    }

    public C3167w a() {
        return this.g;
    }

    public synchronized void a(Qi qi) {
        try {
            if (this.p != null) {
                this.p.a(qi);
            }
            if (this.h != null) {
                this.h.b(qi);
            }
            if (this.i != null) {
                this.i.a(qi);
            }
            if (this.e != null) {
                this.e.b(qi);
            }
            Zd zd = this.x;
            if (zd != null) {
                zd.a(qi);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void a(E2 e2) {
        this.m = new D2(this.a, e2);
    }
}
