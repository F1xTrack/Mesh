package defpackage;

import java.util.ArrayList;

/* renamed from: qW, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6663qW extends X20 {
    public float A0;
    public float B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public ArrayList J0;
    public C3488dy[] K0;
    public C3488dy[] L0;
    public int[] M0;
    public C3488dy[] N0;
    public int O0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public boolean l0;
    public int m0;
    public int n0;
    public C1285Qg o0;
    public C1258Px p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public float w0;
    public float x0;
    public float y0;
    public float z0;

    @Override // defpackage.X20
    public final void B() {
        for (int i = 0; i < this.e0; i++) {
            C3488dy c3488dy = this.d0[i];
        }
    }

    public final int C(C3488dy c3488dy, int i) {
        if (c3488dy == null) {
            return 0;
        }
        int[] iArr = c3488dy.c0;
        if (iArr[1] == 3) {
            int i2 = c3488dy.k;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c3488dy.r * i);
                if (i3 != c3488dy.i()) {
                    E(iArr[0], c3488dy.l(), 1, i3, c3488dy);
                }
                return i3;
            }
            if (i2 == 1) {
                return c3488dy.i();
            }
            if (i2 == 3) {
                return (int) ((c3488dy.l() * c3488dy.L) + 0.5f);
            }
        }
        return c3488dy.i();
    }

    public final int D(C3488dy c3488dy, int i) {
        if (c3488dy == null) {
            return 0;
        }
        int[] iArr = c3488dy.c0;
        if (iArr[0] == 3) {
            int i2 = c3488dy.j;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c3488dy.o * i);
                if (i3 != c3488dy.l()) {
                    E(1, i3, iArr[1], c3488dy.i(), c3488dy);
                }
                return i3;
            }
            if (i2 == 1) {
                return c3488dy.l();
            }
            if (i2 == 3) {
                return (int) ((c3488dy.i() * c3488dy.L) + 0.5f);
            }
        }
        return c3488dy.l();
    }

    public final void E(int i, int i2, int i3, int i4, C3488dy c3488dy) {
        C1258Px c1258Px;
        C3488dy c3488dy2;
        while (true) {
            c1258Px = this.p0;
            if (c1258Px != null || (c3488dy2 = this.I) == null) {
                break;
            } else {
                this.p0 = ((C3679ey) c3488dy2).g0;
            }
        }
        C1285Qg c1285Qg = this.o0;
        c1285Qg.a = i;
        c1285Qg.b = i3;
        c1285Qg.c = i2;
        c1285Qg.d = i4;
        c1258Px.a(c3488dy, c1285Qg);
        c3488dy.y(c1285Qg.e);
        c3488dy.v(c1285Qg.f);
        c3488dy.w = c1285Qg.h;
        int i5 = c1285Qg.g;
        c3488dy.P = i5;
        c3488dy.w = i5 > 0;
    }

    @Override // defpackage.C3488dy
    public final void a(C2569cj0 c2569cj0) {
        C3488dy c3488dy;
        super.a(c2569cj0);
        C3488dy c3488dy2 = this.I;
        boolean z = c3488dy2 != null ? ((C3679ey) c3488dy2).h0 : false;
        int i = this.G0;
        ArrayList arrayList = this.J0;
        if (i != 0) {
            if (i == 1) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    ((C6281oW) arrayList.get(i2)).b(i2, z, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2 && this.M0 != null && this.L0 != null && this.K0 != null) {
                for (int i3 = 0; i3 < this.O0; i3++) {
                    this.N0[i3].t();
                }
                int[] iArr = this.M0;
                int i4 = iArr[0];
                int i5 = iArr[1];
                C3488dy c3488dy3 = null;
                for (int i6 = 0; i6 < i4; i6++) {
                    C3488dy c3488dy4 = this.L0[z ? (i4 - i6) - 1 : i6];
                    if (c3488dy4 != null && c3488dy4.V != 8) {
                        C0791Jx c0791Jx = c3488dy4.x;
                        if (i6 == 0) {
                            c3488dy4.e(c0791Jx, this.x, this.j0);
                            c3488dy4.X = this.q0;
                            c3488dy4.S = this.w0;
                        }
                        if (i6 == i4 - 1) {
                            c3488dy4.e(c3488dy4.z, this.z, this.k0);
                        }
                        if (i6 > 0) {
                            c3488dy4.e(c0791Jx, c3488dy3.z, this.C0);
                            c3488dy3.e(c3488dy3.z, c0791Jx, 0);
                        }
                        c3488dy3 = c3488dy4;
                    }
                }
                for (int i7 = 0; i7 < i5; i7++) {
                    C3488dy c3488dy5 = this.K0[i7];
                    if (c3488dy5 != null && c3488dy5.V != 8) {
                        C0791Jx c0791Jx2 = c3488dy5.y;
                        if (i7 == 0) {
                            c3488dy5.e(c0791Jx2, this.y, this.f0);
                            c3488dy5.Y = this.r0;
                            c3488dy5.T = this.x0;
                        }
                        if (i7 == i5 - 1) {
                            c3488dy5.e(c3488dy5.A, this.A, this.g0);
                        }
                        if (i7 > 0) {
                            c3488dy5.e(c0791Jx2, c3488dy3.A, this.D0);
                            c3488dy3.e(c3488dy3.A, c0791Jx2, 0);
                        }
                        c3488dy3 = c3488dy5;
                    }
                }
                for (int i8 = 0; i8 < i4; i8++) {
                    for (int i9 = 0; i9 < i5; i9++) {
                        int i10 = (i9 * i4) + i8;
                        if (this.I0 == 1) {
                            i10 = (i8 * i5) + i9;
                        }
                        C3488dy[] c3488dyArr = this.N0;
                        if (i10 < c3488dyArr.length && (c3488dy = c3488dyArr[i10]) != null && c3488dy.V != 8) {
                            C3488dy c3488dy6 = this.L0[i8];
                            C3488dy c3488dy7 = this.K0[i9];
                            if (c3488dy != c3488dy6) {
                                c3488dy.e(c3488dy.x, c3488dy6.x, 0);
                                c3488dy.e(c3488dy.z, c3488dy6.z, 0);
                            }
                            if (c3488dy != c3488dy7) {
                                c3488dy.e(c3488dy.y, c3488dy7.y, 0);
                                c3488dy.e(c3488dy.A, c3488dy7.A, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C6281oW) arrayList.get(0)).b(0, z, true);
        }
        this.l0 = false;
    }
}
