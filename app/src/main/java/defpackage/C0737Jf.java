package defpackage;

/* renamed from: Jf */
/* loaded from: classes.dex */
public final class C0737Jf extends X20 {
    public int f0;
    public boolean g0;
    public int h0;

    @Override // defpackage.C3488dy
    public final void a(C2569cj0 c2569cj0) {
        boolean z;
        int i;
        int i2;
        C0791Jx[] c0791JxArr = this.F;
        C0791Jx c0791Jx = this.x;
        c0791JxArr[0] = c0791Jx;
        C0791Jx c0791Jx2 = this.y;
        int i3 = 2;
        c0791JxArr[2] = c0791Jx2;
        C0791Jx c0791Jx3 = this.z;
        c0791JxArr[1] = c0791Jx3;
        C0791Jx c0791Jx4 = this.A;
        c0791JxArr[3] = c0791Jx4;
        for (C0791Jx c0791Jx5 : c0791JxArr) {
            c0791Jx5.g = c2569cj0.j(c0791Jx5);
        }
        int i4 = this.f0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0791Jx c0791Jx6 = c0791JxArr[i4];
        for (int i5 = 0; i5 < this.e0; i5++) {
            C3488dy c3488dy = this.d0[i5];
            if ((this.g0 || c3488dy.b()) && ((((i2 = this.f0) == 0 || i2 == 1) && c3488dy.c0[0] == 3 && c3488dy.x.d != null && c3488dy.z.d != null) || ((i2 == 2 || i2 == 3) && c3488dy.c0[1] == 3 && c3488dy.y.d != null && c3488dy.A.d != null))) {
                z = true;
                break;
            }
        }
        z = false;
        boolean z2 = c0791Jx.e() || c0791Jx3.e();
        boolean z3 = c0791Jx2.e() || c0791Jx4.e();
        int i6 = (z || !(((i = this.f0) == 0 && z2) || ((i == 2 && z3) || ((i == 1 && z2) || (i == 3 && z3))))) ? 4 : 5;
        int i7 = 0;
        while (i7 < this.e0) {
            C3488dy c3488dy2 = this.d0[i7];
            if (this.g0 || c3488dy2.b()) {
                P21 p21J = c2569cj0.j(c3488dy2.F[this.f0]);
                int i8 = this.f0;
                C0791Jx c0791Jx7 = c3488dy2.F[i8];
                c0791Jx7.g = p21J;
                C0791Jx c0791Jx8 = c0791Jx7.d;
                int i9 = (c0791Jx8 == null || c0791Jx8.b != this) ? 0 : c0791Jx7.e;
                if (i8 == 0 || i8 == i3) {
                    P21 p21 = c0791Jx6.g;
                    int i10 = this.h0 - i9;
                    B8 b8K = c2569cj0.k();
                    P21 p21L = c2569cj0.l();
                    p21L.d = 0;
                    b8K.c(p21, p21J, p21L, i10);
                    c2569cj0.c(b8K);
                } else {
                    P21 p212 = c0791Jx6.g;
                    int i11 = this.h0 + i9;
                    B8 b8K2 = c2569cj0.k();
                    P21 p21L2 = c2569cj0.l();
                    p21L2.d = 0;
                    b8K2.b(p212, p21J, p21L2, i11);
                    c2569cj0.c(b8K2);
                }
                c2569cj0.e(c0791Jx6.g, p21J, this.h0 + i9, i6);
            }
            i7++;
            i3 = 2;
        }
        int i12 = this.f0;
        if (i12 == 0) {
            c2569cj0.e(c0791Jx3.g, c0791Jx.g, 0, 8);
            c2569cj0.e(c0791Jx.g, this.I.z.g, 0, 4);
            c2569cj0.e(c0791Jx.g, this.I.x.g, 0, 0);
            return;
        }
        if (i12 == 1) {
            c2569cj0.e(c0791Jx.g, c0791Jx3.g, 0, 8);
            c2569cj0.e(c0791Jx.g, this.I.x.g, 0, 4);
            c2569cj0.e(c0791Jx.g, this.I.z.g, 0, 0);
        } else if (i12 == 2) {
            c2569cj0.e(c0791Jx4.g, c0791Jx2.g, 0, 8);
            c2569cj0.e(c0791Jx2.g, this.I.A.g, 0, 4);
            c2569cj0.e(c0791Jx2.g, this.I.y.g, 0, 0);
        } else if (i12 == 3) {
            c2569cj0.e(c0791Jx2.g, c0791Jx4.g, 0, 8);
            c2569cj0.e(c0791Jx2.g, this.I.y.g, 0, 4);
            c2569cj0.e(c0791Jx2.g, this.I.A.g, 0, 0);
        }
    }

    @Override // defpackage.C3488dy
    public final boolean b() {
        return true;
    }

    @Override // defpackage.C3488dy
    public final String toString() {
        String strL = AbstractC1705Vq.l(new StringBuilder("[Barrier] "), this.W, " {");
        for (int i = 0; i < this.e0; i++) {
            C3488dy c3488dy = this.d0[i];
            if (i > 0) {
                strL = AbstractC8235ym.i(strL, ", ");
            }
            StringBuilder sbO = AbstractC8235ym.o(strL);
            sbO.append(c3488dy.W);
            strL = sbO.toString();
        }
        return AbstractC8235ym.i(strL, "}");
    }
}
