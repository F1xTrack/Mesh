package defpackage;

import android.util.Pair;
import java.util.ArrayList;

/* renamed from: Cp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0222Cp0 {
    public final C8323zE c;
    public final R71 d;
    public final EE e;
    public long f;
    public int g;
    public boolean h;
    public C0066Ap0 i;
    public C0066Ap0 j;
    public C0066Ap0 k;
    public int l;
    public Object m;
    public long n;
    public final C0022Aa1 a = new C0022Aa1();
    public final C0100Ba1 b = new C0100Ba1();
    public ArrayList o = new ArrayList();

    public C0222Cp0(C8323zE c8323zE, R71 r71, EE ee, LQ lq) {
        this.c = c8323zE;
        this.d = r71;
        this.e = ee;
    }

    public static C0456Fp0 l(AbstractC0178Ca1 abstractC0178Ca1, Object obj, long j, long j2, C0100Ba1 c0100Ba1, C0022Aa1 c0022Aa1) {
        abstractC0178Ca1.g(obj, c0022Aa1);
        abstractC0178Ca1.n(c0022Aa1.c, c0100Ba1);
        abstractC0178Ca1.b(obj);
        int i = c0022Aa1.g.a;
        if (i != 0) {
            if (i == 1) {
                c0022Aa1.f(0);
            }
            c0022Aa1.g.getClass();
            c0022Aa1.g(0);
        }
        abstractC0178Ca1.g(obj, c0022Aa1);
        int iC = c0022Aa1.c(j);
        return iC == -1 ? new C0456Fp0(obj, j2, c0022Aa1.b(j)) : new C0456Fp0(obj, iC, c0022Aa1.e(iC), j2, -1);
    }

    public final C0066Ap0 a() {
        C0066Ap0 c0066Ap0 = this.i;
        if (c0066Ap0 == null) {
            return null;
        }
        if (c0066Ap0 == this.j) {
            this.j = c0066Ap0.l;
        }
        c0066Ap0.g();
        int i = this.l - 1;
        this.l = i;
        if (i == 0) {
            this.k = null;
            C0066Ap0 c0066Ap02 = this.i;
            this.m = c0066Ap02.b;
            this.n = c0066Ap02.f.a.d;
        }
        this.i = this.i.l;
        j();
        return this.i;
    }

    public final void b() {
        if (this.l == 0) {
            return;
        }
        C0066Ap0 c0066Ap0 = this.i;
        YN1.h(c0066Ap0);
        this.m = c0066Ap0.b;
        this.n = c0066Ap0.f.a.d;
        while (c0066Ap0 != null) {
            c0066Ap0.g();
            c0066Ap0 = c0066Ap0.l;
        }
        this.i = null;
        this.k = null;
        this.j = null;
        this.l = 0;
        j();
    }

    public final C0144Bp0 c(AbstractC0178Ca1 abstractC0178Ca1, C0066Ap0 c0066Ap0, long j) {
        C0144Bp0 c0144Bp0F;
        long j2;
        C0144Bp0 c0144Bp0 = c0066Ap0.f;
        long j3 = (c0066Ap0.o + c0144Bp0.e) - j;
        if (c0144Bp0.g) {
            C0144Bp0 c0144Bp02 = c0066Ap0.f;
            C0456Fp0 c0456Fp0 = c0144Bp02.a;
            int iD = abstractC0178Ca1.d(abstractC0178Ca1.b(c0456Fp0.a), this.a, this.b, this.g, this.h);
            if (iD != -1) {
                C0022Aa1 c0022Aa1 = this.a;
                int i = abstractC0178Ca1.f(iD, c0022Aa1, true).c;
                Object obj = c0022Aa1.b;
                obj.getClass();
                long jN = c0456Fp0.d;
                long j4 = 0;
                if (abstractC0178Ca1.m(i, this.b, 0L).n == iD) {
                    Pair pairJ = abstractC0178Ca1.j(this.b, this.a, i, -9223372036854775807L, Math.max(0L, j3));
                    if (pairJ != null) {
                        obj = pairJ.first;
                        long jLongValue = ((Long) pairJ.second).longValue();
                        C0066Ap0 c0066Ap02 = c0066Ap0.l;
                        if (c0066Ap02 == null || !c0066Ap02.b.equals(obj)) {
                            jN = n(obj);
                            if (jN == -1) {
                                jN = this.f;
                                this.f = 1 + jN;
                            }
                        } else {
                            jN = c0066Ap02.f.a.d;
                        }
                        j2 = jLongValue;
                        j4 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                }
                C0456Fp0 c0456Fp0L = l(abstractC0178Ca1, obj, j2, jN, this.b, this.a);
                if (j4 != -9223372036854775807L && c0144Bp02.c != -9223372036854775807L) {
                    int i2 = abstractC0178Ca1.g(c0456Fp0.a, c0022Aa1).g.a;
                    c0022Aa1.g.getClass();
                    if (i2 > 0) {
                        c0022Aa1.g(0);
                    }
                }
                return d(abstractC0178Ca1, c0456Fp0L, j4, j2);
            }
            return null;
        }
        C0456Fp0 c0456Fp02 = c0144Bp0.a;
        Object obj2 = c0456Fp02.a;
        C0022Aa1 c0022Aa12 = this.a;
        abstractC0178Ca1.g(obj2, c0022Aa12);
        boolean zB = c0456Fp02.b();
        Object obj3 = c0456Fp02.a;
        if (zB) {
            C3507e3 c3507e3 = c0022Aa12.g;
            int i3 = c0456Fp02.b;
            int i4 = c3507e3.a(i3).a;
            if (i4 != -1) {
                int iA = c0022Aa12.g.a(i3).a(c0456Fp02.c);
                if (iA < i4) {
                    c0144Bp0F = e(abstractC0178Ca1, c0456Fp02.a, i3, iA, c0144Bp0.c, c0456Fp02.d);
                } else {
                    long jLongValue2 = c0144Bp0.c;
                    if (jLongValue2 == -9223372036854775807L) {
                        Pair pairJ2 = abstractC0178Ca1.j(this.b, c0022Aa12, c0022Aa12.c, -9223372036854775807L, Math.max(0L, j3));
                        if (pairJ2 != null) {
                            jLongValue2 = ((Long) pairJ2.second).longValue();
                        }
                    }
                    abstractC0178Ca1.g(obj3, c0022Aa12);
                    int i5 = c0456Fp02.b;
                    c0022Aa12.d(i5);
                    c0022Aa12.g.a(i5).getClass();
                    c0144Bp0F = f(abstractC0178Ca1, c0456Fp02.a, Math.max(0L, jLongValue2), c0144Bp0.c, c0456Fp02.d);
                }
            }
            return null;
        }
        int i6 = c0456Fp02.e;
        if (i6 != -1) {
            c0022Aa12.f(i6);
        }
        int iE = c0022Aa12.e(i6);
        c0022Aa12.g(i6);
        if (iE != c0022Aa12.g.a(i6).a) {
            c0144Bp0F = e(abstractC0178Ca1, c0456Fp02.a, c0456Fp02.e, iE, c0144Bp0.e, c0456Fp02.d);
        } else {
            abstractC0178Ca1.g(obj3, c0022Aa12);
            c0022Aa12.d(i6);
            c0022Aa12.g.a(i6).getClass();
            c0144Bp0F = f(abstractC0178Ca1, c0456Fp02.a, 0L, c0144Bp0.e, c0456Fp02.d);
        }
        return c0144Bp0F;
    }

    public final C0144Bp0 d(AbstractC0178Ca1 abstractC0178Ca1, C0456Fp0 c0456Fp0, long j, long j2) {
        abstractC0178Ca1.g(c0456Fp0.a, this.a);
        if (!c0456Fp0.b()) {
            return f(abstractC0178Ca1, c0456Fp0.a, j2, j, c0456Fp0.d);
        }
        return e(abstractC0178Ca1, c0456Fp0.a, c0456Fp0.b, c0456Fp0.c, j, c0456Fp0.d);
    }

    public final C0144Bp0 e(AbstractC0178Ca1 abstractC0178Ca1, Object obj, int i, int i2, long j, long j2) {
        C0456Fp0 c0456Fp0 = new C0456Fp0(obj, i, i2, j2, -1);
        C0022Aa1 c0022Aa1 = this.a;
        long jA = abstractC0178Ca1.g(obj, c0022Aa1).a(i, i2);
        if (i2 == c0022Aa1.e(i)) {
            c0022Aa1.g.getClass();
        }
        c0022Aa1.g(i);
        return new C0144Bp0(c0456Fp0, (jA == -9223372036854775807L || 0 < jA) ? 0L : Math.max(0L, jA - 1), j, -9223372036854775807L, jA, false, false, false, false);
    }

    public final C0144Bp0 f(AbstractC0178Ca1 abstractC0178Ca1, Object obj, long j, long j2, long j3) {
        long j4;
        C0022Aa1 c0022Aa1 = this.a;
        abstractC0178Ca1.g(obj, c0022Aa1);
        int iB = c0022Aa1.b(j);
        if (iB != -1) {
            c0022Aa1.f(iB);
        }
        boolean z = false;
        if (iB != -1) {
            c0022Aa1.g(iB);
        } else if (c0022Aa1.g.a > 0) {
            c0022Aa1.g(0);
        }
        C0456Fp0 c0456Fp0 = new C0456Fp0(obj, j3, iB);
        if (!c0456Fp0.b() && iB == -1) {
            z = true;
        }
        boolean zI = i(abstractC0178Ca1, c0456Fp0);
        boolean zH = h(abstractC0178Ca1, c0456Fp0, z);
        if (iB != -1) {
            c0022Aa1.g(iB);
        }
        if (iB != -1) {
            c0022Aa1.d(iB);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j5 = (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? c0022Aa1.d : j4;
        return new C0144Bp0(c0456Fp0, (j5 == -9223372036854775807L || j < j5) ? j : Math.max(0L, j5 - 1), j2, j4, j5, false, z, zI, zH);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.C0144Bp0 g(defpackage.AbstractC0178Ca1 r20, defpackage.C0144Bp0 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            Fp0 r3 = r2.a
            boolean r4 = r3.b()
            r5 = -1
            int r6 = r3.e
            if (r4 != 0) goto L16
            if (r6 != r5) goto L16
            r4 = 1
        L14:
            r12 = r4
            goto L18
        L16:
            r4 = 0
            goto L14
        L18:
            boolean r13 = r0.i(r1, r3)
            boolean r14 = r0.h(r1, r3, r12)
            java.lang.Object r4 = r3.a
            Aa1 r7 = r0.a
            r1.g(r4, r7)
            boolean r1 = r3.b()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L3b
            if (r6 != r5) goto L35
            goto L3b
        L35:
            r7.d(r6)
            r10 = 0
            goto L3c
        L3b:
            r10 = r8
        L3c:
            boolean r1 = r3.b()
            int r4 = r3.b
            if (r1 == 0) goto L4c
            int r1 = r3.c
            long r8 = r7.a(r4, r1)
        L4a:
            r15 = r8
            goto L5c
        L4c:
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 == 0) goto L59
            r8 = -9223372036854775808
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L57
            goto L59
        L57:
            r15 = r10
            goto L5c
        L59:
            long r8 = r7.d
            goto L4a
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L66
            r7.g(r4)
            goto L6b
        L66:
            if (r6 == r5) goto L6b
            r7.g(r6)
        L6b:
            Bp0 r17 = new Bp0
            long r4 = r2.b
            long r6 = r2.c
            r18 = 0
            r1 = r17
            r2 = r3
            r3 = r4
            r5 = r6
            r7 = r10
            r9 = r15
            r11 = r18
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0222Cp0.g(Ca1, Bp0):Bp0");
    }

    public final boolean h(AbstractC0178Ca1 abstractC0178Ca1, C0456Fp0 c0456Fp0, boolean z) {
        int iB = abstractC0178Ca1.b(c0456Fp0.a);
        if (abstractC0178Ca1.m(abstractC0178Ca1.f(iB, this.a, false).c, this.b, 0L).i) {
            return false;
        }
        return abstractC0178Ca1.d(iB, this.a, this.b, this.g, this.h) == -1 && z;
    }

    public final boolean i(AbstractC0178Ca1 abstractC0178Ca1, C0456Fp0 c0456Fp0) {
        if (!(!c0456Fp0.b() && c0456Fp0.e == -1)) {
            return false;
        }
        Object obj = c0456Fp0.a;
        return abstractC0178Ca1.m(abstractC0178Ca1.g(obj, this.a).c, this.b, 0L).o == abstractC0178Ca1.b(obj);
    }

    public final void j() {
        M70 m70T = P70.t();
        for (C0066Ap0 c0066Ap0 = this.i; c0066Ap0 != null; c0066Ap0 = c0066Ap0.l) {
            m70T.a(c0066Ap0.f.a);
        }
        C0066Ap0 c0066Ap02 = this.j;
        this.d.c(new RunnableC1557Ts1(this, m70T, c0066Ap02 == null ? null : c0066Ap02.f.a, 28));
    }

    public final boolean k(C0066Ap0 c0066Ap0) {
        YN1.h(c0066Ap0);
        boolean z = false;
        if (c0066Ap0.equals(this.k)) {
            return false;
        }
        this.k = c0066Ap0;
        while (true) {
            c0066Ap0 = c0066Ap0.l;
            if (c0066Ap0 == null) {
                break;
            }
            if (c0066Ap0 == this.j) {
                this.j = this.i;
                z = true;
            }
            c0066Ap0.g();
            this.l--;
        }
        C0066Ap0 c0066Ap02 = this.k;
        c0066Ap02.getClass();
        if (c0066Ap02.l != null) {
            c0066Ap02.b();
            c0066Ap02.l = null;
            c0066Ap02.c();
        }
        j();
        return z;
    }

    public final C0456Fp0 m(AbstractC0178Ca1 abstractC0178Ca1, Object obj, long j) {
        long jN;
        int iB;
        Object obj2 = obj;
        C0022Aa1 c0022Aa1 = this.a;
        int i = abstractC0178Ca1.g(obj2, c0022Aa1).c;
        Object obj3 = this.m;
        if (obj3 == null || (iB = abstractC0178Ca1.b(obj3)) == -1 || abstractC0178Ca1.f(iB, c0022Aa1, false).c != i) {
            C0066Ap0 c0066Ap0 = this.i;
            while (true) {
                if (c0066Ap0 == null) {
                    C0066Ap0 c0066Ap02 = this.i;
                    while (true) {
                        if (c0066Ap02 != null) {
                            int iB2 = abstractC0178Ca1.b(c0066Ap02.b);
                            if (iB2 != -1 && abstractC0178Ca1.f(iB2, c0022Aa1, false).c == i) {
                                jN = c0066Ap02.f.a.d;
                                break;
                            }
                            c0066Ap02 = c0066Ap02.l;
                        } else {
                            jN = n(obj2);
                            if (jN == -1) {
                                jN = this.f;
                                this.f = 1 + jN;
                                if (this.i == null) {
                                    this.m = obj2;
                                    this.n = jN;
                                }
                            }
                        }
                    }
                } else {
                    if (c0066Ap0.b.equals(obj2)) {
                        jN = c0066Ap0.f.a.d;
                        break;
                    }
                    c0066Ap0 = c0066Ap0.l;
                }
            }
        } else {
            jN = this.n;
        }
        long j2 = jN;
        abstractC0178Ca1.g(obj2, c0022Aa1);
        int i2 = c0022Aa1.c;
        C0100Ba1 c0100Ba1 = this.b;
        abstractC0178Ca1.n(i2, c0100Ba1);
        boolean z = false;
        for (int iB3 = abstractC0178Ca1.b(obj); iB3 >= c0100Ba1.n; iB3--) {
            abstractC0178Ca1.f(iB3, c0022Aa1, true);
            boolean z2 = c0022Aa1.g.a > 0;
            z |= z2;
            if (c0022Aa1.c(c0022Aa1.d) != -1) {
                obj2 = c0022Aa1.b;
                obj2.getClass();
            }
            if (z && (!z2 || c0022Aa1.d != 0)) {
                break;
            }
        }
        return l(abstractC0178Ca1, obj2, j, j2, this.b, this.a);
    }

    public final long n(Object obj) {
        for (int i = 0; i < this.o.size(); i++) {
            C0066Ap0 c0066Ap0 = (C0066Ap0) this.o.get(i);
            if (c0066Ap0.b.equals(obj)) {
                return c0066Ap0.f.a.d;
            }
        }
        return -1L;
    }

    public final boolean o(AbstractC0178Ca1 abstractC0178Ca1) {
        C0066Ap0 c0066Ap0;
        C0066Ap0 c0066Ap02 = this.i;
        if (c0066Ap02 == null) {
            return true;
        }
        int iB = abstractC0178Ca1.b(c0066Ap02.b);
        while (true) {
            iB = abstractC0178Ca1.d(iB, this.a, this.b, this.g, this.h);
            while (true) {
                c0066Ap02.getClass();
                c0066Ap0 = c0066Ap02.l;
                if (c0066Ap0 == null || c0066Ap02.f.g) {
                    break;
                }
                c0066Ap02 = c0066Ap0;
            }
            if (iB == -1 || c0066Ap0 == null || abstractC0178Ca1.b(c0066Ap0.b) != iB) {
                break;
            }
            c0066Ap02 = c0066Ap0;
        }
        boolean zK = k(c0066Ap02);
        c0066Ap02.f = g(abstractC0178Ca1, c0066Ap02.f);
        return !zK;
    }

    public final boolean p(AbstractC0178Ca1 abstractC0178Ca1, long j, long j2) {
        C0144Bp0 c0144Bp0G;
        C0066Ap0 c0066Ap0 = this.i;
        C0066Ap0 c0066Ap02 = null;
        while (c0066Ap0 != null) {
            C0144Bp0 c0144Bp0 = c0066Ap0.f;
            if (c0066Ap02 == null) {
                c0144Bp0G = g(abstractC0178Ca1, c0144Bp0);
            } else {
                C0144Bp0 c0144Bp0C = c(abstractC0178Ca1, c0066Ap02, j);
                if (c0144Bp0C == null) {
                    return !k(c0066Ap02);
                }
                if (c0144Bp0.b != c0144Bp0C.b || !c0144Bp0.a.equals(c0144Bp0C.a)) {
                    return !k(c0066Ap02);
                }
                c0144Bp0G = c0144Bp0C;
            }
            c0066Ap0.f = c0144Bp0G.a(c0144Bp0.c);
            long j3 = c0144Bp0.e;
            if (j3 != -9223372036854775807L) {
                long j4 = c0144Bp0G.e;
                if (j3 != j4) {
                    c0066Ap0.i();
                    return (k(c0066Ap0) || (c0066Ap0 == this.j && !c0066Ap0.f.f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c0066Ap0.o + j4) ? 1 : (j2 == ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c0066Ap0.o + j4) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            c0066Ap02 = c0066Ap0;
            c0066Ap0 = c0066Ap0.l;
        }
        return true;
    }
}
