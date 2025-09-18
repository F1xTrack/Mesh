package defpackage;

import java.util.ArrayList;

/* renamed from: h20 */
/* loaded from: classes.dex */
public final class C4077h20 extends C3488dy {
    public float d0 = -1.0f;
    public int e0 = -1;
    public int f0 = -1;
    public C0791Jx g0 = this.y;
    public int h0 = 0;

    public C4077h20() {
        this.G.clear();
        this.G.add(this.g0);
        int length = this.F.length;
        for (int i = 0; i < length; i++) {
            this.F[i] = this.g0;
        }
    }

    @Override // defpackage.C3488dy
    public final void A(C2569cj0 c2569cj0) {
        if (this.I == null) {
            return;
        }
        C0791Jx c0791Jx = this.g0;
        c2569cj0.getClass();
        int iM = C2569cj0.m(c0791Jx);
        if (this.h0 == 1) {
            this.N = iM;
            this.O = 0;
            v(this.I.i());
            y(0);
            return;
        }
        this.N = 0;
        this.O = iM;
        y(this.I.l());
        v(0);
    }

    public final void B(int i) {
        if (this.h0 == i) {
            return;
        }
        this.h0 = i;
        ArrayList arrayList = this.G;
        arrayList.clear();
        if (this.h0 == 1) {
            this.g0 = this.x;
        } else {
            this.g0 = this.y;
        }
        arrayList.add(this.g0);
        C0791Jx[] c0791JxArr = this.F;
        int length = c0791JxArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0791JxArr[i2] = this.g0;
        }
    }

    @Override // defpackage.C3488dy
    public final void a(C2569cj0 c2569cj0) {
        C3679ey c3679ey = (C3679ey) this.I;
        if (c3679ey == null) {
            return;
        }
        C0791Jx c0791JxG = c3679ey.g(2);
        C0791Jx c0791JxG2 = c3679ey.g(4);
        C3488dy c3488dy = this.I;
        boolean z = c3488dy != null && c3488dy.c0[0] == 2;
        if (this.h0 == 0) {
            c0791JxG = c3679ey.g(3);
            c0791JxG2 = c3679ey.g(5);
            C3488dy c3488dy2 = this.I;
            z = c3488dy2 != null && c3488dy2.c0[1] == 2;
        }
        if (this.e0 != -1) {
            P21 p21J = c2569cj0.j(this.g0);
            c2569cj0.e(p21J, c2569cj0.j(c0791JxG), this.e0, 8);
            if (z) {
                c2569cj0.f(c2569cj0.j(c0791JxG2), p21J, 0, 5);
                return;
            }
            return;
        }
        if (this.f0 != -1) {
            P21 p21J2 = c2569cj0.j(this.g0);
            P21 p21J3 = c2569cj0.j(c0791JxG2);
            c2569cj0.e(p21J2, p21J3, -this.f0, 8);
            if (z) {
                c2569cj0.f(p21J2, c2569cj0.j(c0791JxG), 0, 5);
                c2569cj0.f(p21J3, p21J2, 0, 5);
                return;
            }
            return;
        }
        if (this.d0 != -1.0f) {
            P21 p21J4 = c2569cj0.j(this.g0);
            P21 p21J5 = c2569cj0.j(c0791JxG2);
            float f = this.d0;
            B8 b8K = c2569cj0.k();
            b8K.d.k(p21J4, -1.0f);
            b8K.d.k(p21J5, f);
            c2569cj0.c(b8K);
        }
    }

    @Override // defpackage.C3488dy
    public final boolean b() {
        return true;
    }

    @Override // defpackage.C3488dy
    public final C0791Jx g(int i) {
        switch (AbstractC8235ym.x(i)) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
            case 3:
                if (this.h0 == 1) {
                    return this.g0;
                }
                break;
            case 2:
            case 4:
                if (this.h0 == 0) {
                    return this.g0;
                }
                break;
        }
        throw new AssertionError(AbstractC1705Vq.s(i));
    }
}
