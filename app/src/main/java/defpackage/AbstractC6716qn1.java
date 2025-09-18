package defpackage;

/* renamed from: qn1 */
/* loaded from: classes.dex */
public abstract class AbstractC6716qn1 implements SH {
    public int a;
    public C3488dy b;
    public C5321jU0 c;
    public int d;
    public final MJ e = new MJ(this);
    public int f = 0;
    public boolean g = false;
    public final XH h = new XH(this);
    public final XH i = new XH(this);
    public int j = 1;

    public AbstractC6716qn1(C3488dy c3488dy) {
        this.b = c3488dy;
    }

    public static void b(XH xh, XH xh2, int i) {
        xh.l.add(xh2);
        xh.f = i;
        xh2.k.add(xh);
    }

    public static XH h(C0791Jx c0791Jx) {
        C0791Jx c0791Jx2 = c0791Jx.d;
        if (c0791Jx2 == null) {
            return null;
        }
        int iX = AbstractC8235ym.x(c0791Jx2.c);
        C3488dy c3488dy = c0791Jx2.b;
        if (iX == 1) {
            return c3488dy.d.h;
        }
        if (iX == 2) {
            return c3488dy.e.h;
        }
        if (iX == 3) {
            return c3488dy.d.i;
        }
        if (iX == 4) {
            return c3488dy.e.i;
        }
        if (iX != 5) {
            return null;
        }
        return c3488dy.e.k;
    }

    public static XH i(C0791Jx c0791Jx, int i) {
        C0791Jx c0791Jx2 = c0791Jx.d;
        if (c0791Jx2 == null) {
            return null;
        }
        C3488dy c3488dy = c0791Jx2.b;
        AbstractC6716qn1 abstractC6716qn1 = i == 0 ? c3488dy.d : c3488dy.e;
        int iX = AbstractC8235ym.x(c0791Jx2.c);
        if (iX == 1 || iX == 2) {
            return abstractC6716qn1.h;
        }
        if (iX == 3 || iX == 4) {
            return abstractC6716qn1.i;
        }
        return null;
    }

    public final void c(XH xh, XH xh2, int i, MJ mj) {
        xh.l.add(xh2);
        xh.l.add(this.e);
        xh.h = i;
        xh.i = mj;
        xh2.k.add(xh);
        mj.k.add(xh);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            C3488dy c3488dy = this.b;
            int i3 = c3488dy.n;
            iMax = Math.max(c3488dy.m, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            C3488dy c3488dy2 = this.b;
            int i4 = c3488dy2.q;
            iMax = Math.max(c3488dy2.p, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    public long j() {
        if (this.e.j) {
            return r0.g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(C0791Jx c0791Jx, C0791Jx c0791Jx2, int i) {
        XH xhH = h(c0791Jx);
        XH xhH2 = h(c0791Jx2);
        if (xhH.j && xhH2.j) {
            int iC = c0791Jx.c() + xhH.g;
            int iC2 = xhH2.g - c0791Jx2.c();
            int i2 = iC2 - iC;
            MJ mj = this.e;
            if (!mj.j && this.d == 3) {
                int i3 = this.a;
                if (i3 == 0) {
                    mj.d(g(i2, i));
                } else if (i3 == 1) {
                    mj.d(Math.min(g(mj.m, i), i2));
                } else if (i3 == 2) {
                    C3488dy c3488dy = this.b;
                    C3488dy c3488dy2 = c3488dy.I;
                    if (c3488dy2 != null) {
                        if ((i == 0 ? c3488dy2.d : c3488dy2.e).e.j) {
                            mj.d(g((int) ((r6.g * (i == 0 ? c3488dy.o : c3488dy.r)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C3488dy c3488dy3 = this.b;
                    AbstractC6716qn1 abstractC6716qn1 = c3488dy3.d;
                    int i4 = abstractC6716qn1.d;
                    AbstractC6716qn1 abstractC6716qn12 = c3488dy3.e;
                    if (i4 != 3 || abstractC6716qn1.a != 3 || abstractC6716qn12.d != 3 || abstractC6716qn12.a != 3) {
                        if (i == 0) {
                            abstractC6716qn1 = abstractC6716qn12;
                        }
                        if (abstractC6716qn1.e.j) {
                            float f = c3488dy3.L;
                            mj.d(i == 1 ? (int) ((r6.g / f) + 0.5f) : (int) ((f * r6.g) + 0.5f));
                        }
                    }
                }
            }
            if (mj.j) {
                int i5 = mj.g;
                XH xh = this.i;
                XH xh2 = this.h;
                if (i5 == i2) {
                    xh2.d(iC);
                    xh.d(iC2);
                    return;
                }
                C3488dy c3488dy4 = this.b;
                float f2 = i == 0 ? c3488dy4.S : c3488dy4.T;
                if (xhH == xhH2) {
                    iC = xhH.g;
                    iC2 = xhH2.g;
                    f2 = 0.5f;
                }
                xh2.d((int) ((((iC2 - iC) - i5) * f2) + iC + 0.5f));
                xh.d(xh2.g + mj.g);
            }
        }
    }
}
