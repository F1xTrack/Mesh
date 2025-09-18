package defpackage;

/* loaded from: classes.dex */
public final class M30 extends AbstractC6716qn1 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:303:0x0267  */
    @Override // defpackage.SH
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.SH r24) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.M30.a(SH):void");
    }

    @Override // defpackage.AbstractC6716qn1
    public final void d() {
        C3488dy c3488dy;
        C3488dy c3488dy2;
        C3488dy c3488dy3;
        C3488dy c3488dy4;
        C3488dy c3488dy5 = this.b;
        boolean z = c3488dy5.a;
        MJ mj = this.e;
        if (z) {
            mj.d(c3488dy5.l());
        }
        boolean z2 = mj.j;
        XH xh = this.i;
        XH xh2 = this.h;
        if (!z2) {
            C3488dy c3488dy6 = this.b;
            int i = c3488dy6.c0[0];
            this.d = i;
            if (i != 3) {
                if (i == 4 && (((c3488dy4 = c3488dy6.I) != null && c3488dy4.c0[0] == 1) || c3488dy4.c0[0] == 4)) {
                    int iL = (c3488dy4.l() - this.b.x.c()) - this.b.z.c();
                    M30 m30 = c3488dy4.d;
                    AbstractC6716qn1.b(xh2, m30.h, this.b.x.c());
                    AbstractC6716qn1.b(xh, m30.i, -this.b.z.c());
                    mj.d(iL);
                    return;
                }
                if (i == 1) {
                    mj.d(c3488dy6.l());
                }
            }
        } else if (this.d == 4 && (((c3488dy2 = (c3488dy = this.b).I) != null && c3488dy2.c0[0] == 1) || c3488dy2.c0[0] == 4)) {
            AbstractC6716qn1.b(xh2, c3488dy2.d.h, c3488dy.x.c());
            AbstractC6716qn1.b(xh, c3488dy2.d.i, -this.b.z.c());
            return;
        }
        if (mj.j) {
            C3488dy c3488dy7 = this.b;
            if (c3488dy7.a) {
                C0791Jx[] c0791JxArr = c3488dy7.F;
                C0791Jx c0791Jx = c0791JxArr[0];
                C0791Jx c0791Jx2 = c0791Jx.d;
                if (c0791Jx2 != null && c0791JxArr[1].d != null) {
                    if (c3488dy7.q()) {
                        xh2.f = this.b.F[0].c();
                        xh.f = -this.b.F[1].c();
                        return;
                    }
                    XH xhH = AbstractC6716qn1.h(this.b.F[0]);
                    if (xhH != null) {
                        AbstractC6716qn1.b(xh2, xhH, this.b.F[0].c());
                    }
                    XH xhH2 = AbstractC6716qn1.h(this.b.F[1]);
                    if (xhH2 != null) {
                        AbstractC6716qn1.b(xh, xhH2, -this.b.F[1].c());
                    }
                    xh2.b = true;
                    xh.b = true;
                    return;
                }
                if (c0791Jx2 != null) {
                    XH xhH3 = AbstractC6716qn1.h(c0791Jx);
                    if (xhH3 != null) {
                        AbstractC6716qn1.b(xh2, xhH3, this.b.F[0].c());
                        AbstractC6716qn1.b(xh, xh2, mj.g);
                        return;
                    }
                    return;
                }
                C0791Jx c0791Jx3 = c0791JxArr[1];
                if (c0791Jx3.d != null) {
                    XH xhH4 = AbstractC6716qn1.h(c0791Jx3);
                    if (xhH4 != null) {
                        AbstractC6716qn1.b(xh, xhH4, -this.b.F[1].c());
                        AbstractC6716qn1.b(xh2, xh, -mj.g);
                        return;
                    }
                    return;
                }
                if ((c3488dy7 instanceof X20) || c3488dy7.I == null || c3488dy7.g(7).d != null) {
                    return;
                }
                C3488dy c3488dy8 = this.b;
                AbstractC6716qn1.b(xh2, c3488dy8.I.d.h, c3488dy8.m());
                AbstractC6716qn1.b(xh, xh2, mj.g);
                return;
            }
        }
        if (this.d == 3) {
            C3488dy c3488dy9 = this.b;
            int i2 = c3488dy9.j;
            if (i2 == 2) {
                C3488dy c3488dy10 = c3488dy9.I;
                if (c3488dy10 != null) {
                    MJ mj2 = c3488dy10.e.e;
                    mj.l.add(mj2);
                    mj2.k.add(mj);
                    mj.b = true;
                    mj.k.add(xh2);
                    mj.k.add(xh);
                }
            } else if (i2 == 3) {
                if (c3488dy9.k == 3) {
                    xh2.a = this;
                    xh.a = this;
                    C0514Gi1 c0514Gi1 = c3488dy9.e;
                    c0514Gi1.h.a = this;
                    c0514Gi1.i.a = this;
                    mj.a = this;
                    if (c3488dy9.r()) {
                        mj.l.add(this.b.e.e);
                        this.b.e.e.k.add(mj);
                        C0514Gi1 c0514Gi12 = this.b.e;
                        c0514Gi12.e.a = this;
                        mj.l.add(c0514Gi12.h);
                        mj.l.add(this.b.e.i);
                        this.b.e.h.k.add(mj);
                        this.b.e.i.k.add(mj);
                    } else if (this.b.q()) {
                        this.b.e.e.l.add(mj);
                        mj.k.add(this.b.e.e);
                    } else {
                        this.b.e.e.l.add(mj);
                    }
                } else {
                    MJ mj3 = c3488dy9.e.e;
                    mj.l.add(mj3);
                    mj3.k.add(mj);
                    this.b.e.h.k.add(mj);
                    this.b.e.i.k.add(mj);
                    mj.b = true;
                    mj.k.add(xh2);
                    mj.k.add(xh);
                    xh2.l.add(mj);
                    xh.l.add(mj);
                }
            }
        }
        C3488dy c3488dy11 = this.b;
        C0791Jx[] c0791JxArr2 = c3488dy11.F;
        C0791Jx c0791Jx4 = c0791JxArr2[0];
        C0791Jx c0791Jx5 = c0791Jx4.d;
        if (c0791Jx5 != null && c0791JxArr2[1].d != null) {
            if (c3488dy11.q()) {
                xh2.f = this.b.F[0].c();
                xh.f = -this.b.F[1].c();
                return;
            }
            XH xhH5 = AbstractC6716qn1.h(this.b.F[0]);
            XH xhH6 = AbstractC6716qn1.h(this.b.F[1]);
            xhH5.b(this);
            xhH6.b(this);
            this.j = 4;
            return;
        }
        if (c0791Jx5 != null) {
            XH xhH7 = AbstractC6716qn1.h(c0791Jx4);
            if (xhH7 != null) {
                AbstractC6716qn1.b(xh2, xhH7, this.b.F[0].c());
                c(xh, xh2, 1, mj);
                return;
            }
            return;
        }
        C0791Jx c0791Jx6 = c0791JxArr2[1];
        if (c0791Jx6.d != null) {
            XH xhH8 = AbstractC6716qn1.h(c0791Jx6);
            if (xhH8 != null) {
                AbstractC6716qn1.b(xh, xhH8, -this.b.F[1].c());
                c(xh2, xh, -1, mj);
                return;
            }
            return;
        }
        if ((c3488dy11 instanceof X20) || (c3488dy3 = c3488dy11.I) == null) {
            return;
        }
        AbstractC6716qn1.b(xh2, c3488dy3.d.h, c3488dy11.m());
        c(xh, xh2, 1, mj);
    }

    @Override // defpackage.AbstractC6716qn1
    public final void e() {
        XH xh = this.h;
        if (xh.j) {
            this.b.N = xh.g;
        }
    }

    @Override // defpackage.AbstractC6716qn1
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.AbstractC6716qn1
    public final boolean k() {
        return this.d != 3 || this.b.j == 0;
    }

    public final void n() {
        this.g = false;
        XH xh = this.h;
        xh.c();
        xh.j = false;
        XH xh2 = this.i;
        xh2.c();
        xh2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.W;
    }
}
