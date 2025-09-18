package defpackage;

/* renamed from: Gi1 */
/* loaded from: classes.dex */
public final class C0514Gi1 extends AbstractC6716qn1 {
    public XH k;
    public C1051Ng l;

    @Override // defpackage.SH
    public final void a(SH sh) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC8235ym.x(this.j) == 3) {
            C3488dy c3488dy = this.b;
            l(c3488dy.y, c3488dy.A, 1);
            return;
        }
        MJ mj = this.e;
        if (mj.c && !mj.j && this.d == 3) {
            C3488dy c3488dy2 = this.b;
            int i2 = c3488dy2.k;
            if (i2 == 2) {
                C3488dy c3488dy3 = c3488dy2.I;
                if (c3488dy3 != null) {
                    if (c3488dy3.e.e.j) {
                        mj.d((int) ((r5.g * c3488dy2.r) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                MJ mj2 = c3488dy2.d.e;
                if (mj2.j) {
                    int i3 = c3488dy2.M;
                    if (i3 == -1) {
                        f = mj2.g;
                        f2 = c3488dy2.L;
                    } else if (i3 == 0) {
                        f3 = mj2.g * c3488dy2.L;
                        i = (int) (f3 + 0.5f);
                        mj.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        mj.d(i);
                    } else {
                        f = mj2.g;
                        f2 = c3488dy2.L;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    mj.d(i);
                }
            }
        }
        XH xh = this.h;
        if (xh.c) {
            XH xh2 = this.i;
            if (xh2.c) {
                if (xh.j && xh2.j && mj.j) {
                    return;
                }
                if (!mj.j && this.d == 3) {
                    C3488dy c3488dy4 = this.b;
                    if (c3488dy4.j == 0 && !c3488dy4.r()) {
                        XH xh3 = (XH) xh.l.get(0);
                        XH xh4 = (XH) xh2.l.get(0);
                        int i4 = xh3.g + xh.f;
                        int i5 = xh4.g + xh2.f;
                        xh.d(i4);
                        xh2.d(i5);
                        mj.d(i5 - i4);
                        return;
                    }
                }
                if (!mj.j && this.d == 3 && this.a == 1 && xh.l.size() > 0 && xh2.l.size() > 0) {
                    XH xh5 = (XH) xh.l.get(0);
                    int i6 = (((XH) xh2.l.get(0)).g + xh2.f) - (xh5.g + xh.f);
                    int i7 = mj.m;
                    if (i6 < i7) {
                        mj.d(i6);
                    } else {
                        mj.d(i7);
                    }
                }
                if (mj.j && xh.l.size() > 0 && xh2.l.size() > 0) {
                    XH xh6 = (XH) xh.l.get(0);
                    XH xh7 = (XH) xh2.l.get(0);
                    int i8 = xh6.g;
                    int i9 = xh.f + i8;
                    int i10 = xh7.g;
                    int i11 = xh2.f + i10;
                    float f4 = this.b.T;
                    if (xh6 == xh7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    xh.d((int) ((((i10 - i8) - mj.g) * f4) + i8 + 0.5f));
                    xh2.d(xh.g + mj.g);
                }
            }
        }
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
            mj.d(c3488dy5.i());
        }
        boolean z2 = mj.j;
        XH xh = this.i;
        XH xh2 = this.h;
        if (!z2) {
            C3488dy c3488dy6 = this.b;
            this.d = c3488dy6.c0[1];
            if (c3488dy6.w) {
                this.l = new C1051Ng(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (c3488dy4 = this.b.I) != null && c3488dy4.c0[1] == 1) {
                    int i2 = (c3488dy4.i() - this.b.y.c()) - this.b.A.c();
                    C0514Gi1 c0514Gi1 = c3488dy4.e;
                    AbstractC6716qn1.b(xh2, c0514Gi1.h, this.b.y.c());
                    AbstractC6716qn1.b(xh, c0514Gi1.i, -this.b.A.c());
                    mj.d(i2);
                    return;
                }
                if (i == 1) {
                    mj.d(this.b.i());
                }
            }
        } else if (this.d == 4 && (c3488dy2 = (c3488dy = this.b).I) != null && c3488dy2.c0[1] == 1) {
            C0514Gi1 c0514Gi12 = c3488dy2.e;
            AbstractC6716qn1.b(xh2, c0514Gi12.h, c3488dy.y.c());
            AbstractC6716qn1.b(xh, c0514Gi12.i, -this.b.A.c());
            return;
        }
        boolean z3 = mj.j;
        XH xh3 = this.k;
        if (z3) {
            C3488dy c3488dy7 = this.b;
            if (c3488dy7.a) {
                C0791Jx[] c0791JxArr = c3488dy7.F;
                C0791Jx c0791Jx = c0791JxArr[2];
                C0791Jx c0791Jx2 = c0791Jx.d;
                if (c0791Jx2 != null && c0791JxArr[3].d != null) {
                    if (c3488dy7.r()) {
                        xh2.f = this.b.F[2].c();
                        xh.f = -this.b.F[3].c();
                    } else {
                        XH xhH = AbstractC6716qn1.h(this.b.F[2]);
                        if (xhH != null) {
                            AbstractC6716qn1.b(xh2, xhH, this.b.F[2].c());
                        }
                        XH xhH2 = AbstractC6716qn1.h(this.b.F[3]);
                        if (xhH2 != null) {
                            AbstractC6716qn1.b(xh, xhH2, -this.b.F[3].c());
                        }
                        xh2.b = true;
                        xh.b = true;
                    }
                    C3488dy c3488dy8 = this.b;
                    if (c3488dy8.w) {
                        AbstractC6716qn1.b(xh3, xh2, c3488dy8.P);
                        return;
                    }
                    return;
                }
                if (c0791Jx2 != null) {
                    XH xhH3 = AbstractC6716qn1.h(c0791Jx);
                    if (xhH3 != null) {
                        AbstractC6716qn1.b(xh2, xhH3, this.b.F[2].c());
                        AbstractC6716qn1.b(xh, xh2, mj.g);
                        C3488dy c3488dy9 = this.b;
                        if (c3488dy9.w) {
                            AbstractC6716qn1.b(xh3, xh2, c3488dy9.P);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0791Jx c0791Jx3 = c0791JxArr[3];
                if (c0791Jx3.d != null) {
                    XH xhH4 = AbstractC6716qn1.h(c0791Jx3);
                    if (xhH4 != null) {
                        AbstractC6716qn1.b(xh, xhH4, -this.b.F[3].c());
                        AbstractC6716qn1.b(xh2, xh, -mj.g);
                    }
                    C3488dy c3488dy10 = this.b;
                    if (c3488dy10.w) {
                        AbstractC6716qn1.b(xh3, xh2, c3488dy10.P);
                        return;
                    }
                    return;
                }
                C0791Jx c0791Jx4 = c0791JxArr[4];
                if (c0791Jx4.d != null) {
                    XH xhH5 = AbstractC6716qn1.h(c0791Jx4);
                    if (xhH5 != null) {
                        AbstractC6716qn1.b(xh3, xhH5, 0);
                        AbstractC6716qn1.b(xh2, xh3, -this.b.P);
                        AbstractC6716qn1.b(xh, xh2, mj.g);
                        return;
                    }
                    return;
                }
                if ((c3488dy7 instanceof X20) || c3488dy7.I == null || c3488dy7.g(7).d != null) {
                    return;
                }
                C3488dy c3488dy11 = this.b;
                AbstractC6716qn1.b(xh2, c3488dy11.I.e.h, c3488dy11.n());
                AbstractC6716qn1.b(xh, xh2, mj.g);
                C3488dy c3488dy12 = this.b;
                if (c3488dy12.w) {
                    AbstractC6716qn1.b(xh3, xh2, c3488dy12.P);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            mj.b(this);
        } else {
            C3488dy c3488dy13 = this.b;
            int i3 = c3488dy13.k;
            if (i3 == 2) {
                C3488dy c3488dy14 = c3488dy13.I;
                if (c3488dy14 != null) {
                    MJ mj2 = c3488dy14.e.e;
                    mj.l.add(mj2);
                    mj2.k.add(mj);
                    mj.b = true;
                    mj.k.add(xh2);
                    mj.k.add(xh);
                }
            } else if (i3 == 3 && !c3488dy13.r()) {
                C3488dy c3488dy15 = this.b;
                if (c3488dy15.j != 3) {
                    MJ mj3 = c3488dy15.d.e;
                    mj.l.add(mj3);
                    mj3.k.add(mj);
                    mj.b = true;
                    mj.k.add(xh2);
                    mj.k.add(xh);
                }
            }
        }
        C3488dy c3488dy16 = this.b;
        C0791Jx[] c0791JxArr2 = c3488dy16.F;
        C0791Jx c0791Jx5 = c0791JxArr2[2];
        C0791Jx c0791Jx6 = c0791Jx5.d;
        if (c0791Jx6 != null && c0791JxArr2[3].d != null) {
            if (c3488dy16.r()) {
                xh2.f = this.b.F[2].c();
                xh.f = -this.b.F[3].c();
            } else {
                XH xhH6 = AbstractC6716qn1.h(this.b.F[2]);
                XH xhH7 = AbstractC6716qn1.h(this.b.F[3]);
                xhH6.b(this);
                xhH7.b(this);
                this.j = 4;
            }
            if (this.b.w) {
                c(xh3, xh2, 1, this.l);
            }
        } else if (c0791Jx6 != null) {
            XH xhH8 = AbstractC6716qn1.h(c0791Jx5);
            if (xhH8 != null) {
                AbstractC6716qn1.b(xh2, xhH8, this.b.F[2].c());
                c(xh, xh2, 1, mj);
                if (this.b.w) {
                    c(xh3, xh2, 1, this.l);
                }
                if (this.d == 3) {
                    C3488dy c3488dy17 = this.b;
                    if (c3488dy17.L > 0.0f) {
                        M30 m30 = c3488dy17.d;
                        if (m30.d == 3) {
                            m30.e.k.add(mj);
                            mj.l.add(this.b.d.e);
                            mj.a = this;
                        }
                    }
                }
            }
        } else {
            C0791Jx c0791Jx7 = c0791JxArr2[3];
            if (c0791Jx7.d != null) {
                XH xhH9 = AbstractC6716qn1.h(c0791Jx7);
                if (xhH9 != null) {
                    AbstractC6716qn1.b(xh, xhH9, -this.b.F[3].c());
                    c(xh2, xh, -1, mj);
                    if (this.b.w) {
                        c(xh3, xh2, 1, this.l);
                    }
                }
            } else {
                C0791Jx c0791Jx8 = c0791JxArr2[4];
                if (c0791Jx8.d != null) {
                    XH xhH10 = AbstractC6716qn1.h(c0791Jx8);
                    if (xhH10 != null) {
                        AbstractC6716qn1.b(xh3, xhH10, 0);
                        c(xh2, xh3, -1, this.l);
                        c(xh, xh2, 1, mj);
                    }
                } else if (!(c3488dy16 instanceof X20) && (c3488dy3 = c3488dy16.I) != null) {
                    AbstractC6716qn1.b(xh2, c3488dy3.e.h, c3488dy16.n());
                    c(xh, xh2, 1, mj);
                    if (this.b.w) {
                        c(xh3, xh2, 1, this.l);
                    }
                    if (this.d == 3) {
                        C3488dy c3488dy18 = this.b;
                        if (c3488dy18.L > 0.0f) {
                            M30 m302 = c3488dy18.d;
                            if (m302.d == 3) {
                                m302.e.k.add(mj);
                                mj.l.add(this.b.d.e);
                                mj.a = this;
                            }
                        }
                    }
                }
            }
        }
        if (mj.l.size() == 0) {
            mj.c = true;
        }
    }

    @Override // defpackage.AbstractC6716qn1
    public final void e() {
        XH xh = this.h;
        if (xh.j) {
            this.b.O = xh.g;
        }
    }

    @Override // defpackage.AbstractC6716qn1
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.AbstractC6716qn1
    public final boolean k() {
        return this.d != 3 || this.b.k == 0;
    }

    public final void m() {
        this.g = false;
        XH xh = this.h;
        xh.c();
        xh.j = false;
        XH xh2 = this.i;
        xh2.c();
        xh2.j = false;
        XH xh3 = this.k;
        xh3.c();
        xh3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.W;
    }
}
