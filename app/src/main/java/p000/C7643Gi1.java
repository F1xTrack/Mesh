package p000;

/* renamed from: Gi1 */
/* loaded from: classes.dex */
public final class C7643Gi1 extends AbstractC10822qn1 {

    /* renamed from: k */
    public C1465XH f3857k;

    /* renamed from: l */
    public C0861Ng f3858l;

    @Override // p000.InterfaceC1150SH
    /* renamed from: a */
    public final void mo3126a(InterfaceC1150SH interfaceC1150SH) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC7222ym.m26247x(this.f41165j) == 3) {
            C3960dy c3960dy = this.f41157b;
            m24069l(c3960dy.f26455y, c3960dy.f26402A, 1);
            return;
        }
        C0775MJ c0775mj = this.f41160e;
        if (c0775mj.f13653c && !c0775mj.f13660j && this.f41159d == 3) {
            C3960dy c3960dy2 = this.f41157b;
            int i2 = c3960dy2.f26441k;
            if (i2 == 2) {
                C3960dy c3960dy3 = c3960dy2.f26410I;
                if (c3960dy3 != null) {
                    if (c3960dy3.f26435e.f41160e.f13660j) {
                        c0775mj.mo5302d((int) ((r5.f13657g * c3960dy2.f26448r) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0775MJ c0775mj2 = c3960dy2.f26434d.f41160e;
                if (c0775mj2.f13660j) {
                    int i3 = c3960dy2.f26414M;
                    if (i3 == -1) {
                        f = c0775mj2.f13657g;
                        f2 = c3960dy2.f26413L;
                    } else if (i3 == 0) {
                        f3 = c0775mj2.f13657g * c3960dy2.f26413L;
                        i = (int) (f3 + 0.5f);
                        c0775mj.mo5302d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        c0775mj.mo5302d(i);
                    } else {
                        f = c0775mj2.f13657g;
                        f2 = c3960dy2.f26413L;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c0775mj.mo5302d(i);
                }
            }
        }
        C1465XH c1465xh = this.f41163h;
        if (c1465xh.f13653c) {
            C1465XH c1465xh2 = this.f41164i;
            if (c1465xh2.f13653c) {
                if (c1465xh.f13660j && c1465xh2.f13660j && c0775mj.f13660j) {
                    return;
                }
                if (!c0775mj.f13660j && this.f41159d == 3) {
                    C3960dy c3960dy4 = this.f41157b;
                    if (c3960dy4.f26440j == 0 && !c3960dy4.m17795r()) {
                        C1465XH c1465xh3 = (C1465XH) c1465xh.f13662l.get(0);
                        C1465XH c1465xh4 = (C1465XH) c1465xh2.f13662l.get(0);
                        int i4 = c1465xh3.f13657g + c1465xh.f13656f;
                        int i5 = c1465xh4.f13657g + c1465xh2.f13656f;
                        c1465xh.mo5302d(i4);
                        c1465xh2.mo5302d(i5);
                        c0775mj.mo5302d(i5 - i4);
                        return;
                    }
                }
                if (!c0775mj.f13660j && this.f41159d == 3 && this.f41156a == 1 && c1465xh.f13662l.size() > 0 && c1465xh2.f13662l.size() > 0) {
                    C1465XH c1465xh5 = (C1465XH) c1465xh.f13662l.get(0);
                    int i6 = (((C1465XH) c1465xh2.f13662l.get(0)).f13657g + c1465xh2.f13656f) - (c1465xh5.f13657g + c1465xh.f13656f);
                    int i7 = c0775mj.f7088m;
                    if (i6 < i7) {
                        c0775mj.mo5302d(i6);
                    } else {
                        c0775mj.mo5302d(i7);
                    }
                }
                if (c0775mj.f13660j && c1465xh.f13662l.size() > 0 && c1465xh2.f13662l.size() > 0) {
                    C1465XH c1465xh6 = (C1465XH) c1465xh.f13662l.get(0);
                    C1465XH c1465xh7 = (C1465XH) c1465xh2.f13662l.get(0);
                    int i8 = c1465xh6.f13657g;
                    int i9 = c1465xh.f13656f + i8;
                    int i10 = c1465xh7.f13657g;
                    int i11 = c1465xh2.f13656f + i10;
                    float f4 = this.f41157b.f26421T;
                    if (c1465xh6 == c1465xh7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c1465xh.mo5302d((int) ((((i10 - i8) - c0775mj.f13657g) * f4) + i8 + 0.5f));
                    c1465xh2.mo5302d(c1465xh.f13657g + c0775mj.f13657g);
                }
            }
        }
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: d */
    public final void mo3127d() {
        C3960dy c3960dy;
        C3960dy c3960dy2;
        C3960dy c3960dy3;
        C3960dy c3960dy4;
        C3960dy c3960dy5 = this.f41157b;
        boolean z = c3960dy5.f26428a;
        C0775MJ c0775mj = this.f41160e;
        if (z) {
            c0775mj.mo5302d(c3960dy5.m17786i());
        }
        boolean z2 = c0775mj.f13660j;
        C1465XH c1465xh = this.f41164i;
        C1465XH c1465xh2 = this.f41163h;
        if (!z2) {
            C3960dy c3960dy6 = this.f41157b;
            this.f41159d = c3960dy6.f26433c0[1];
            if (c3960dy6.f26453w) {
                this.f3858l = new C0861Ng(this);
            }
            int i = this.f41159d;
            if (i != 3) {
                if (i == 4 && (c3960dy4 = this.f41157b.f26410I) != null && c3960dy4.f26433c0[1] == 1) {
                    int iM17786i = (c3960dy4.m17786i() - this.f41157b.f26455y.m4472c()) - this.f41157b.f26402A.m4472c();
                    C7643Gi1 c7643Gi1 = c3960dy4.f26435e;
                    AbstractC10822qn1.m24064b(c1465xh2, c7643Gi1.f41163h, this.f41157b.f26455y.m4472c());
                    AbstractC10822qn1.m24064b(c1465xh, c7643Gi1.f41164i, -this.f41157b.f26402A.m4472c());
                    c0775mj.mo5302d(iM17786i);
                    return;
                }
                if (i == 1) {
                    c0775mj.mo5302d(this.f41157b.m17786i());
                }
            }
        } else if (this.f41159d == 4 && (c3960dy2 = (c3960dy = this.f41157b).f26410I) != null && c3960dy2.f26433c0[1] == 1) {
            C7643Gi1 c7643Gi12 = c3960dy2.f26435e;
            AbstractC10822qn1.m24064b(c1465xh2, c7643Gi12.f41163h, c3960dy.f26455y.m4472c());
            AbstractC10822qn1.m24064b(c1465xh, c7643Gi12.f41164i, -this.f41157b.f26402A.m4472c());
            return;
        }
        boolean z3 = c0775mj.f13660j;
        C1465XH c1465xh3 = this.f3857k;
        if (z3) {
            C3960dy c3960dy7 = this.f41157b;
            if (c3960dy7.f26428a) {
                C0627Jx[] c0627JxArr = c3960dy7.f26407F;
                C0627Jx c0627Jx = c0627JxArr[2];
                C0627Jx c0627Jx2 = c0627Jx.f5809d;
                if (c0627Jx2 != null && c0627JxArr[3].f5809d != null) {
                    if (c3960dy7.m17795r()) {
                        c1465xh2.f13656f = this.f41157b.f26407F[2].m4472c();
                        c1465xh.f13656f = -this.f41157b.f26407F[3].m4472c();
                    } else {
                        C1465XH c1465xhM24065h = AbstractC10822qn1.m24065h(this.f41157b.f26407F[2]);
                        if (c1465xhM24065h != null) {
                            AbstractC10822qn1.m24064b(c1465xh2, c1465xhM24065h, this.f41157b.f26407F[2].m4472c());
                        }
                        C1465XH c1465xhM24065h2 = AbstractC10822qn1.m24065h(this.f41157b.f26407F[3]);
                        if (c1465xhM24065h2 != null) {
                            AbstractC10822qn1.m24064b(c1465xh, c1465xhM24065h2, -this.f41157b.f26407F[3].m4472c());
                        }
                        c1465xh2.f13652b = true;
                        c1465xh.f13652b = true;
                    }
                    C3960dy c3960dy8 = this.f41157b;
                    if (c3960dy8.f26453w) {
                        AbstractC10822qn1.m24064b(c1465xh3, c1465xh2, c3960dy8.f26417P);
                        return;
                    }
                    return;
                }
                if (c0627Jx2 != null) {
                    C1465XH c1465xhM24065h3 = AbstractC10822qn1.m24065h(c0627Jx);
                    if (c1465xhM24065h3 != null) {
                        AbstractC10822qn1.m24064b(c1465xh2, c1465xhM24065h3, this.f41157b.f26407F[2].m4472c());
                        AbstractC10822qn1.m24064b(c1465xh, c1465xh2, c0775mj.f13657g);
                        C3960dy c3960dy9 = this.f41157b;
                        if (c3960dy9.f26453w) {
                            AbstractC10822qn1.m24064b(c1465xh3, c1465xh2, c3960dy9.f26417P);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0627Jx c0627Jx3 = c0627JxArr[3];
                if (c0627Jx3.f5809d != null) {
                    C1465XH c1465xhM24065h4 = AbstractC10822qn1.m24065h(c0627Jx3);
                    if (c1465xhM24065h4 != null) {
                        AbstractC10822qn1.m24064b(c1465xh, c1465xhM24065h4, -this.f41157b.f26407F[3].m4472c());
                        AbstractC10822qn1.m24064b(c1465xh2, c1465xh, -c0775mj.f13657g);
                    }
                    C3960dy c3960dy10 = this.f41157b;
                    if (c3960dy10.f26453w) {
                        AbstractC10822qn1.m24064b(c1465xh3, c1465xh2, c3960dy10.f26417P);
                        return;
                    }
                    return;
                }
                C0627Jx c0627Jx4 = c0627JxArr[4];
                if (c0627Jx4.f5809d != null) {
                    C1465XH c1465xhM24065h5 = AbstractC10822qn1.m24065h(c0627Jx4);
                    if (c1465xhM24065h5 != null) {
                        AbstractC10822qn1.m24064b(c1465xh3, c1465xhM24065h5, 0);
                        AbstractC10822qn1.m24064b(c1465xh2, c1465xh3, -this.f41157b.f26417P);
                        AbstractC10822qn1.m24064b(c1465xh, c1465xh2, c0775mj.f13657g);
                        return;
                    }
                    return;
                }
                if ((c3960dy7 instanceof X20) || c3960dy7.f26410I == null || c3960dy7.mo17784g(7).f5809d != null) {
                    return;
                }
                C3960dy c3960dy11 = this.f41157b;
                AbstractC10822qn1.m24064b(c1465xh2, c3960dy11.f26410I.f26435e.f41163h, c3960dy11.m17791n());
                AbstractC10822qn1.m24064b(c1465xh, c1465xh2, c0775mj.f13657g);
                C3960dy c3960dy12 = this.f41157b;
                if (c3960dy12.f26453w) {
                    AbstractC10822qn1.m24064b(c1465xh3, c1465xh2, c3960dy12.f26417P);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f41159d != 3) {
            c0775mj.m8962b(this);
        } else {
            C3960dy c3960dy13 = this.f41157b;
            int i2 = c3960dy13.f26441k;
            if (i2 == 2) {
                C3960dy c3960dy14 = c3960dy13.f26410I;
                if (c3960dy14 != null) {
                    C0775MJ c0775mj2 = c3960dy14.f26435e.f41160e;
                    c0775mj.f13662l.add(c0775mj2);
                    c0775mj2.f13661k.add(c0775mj);
                    c0775mj.f13652b = true;
                    c0775mj.f13661k.add(c1465xh2);
                    c0775mj.f13661k.add(c1465xh);
                }
            } else if (i2 == 3 && !c3960dy13.m17795r()) {
                C3960dy c3960dy15 = this.f41157b;
                if (c3960dy15.f26440j != 3) {
                    C0775MJ c0775mj3 = c3960dy15.f26434d.f41160e;
                    c0775mj.f13662l.add(c0775mj3);
                    c0775mj3.f13661k.add(c0775mj);
                    c0775mj.f13652b = true;
                    c0775mj.f13661k.add(c1465xh2);
                    c0775mj.f13661k.add(c1465xh);
                }
            }
        }
        C3960dy c3960dy16 = this.f41157b;
        C0627Jx[] c0627JxArr2 = c3960dy16.f26407F;
        C0627Jx c0627Jx5 = c0627JxArr2[2];
        C0627Jx c0627Jx6 = c0627Jx5.f5809d;
        if (c0627Jx6 != null && c0627JxArr2[3].f5809d != null) {
            if (c3960dy16.m17795r()) {
                c1465xh2.f13656f = this.f41157b.f26407F[2].m4472c();
                c1465xh.f13656f = -this.f41157b.f26407F[3].m4472c();
            } else {
                C1465XH c1465xhM24065h6 = AbstractC10822qn1.m24065h(this.f41157b.f26407F[2]);
                C1465XH c1465xhM24065h7 = AbstractC10822qn1.m24065h(this.f41157b.f26407F[3]);
                c1465xhM24065h6.m8962b(this);
                c1465xhM24065h7.m8962b(this);
                this.f41165j = 4;
            }
            if (this.f41157b.f26453w) {
                m24067c(c1465xh3, c1465xh2, 1, this.f3858l);
            }
        } else if (c0627Jx6 != null) {
            C1465XH c1465xhM24065h8 = AbstractC10822qn1.m24065h(c0627Jx5);
            if (c1465xhM24065h8 != null) {
                AbstractC10822qn1.m24064b(c1465xh2, c1465xhM24065h8, this.f41157b.f26407F[2].m4472c());
                m24067c(c1465xh, c1465xh2, 1, c0775mj);
                if (this.f41157b.f26453w) {
                    m24067c(c1465xh3, c1465xh2, 1, this.f3858l);
                }
                if (this.f41159d == 3) {
                    C3960dy c3960dy17 = this.f41157b;
                    if (c3960dy17.f26413L > 0.0f) {
                        M30 m30 = c3960dy17.f26434d;
                        if (m30.f41159d == 3) {
                            m30.f41160e.f13661k.add(c0775mj);
                            c0775mj.f13662l.add(this.f41157b.f26434d.f41160e);
                            c0775mj.f13651a = this;
                        }
                    }
                }
            }
        } else {
            C0627Jx c0627Jx7 = c0627JxArr2[3];
            if (c0627Jx7.f5809d != null) {
                C1465XH c1465xhM24065h9 = AbstractC10822qn1.m24065h(c0627Jx7);
                if (c1465xhM24065h9 != null) {
                    AbstractC10822qn1.m24064b(c1465xh, c1465xhM24065h9, -this.f41157b.f26407F[3].m4472c());
                    m24067c(c1465xh2, c1465xh, -1, c0775mj);
                    if (this.f41157b.f26453w) {
                        m24067c(c1465xh3, c1465xh2, 1, this.f3858l);
                    }
                }
            } else {
                C0627Jx c0627Jx8 = c0627JxArr2[4];
                if (c0627Jx8.f5809d != null) {
                    C1465XH c1465xhM24065h10 = AbstractC10822qn1.m24065h(c0627Jx8);
                    if (c1465xhM24065h10 != null) {
                        AbstractC10822qn1.m24064b(c1465xh3, c1465xhM24065h10, 0);
                        m24067c(c1465xh2, c1465xh3, -1, this.f3858l);
                        m24067c(c1465xh, c1465xh2, 1, c0775mj);
                    }
                } else if (!(c3960dy16 instanceof X20) && (c3960dy3 = c3960dy16.f26410I) != null) {
                    AbstractC10822qn1.m24064b(c1465xh2, c3960dy3.f26435e.f41163h, c3960dy16.m17791n());
                    m24067c(c1465xh, c1465xh2, 1, c0775mj);
                    if (this.f41157b.f26453w) {
                        m24067c(c1465xh3, c1465xh2, 1, this.f3858l);
                    }
                    if (this.f41159d == 3) {
                        C3960dy c3960dy18 = this.f41157b;
                        if (c3960dy18.f26413L > 0.0f) {
                            M30 m302 = c3960dy18.f26434d;
                            if (m302.f41159d == 3) {
                                m302.f41160e.f13661k.add(c0775mj);
                                c0775mj.f13662l.add(this.f41157b.f26434d.f41160e);
                                c0775mj.f13651a = this;
                            }
                        }
                    }
                }
            }
        }
        if (c0775mj.f13662l.size() == 0) {
            c0775mj.f13653c = true;
        }
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: e */
    public final void mo3128e() {
        C1465XH c1465xh = this.f41163h;
        if (c1465xh.f13660j) {
            this.f41157b.f26416O = c1465xh.f13657g;
        }
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: f */
    public final void mo3129f() {
        this.f41158c = null;
        this.f41163h.m8963c();
        this.f41164i.m8963c();
        this.f3857k.m8963c();
        this.f41160e.m8963c();
        this.f41162g = false;
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: k */
    public final boolean mo3130k() {
        return this.f41159d != 3 || this.f41157b.f26441k == 0;
    }

    /* renamed from: m */
    public final void m3131m() {
        this.f41162g = false;
        C1465XH c1465xh = this.f41163h;
        c1465xh.m8963c();
        c1465xh.f13660j = false;
        C1465XH c1465xh2 = this.f41164i;
        c1465xh2.m8963c();
        c1465xh2.f13660j = false;
        C1465XH c1465xh3 = this.f3857k;
        c1465xh3.m8963c();
        c1465xh3.f13660j = false;
        this.f41160e.f13660j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f41157b.f26424W;
    }
}
