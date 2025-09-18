package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: k30, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5430k30 implements InterfaceC8435zp0, InterfaceC8291z30 {
    public final CF a;
    public final FF b;
    public final C0136Bm1 c;
    public final InterfaceC4188hc1 d;
    public final C22 e;
    public final RL f;
    public final OL g;
    public final C3547eG h;
    public final VY i;
    public final C5272jE j;
    public final IdentityHashMap k;
    public final C5996n11 l;
    public final C7304tt m;
    public final boolean n;
    public final int o;
    public final NB0 p;
    public final C1304Qm0 q = new C1304Qm0(20, this);
    public InterfaceC8245yp0 r;
    public int s;
    public C1350Rb1 t;
    public E30[] u;
    public E30[] v;
    public int w;
    public C1954Yv x;

    public C5430k30(CF cf, FF ff, C0136Bm1 c0136Bm1, InterfaceC4188hc1 interfaceC4188hc1, C22 c22, RL rl, OL ol, C3547eG c3547eG, VY vy, C5272jE c5272jE, C7304tt c7304tt, boolean z, int i, NB0 nb0) {
        this.a = cf;
        this.b = ff;
        this.c = c0136Bm1;
        this.d = interfaceC4188hc1;
        this.e = c22;
        this.f = rl;
        this.g = ol;
        this.h = c3547eG;
        this.i = vy;
        this.j = c5272jE;
        this.m = c7304tt;
        this.n = z;
        this.o = i;
        this.p = nb0;
        c7304tt.getClass();
        N70 n70 = P70.b;
        C3769fQ0 c3769fQ0 = C3769fQ0.e;
        this.x = new C1954Yv(c3769fQ0, c3769fQ0);
        this.k = new IdentityHashMap();
        this.l = new C5996n11(3);
        this.u = new E30[0];
        this.v = new E30[0];
    }

    public static C6666qX j(C6666qX c6666qX, C6666qX c6666qX2, boolean z) {
        C0540Gr0 c0540Gr0;
        int i;
        String str;
        int i2;
        int i3;
        String str2;
        String str3;
        P70 p70;
        N70 n70 = P70.b;
        P70 p702 = C3769fQ0.e;
        if (c6666qX2 != null) {
            str3 = c6666qX2.j;
            c0540Gr0 = c6666qX2.k;
            i2 = c6666qX2.A;
            i = c6666qX2.e;
            i3 = c6666qX2.f;
            str = c6666qX2.d;
            str2 = c6666qX2.b;
            p70 = c6666qX2.c;
        } else {
            String strT = AbstractC0277Dh1.t(1, c6666qX.j);
            c0540Gr0 = c6666qX.k;
            if (z) {
                i2 = c6666qX.A;
                i = c6666qX.e;
                i3 = c6666qX.f;
                str = c6666qX.d;
                str2 = c6666qX.b;
                p702 = c6666qX.c;
            } else {
                i = 0;
                str = null;
                i2 = -1;
                i3 = 0;
                str2 = null;
            }
            P70 p703 = p702;
            str3 = strT;
            p70 = p703;
        }
        String strD = AbstractC1865Xr0.d(str3);
        int i4 = z ? c6666qX.g : -1;
        int i5 = z ? c6666qX.h : -1;
        C6475pX c6475pX = new C6475pX();
        c6475pX.a = c6666qX.a;
        c6475pX.b = str2;
        c6475pX.c = P70.u(p70);
        c6475pX.k = AbstractC1865Xr0.n(c6666qX.l);
        c6475pX.l = AbstractC1865Xr0.n(strD);
        c6475pX.i = str3;
        c6475pX.j = c0540Gr0;
        c6475pX.g = i4;
        c6475pX.h = i5;
        c6475pX.z = i2;
        c6475pX.e = i;
        c6475pX.f = i3;
        c6475pX.d = str;
        return new C6666qX(c6475pX);
    }

    @Override // defpackage.InterfaceC8291z30
    public final void a() {
        for (E30 e30 : this.u) {
            ArrayList arrayList = e30.n;
            if (!arrayList.isEmpty()) {
                C5239j30 c5239j30 = (C5239j30) AbstractC7337u22.b(arrayList);
                int iB = e30.d.b(c5239j30);
                if (iB == 1) {
                    c5239j30.K = true;
                } else if (iB == 0) {
                    e30.r.post(new RQ(e30, 7, c5239j30));
                } else if (iB == 2 && !e30.T) {
                    C1857Xo1 c1857Xo1 = e30.j;
                    if (c1857Xo1.I()) {
                        c1857Xo1.p();
                    }
                }
            }
        }
        this.r.m(this);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long b(long j, DX0 dx0) {
        E30[] e30Arr = this.v;
        int length = e30Arr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            E30 e30 = e30Arr[i];
            if (e30.A == 2) {
                C4081h30 c4081h30 = e30.d;
                int iE = c4081h30.r.e();
                Uri[] uriArr = c4081h30.e;
                int length2 = uriArr.length;
                FF ff = c4081h30.g;
                C6576q30 c6576q30A = (iE >= length2 || iE == -1) ? null : ff.a(true, uriArr[c4081h30.r.l()]);
                if (c6576q30A != null) {
                    P70 p70 = c6576q30A.r;
                    if (!p70.isEmpty() && c6576q30A.c) {
                        long j2 = c6576q30A.h - ff.n;
                        long j3 = j - j2;
                        int iD = AbstractC0277Dh1.d(p70, Long.valueOf(j3), true);
                        long j4 = ((C6003n30) p70.get(iD)).e;
                        return dx0.a(j3, j4, iD != p70.size() - 1 ? ((C6003n30) p70.get(iD + 1)).e : j4) + j2;
                    }
                }
            } else {
                i++;
            }
        }
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0053 A[SYNTHETIC] */
    @Override // defpackage.InterfaceC8291z30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean c(android.net.Uri r17, defpackage.C1204Pf r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            E30[] r2 = r0.u
            int r3 = r2.length
            r6 = 0
            r7 = 1
        L9:
            if (r6 >= r3) goto La4
            r8 = r2[r6]
            h30 r9 = r8.d
            android.net.Uri[] r10 = r9.e
            boolean r11 = defpackage.AbstractC0277Dh1.l(r10, r1)
            if (r11 != 0) goto L1d
            r8 = r18
            r4 = 1
            r5 = 1
            goto L9f
        L1d:
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r19 != 0) goto L3f
            jR r13 = r9.r
            ek0 r13 = defpackage.RY1.a(r13)
            eG r8 = r8.i
            r8.getClass()
            r8 = r18
            fk0 r13 = defpackage.C3547eG.c(r13, r8)
            if (r13 == 0) goto L41
            int r14 = r13.a
            r15 = 2
            if (r14 != r15) goto L41
            long r13 = r13.b
            goto L42
        L3f:
            r8 = r18
        L41:
            r13 = r11
        L42:
            r15 = 0
        L43:
            int r5 = r10.length
            r4 = -1
            if (r15 >= r5) goto L53
            r5 = r10[r15]
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L50
            goto L54
        L50:
            int r15 = r15 + 1
            goto L43
        L53:
            r15 = r4
        L54:
            if (r15 != r4) goto L59
        L56:
            r4 = 1
            r5 = 1
            goto L96
        L59:
            jR r5 = r9.r
            int r5 = r5.t(r15)
            if (r5 != r4) goto L62
            goto L56
        L62:
            boolean r4 = r9.t
            android.net.Uri r10 = r9.p
            boolean r10 = r1.equals(r10)
            r4 = r4 | r10
            r9.t = r4
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L94
            jR r4 = r9.r
            boolean r4 = r4.o(r5, r13)
            if (r4 == 0) goto L91
            FF r4 = r9.g
            java.util.HashMap r4 = r4.d
            java.lang.Object r4 = r4.get(r1)
            EF r4 = (defpackage.EF) r4
            if (r4 == 0) goto L8c
            boolean r4 = defpackage.EF.a(r4, r13)
            r5 = 1
            r4 = r4 ^ r5
            goto L8e
        L8c:
            r5 = 1
            r4 = 0
        L8e:
            if (r4 == 0) goto L92
            goto L95
        L91:
            r5 = 1
        L92:
            r4 = 0
            goto L96
        L94:
            r5 = 1
        L95:
            r4 = r5
        L96:
            if (r4 == 0) goto L9e
            int r4 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r4 == 0) goto L9e
            r4 = r5
            goto L9f
        L9e:
            r4 = 0
        L9f:
            r7 = r7 & r4
            int r6 = r6 + 1
            goto L9
        La4:
            yp0 r1 = r0.r
            r1.m(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5430k30.c(android.net.Uri, Pf, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x028d  */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v32 */
    @Override // defpackage.InterfaceC8435zp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long d(defpackage.InterfaceC5311jR[] r37, boolean[] r38, defpackage.InterfaceC3403dV0[] r39, boolean[] r40, long r41) {
        /*
            Method dump skipped, instructions count: 889
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5430k30.d(jR[], boolean[], dV0[], boolean[], long):long");
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long e() {
        return this.x.e();
    }

    public final E30 f(String str, int i, Uri[] uriArr, C6666qX[] c6666qXArr, C6666qX c6666qX, List list, Map map, long j) {
        C4081h30 c4081h30 = new C4081h30(this.a, this.b, uriArr, c6666qXArr, this.c, this.d, this.l, list, this.p, this.e);
        VY vy = this.i;
        return new E30(str, i, this.q, c4081h30, map, this.j, j, c6666qX, this.f, this.g, this.h, vy, this.o);
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void g() throws IOException {
        for (E30 e30 : this.u) {
            e30.D();
            if (e30.T && !e30.D) {
                throw C5643lA0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long h(long j) {
        E30[] e30Arr = this.v;
        if (e30Arr.length > 0) {
            boolean zG = e30Arr[0].G(j, false);
            int i = 1;
            while (true) {
                E30[] e30Arr2 = this.v;
                if (i >= e30Arr2.length) {
                    break;
                }
                e30Arr2[i].G(j, zG);
                i++;
            }
            if (zG) {
                ((SparseArray) this.l.b).clear();
            }
        }
        return j;
    }

    @Override // defpackage.InterfaceC8435zp0
    public final void i(long j) {
        for (E30 e30 : this.v) {
            if (e30.C && !e30.B()) {
                int length = e30.v.length;
                for (int i = 0; i < length; i++) {
                    e30.v[i].i(j, e30.N[i]);
                }
            }
        }
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean l() {
        return this.x.l();
    }

    @Override // defpackage.InterfaceC8435zp0
    public final long n() {
        return -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0241  */
    @Override // defpackage.InterfaceC8435zp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(defpackage.InterfaceC8245yp0 r27, long r28) {
        /*
            Method dump skipped, instructions count: 1036
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5430k30.o(yp0, long):void");
    }

    @Override // defpackage.InterfaceC8435zp0
    public final C1350Rb1 q() {
        C1350Rb1 c1350Rb1 = this.t;
        c1350Rb1.getClass();
        return c1350Rb1;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final boolean r(C7660vk0 c7660vk0) {
        if (this.t != null) {
            return this.x.r(c7660vk0);
        }
        for (E30 e30 : this.u) {
            if (!e30.D) {
                C7469uk0 c7469uk0 = new C7469uk0();
                c7469uk0.a = e30.P;
                e30.r(new C7660vk0(c7469uk0));
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC3984gY0
    public final long s() {
        return this.x.s();
    }

    @Override // defpackage.InterfaceC3984gY0
    public final void t(long j) {
        this.x.t(j);
    }
}
