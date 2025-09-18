package p000;

import android.util.Pair;
import java.util.ArrayList;

/* renamed from: Cp0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7448Cp0 {

    /* renamed from: c */
    public final C7251zE f1675c;

    /* renamed from: d */
    public final R71 f1676d;

    /* renamed from: e */
    public final C0267EE f1677e;

    /* renamed from: f */
    public long f1678f;

    /* renamed from: g */
    public int f1679g;

    /* renamed from: h */
    public boolean f1680h;

    /* renamed from: i */
    public C7344Ap0 f1681i;

    /* renamed from: j */
    public C7344Ap0 f1682j;

    /* renamed from: k */
    public C7344Ap0 f1683k;

    /* renamed from: l */
    public int f1684l;

    /* renamed from: m */
    public Object f1685m;

    /* renamed from: n */
    public long f1686n;

    /* renamed from: a */
    public final C7315Aa1 f1673a = new C7315Aa1();

    /* renamed from: b */
    public final C7367Ba1 f1674b = new C7367Ba1();

    /* renamed from: o */
    public ArrayList f1687o = new ArrayList();

    public C7448Cp0(C7251zE c7251zE, R71 r71, C0267EE c0267ee, C0720LQ c0720lq) {
        this.f1675c = c7251zE;
        this.f1676d = r71;
        this.f1677e = c0267ee;
    }

    /* renamed from: l */
    public static C7604Fp0 m1374l(AbstractC7419Ca1 abstractC7419Ca1, Object obj, long j, long j2, C7367Ba1 c7367Ba1, C7315Aa1 c7315Aa1) {
        abstractC7419Ca1.mo1250g(obj, c7315Aa1);
        abstractC7419Ca1.m1257n(c7315Aa1.f258c, c7367Ba1);
        abstractC7419Ca1.mo1245b(obj);
        int i = c7315Aa1.f262g.f26515a;
        if (i != 0) {
            if (i == 1) {
                c7315Aa1.m241f(0);
            }
            c7315Aa1.f262g.getClass();
            c7315Aa1.m242g(0);
        }
        abstractC7419Ca1.mo1250g(obj, c7315Aa1);
        int iM238c = c7315Aa1.m238c(j);
        return iM238c == -1 ? new C7604Fp0(obj, j2, c7315Aa1.m237b(j)) : new C7604Fp0(obj, iM238c, c7315Aa1.m240e(iM238c), j2, -1);
    }

    /* renamed from: a */
    public final C7344Ap0 m1375a() {
        C7344Ap0 c7344Ap0 = this.f1681i;
        if (c7344Ap0 == null) {
            return null;
        }
        if (c7344Ap0 == this.f1682j) {
            this.f1682j = c7344Ap0.f394l;
        }
        c7344Ap0.m331g();
        int i = this.f1684l - 1;
        this.f1684l = i;
        if (i == 0) {
            this.f1683k = null;
            C7344Ap0 c7344Ap02 = this.f1681i;
            this.f1685m = c7344Ap02.f384b;
            this.f1686n = c7344Ap02.f388f.f1042a.f3433d;
        }
        this.f1681i = this.f1681i.f394l;
        m1384j();
        return this.f1681i;
    }

    /* renamed from: b */
    public final void m1376b() {
        if (this.f1684l == 0) {
            return;
        }
        C7344Ap0 c7344Ap0 = this.f1681i;
        YN1.m9283h(c7344Ap0);
        this.f1685m = c7344Ap0.f384b;
        this.f1686n = c7344Ap0.f388f.f1042a.f3433d;
        while (c7344Ap0 != null) {
            c7344Ap0.m331g();
            c7344Ap0 = c7344Ap0.f394l;
        }
        this.f1681i = null;
        this.f1683k = null;
        this.f1682j = null;
        this.f1684l = 0;
        m1384j();
    }

    /* renamed from: c */
    public final C7396Bp0 m1377c(AbstractC7419Ca1 abstractC7419Ca1, C7344Ap0 c7344Ap0, long j) {
        C7396Bp0 c7396Bp0M1380f;
        long j2;
        C7396Bp0 c7396Bp0 = c7344Ap0.f388f;
        long j3 = (c7344Ap0.f397o + c7396Bp0.f1046e) - j;
        if (c7396Bp0.f1048g) {
            C7396Bp0 c7396Bp02 = c7344Ap0.f388f;
            C7604Fp0 c7604Fp0 = c7396Bp02.f1042a;
            int iM1247d = abstractC7419Ca1.m1247d(abstractC7419Ca1.mo1245b(c7604Fp0.f3430a), this.f1673a, this.f1674b, this.f1679g, this.f1680h);
            if (iM1247d != -1) {
                C7315Aa1 c7315Aa1 = this.f1673a;
                int i = abstractC7419Ca1.mo1249f(iM1247d, c7315Aa1, true).f258c;
                Object obj = c7315Aa1.f257b;
                obj.getClass();
                long jM1387n = c7604Fp0.f3433d;
                long j4 = 0;
                if (abstractC7419Ca1.mo1256m(i, this.f1674b, 0L).f927n == iM1247d) {
                    Pair pairM1253j = abstractC7419Ca1.m1253j(this.f1674b, this.f1673a, i, -9223372036854775807L, Math.max(0L, j3));
                    if (pairM1253j != null) {
                        obj = pairM1253j.first;
                        long jLongValue = ((Long) pairM1253j.second).longValue();
                        C7344Ap0 c7344Ap02 = c7344Ap0.f394l;
                        if (c7344Ap02 == null || !c7344Ap02.f384b.equals(obj)) {
                            jM1387n = m1387n(obj);
                            if (jM1387n == -1) {
                                jM1387n = this.f1678f;
                                this.f1678f = 1 + jM1387n;
                            }
                        } else {
                            jM1387n = c7344Ap02.f388f.f1042a.f3433d;
                        }
                        j2 = jLongValue;
                        j4 = -9223372036854775807L;
                    }
                } else {
                    j2 = 0;
                }
                C7604Fp0 c7604Fp0M1374l = m1374l(abstractC7419Ca1, obj, j2, jM1387n, this.f1674b, this.f1673a);
                if (j4 != -9223372036854775807L && c7396Bp02.f1044c != -9223372036854775807L) {
                    int i2 = abstractC7419Ca1.mo1250g(c7604Fp0.f3430a, c7315Aa1).f262g.f26515a;
                    c7315Aa1.f262g.getClass();
                    if (i2 > 0) {
                        c7315Aa1.m242g(0);
                    }
                }
                return m1378d(abstractC7419Ca1, c7604Fp0M1374l, j4, j2);
            }
            return null;
        }
        C7604Fp0 c7604Fp02 = c7396Bp0.f1042a;
        Object obj2 = c7604Fp02.f3430a;
        C7315Aa1 c7315Aa12 = this.f1673a;
        abstractC7419Ca1.mo1250g(obj2, c7315Aa12);
        boolean zM2791b = c7604Fp02.m2791b();
        Object obj3 = c7604Fp02.f3430a;
        if (zM2791b) {
            C3966e3 c3966e3 = c7315Aa12.f262g;
            int i3 = c7604Fp02.f3431b;
            int i4 = c3966e3.m17827a(i3).f25777a;
            if (i4 != -1) {
                int iM17481a = c7315Aa12.f262g.m17827a(i3).m17481a(c7604Fp02.f3432c);
                if (iM17481a < i4) {
                    c7396Bp0M1380f = m1379e(abstractC7419Ca1, c7604Fp02.f3430a, i3, iM17481a, c7396Bp0.f1044c, c7604Fp02.f3433d);
                } else {
                    long jLongValue2 = c7396Bp0.f1044c;
                    if (jLongValue2 == -9223372036854775807L) {
                        Pair pairM1253j2 = abstractC7419Ca1.m1253j(this.f1674b, c7315Aa12, c7315Aa12.f258c, -9223372036854775807L, Math.max(0L, j3));
                        if (pairM1253j2 != null) {
                            jLongValue2 = ((Long) pairM1253j2.second).longValue();
                        }
                    }
                    abstractC7419Ca1.mo1250g(obj3, c7315Aa12);
                    int i5 = c7604Fp02.f3431b;
                    c7315Aa12.m239d(i5);
                    c7315Aa12.f262g.m17827a(i5).getClass();
                    c7396Bp0M1380f = m1380f(abstractC7419Ca1, c7604Fp02.f3430a, Math.max(0L, jLongValue2), c7396Bp0.f1044c, c7604Fp02.f3433d);
                }
            }
            return null;
        }
        int i6 = c7604Fp02.f3434e;
        if (i6 != -1) {
            c7315Aa12.m241f(i6);
        }
        int iM240e = c7315Aa12.m240e(i6);
        c7315Aa12.m242g(i6);
        if (iM240e != c7315Aa12.f262g.m17827a(i6).f25777a) {
            c7396Bp0M1380f = m1379e(abstractC7419Ca1, c7604Fp02.f3430a, c7604Fp02.f3434e, iM240e, c7396Bp0.f1046e, c7604Fp02.f3433d);
        } else {
            abstractC7419Ca1.mo1250g(obj3, c7315Aa12);
            c7315Aa12.m239d(i6);
            c7315Aa12.f262g.m17827a(i6).getClass();
            c7396Bp0M1380f = m1380f(abstractC7419Ca1, c7604Fp02.f3430a, 0L, c7396Bp0.f1046e, c7604Fp02.f3433d);
        }
        return c7396Bp0M1380f;
    }

    /* renamed from: d */
    public final C7396Bp0 m1378d(AbstractC7419Ca1 abstractC7419Ca1, C7604Fp0 c7604Fp0, long j, long j2) {
        abstractC7419Ca1.mo1250g(c7604Fp0.f3430a, this.f1673a);
        if (!c7604Fp0.m2791b()) {
            return m1380f(abstractC7419Ca1, c7604Fp0.f3430a, j2, j, c7604Fp0.f3433d);
        }
        return m1379e(abstractC7419Ca1, c7604Fp0.f3430a, c7604Fp0.f3431b, c7604Fp0.f3432c, j, c7604Fp0.f3433d);
    }

    /* renamed from: e */
    public final C7396Bp0 m1379e(AbstractC7419Ca1 abstractC7419Ca1, Object obj, int i, int i2, long j, long j2) {
        C7604Fp0 c7604Fp0 = new C7604Fp0(obj, i, i2, j2, -1);
        C7315Aa1 c7315Aa1 = this.f1673a;
        long jM236a = abstractC7419Ca1.mo1250g(obj, c7315Aa1).m236a(i, i2);
        if (i2 == c7315Aa1.m240e(i)) {
            c7315Aa1.f262g.getClass();
        }
        c7315Aa1.m242g(i);
        return new C7396Bp0(c7604Fp0, (jM236a == -9223372036854775807L || 0 < jM236a) ? 0L : Math.max(0L, jM236a - 1), j, -9223372036854775807L, jM236a, false, false, false, false);
    }

    /* renamed from: f */
    public final C7396Bp0 m1380f(AbstractC7419Ca1 abstractC7419Ca1, Object obj, long j, long j2, long j3) {
        long j4;
        C7315Aa1 c7315Aa1 = this.f1673a;
        abstractC7419Ca1.mo1250g(obj, c7315Aa1);
        int iM237b = c7315Aa1.m237b(j);
        if (iM237b != -1) {
            c7315Aa1.m241f(iM237b);
        }
        boolean z = false;
        if (iM237b != -1) {
            c7315Aa1.m242g(iM237b);
        } else if (c7315Aa1.f262g.f26515a > 0) {
            c7315Aa1.m242g(0);
        }
        C7604Fp0 c7604Fp0 = new C7604Fp0(obj, j3, iM237b);
        if (!c7604Fp0.m2791b() && iM237b == -1) {
            z = true;
        }
        boolean zM1383i = m1383i(abstractC7419Ca1, c7604Fp0);
        boolean zM1382h = m1382h(abstractC7419Ca1, c7604Fp0, z);
        if (iM237b != -1) {
            c7315Aa1.m242g(iM237b);
        }
        if (iM237b != -1) {
            c7315Aa1.m239d(iM237b);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        long j5 = (j4 == -9223372036854775807L || j4 == Long.MIN_VALUE) ? c7315Aa1.f259d : j4;
        return new C7396Bp0(c7604Fp0, (j5 == -9223372036854775807L || j < j5) ? j : Math.max(0L, j5 - 1), j2, j4, j5, false, z, zM1383i, zM1382h);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000.C7396Bp0 m1381g(p000.AbstractC7419Ca1 r20, p000.C7396Bp0 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            Fp0 r3 = r2.f1042a
            boolean r4 = r3.m2791b()
            r5 = -1
            int r6 = r3.f3434e
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
            boolean r13 = r0.m1383i(r1, r3)
            boolean r14 = r0.m1382h(r1, r3, r12)
            java.lang.Object r4 = r3.f3430a
            Aa1 r7 = r0.f1673a
            r1.mo1250g(r4, r7)
            boolean r1 = r3.m2791b()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L3b
            if (r6 != r5) goto L35
            goto L3b
        L35:
            r7.m239d(r6)
            r10 = 0
            goto L3c
        L3b:
            r10 = r8
        L3c:
            boolean r1 = r3.m2791b()
            int r4 = r3.f3431b
            if (r1 == 0) goto L4c
            int r1 = r3.f3432c
            long r8 = r7.m236a(r4, r1)
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
            long r8 = r7.f259d
            goto L4a
        L5c:
            boolean r1 = r3.m2791b()
            if (r1 == 0) goto L66
            r7.m242g(r4)
            goto L6b
        L66:
            if (r6 == r5) goto L6b
            r7.m242g(r6)
        L6b:
            Bp0 r17 = new Bp0
            long r4 = r2.f1043b
            long r6 = r2.f1044c
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C7448Cp0.m1381g(Ca1, Bp0):Bp0");
    }

    /* renamed from: h */
    public final boolean m1382h(AbstractC7419Ca1 abstractC7419Ca1, C7604Fp0 c7604Fp0, boolean z) {
        int iMo1245b = abstractC7419Ca1.mo1245b(c7604Fp0.f3430a);
        if (abstractC7419Ca1.mo1256m(abstractC7419Ca1.mo1249f(iMo1245b, this.f1673a, false).f258c, this.f1674b, 0L).f922i) {
            return false;
        }
        return abstractC7419Ca1.m1247d(iMo1245b, this.f1673a, this.f1674b, this.f1679g, this.f1680h) == -1 && z;
    }

    /* renamed from: i */
    public final boolean m1383i(AbstractC7419Ca1 abstractC7419Ca1, C7604Fp0 c7604Fp0) {
        if (!(!c7604Fp0.m2791b() && c7604Fp0.f3434e == -1)) {
            return false;
        }
        Object obj = c7604Fp0.f3430a;
        return abstractC7419Ca1.mo1256m(abstractC7419Ca1.mo1250g(obj, this.f1673a).f258c, this.f1674b, 0L).f928o == abstractC7419Ca1.mo1245b(obj);
    }

    /* renamed from: j */
    public final void m1384j() {
        M70 m70M6233t = P70.m6233t();
        for (C7344Ap0 c7344Ap0 = this.f1681i; c7344Ap0 != null; c7344Ap0 = c7344Ap0.f394l) {
            m70M6233t.m3755a(c7344Ap0.f388f.f1042a);
        }
        C7344Ap0 c7344Ap02 = this.f1682j;
        this.f1676d.m6905c(new RunnableC8339Ts1(this, m70M6233t, c7344Ap02 == null ? null : c7344Ap02.f388f.f1042a, 28));
    }

    /* renamed from: k */
    public final boolean m1385k(C7344Ap0 c7344Ap0) {
        YN1.m9283h(c7344Ap0);
        boolean z = false;
        if (c7344Ap0.equals(this.f1683k)) {
            return false;
        }
        this.f1683k = c7344Ap0;
        while (true) {
            c7344Ap0 = c7344Ap0.f394l;
            if (c7344Ap0 == null) {
                break;
            }
            if (c7344Ap0 == this.f1682j) {
                this.f1682j = this.f1681i;
                z = true;
            }
            c7344Ap0.m331g();
            this.f1684l--;
        }
        C7344Ap0 c7344Ap02 = this.f1683k;
        c7344Ap02.getClass();
        if (c7344Ap02.f394l != null) {
            c7344Ap02.m326b();
            c7344Ap02.f394l = null;
            c7344Ap02.m327c();
        }
        m1384j();
        return z;
    }

    /* renamed from: m */
    public final C7604Fp0 m1386m(AbstractC7419Ca1 abstractC7419Ca1, Object obj, long j) {
        long jM1387n;
        int iMo1245b;
        Object obj2 = obj;
        C7315Aa1 c7315Aa1 = this.f1673a;
        int i = abstractC7419Ca1.mo1250g(obj2, c7315Aa1).f258c;
        Object obj3 = this.f1685m;
        if (obj3 == null || (iMo1245b = abstractC7419Ca1.mo1245b(obj3)) == -1 || abstractC7419Ca1.mo1249f(iMo1245b, c7315Aa1, false).f258c != i) {
            C7344Ap0 c7344Ap0 = this.f1681i;
            while (true) {
                if (c7344Ap0 == null) {
                    C7344Ap0 c7344Ap02 = this.f1681i;
                    while (true) {
                        if (c7344Ap02 != null) {
                            int iMo1245b2 = abstractC7419Ca1.mo1245b(c7344Ap02.f384b);
                            if (iMo1245b2 != -1 && abstractC7419Ca1.mo1249f(iMo1245b2, c7315Aa1, false).f258c == i) {
                                jM1387n = c7344Ap02.f388f.f1042a.f3433d;
                                break;
                            }
                            c7344Ap02 = c7344Ap02.f394l;
                        } else {
                            jM1387n = m1387n(obj2);
                            if (jM1387n == -1) {
                                jM1387n = this.f1678f;
                                this.f1678f = 1 + jM1387n;
                                if (this.f1681i == null) {
                                    this.f1685m = obj2;
                                    this.f1686n = jM1387n;
                                }
                            }
                        }
                    }
                } else {
                    if (c7344Ap0.f384b.equals(obj2)) {
                        jM1387n = c7344Ap0.f388f.f1042a.f3433d;
                        break;
                    }
                    c7344Ap0 = c7344Ap0.f394l;
                }
            }
        } else {
            jM1387n = this.f1686n;
        }
        long j2 = jM1387n;
        abstractC7419Ca1.mo1250g(obj2, c7315Aa1);
        int i2 = c7315Aa1.f258c;
        C7367Ba1 c7367Ba1 = this.f1674b;
        abstractC7419Ca1.m1257n(i2, c7367Ba1);
        boolean z = false;
        for (int iMo1245b3 = abstractC7419Ca1.mo1245b(obj); iMo1245b3 >= c7367Ba1.f927n; iMo1245b3--) {
            abstractC7419Ca1.mo1249f(iMo1245b3, c7315Aa1, true);
            boolean z2 = c7315Aa1.f262g.f26515a > 0;
            z |= z2;
            if (c7315Aa1.m238c(c7315Aa1.f259d) != -1) {
                obj2 = c7315Aa1.f257b;
                obj2.getClass();
            }
            if (z && (!z2 || c7315Aa1.f259d != 0)) {
                break;
            }
        }
        return m1374l(abstractC7419Ca1, obj2, j, j2, this.f1674b, this.f1673a);
    }

    /* renamed from: n */
    public final long m1387n(Object obj) {
        for (int i = 0; i < this.f1687o.size(); i++) {
            C7344Ap0 c7344Ap0 = (C7344Ap0) this.f1687o.get(i);
            if (c7344Ap0.f384b.equals(obj)) {
                return c7344Ap0.f388f.f1042a.f3433d;
            }
        }
        return -1L;
    }

    /* renamed from: o */
    public final boolean m1388o(AbstractC7419Ca1 abstractC7419Ca1) {
        C7344Ap0 c7344Ap0;
        C7344Ap0 c7344Ap02 = this.f1681i;
        if (c7344Ap02 == null) {
            return true;
        }
        int iMo1245b = abstractC7419Ca1.mo1245b(c7344Ap02.f384b);
        while (true) {
            iMo1245b = abstractC7419Ca1.m1247d(iMo1245b, this.f1673a, this.f1674b, this.f1679g, this.f1680h);
            while (true) {
                c7344Ap02.getClass();
                c7344Ap0 = c7344Ap02.f394l;
                if (c7344Ap0 == null || c7344Ap02.f388f.f1048g) {
                    break;
                }
                c7344Ap02 = c7344Ap0;
            }
            if (iMo1245b == -1 || c7344Ap0 == null || abstractC7419Ca1.mo1245b(c7344Ap0.f384b) != iMo1245b) {
                break;
            }
            c7344Ap02 = c7344Ap0;
        }
        boolean zM1385k = m1385k(c7344Ap02);
        c7344Ap02.f388f = m1381g(abstractC7419Ca1, c7344Ap02.f388f);
        return !zM1385k;
    }

    /* renamed from: p */
    public final boolean m1389p(AbstractC7419Ca1 abstractC7419Ca1, long j, long j2) {
        C7396Bp0 c7396Bp0M1381g;
        C7344Ap0 c7344Ap0 = this.f1681i;
        C7344Ap0 c7344Ap02 = null;
        while (c7344Ap0 != null) {
            C7396Bp0 c7396Bp0 = c7344Ap0.f388f;
            if (c7344Ap02 == null) {
                c7396Bp0M1381g = m1381g(abstractC7419Ca1, c7396Bp0);
            } else {
                C7396Bp0 c7396Bp0M1377c = m1377c(abstractC7419Ca1, c7344Ap02, j);
                if (c7396Bp0M1377c == null) {
                    return !m1385k(c7344Ap02);
                }
                if (c7396Bp0.f1043b != c7396Bp0M1377c.f1043b || !c7396Bp0.f1042a.equals(c7396Bp0M1377c.f1042a)) {
                    return !m1385k(c7344Ap02);
                }
                c7396Bp0M1381g = c7396Bp0M1377c;
            }
            c7344Ap0.f388f = c7396Bp0M1381g.m882a(c7396Bp0.f1044c);
            long j3 = c7396Bp0.f1046e;
            if (j3 != -9223372036854775807L) {
                long j4 = c7396Bp0M1381g.f1046e;
                if (j3 != j4) {
                    c7344Ap0.m333i();
                    return (m1385k(c7344Ap0) || (c7344Ap0 == this.f1682j && !c7344Ap0.f388f.f1047f && ((j2 > Long.MIN_VALUE ? 1 : (j2 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j2 > ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c7344Ap0.f397o + j4) ? 1 : (j2 == ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c7344Ap0.f397o + j4) ? 0 : -1)) >= 0))) ? false : true;
                }
            }
            c7344Ap02 = c7344Ap0;
            c7344Ap0 = c7344Ap0.f394l;
        }
        return true;
    }
}
