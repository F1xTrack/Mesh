package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.q4 */
/* loaded from: classes2.dex */
public final class C4805q4 {
    public static volatile C4805q4 q;
    public final Ub a;
    public final D7 b;
    public final C4566g4 c;
    public final G1 d;
    public final C4776p e;
    public final Zj f;
    public final I5 g;
    public final C4680l h;
    public final C4655jm i;
    public Yc j;
    public final C4610i0 k;
    public volatile C4733n4 l;
    public final Cc m;
    public volatile C4719me n;
    public C4842ri o;
    public final C4753o0 p;

    public C4805q4(Ub ub, C4776p c4776p, C4566g4 c4566g4) {
        this(ub, c4776p, c4566g4, new C4680l(c4776p));
    }

    public static C4805q4 h() {
        if (q == null) {
            synchronized (C4805q4.class) {
                try {
                    if (q == null) {
                        q = new C4805q4(new Ub(), new C4776p(), new C4566g4());
                    }
                } finally {
                }
            }
        }
        return q;
    }

    public final C4776p a() {
        return this.e;
    }

    public final C4610i0 b() {
        return this.k;
    }

    public final C4753o0 c() {
        return this.p;
    }

    public final G1 d() {
        return this.d;
    }

    public final C4566g4 e() {
        return this.c;
    }

    public final I5 f() {
        return this.g;
    }

    public final D7 g() {
        return this.b;
    }

    public final Ub i() {
        return this.a;
    }

    public final C4733n4 j() {
        C4733n4 c4733n4 = this.l;
        if (c4733n4 == null) {
            synchronized (this) {
                try {
                    c4733n4 = this.l;
                    if (c4733n4 == null) {
                        c4733n4 = new C4733n4();
                        this.l = c4733n4;
                    }
                } finally {
                }
            }
        }
        return c4733n4;
    }

    public final Ub k() {
        return this.a;
    }

    public final Zj l() {
        return this.f;
    }

    public C4805q4(Ub ub, C4776p c4776p, C4566g4 c4566g4, C4680l c4680l) {
        this(ub, new D7(), c4566g4, c4680l, new G1(), c4776p, new Zj(c4776p, c4680l), new I5(c4776p), new C4655jm(), new C4610i0());
    }

    public final synchronized Yc a(Context context) {
        try {
            if (this.j == null) {
                this.j = new Yc(context, new in());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.j;
    }

    public final C4719me b(Context context) {
        C4719me c4719me = this.n;
        if (c4719me == null) {
            synchronized (this) {
                try {
                    c4719me = this.n;
                    if (c4719me == null) {
                        c4719me = new C4719me(Z6.a(context).a());
                        this.n = c4719me;
                    }
                } finally {
                }
            }
        }
        return c4719me;
    }

    public C4805q4(Ub ub, D7 d7, C4566g4 c4566g4, C4680l c4680l, G1 g1, C4776p c4776p, Zj zj, I5 i5, C4655jm c4655jm, C4610i0 c4610i0) {
        this.m = new Cc();
        this.p = new C4753o0();
        this.a = ub;
        this.b = d7;
        this.c = c4566g4;
        this.h = c4680l;
        this.d = g1;
        this.e = c4776p;
        this.f = zj;
        this.g = i5;
        this.i = c4655jm;
        this.k = c4610i0;
    }
}
