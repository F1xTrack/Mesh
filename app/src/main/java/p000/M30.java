package p000;

/* loaded from: classes.dex */
public final class M30 extends AbstractC10822qn1 {

    /* renamed from: k */
    public static final int[] f6978k = new int[2];

    /* renamed from: m */
    public static void m5251m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
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
    @Override // p000.InterfaceC1150SH
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo3126a(p000.InterfaceC1150SH r24) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.M30.mo3126a(SH):void");
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
            c0775mj.mo5302d(c3960dy5.m17789l());
        }
        boolean z2 = c0775mj.f13660j;
        C1465XH c1465xh = this.f41164i;
        C1465XH c1465xh2 = this.f41163h;
        if (!z2) {
            C3960dy c3960dy6 = this.f41157b;
            int i = c3960dy6.f26433c0[0];
            this.f41159d = i;
            if (i != 3) {
                if (i == 4 && (((c3960dy4 = c3960dy6.f26410I) != null && c3960dy4.f26433c0[0] == 1) || c3960dy4.f26433c0[0] == 4)) {
                    int iM17789l = (c3960dy4.m17789l() - this.f41157b.f26454x.m4472c()) - this.f41157b.f26456z.m4472c();
                    M30 m30 = c3960dy4.f26434d;
                    AbstractC10822qn1.m24064b(c1465xh2, m30.f41163h, this.f41157b.f26454x.m4472c());
                    AbstractC10822qn1.m24064b(c1465xh, m30.f41164i, -this.f41157b.f26456z.m4472c());
                    c0775mj.mo5302d(iM17789l);
                    return;
                }
                if (i == 1) {
                    c0775mj.mo5302d(c3960dy6.m17789l());
                }
            }
        } else if (this.f41159d == 4 && (((c3960dy2 = (c3960dy = this.f41157b).f26410I) != null && c3960dy2.f26433c0[0] == 1) || c3960dy2.f26433c0[0] == 4)) {
            AbstractC10822qn1.m24064b(c1465xh2, c3960dy2.f26434d.f41163h, c3960dy.f26454x.m4472c());
            AbstractC10822qn1.m24064b(c1465xh, c3960dy2.f26434d.f41164i, -this.f41157b.f26456z.m4472c());
            return;
        }
        if (c0775mj.f13660j) {
            C3960dy c3960dy7 = this.f41157b;
            if (c3960dy7.f26428a) {
                C0627Jx[] c0627JxArr = c3960dy7.f26407F;
                C0627Jx c0627Jx = c0627JxArr[0];
                C0627Jx c0627Jx2 = c0627Jx.f5809d;
                if (c0627Jx2 != null && c0627JxArr[1].f5809d != null) {
                    if (c3960dy7.m17794q()) {
                        c1465xh2.f13656f = this.f41157b.f26407F[0].m4472c();
                        c1465xh.f13656f = -this.f41157b.f26407F[1].m4472c();
                        return;
                    }
                    C1465XH c1465xhM24065h = AbstractC10822qn1.m24065h(this.f41157b.f26407F[0]);
                    if (c1465xhM24065h != null) {
                        AbstractC10822qn1.m24064b(c1465xh2, c1465xhM24065h, this.f41157b.f26407F[0].m4472c());
                    }
                    C1465XH c1465xhM24065h2 = AbstractC10822qn1.m24065h(this.f41157b.f26407F[1]);
                    if (c1465xhM24065h2 != null) {
                        AbstractC10822qn1.m24064b(c1465xh, c1465xhM24065h2, -this.f41157b.f26407F[1].m4472c());
                    }
                    c1465xh2.f13652b = true;
                    c1465xh.f13652b = true;
                    return;
                }
                if (c0627Jx2 != null) {
                    C1465XH c1465xhM24065h3 = AbstractC10822qn1.m24065h(c0627Jx);
                    if (c1465xhM24065h3 != null) {
                        AbstractC10822qn1.m24064b(c1465xh2, c1465xhM24065h3, this.f41157b.f26407F[0].m4472c());
                        AbstractC10822qn1.m24064b(c1465xh, c1465xh2, c0775mj.f13657g);
                        return;
                    }
                    return;
                }
                C0627Jx c0627Jx3 = c0627JxArr[1];
                if (c0627Jx3.f5809d != null) {
                    C1465XH c1465xhM24065h4 = AbstractC10822qn1.m24065h(c0627Jx3);
                    if (c1465xhM24065h4 != null) {
                        AbstractC10822qn1.m24064b(c1465xh, c1465xhM24065h4, -this.f41157b.f26407F[1].m4472c());
                        AbstractC10822qn1.m24064b(c1465xh2, c1465xh, -c0775mj.f13657g);
                        return;
                    }
                    return;
                }
                if ((c3960dy7 instanceof X20) || c3960dy7.f26410I == null || c3960dy7.mo17784g(7).f5809d != null) {
                    return;
                }
                C3960dy c3960dy8 = this.f41157b;
                AbstractC10822qn1.m24064b(c1465xh2, c3960dy8.f26410I.f26434d.f41163h, c3960dy8.m17790m());
                AbstractC10822qn1.m24064b(c1465xh, c1465xh2, c0775mj.f13657g);
                return;
            }
        }
        if (this.f41159d == 3) {
            C3960dy c3960dy9 = this.f41157b;
            int i2 = c3960dy9.f26440j;
            if (i2 == 2) {
                C3960dy c3960dy10 = c3960dy9.f26410I;
                if (c3960dy10 != null) {
                    C0775MJ c0775mj2 = c3960dy10.f26435e.f41160e;
                    c0775mj.f13662l.add(c0775mj2);
                    c0775mj2.f13661k.add(c0775mj);
                    c0775mj.f13652b = true;
                    c0775mj.f13661k.add(c1465xh2);
                    c0775mj.f13661k.add(c1465xh);
                }
            } else if (i2 == 3) {
                if (c3960dy9.f26441k == 3) {
                    c1465xh2.f13651a = this;
                    c1465xh.f13651a = this;
                    C7643Gi1 c7643Gi1 = c3960dy9.f26435e;
                    c7643Gi1.f41163h.f13651a = this;
                    c7643Gi1.f41164i.f13651a = this;
                    c0775mj.f13651a = this;
                    if (c3960dy9.m17795r()) {
                        c0775mj.f13662l.add(this.f41157b.f26435e.f41160e);
                        this.f41157b.f26435e.f41160e.f13661k.add(c0775mj);
                        C7643Gi1 c7643Gi12 = this.f41157b.f26435e;
                        c7643Gi12.f41160e.f13651a = this;
                        c0775mj.f13662l.add(c7643Gi12.f41163h);
                        c0775mj.f13662l.add(this.f41157b.f26435e.f41164i);
                        this.f41157b.f26435e.f41163h.f13661k.add(c0775mj);
                        this.f41157b.f26435e.f41164i.f13661k.add(c0775mj);
                    } else if (this.f41157b.m17794q()) {
                        this.f41157b.f26435e.f41160e.f13662l.add(c0775mj);
                        c0775mj.f13661k.add(this.f41157b.f26435e.f41160e);
                    } else {
                        this.f41157b.f26435e.f41160e.f13662l.add(c0775mj);
                    }
                } else {
                    C0775MJ c0775mj3 = c3960dy9.f26435e.f41160e;
                    c0775mj.f13662l.add(c0775mj3);
                    c0775mj3.f13661k.add(c0775mj);
                    this.f41157b.f26435e.f41163h.f13661k.add(c0775mj);
                    this.f41157b.f26435e.f41164i.f13661k.add(c0775mj);
                    c0775mj.f13652b = true;
                    c0775mj.f13661k.add(c1465xh2);
                    c0775mj.f13661k.add(c1465xh);
                    c1465xh2.f13662l.add(c0775mj);
                    c1465xh.f13662l.add(c0775mj);
                }
            }
        }
        C3960dy c3960dy11 = this.f41157b;
        C0627Jx[] c0627JxArr2 = c3960dy11.f26407F;
        C0627Jx c0627Jx4 = c0627JxArr2[0];
        C0627Jx c0627Jx5 = c0627Jx4.f5809d;
        if (c0627Jx5 != null && c0627JxArr2[1].f5809d != null) {
            if (c3960dy11.m17794q()) {
                c1465xh2.f13656f = this.f41157b.f26407F[0].m4472c();
                c1465xh.f13656f = -this.f41157b.f26407F[1].m4472c();
                return;
            }
            C1465XH c1465xhM24065h5 = AbstractC10822qn1.m24065h(this.f41157b.f26407F[0]);
            C1465XH c1465xhM24065h6 = AbstractC10822qn1.m24065h(this.f41157b.f26407F[1]);
            c1465xhM24065h5.m8962b(this);
            c1465xhM24065h6.m8962b(this);
            this.f41165j = 4;
            return;
        }
        if (c0627Jx5 != null) {
            C1465XH c1465xhM24065h7 = AbstractC10822qn1.m24065h(c0627Jx4);
            if (c1465xhM24065h7 != null) {
                AbstractC10822qn1.m24064b(c1465xh2, c1465xhM24065h7, this.f41157b.f26407F[0].m4472c());
                m24067c(c1465xh, c1465xh2, 1, c0775mj);
                return;
            }
            return;
        }
        C0627Jx c0627Jx6 = c0627JxArr2[1];
        if (c0627Jx6.f5809d != null) {
            C1465XH c1465xhM24065h8 = AbstractC10822qn1.m24065h(c0627Jx6);
            if (c1465xhM24065h8 != null) {
                AbstractC10822qn1.m24064b(c1465xh, c1465xhM24065h8, -this.f41157b.f26407F[1].m4472c());
                m24067c(c1465xh2, c1465xh, -1, c0775mj);
                return;
            }
            return;
        }
        if ((c3960dy11 instanceof X20) || (c3960dy3 = c3960dy11.f26410I) == null) {
            return;
        }
        AbstractC10822qn1.m24064b(c1465xh2, c3960dy3.f26434d.f41163h, c3960dy11.m17790m());
        m24067c(c1465xh, c1465xh2, 1, c0775mj);
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: e */
    public final void mo3128e() {
        C1465XH c1465xh = this.f41163h;
        if (c1465xh.f13660j) {
            this.f41157b.f26415N = c1465xh.f13657g;
        }
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: f */
    public final void mo3129f() {
        this.f41158c = null;
        this.f41163h.m8963c();
        this.f41164i.m8963c();
        this.f41160e.m8963c();
        this.f41162g = false;
    }

    @Override // p000.AbstractC10822qn1
    /* renamed from: k */
    public final boolean mo3130k() {
        return this.f41159d != 3 || this.f41157b.f26440j == 0;
    }

    /* renamed from: n */
    public final void m5252n() {
        this.f41162g = false;
        C1465XH c1465xh = this.f41163h;
        c1465xh.m8963c();
        c1465xh.f13660j = false;
        C1465XH c1465xh2 = this.f41164i;
        c1465xh2.m8963c();
        c1465xh2.f13660j = false;
        this.f41160e.f13660j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f41157b.f26424W;
    }
}
