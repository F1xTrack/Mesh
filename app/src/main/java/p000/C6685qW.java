package p000;

import java.util.ArrayList;

/* renamed from: qW */
/* loaded from: classes.dex */
public final class C6685qW extends X20 {

    /* renamed from: A0 */
    public float f40914A0;

    /* renamed from: B0 */
    public float f40915B0;

    /* renamed from: C0 */
    public int f40916C0;

    /* renamed from: D0 */
    public int f40917D0;

    /* renamed from: E0 */
    public int f40918E0;

    /* renamed from: F0 */
    public int f40919F0;

    /* renamed from: G0 */
    public int f40920G0;

    /* renamed from: H0 */
    public int f40921H0;

    /* renamed from: I0 */
    public int f40922I0;

    /* renamed from: J0 */
    public ArrayList f40923J0;

    /* renamed from: K0 */
    public C3960dy[] f40924K0;

    /* renamed from: L0 */
    public C3960dy[] f40925L0;

    /* renamed from: M0 */
    public int[] f40926M0;

    /* renamed from: N0 */
    public C3960dy[] f40927N0;

    /* renamed from: O0 */
    public int f40928O0;

    /* renamed from: f0 */
    public int f40929f0;

    /* renamed from: g0 */
    public int f40930g0;

    /* renamed from: h0 */
    public int f40931h0;

    /* renamed from: i0 */
    public int f40932i0;

    /* renamed from: j0 */
    public int f40933j0;

    /* renamed from: k0 */
    public int f40934k0;

    /* renamed from: l0 */
    public boolean f40935l0;

    /* renamed from: m0 */
    public int f40936m0;

    /* renamed from: n0 */
    public int f40937n0;

    /* renamed from: o0 */
    public C1050Qg f40938o0;

    /* renamed from: p0 */
    public C1004Px f40939p0;

    /* renamed from: q0 */
    public int f40940q0;

    /* renamed from: r0 */
    public int f40941r0;

    /* renamed from: s0 */
    public int f40942s0;

    /* renamed from: t0 */
    public int f40943t0;

    /* renamed from: u0 */
    public int f40944u0;

    /* renamed from: v0 */
    public int f40945v0;

    /* renamed from: w0 */
    public float f40946w0;

    /* renamed from: x0 */
    public float f40947x0;

    /* renamed from: y0 */
    public float f40948y0;

    /* renamed from: z0 */
    public float f40949z0;

    @Override // p000.X20
    /* renamed from: B */
    public final void mo8924B() {
        for (int i = 0; i < this.f13525e0; i++) {
            C3960dy c3960dy = this.f13524d0[i];
        }
    }

    /* renamed from: C */
    public final int m24016C(C3960dy c3960dy, int i) {
        if (c3960dy == null) {
            return 0;
        }
        int[] iArr = c3960dy.f26433c0;
        if (iArr[1] == 3) {
            int i2 = c3960dy.f26441k;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c3960dy.f26448r * i);
                if (i3 != c3960dy.m17786i()) {
                    m24018E(iArr[0], c3960dy.m17789l(), 1, i3, c3960dy);
                }
                return i3;
            }
            if (i2 == 1) {
                return c3960dy.m17786i();
            }
            if (i2 == 3) {
                return (int) ((c3960dy.m17789l() * c3960dy.f26413L) + 0.5f);
            }
        }
        return c3960dy.m17786i();
    }

    /* renamed from: D */
    public final int m24017D(C3960dy c3960dy, int i) {
        if (c3960dy == null) {
            return 0;
        }
        int[] iArr = c3960dy.f26433c0;
        if (iArr[0] == 3) {
            int i2 = c3960dy.f26440j;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c3960dy.f26445o * i);
                if (i3 != c3960dy.m17789l()) {
                    m24018E(1, i3, iArr[1], c3960dy.m17786i(), c3960dy);
                }
                return i3;
            }
            if (i2 == 1) {
                return c3960dy.m17789l();
            }
            if (i2 == 3) {
                return (int) ((c3960dy.m17786i() * c3960dy.f26413L) + 0.5f);
            }
        }
        return c3960dy.m17789l();
    }

    /* renamed from: E */
    public final void m24018E(int i, int i2, int i3, int i4, C3960dy c3960dy) {
        C1004Px c1004Px;
        C3960dy c3960dy2;
        while (true) {
            c1004Px = this.f40939p0;
            if (c1004Px != null || (c3960dy2 = this.f26410I) == null) {
                break;
            } else {
                this.f40939p0 = ((C4023ey) c3960dy2).f26971g0;
            }
        }
        C1050Qg c1050Qg = this.f40938o0;
        c1050Qg.f9715a = i;
        c1050Qg.f9716b = i3;
        c1050Qg.f9717c = i2;
        c1050Qg.f9718d = i4;
        c1004Px.m6490a(c3960dy, c1050Qg);
        c3960dy.m17802y(c1050Qg.f9719e);
        c3960dy.m17799v(c1050Qg.f9720f);
        c3960dy.f26453w = c1050Qg.f9722h;
        int i5 = c1050Qg.f9721g;
        c3960dy.f26417P = i5;
        c3960dy.f26453w = i5 > 0;
    }

    @Override // p000.C3960dy
    /* renamed from: a */
    public final void mo4383a(C9016cj0 c9016cj0) {
        C3960dy c3960dy;
        super.mo4383a(c9016cj0);
        C3960dy c3960dy2 = this.f26410I;
        boolean z = c3960dy2 != null ? ((C4023ey) c3960dy2).f26972h0 : false;
        int i = this.f40920G0;
        ArrayList arrayList = this.f40923J0;
        if (i != 0) {
            if (i == 1) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    ((C6557oW) arrayList.get(i2)).m23496b(i2, z, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2 && this.f40926M0 != null && this.f40925L0 != null && this.f40924K0 != null) {
                for (int i3 = 0; i3 < this.f40928O0; i3++) {
                    this.f40927N0[i3].m17797t();
                }
                int[] iArr = this.f40926M0;
                int i4 = iArr[0];
                int i5 = iArr[1];
                C3960dy c3960dy3 = null;
                for (int i6 = 0; i6 < i4; i6++) {
                    C3960dy c3960dy4 = this.f40925L0[z ? (i4 - i6) - 1 : i6];
                    if (c3960dy4 != null && c3960dy4.f26423V != 8) {
                        C0627Jx c0627Jx = c3960dy4.f26454x;
                        if (i6 == 0) {
                            c3960dy4.m17782e(c0627Jx, this.f26454x, this.f40933j0);
                            c3960dy4.f26425X = this.f40940q0;
                            c3960dy4.f26420S = this.f40946w0;
                        }
                        if (i6 == i4 - 1) {
                            c3960dy4.m17782e(c3960dy4.f26456z, this.f26456z, this.f40934k0);
                        }
                        if (i6 > 0) {
                            c3960dy4.m17782e(c0627Jx, c3960dy3.f26456z, this.f40916C0);
                            c3960dy3.m17782e(c3960dy3.f26456z, c0627Jx, 0);
                        }
                        c3960dy3 = c3960dy4;
                    }
                }
                for (int i7 = 0; i7 < i5; i7++) {
                    C3960dy c3960dy5 = this.f40924K0[i7];
                    if (c3960dy5 != null && c3960dy5.f26423V != 8) {
                        C0627Jx c0627Jx2 = c3960dy5.f26455y;
                        if (i7 == 0) {
                            c3960dy5.m17782e(c0627Jx2, this.f26455y, this.f40929f0);
                            c3960dy5.f26426Y = this.f40941r0;
                            c3960dy5.f26421T = this.f40947x0;
                        }
                        if (i7 == i5 - 1) {
                            c3960dy5.m17782e(c3960dy5.f26402A, this.f26402A, this.f40930g0);
                        }
                        if (i7 > 0) {
                            c3960dy5.m17782e(c0627Jx2, c3960dy3.f26402A, this.f40917D0);
                            c3960dy3.m17782e(c3960dy3.f26402A, c0627Jx2, 0);
                        }
                        c3960dy3 = c3960dy5;
                    }
                }
                for (int i8 = 0; i8 < i4; i8++) {
                    for (int i9 = 0; i9 < i5; i9++) {
                        int i10 = (i9 * i4) + i8;
                        if (this.f40922I0 == 1) {
                            i10 = (i8 * i5) + i9;
                        }
                        C3960dy[] c3960dyArr = this.f40927N0;
                        if (i10 < c3960dyArr.length && (c3960dy = c3960dyArr[i10]) != null && c3960dy.f26423V != 8) {
                            C3960dy c3960dy6 = this.f40925L0[i8];
                            C3960dy c3960dy7 = this.f40924K0[i9];
                            if (c3960dy != c3960dy6) {
                                c3960dy.m17782e(c3960dy.f26454x, c3960dy6.f26454x, 0);
                                c3960dy.m17782e(c3960dy.f26456z, c3960dy6.f26456z, 0);
                            }
                            if (c3960dy != c3960dy7) {
                                c3960dy.m17782e(c3960dy.f26455y, c3960dy7.f26455y, 0);
                                c3960dy.m17782e(c3960dy.f26402A, c3960dy7.f26402A, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((C6557oW) arrayList.get(0)).m23496b(0, z, true);
        }
        this.f40935l0 = false;
    }
}
