package p000;

/* renamed from: qn1 */
/* loaded from: classes.dex */
public abstract class AbstractC10822qn1 implements InterfaceC1150SH {

    /* renamed from: a */
    public int f41156a;

    /* renamed from: b */
    public C3960dy f41157b;

    /* renamed from: c */
    public C9887jU0 f41158c;

    /* renamed from: d */
    public int f41159d;

    /* renamed from: e */
    public final C0775MJ f41160e = new C0775MJ(this);

    /* renamed from: f */
    public int f41161f = 0;

    /* renamed from: g */
    public boolean f41162g = false;

    /* renamed from: h */
    public final C1465XH f41163h = new C1465XH(this);

    /* renamed from: i */
    public final C1465XH f41164i = new C1465XH(this);

    /* renamed from: j */
    public int f41165j = 1;

    public AbstractC10822qn1(C3960dy c3960dy) {
        this.f41157b = c3960dy;
    }

    /* renamed from: b */
    public static void m24064b(C1465XH c1465xh, C1465XH c1465xh2, int i) {
        c1465xh.f13662l.add(c1465xh2);
        c1465xh.f13656f = i;
        c1465xh2.f13661k.add(c1465xh);
    }

    /* renamed from: h */
    public static C1465XH m24065h(C0627Jx c0627Jx) {
        C0627Jx c0627Jx2 = c0627Jx.f5809d;
        if (c0627Jx2 == null) {
            return null;
        }
        int iM26247x = AbstractC7222ym.m26247x(c0627Jx2.f5808c);
        C3960dy c3960dy = c0627Jx2.f5807b;
        if (iM26247x == 1) {
            return c3960dy.f26434d.f41163h;
        }
        if (iM26247x == 2) {
            return c3960dy.f26435e.f41163h;
        }
        if (iM26247x == 3) {
            return c3960dy.f26434d.f41164i;
        }
        if (iM26247x == 4) {
            return c3960dy.f26435e.f41164i;
        }
        if (iM26247x != 5) {
            return null;
        }
        return c3960dy.f26435e.f3857k;
    }

    /* renamed from: i */
    public static C1465XH m24066i(C0627Jx c0627Jx, int i) {
        C0627Jx c0627Jx2 = c0627Jx.f5809d;
        if (c0627Jx2 == null) {
            return null;
        }
        C3960dy c3960dy = c0627Jx2.f5807b;
        AbstractC10822qn1 abstractC10822qn1 = i == 0 ? c3960dy.f26434d : c3960dy.f26435e;
        int iM26247x = AbstractC7222ym.m26247x(c0627Jx2.f5808c);
        if (iM26247x == 1 || iM26247x == 2) {
            return abstractC10822qn1.f41163h;
        }
        if (iM26247x == 3 || iM26247x == 4) {
            return abstractC10822qn1.f41164i;
        }
        return null;
    }

    /* renamed from: c */
    public final void m24067c(C1465XH c1465xh, C1465XH c1465xh2, int i, C0775MJ c0775mj) {
        c1465xh.f13662l.add(c1465xh2);
        c1465xh.f13662l.add(this.f41160e);
        c1465xh.f13658h = i;
        c1465xh.f13659i = c0775mj;
        c1465xh2.f13661k.add(c1465xh);
        c0775mj.f13661k.add(c1465xh);
    }

    /* renamed from: d */
    public abstract void mo3127d();

    /* renamed from: e */
    public abstract void mo3128e();

    /* renamed from: f */
    public abstract void mo3129f();

    /* renamed from: g */
    public final int m24068g(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            C3960dy c3960dy = this.f41157b;
            int i3 = c3960dy.f26444n;
            iMax = Math.max(c3960dy.f26443m, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            C3960dy c3960dy2 = this.f41157b;
            int i4 = c3960dy2.f26447q;
            iMax = Math.max(c3960dy2.f26446p, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    /* renamed from: j */
    public long mo10527j() {
        if (this.f41160e.f13660j) {
            return r0.f13657g;
        }
        return 0L;
    }

    /* renamed from: k */
    public abstract boolean mo3130k();

    /* renamed from: l */
    public final void m24069l(C0627Jx c0627Jx, C0627Jx c0627Jx2, int i) {
        C1465XH c1465xhM24065h = m24065h(c0627Jx);
        C1465XH c1465xhM24065h2 = m24065h(c0627Jx2);
        if (c1465xhM24065h.f13660j && c1465xhM24065h2.f13660j) {
            int iM4472c = c0627Jx.m4472c() + c1465xhM24065h.f13657g;
            int iM4472c2 = c1465xhM24065h2.f13657g - c0627Jx2.m4472c();
            int i2 = iM4472c2 - iM4472c;
            C0775MJ c0775mj = this.f41160e;
            if (!c0775mj.f13660j && this.f41159d == 3) {
                int i3 = this.f41156a;
                if (i3 == 0) {
                    c0775mj.mo5302d(m24068g(i2, i));
                } else if (i3 == 1) {
                    c0775mj.mo5302d(Math.min(m24068g(c0775mj.f7088m, i), i2));
                } else if (i3 == 2) {
                    C3960dy c3960dy = this.f41157b;
                    C3960dy c3960dy2 = c3960dy.f26410I;
                    if (c3960dy2 != null) {
                        if ((i == 0 ? c3960dy2.f26434d : c3960dy2.f26435e).f41160e.f13660j) {
                            c0775mj.mo5302d(m24068g((int) ((r6.f13657g * (i == 0 ? c3960dy.f26445o : c3960dy.f26448r)) + 0.5f), i));
                        }
                    }
                } else if (i3 == 3) {
                    C3960dy c3960dy3 = this.f41157b;
                    AbstractC10822qn1 abstractC10822qn1 = c3960dy3.f26434d;
                    int i4 = abstractC10822qn1.f41159d;
                    AbstractC10822qn1 abstractC10822qn12 = c3960dy3.f26435e;
                    if (i4 != 3 || abstractC10822qn1.f41156a != 3 || abstractC10822qn12.f41159d != 3 || abstractC10822qn12.f41156a != 3) {
                        if (i == 0) {
                            abstractC10822qn1 = abstractC10822qn12;
                        }
                        if (abstractC10822qn1.f41160e.f13660j) {
                            float f = c3960dy3.f26413L;
                            c0775mj.mo5302d(i == 1 ? (int) ((r6.f13657g / f) + 0.5f) : (int) ((f * r6.f13657g) + 0.5f));
                        }
                    }
                }
            }
            if (c0775mj.f13660j) {
                int i5 = c0775mj.f13657g;
                C1465XH c1465xh = this.f41164i;
                C1465XH c1465xh2 = this.f41163h;
                if (i5 == i2) {
                    c1465xh2.mo5302d(iM4472c);
                    c1465xh.mo5302d(iM4472c2);
                    return;
                }
                C3960dy c3960dy4 = this.f41157b;
                float f2 = i == 0 ? c3960dy4.f26420S : c3960dy4.f26421T;
                if (c1465xhM24065h == c1465xhM24065h2) {
                    iM4472c = c1465xhM24065h.f13657g;
                    iM4472c2 = c1465xhM24065h2.f13657g;
                    f2 = 0.5f;
                }
                c1465xh2.mo5302d((int) ((((iM4472c2 - iM4472c) - i5) * f2) + iM4472c + 0.5f));
                c1465xh.mo5302d(c1465xh2.f13657g + c0775mj.f13657g);
            }
        }
    }
}
