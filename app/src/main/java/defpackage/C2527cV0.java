package defpackage;

import android.util.SparseArray;
import java.io.EOFException;

/* renamed from: cV0 */
/* loaded from: classes.dex */
public class C2527cV0 implements InterfaceC1584Ub1 {
    public C6666qX A;
    public C6666qX B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;
    public final ZU0 a;
    public final RL d;
    public final OL e;
    public Object f;
    public C6666qX g;
    public LL h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public boolean z;
    public final C0374Eo b = new C0374Eo();
    public int i = 1000;
    public long[] j = new long[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public C1506Tb1[] o = new C1506Tb1[1000];
    public final VY c = new VY(new C0681Im0(20));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;
    public boolean D = true;

    public C2527cV0(C5272jE c5272jE, RL rl, OL ol) {
        this.d = rl;
        this.e = ol;
        this.a = new ZU0(c5272jE);
    }

    public final synchronized long A() {
        try {
        } catch (Throwable th) {
            throw th;
        }
        return v() ? this.j[s(this.s)] : this.C;
    }

    public final int B(N8 n8, ZD zd, int i, boolean z) {
        int i2;
        boolean z2 = (i & 2) != 0;
        C0374Eo c0374Eo = this.b;
        synchronized (this) {
            try {
                zd.f = false;
                i2 = -3;
                if (v()) {
                    C6666qX c6666qX = ((C2146aV0) this.c.B(r())).a;
                    if (!z2 && c6666qX == this.g) {
                        int iS = s(this.s);
                        if (x(iS)) {
                            zd.b = this.m[iS];
                            if (this.s == this.p - 1 && (z || this.w)) {
                                zd.a(536870912);
                            }
                            zd.g = this.n[iS];
                            c0374Eo.a = this.l[iS];
                            c0374Eo.b = this.k[iS];
                            c0374Eo.c = this.o[iS];
                            i2 = -4;
                        } else {
                            zd.f = true;
                        }
                    }
                    z(c6666qX, n8);
                    i2 = -5;
                } else {
                    if (!z && !this.w) {
                        C6666qX c6666qX2 = this.B;
                        if (c6666qX2 == null || (!z2 && c6666qX2 == this.g)) {
                        }
                        z(c6666qX2, n8);
                        i2 = -5;
                    }
                    zd.b = 4;
                    zd.g = Long.MIN_VALUE;
                    i2 = -4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 == -4 && !zd.g(4)) {
            boolean z3 = (i & 1) != 0;
            if ((i & 4) == 0) {
                if (z3) {
                    ZU0 zu0 = this.a;
                    ZU0.f(zu0.e, zd, this.b, zu0.c);
                } else {
                    ZU0 zu02 = this.a;
                    zu02.e = ZU0.f(zu02.e, zd, this.b, zu02.c);
                }
            }
            if (!z3) {
                this.s++;
            }
        }
        return i2;
    }

    public final void C(boolean z) {
        VY vy;
        SparseArray sparseArray;
        ZU0 zu0 = this.a;
        zu0.a(zu0.d);
        H9 h9 = zu0.d;
        int i = 0;
        YN1.f(((N3) h9.c) == null);
        h9.a = 0L;
        h9.b = zu0.b;
        H9 h92 = zu0.d;
        zu0.e = h92;
        zu0.f = h92;
        zu0.g = 0L;
        zu0.a.c();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        while (true) {
            vy = this.c;
            sparseArray = (SparseArray) vy.c;
            if (i >= sparseArray.size()) {
                break;
            }
            ((C0681Im0) vy.d).b(sparseArray.valueAt(i));
            i++;
        }
        vy.b = -1;
        sparseArray.clear();
        if (z) {
            this.A = null;
            this.B = null;
            this.y = true;
            this.D = true;
        }
    }

    public final synchronized void D() {
        this.s = 0;
        ZU0 zu0 = this.a;
        zu0.e = zu0.d;
    }

    public final synchronized boolean E(int i) {
        D();
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean F(long j, boolean z) {
        int iM;
        try {
            D();
            int iS = s(this.s);
            if (v() && j >= this.n[iS] && (j <= this.v || z)) {
                if (this.D) {
                    int i = this.p - this.s;
                    iM = 0;
                    while (true) {
                        if (iM >= i) {
                            if (!z) {
                                i = -1;
                            }
                            iM = i;
                        } else if (this.n[iS] < j) {
                            iS++;
                            if (iS == this.i) {
                                iS = 0;
                            }
                            iM++;
                        }
                    }
                } else {
                    iM = m(j, iS, this.p - this.s, true);
                }
                if (iM == -1) {
                    return false;
                }
                this.t = j;
                this.s += iM;
                return true;
            }
            return false;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void G(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            defpackage.YN1.c(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2527cV0.G(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x004b  */
    @Override // defpackage.InterfaceC1584Ub1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r13, int r15, int r16, int r17, defpackage.C1506Tb1 r18) {
        /*
            Method dump skipped, instructions count: 182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2527cV0.a(long, int, int, int, Tb1):void");
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final void b(C4103hA0 c4103hA0, int i, int i2) {
        while (true) {
            ZU0 zu0 = this.a;
            if (i <= 0) {
                zu0.getClass();
                return;
            }
            int iC = zu0.c(i);
            H9 h9 = zu0.f;
            N3 n3 = (N3) h9.c;
            c4103hA0.e(n3.a, ((int) (zu0.g - h9.a)) + n3.b, iC);
            i -= iC;
            long j = zu0.g + iC;
            zu0.g = j;
            H9 h92 = zu0.f;
            if (j == h92.b) {
                zu0.f = (H9) h92.d;
            }
        }
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final int c(RC rc, int i, boolean z) throws EOFException {
        ZU0 zu0 = this.a;
        int iC = zu0.c(i);
        H9 h9 = zu0.f;
        N3 n3 = (N3) h9.c;
        int iR = rc.r(n3.a, ((int) (zu0.g - h9.a)) + n3.b, iC);
        if (iR == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = zu0.g + iR;
        zu0.g = j;
        H9 h92 = zu0.f;
        if (j != h92.b) {
            return iR;
        }
        zu0.f = (H9) h92.d;
        return iR;
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final /* synthetic */ void d(int i, C4103hA0 c4103hA0) {
        F91.n(this, c4103hA0, i);
    }

    @Override // defpackage.InterfaceC1584Ub1
    public final int e(RC rc, int i, boolean z) {
        return c(rc, i, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x005c A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:98:0x000b, B:102:0x0019, B:107:0x002a, B:109:0x0043, B:113:0x005e, B:175:0x0114, B:167:0x0101, B:170:0x0109, B:112:0x005c), top: B:184:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0113  */
    /* JADX WARN: Type inference failed for: r7v26, types: [bV0, java.lang.Object] */
    @Override // defpackage.InterfaceC1584Ub1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.C6666qX r7) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2527cV0.f(qX):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0082 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:56:0x0001, B:58:0x0007, B:62:0x001d, B:65:0x0024, B:69:0x002c, B:74:0x0067, B:97:0x00e3, B:99:0x00ec, B:76:0x0082, B:78:0x008b, B:80:0x0094, B:82:0x00a9, B:86:0x00b2, B:87:0x00b7, B:89:0x00bd, B:93:0x00cb, B:95:0x00d0, B:96:0x00e0, B:79:0x0092), top: B:104:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void g(long r9, int r11, long r12, int r14, defpackage.C1506Tb1 r15) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2527cV0.g(long, int, long, int, Tb1):void");
    }

    public final long h(int i) {
        this.u = Math.max(this.u, q(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        while (true) {
            VY vy = this.c;
            SparseArray sparseArray = (SparseArray) vy.c;
            if (i6 >= sparseArray.size() - 1) {
                break;
            }
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((C0681Im0) vy.d).b(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = vy.b;
            if (i8 > 0) {
                vy.b = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p != 0) {
            return this.k[this.r];
        }
        int i9 = this.r;
        if (i9 == 0) {
            i9 = this.i;
        }
        return this.k[i9 - 1] + this.l[r7];
    }

    public final void i(long j, boolean z) {
        long jH;
        int i;
        ZU0 zu0 = this.a;
        synchronized (this) {
            try {
                int i2 = this.p;
                jH = -1;
                if (i2 != 0) {
                    long[] jArr = this.n;
                    int i3 = this.r;
                    if (j >= jArr[i3]) {
                        if (z && (i = this.s) != i2) {
                            i2 = i + 1;
                        }
                        int iM = m(j, i3, i2, false);
                        if (iM != -1) {
                            jH = h(iM);
                        }
                    }
                }
            } finally {
            }
        }
        zu0.b(jH);
    }

    public final void j() {
        long jH;
        ZU0 zu0 = this.a;
        synchronized (this) {
            int i = this.p;
            jH = i == 0 ? -1L : h(i);
        }
        zu0.b(jH);
    }

    public final long k(int i) {
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z = false;
        YN1.c(i4 >= 0 && i4 <= i3 - this.s);
        int i5 = this.p - i4;
        this.p = i5;
        this.v = Math.max(this.u, q(i5));
        if (i4 == 0 && this.w) {
            z = true;
        }
        this.w = z;
        VY vy = this.c;
        SparseArray sparseArray = (SparseArray) vy.c;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((C0681Im0) vy.d).b(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        vy.b = sparseArray.size() > 0 ? Math.min(vy.b, sparseArray.size() - 1) : -1;
        int i6 = this.p;
        if (i6 == 0) {
            return 0L;
        }
        return this.k[s(i6 - 1)] + this.l[r9];
    }

    public final void l(int i) {
        long jK = k(i);
        ZU0 zu0 = this.a;
        YN1.c(jK <= zu0.g);
        zu0.g = jK;
        int i2 = zu0.b;
        if (jK != 0) {
            H9 h9 = zu0.d;
            if (jK != h9.a) {
                while (zu0.g > h9.b) {
                    h9 = (H9) h9.d;
                }
                H9 h92 = (H9) h9.d;
                h92.getClass();
                zu0.a(h92);
                H9 h93 = new H9(h9.b, i2);
                h9.d = h93;
                if (zu0.g == h9.b) {
                    h9 = h93;
                }
                zu0.f = h9;
                if (zu0.e == h92) {
                    zu0.e = h93;
                    return;
                }
                return;
            }
        }
        zu0.a(zu0.d);
        H9 h94 = new H9(zu0.g, i2);
        zu0.d = h94;
        zu0.e = h94;
        zu0.f = h94;
    }

    public final int m(long j, int i, int i2, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                i3 = i4;
                if (j2 == j) {
                    break;
                }
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public C6666qX n(C6666qX c6666qX) {
        if (this.F == 0 || c6666qX.r == Long.MAX_VALUE) {
            return c6666qX;
        }
        C6475pX c6475pXA = c6666qX.a();
        c6475pXA.q = c6666qX.r + this.F;
        return new C6666qX(c6475pXA);
    }

    public final synchronized long o() {
        return this.v;
    }

    public final synchronized long p() {
        return Math.max(this.u, q(this.s));
    }

    public final long q(int i) {
        long jMax = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int iS = s(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            jMax = Math.max(jMax, this.n[iS]);
            if ((this.m[iS] & 1) != 0) {
                break;
            }
            iS--;
            if (iS == -1) {
                iS = this.i - 1;
            }
        }
        return jMax;
    }

    public final int r() {
        return this.q + this.s;
    }

    public final int s(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        return i2 < i3 ? i2 : i2 - i3;
    }

    public final synchronized int t(long j, boolean z) {
        int iS = s(this.s);
        if (v() && j >= this.n[iS]) {
            if (j > this.v && z) {
                return this.p - this.s;
            }
            int iM = m(j, iS, this.p - this.s, true);
            if (iM == -1) {
                return 0;
            }
            return iM;
        }
        return 0;
    }

    public final synchronized C6666qX u() {
        return this.y ? null : this.B;
    }

    public final boolean v() {
        return this.s != this.p;
    }

    public final synchronized boolean w(boolean z) {
        C6666qX c6666qX;
        boolean z2 = true;
        if (v()) {
            if (((C2146aV0) this.c.B(r())).a != this.g) {
                return true;
            }
            return x(s(this.s));
        }
        if (!z && !this.w && ((c6666qX = this.B) == null || c6666qX == this.g)) {
            z2 = false;
        }
        return z2;
    }

    public final boolean x(int i) {
        LL ll = this.h;
        return ll == null || ll.getState() == 4 || ((this.m[i] & 1073741824) == 0 && this.h.b());
    }

    public final void y() {
        LL ll = this.h;
        if (ll == null || ll.getState() != 1) {
            return;
        }
        KL klC = this.h.c();
        klC.getClass();
        throw klC;
    }

    public final void z(C6666qX c6666qX, N8 n8) {
        C6666qX c6666qX2;
        C6666qX c6666qX3 = this.g;
        boolean z = c6666qX3 == null;
        JL jl = c6666qX3 == null ? null : c6666qX3.q;
        this.g = c6666qX;
        JL jl2 = c6666qX.q;
        RL rl = this.d;
        if (rl != null) {
            int iJ = rl.j(c6666qX);
            C6475pX c6475pXA = c6666qX.a();
            c6475pXA.I = iJ;
            c6666qX2 = new C6666qX(c6475pXA);
        } else {
            c6666qX2 = c6666qX;
        }
        n8.c = c6666qX2;
        n8.b = this.h;
        if (rl == null) {
            return;
        }
        if (z || !AbstractC0277Dh1.a(jl, jl2)) {
            LL ll = this.h;
            OL ol = this.e;
            LL llA = rl.a(ol, c6666qX);
            this.h = llA;
            n8.b = llA;
            if (ll != null) {
                ll.d(ol);
            }
        }
    }
}
