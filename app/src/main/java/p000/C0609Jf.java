package p000;

/* renamed from: Jf */
/* loaded from: classes.dex */
public final class C0609Jf extends X20 {

    /* renamed from: f0 */
    public int f5662f0;

    /* renamed from: g0 */
    public boolean f5663g0;

    /* renamed from: h0 */
    public int f5664h0;

    @Override // p000.C3960dy
    /* renamed from: a */
    public final void mo4383a(C9016cj0 c9016cj0) {
        boolean z;
        int i;
        int i2;
        C0627Jx[] c0627JxArr = this.f26407F;
        C0627Jx c0627Jx = this.f26454x;
        c0627JxArr[0] = c0627Jx;
        C0627Jx c0627Jx2 = this.f26455y;
        int i3 = 2;
        c0627JxArr[2] = c0627Jx2;
        C0627Jx c0627Jx3 = this.f26456z;
        c0627JxArr[1] = c0627Jx3;
        C0627Jx c0627Jx4 = this.f26402A;
        c0627JxArr[3] = c0627Jx4;
        for (C0627Jx c0627Jx5 : c0627JxArr) {
            c0627Jx5.f5812g = c9016cj0.m10844j(c0627Jx5);
        }
        int i4 = this.f5662f0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0627Jx c0627Jx6 = c0627JxArr[i4];
        for (int i5 = 0; i5 < this.f13525e0; i5++) {
            C3960dy c3960dy = this.f13524d0[i5];
            if ((this.f5663g0 || c3960dy.mo4384b()) && ((((i2 = this.f5662f0) == 0 || i2 == 1) && c3960dy.f26433c0[0] == 3 && c3960dy.f26454x.f5809d != null && c3960dy.f26456z.f5809d != null) || ((i2 == 2 || i2 == 3) && c3960dy.f26433c0[1] == 3 && c3960dy.f26455y.f5809d != null && c3960dy.f26402A.f5809d != null))) {
                z = true;
                break;
            }
        }
        z = false;
        boolean z2 = c0627Jx.m4474e() || c0627Jx3.m4474e();
        boolean z3 = c0627Jx2.m4474e() || c0627Jx4.m4474e();
        int i6 = (z || !(((i = this.f5662f0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3))))) ? 4 : 5;
        int i7 = 0;
        while (i7 < this.f13525e0) {
            C3960dy c3960dy2 = this.f13524d0[i7];
            if (this.f5663g0 || c3960dy2.mo4384b()) {
                P21 p21M10844j = c9016cj0.m10844j(c3960dy2.f26407F[this.f5662f0]);
                int i8 = this.f5662f0;
                C0627Jx c0627Jx7 = c3960dy2.f26407F[i8];
                c0627Jx7.f5812g = p21M10844j;
                C0627Jx c0627Jx8 = c0627Jx7.f5809d;
                int i9 = (c0627Jx8 == null || c0627Jx8.f5807b != this) ? 0 : c0627Jx7.f5810e;
                if (i8 == 0 || i8 == i3) {
                    P21 p21 = c0627Jx6.f5812g;
                    int i10 = this.f5664h0 - i9;
                    C0072B8 c0072b8M10845k = c9016cj0.m10845k();
                    P21 p21M10846l = c9016cj0.m10846l();
                    p21M10846l.f8795d = 0;
                    c0072b8M10845k.m520c(p21, p21M10844j, p21M10846l, i10);
                    c9016cj0.m10837c(c0072b8M10845k);
                } else {
                    P21 p212 = c0627Jx6.f5812g;
                    int i11 = this.f5664h0 + i9;
                    C0072B8 c0072b8M10845k2 = c9016cj0.m10845k();
                    P21 p21M10846l2 = c9016cj0.m10846l();
                    p21M10846l2.f8795d = 0;
                    c0072b8M10845k2.m519b(p212, p21M10844j, p21M10846l2, i11);
                    c9016cj0.m10837c(c0072b8M10845k2);
                }
                c9016cj0.m10839e(c0627Jx6.f5812g, p21M10844j, this.f5664h0 + i9, i6);
            }
            i7++;
            i3 = 2;
        }
        int i12 = this.f5662f0;
        if (i12 == 0) {
            c9016cj0.m10839e(c0627Jx3.f5812g, c0627Jx.f5812g, 0, 8);
            c9016cj0.m10839e(c0627Jx.f5812g, this.f26410I.f26456z.f5812g, 0, 4);
            c9016cj0.m10839e(c0627Jx.f5812g, this.f26410I.f26454x.f5812g, 0, 0);
            return;
        }
        if (i12 == 1) {
            c9016cj0.m10839e(c0627Jx.f5812g, c0627Jx3.f5812g, 0, 8);
            c9016cj0.m10839e(c0627Jx.f5812g, this.f26410I.f26454x.f5812g, 0, 4);
            c9016cj0.m10839e(c0627Jx.f5812g, this.f26410I.f26456z.f5812g, 0, 0);
        } else if (i12 == 2) {
            c9016cj0.m10839e(c0627Jx4.f5812g, c0627Jx2.f5812g, 0, 8);
            c9016cj0.m10839e(c0627Jx2.f5812g, this.f26410I.f26402A.f5812g, 0, 4);
            c9016cj0.m10839e(c0627Jx2.f5812g, this.f26410I.f26455y.f5812g, 0, 0);
        } else if (i12 == 3) {
            c9016cj0.m10839e(c0627Jx2.f5812g, c0627Jx4.f5812g, 0, 8);
            c9016cj0.m10839e(c0627Jx2.f5812g, this.f26410I.f26455y.f5812g, 0, 4);
            c9016cj0.m10839e(c0627Jx2.f5812g, this.f26410I.f26402A.f5812g, 0, 0);
        }
    }

    @Override // p000.C3960dy
    /* renamed from: b */
    public final boolean mo4384b() {
        return true;
    }

    @Override // p000.C3960dy
    public final String toString() {
        String strM8593l = AbstractC1374Vq.m8593l(new StringBuilder("[Barrier] "), this.f26424W, " {");
        for (int i = 0; i < this.f13525e0; i++) {
            C3960dy c3960dy = this.f13524d0[i];
            if (i > 0) {
                strM8593l = AbstractC7222ym.m26232i(strM8593l, ", ");
            }
            StringBuilder sbM26238o = AbstractC7222ym.m26238o(strM8593l);
            sbM26238o.append(c3960dy.f26424W);
            strM8593l = sbM26238o.toString();
        }
        return AbstractC7222ym.m26232i(strM8593l, "}");
    }
}
