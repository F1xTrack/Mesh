package defpackage;

import android.os.SystemClock;
import java.util.List;

/* loaded from: classes.dex */
public final class BB0 {
    public static final C0456Fp0 u = new C0456Fp0(new Object());
    public final AbstractC0178Ca1 a;
    public final C0456Fp0 b;
    public final long c;
    public final long d;
    public final int e;
    public final IQ f;
    public final boolean g;
    public final C1350Rb1 h;
    public final C2359bc1 i;
    public final List j;
    public final C0456Fp0 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final CB0 o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public BB0(AbstractC0178Ca1 abstractC0178Ca1, C0456Fp0 c0456Fp0, long j, long j2, int i, IQ iq, boolean z, C1350Rb1 c1350Rb1, C2359bc1 c2359bc1, List list, C0456Fp0 c0456Fp02, boolean z2, int i2, int i3, CB0 cb0, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = abstractC0178Ca1;
        this.b = c0456Fp0;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = iq;
        this.g = z;
        this.h = c1350Rb1;
        this.i = c2359bc1;
        this.j = list;
        this.k = c0456Fp02;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = cb0;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static BB0 i(C2359bc1 c2359bc1) {
        C8391za1 c8391za1 = AbstractC0178Ca1.a;
        C0456Fp0 c0456Fp0 = u;
        return new BB0(c8391za1, c0456Fp0, -9223372036854775807L, 0L, 1, null, false, C1350Rb1.d, c2359bc1, C3769fQ0.e, c0456Fp0, false, 1, 0, CB0.d, 0L, 0L, 0L, 0L, false);
    }

    public final BB0 a() {
        return new BB0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, j(), SystemClock.elapsedRealtime(), this.p);
    }

    public final BB0 b(C0456Fp0 c0456Fp0) {
        return new BB0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, c0456Fp0, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final BB0 c(C0456Fp0 c0456Fp0, long j, long j2, long j3, long j4, C1350Rb1 c1350Rb1, C2359bc1 c2359bc1, List list) {
        return new BB0(this.a, c0456Fp0, j2, j3, this.e, this.f, this.g, c1350Rb1, c2359bc1, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final BB0 d(int i, int i2, boolean z) {
        return new BB0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final BB0 e(IQ iq) {
        return new BB0(this.a, this.b, this.c, this.d, this.e, iq, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final BB0 f(CB0 cb0) {
        return new BB0(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, cb0, this.q, this.r, this.s, this.t, this.p);
    }

    public final BB0 g(int i) {
        return new BB0(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final BB0 h(AbstractC0178Ca1 abstractC0178Ca1) {
        return new BB0(abstractC0178Ca1, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long j() {
        long j;
        long j2;
        if (!k()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return AbstractC0277Dh1.Q(AbstractC0277Dh1.d0(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean k() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
