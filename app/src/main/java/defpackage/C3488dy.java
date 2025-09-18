package defpackage;

import android.view.View;
import java.util.ArrayList;

/* renamed from: dy */
/* loaded from: classes.dex */
public class C3488dy {
    public final C0791Jx A;
    public final C0791Jx B;
    public final C0791Jx C;
    public final C0791Jx D;
    public final C0791Jx E;
    public final C0791Jx[] F;
    public final ArrayList G;
    public final boolean[] H;
    public C3488dy I;
    public int J;
    public int K;
    public float L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public float S;
    public float T;
    public View U;
    public int V;
    public String W;
    public int X;
    public int Y;
    public final float[] Z;
    public boolean a = false;
    public final C3488dy[] a0;
    public C2402br b;
    public final C3488dy[] b0;
    public C2402br c;
    public final int[] c0;
    public final M30 d;
    public final C0514Gi1 e;
    public final boolean[] f;
    public final int[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public final int[] l;
    public int m;
    public int n;
    public float o;
    public int p;
    public int q;
    public float r;
    public int s;
    public float t;
    public final int[] u;
    public float v;
    public boolean w;
    public final C0791Jx x;
    public final C0791Jx y;
    public final C0791Jx z;

    public C3488dy() {
        M30 m30 = new M30(this);
        m30.h.e = 4;
        m30.i.e = 5;
        m30.f = 0;
        this.d = m30;
        C0514Gi1 c0514Gi1 = new C0514Gi1(this);
        XH xh = new XH(c0514Gi1);
        c0514Gi1.k = xh;
        c0514Gi1.l = null;
        c0514Gi1.h.e = 6;
        c0514Gi1.i.e = 7;
        xh.e = 8;
        c0514Gi1.f = 1;
        this.e = c0514Gi1;
        this.f = new boolean[]{true, true};
        this.g = new int[]{0, 0, 0, 0};
        this.h = -1;
        this.i = -1;
        this.j = 0;
        this.k = 0;
        this.l = new int[2];
        this.m = 0;
        this.n = 0;
        this.o = 1.0f;
        this.p = 0;
        this.q = 0;
        this.r = 1.0f;
        this.s = -1;
        this.t = 1.0f;
        this.u = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.v = 0.0f;
        this.w = false;
        C0791Jx c0791Jx = new C0791Jx(this, 2);
        this.x = c0791Jx;
        C0791Jx c0791Jx2 = new C0791Jx(this, 3);
        this.y = c0791Jx2;
        C0791Jx c0791Jx3 = new C0791Jx(this, 4);
        this.z = c0791Jx3;
        C0791Jx c0791Jx4 = new C0791Jx(this, 5);
        this.A = c0791Jx4;
        C0791Jx c0791Jx5 = new C0791Jx(this, 6);
        this.B = c0791Jx5;
        C0791Jx c0791Jx6 = new C0791Jx(this, 8);
        this.C = c0791Jx6;
        C0791Jx c0791Jx7 = new C0791Jx(this, 9);
        this.D = c0791Jx7;
        C0791Jx c0791Jx8 = new C0791Jx(this, 7);
        this.E = c0791Jx8;
        this.F = new C0791Jx[]{c0791Jx, c0791Jx3, c0791Jx2, c0791Jx4, c0791Jx5, c0791Jx8};
        ArrayList arrayList = new ArrayList();
        this.G = arrayList;
        this.H = new boolean[2];
        this.c0 = new int[]{1, 1};
        this.I = null;
        this.J = 0;
        this.K = 0;
        this.L = 0.0f;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.S = 0.5f;
        this.T = 0.5f;
        this.V = 0;
        this.W = null;
        this.X = 0;
        this.Y = 0;
        this.Z = new float[]{-1.0f, -1.0f};
        this.a0 = new C3488dy[]{null, null};
        this.b0 = new C3488dy[]{null, null};
        arrayList.add(c0791Jx);
        arrayList.add(c0791Jx2);
        arrayList.add(c0791Jx3);
        arrayList.add(c0791Jx4);
        arrayList.add(c0791Jx6);
        arrayList.add(c0791Jx7);
        arrayList.add(c0791Jx8);
        arrayList.add(c0791Jx5);
    }

    public void A(C2569cj0 c2569cj0) {
        int i;
        int i2;
        C0791Jx c0791Jx = this.x;
        c2569cj0.getClass();
        int iM = C2569cj0.m(c0791Jx);
        int iM2 = C2569cj0.m(this.y);
        int iM3 = C2569cj0.m(this.z);
        int iM4 = C2569cj0.m(this.A);
        M30 m30 = this.d;
        XH xh = m30.h;
        if (xh.j) {
            XH xh2 = m30.i;
            if (xh2.j) {
                iM = xh.g;
                iM3 = xh2.g;
            }
        }
        C0514Gi1 c0514Gi1 = this.e;
        XH xh3 = c0514Gi1.h;
        if (xh3.j) {
            XH xh4 = c0514Gi1.i;
            if (xh4.j) {
                iM2 = xh3.g;
                iM4 = xh4.g;
            }
        }
        int i3 = iM4 - iM2;
        if (iM3 - iM < 0 || i3 < 0 || iM == Integer.MIN_VALUE || iM == Integer.MAX_VALUE || iM2 == Integer.MIN_VALUE || iM2 == Integer.MAX_VALUE || iM3 == Integer.MIN_VALUE || iM3 == Integer.MAX_VALUE || iM4 == Integer.MIN_VALUE || iM4 == Integer.MAX_VALUE) {
            iM = 0;
            iM2 = 0;
            iM3 = 0;
            iM4 = 0;
        }
        int i4 = iM3 - iM;
        int i5 = iM4 - iM2;
        this.N = iM;
        this.O = iM2;
        if (this.V == 8) {
            this.J = 0;
            this.K = 0;
            return;
        }
        int[] iArr = this.c0;
        if (iArr[0] == 1 && i4 < (i2 = this.J)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.K)) {
            i5 = i;
        }
        this.J = i4;
        this.K = i5;
        int i6 = this.R;
        if (i5 < i6) {
            this.K = i6;
        }
        int i7 = this.Q;
        if (i4 < i7) {
            this.J = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:387:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:619:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(defpackage.C2569cj0 r58) {
        /*
            Method dump skipped, instructions count: 1641
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3488dy.a(cj0):void");
    }

    public boolean b() {
        return this.V != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:382:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x030a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:568:0x0425  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.C2569cj0 r32, boolean r33, boolean r34, boolean r35, boolean r36, defpackage.P21 r37, defpackage.P21 r38, int r39, boolean r40, defpackage.C0791Jx r41, defpackage.C0791Jx r42, int r43, int r44, int r45, int r46, float r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3488dy.c(cj0, boolean, boolean, boolean, boolean, P21, P21, int, boolean, Jx, Jx, int, int, int, int, float, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public final void d(int i, C3488dy c3488dy, int i2, int i3) {
        boolean z;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    d(2, c3488dy, i2, 0);
                    d(4, c3488dy, i2, 0);
                    g(7).a(c3488dy.g(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        d(3, c3488dy, i2, 0);
                        d(5, c3488dy, i2, 0);
                        g(7).a(c3488dy.g(i2), 0);
                        return;
                    }
                    return;
                }
            }
            C0791Jx c0791JxG = g(2);
            C0791Jx c0791JxG2 = g(4);
            C0791Jx c0791JxG3 = g(3);
            C0791Jx c0791JxG4 = g(5);
            boolean z2 = true;
            if ((c0791JxG == null || !c0791JxG.f()) && (c0791JxG2 == null || !c0791JxG2.f())) {
                d(2, c3488dy, 2, 0);
                d(4, c3488dy, 4, 0);
                z = true;
            } else {
                z = false;
            }
            if ((c0791JxG3 == null || !c0791JxG3.f()) && (c0791JxG4 == null || !c0791JxG4.f())) {
                d(3, c3488dy, 3, 0);
                d(5, c3488dy, 5, 0);
            } else {
                z2 = false;
            }
            if (z && z2) {
                g(7).a(c3488dy.g(7), 0);
                return;
            } else if (z) {
                g(8).a(c3488dy.g(8), 0);
                return;
            } else {
                if (z2) {
                    g(9).a(c3488dy.g(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            C0791Jx c0791JxG5 = g(2);
            C0791Jx c0791JxG6 = c3488dy.g(i2);
            C0791Jx c0791JxG7 = g(4);
            c0791JxG5.a(c0791JxG6, 0);
            c0791JxG7.a(c0791JxG6, 0);
            g(8).a(c0791JxG6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            C0791Jx c0791JxG8 = c3488dy.g(i2);
            g(3).a(c0791JxG8, 0);
            g(5).a(c0791JxG8, 0);
            g(9).a(c0791JxG8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            g(2).a(c3488dy.g(2), 0);
            g(4).a(c3488dy.g(4), 0);
            g(8).a(c3488dy.g(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            g(3).a(c3488dy.g(3), 0);
            g(5).a(c3488dy.g(5), 0);
            g(9).a(c3488dy.g(i2), 0);
            return;
        }
        C0791Jx c0791JxG9 = g(i);
        C0791Jx c0791JxG10 = c3488dy.g(i2);
        if (c0791JxG9.g(c0791JxG10)) {
            if (i == 6) {
                C0791Jx c0791JxG11 = g(3);
                C0791Jx c0791JxG12 = g(5);
                if (c0791JxG11 != null) {
                    c0791JxG11.h();
                }
                if (c0791JxG12 != null) {
                    c0791JxG12.h();
                }
                i3 = 0;
            } else if (i == 3 || i == 5) {
                C0791Jx c0791JxG13 = g(6);
                if (c0791JxG13 != null) {
                    c0791JxG13.h();
                }
                C0791Jx c0791JxG14 = g(7);
                if (c0791JxG14.d != c0791JxG10) {
                    c0791JxG14.h();
                }
                C0791Jx c0791JxD = g(i).d();
                C0791Jx c0791JxG15 = g(9);
                if (c0791JxG15.f()) {
                    c0791JxD.h();
                    c0791JxG15.h();
                }
            } else if (i == 2 || i == 4) {
                C0791Jx c0791JxG16 = g(7);
                if (c0791JxG16.d != c0791JxG10) {
                    c0791JxG16.h();
                }
                C0791Jx c0791JxD2 = g(i).d();
                C0791Jx c0791JxG17 = g(8);
                if (c0791JxG17.f()) {
                    c0791JxD2.h();
                    c0791JxG17.h();
                }
            }
            c0791JxG9.a(c0791JxG10, i3);
        }
    }

    public final void e(C0791Jx c0791Jx, C0791Jx c0791Jx2, int i) {
        if (c0791Jx.b == this) {
            d(c0791Jx.c, c0791Jx2.b, c0791Jx2.c, i);
        }
    }

    public final void f(C2569cj0 c2569cj0) {
        c2569cj0.j(this.x);
        c2569cj0.j(this.y);
        c2569cj0.j(this.z);
        c2569cj0.j(this.A);
        if (this.P > 0) {
            c2569cj0.j(this.B);
        }
    }

    public C0791Jx g(int i) {
        switch (AbstractC8235ym.x(i)) {
            case 0:
                return null;
            case 1:
                return this.x;
            case 2:
                return this.y;
            case 3:
                return this.z;
            case 4:
                return this.A;
            case 5:
                return this.B;
            case 6:
                return this.E;
            case 7:
                return this.C;
            case 8:
                return this.D;
            default:
                throw new AssertionError(AbstractC1705Vq.s(i));
        }
    }

    public final int h(int i) {
        int[] iArr = this.c0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    public final int i() {
        if (this.V == 8) {
            return 0;
        }
        return this.K;
    }

    public final C3488dy j(int i) {
        C0791Jx c0791Jx;
        C0791Jx c0791Jx2;
        if (i != 0) {
            if (i == 1 && (c0791Jx2 = (c0791Jx = this.A).d) != null && c0791Jx2.d == c0791Jx) {
                return c0791Jx2.b;
            }
            return null;
        }
        C0791Jx c0791Jx3 = this.z;
        C0791Jx c0791Jx4 = c0791Jx3.d;
        if (c0791Jx4 == null || c0791Jx4.d != c0791Jx3) {
            return null;
        }
        return c0791Jx4.b;
    }

    public final C3488dy k(int i) {
        C0791Jx c0791Jx;
        C0791Jx c0791Jx2;
        if (i != 0) {
            if (i == 1 && (c0791Jx2 = (c0791Jx = this.y).d) != null && c0791Jx2.d == c0791Jx) {
                return c0791Jx2.b;
            }
            return null;
        }
        C0791Jx c0791Jx3 = this.x;
        C0791Jx c0791Jx4 = c0791Jx3.d;
        if (c0791Jx4 == null || c0791Jx4.d != c0791Jx3) {
            return null;
        }
        return c0791Jx4.b;
    }

    public final int l() {
        if (this.V == 8) {
            return 0;
        }
        return this.J;
    }

    public final int m() {
        C3488dy c3488dy = this.I;
        return (c3488dy == null || !(c3488dy instanceof C3679ey)) ? this.N : ((C3679ey) c3488dy).j0 + this.N;
    }

    public final int n() {
        C3488dy c3488dy = this.I;
        return (c3488dy == null || !(c3488dy instanceof C3679ey)) ? this.O : ((C3679ey) c3488dy).k0 + this.O;
    }

    public final void o(int i, int i2, int i3, int i4, C3488dy c3488dy) {
        g(i).b(c3488dy.g(i2), i3, i4, true);
    }

    public final boolean p(int i) {
        C0791Jx c0791Jx;
        C0791Jx c0791Jx2;
        int i2 = i * 2;
        C0791Jx[] c0791JxArr = this.F;
        C0791Jx c0791Jx3 = c0791JxArr[i2];
        C0791Jx c0791Jx4 = c0791Jx3.d;
        return (c0791Jx4 == null || c0791Jx4.d == c0791Jx3 || (c0791Jx2 = (c0791Jx = c0791JxArr[i2 + 1]).d) == null || c0791Jx2.d != c0791Jx) ? false : true;
    }

    public final boolean q() {
        C0791Jx c0791Jx = this.x;
        C0791Jx c0791Jx2 = c0791Jx.d;
        if (c0791Jx2 != null && c0791Jx2.d == c0791Jx) {
            return true;
        }
        C0791Jx c0791Jx3 = this.z;
        C0791Jx c0791Jx4 = c0791Jx3.d;
        return c0791Jx4 != null && c0791Jx4.d == c0791Jx3;
    }

    public final boolean r() {
        C0791Jx c0791Jx = this.y;
        C0791Jx c0791Jx2 = c0791Jx.d;
        if (c0791Jx2 != null && c0791Jx2.d == c0791Jx) {
            return true;
        }
        C0791Jx c0791Jx3 = this.A;
        C0791Jx c0791Jx4 = c0791Jx3.d;
        return c0791Jx4 != null && c0791Jx4.d == c0791Jx3;
    }

    public void s() {
        this.x.h();
        this.y.h();
        this.z.h();
        this.A.h();
        this.B.h();
        this.C.h();
        this.D.h();
        this.E.h();
        this.I = null;
        this.v = 0.0f;
        this.J = 0;
        this.K = 0;
        this.L = 0.0f;
        this.M = -1;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = 0;
        this.R = 0;
        this.S = 0.5f;
        this.T = 0.5f;
        int[] iArr = this.c0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.U = null;
        this.V = 0;
        this.X = 0;
        this.Y = 0;
        float[] fArr = this.Z;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.h = -1;
        this.i = -1;
        int[] iArr2 = this.u;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.j = 0;
        this.k = 0;
        this.o = 1.0f;
        this.r = 1.0f;
        this.n = Integer.MAX_VALUE;
        this.q = Integer.MAX_VALUE;
        this.m = 0;
        this.p = 0;
        this.s = -1;
        this.t = 1.0f;
        boolean[] zArr = this.f;
        zArr[0] = true;
        zArr[1] = true;
        boolean[] zArr2 = this.H;
        zArr2[0] = false;
        zArr2[1] = false;
    }

    public final void t() {
        C3488dy c3488dy = this.I;
        if (c3488dy != null && (c3488dy instanceof C3679ey)) {
            ((C3679ey) c3488dy).getClass();
        }
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0791Jx) arrayList.get(i)).h();
        }
    }

    public String toString() {
        StringBuilder sbO = AbstractC8235ym.o("");
        sbO.append(this.W != null ? AbstractC1705Vq.l(new StringBuilder("id: "), this.W, " ") : "");
        sbO.append("(");
        sbO.append(this.N);
        sbO.append(", ");
        sbO.append(this.O);
        sbO.append(") - (");
        sbO.append(this.J);
        sbO.append(" x ");
        return AbstractC1705Vq.j(sbO, this.K, ")");
    }

    public void u(T71 t71) {
        this.x.i();
        this.y.i();
        this.z.i();
        this.A.i();
        this.B.i();
        this.E.i();
        this.C.i();
        this.D.i();
    }

    public final void v(int i) {
        this.K = i;
        int i2 = this.R;
        if (i < i2) {
            this.K = i2;
        }
    }

    public final void w(int i) {
        this.c0[0] = i;
    }

    public final void x(int i) {
        this.c0[1] = i;
    }

    public final void y(int i) {
        this.J = i;
        int i2 = this.Q;
        if (i < i2) {
            this.J = i2;
        }
    }

    public void z(boolean z, boolean z2) {
        int i;
        int i2;
        M30 m30 = this.d;
        boolean z3 = z & m30.g;
        C0514Gi1 c0514Gi1 = this.e;
        boolean z4 = z2 & c0514Gi1.g;
        int i3 = m30.h.g;
        int i4 = c0514Gi1.h.g;
        int i5 = m30.i.g;
        int i6 = c0514Gi1.i.g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z3) {
            this.N = i3;
        }
        if (z4) {
            this.O = i4;
        }
        if (this.V == 8) {
            this.J = 0;
            this.K = 0;
            return;
        }
        int[] iArr = this.c0;
        if (z3) {
            if (iArr[0] == 1 && i8 < (i2 = this.J)) {
                i8 = i2;
            }
            this.J = i8;
            int i10 = this.Q;
            if (i8 < i10) {
                this.J = i10;
            }
        }
        if (z4) {
            if (iArr[1] == 1 && i9 < (i = this.K)) {
                i9 = i;
            }
            this.K = i9;
            int i11 = this.R;
            if (i9 < i11) {
                this.K = i11;
            }
        }
    }
}
