package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: ey */
/* loaded from: classes.dex */
public final class C3679ey extends C3488dy {
    public ArrayList d0 = new ArrayList();
    public final C6846rT1 e0 = new C6846rT1(this);
    public final WH f0;
    public C1258Px g0;
    public boolean h0;
    public final C2569cj0 i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public C2211ar[] n0;
    public C2211ar[] o0;
    public int p0;
    public boolean q0;
    public boolean r0;

    public C3679ey() {
        WH wh = new WH();
        wh.b = true;
        wh.c = true;
        wh.e = new ArrayList();
        new ArrayList();
        wh.f = null;
        wh.g = new C1285Qg();
        wh.h = new ArrayList();
        wh.a = this;
        wh.d = this;
        this.f0 = wh;
        this.g0 = null;
        this.h0 = false;
        this.i0 = new C2569cj0();
        this.l0 = 0;
        this.m0 = 0;
        this.n0 = new C2211ar[4];
        this.o0 = new C2211ar[4];
        this.p0 = 263;
        this.q0 = false;
        this.r0 = false;
    }

    public final void B(C3488dy c3488dy, int i) {
        if (i == 0) {
            int i2 = this.l0 + 1;
            C2211ar[] c2211arArr = this.o0;
            if (i2 >= c2211arArr.length) {
                this.o0 = (C2211ar[]) Arrays.copyOf(c2211arArr, c2211arArr.length * 2);
            }
            C2211ar[] c2211arArr2 = this.o0;
            int i3 = this.l0;
            c2211arArr2[i3] = new C2211ar(c3488dy, 0, this.h0);
            this.l0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.m0 + 1;
            C2211ar[] c2211arArr3 = this.n0;
            if (i4 >= c2211arArr3.length) {
                this.n0 = (C2211ar[]) Arrays.copyOf(c2211arArr3, c2211arArr3.length * 2);
            }
            C2211ar[] c2211arArr4 = this.n0;
            int i5 = this.m0;
            c2211arArr4[i5] = new C2211ar(c3488dy, 1, this.h0);
            this.m0 = i5 + 1;
        }
    }

    public final void C(C2569cj0 c2569cj0) {
        a(c2569cj0);
        int size = this.d0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C3488dy c3488dy = (C3488dy) this.d0.get(i);
            boolean[] zArr = c3488dy.H;
            zArr[0] = false;
            zArr[1] = false;
            if (c3488dy instanceof C0737Jf) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C3488dy c3488dy2 = (C3488dy) this.d0.get(i2);
                if (c3488dy2 instanceof C0737Jf) {
                    C0737Jf c0737Jf = (C0737Jf) c3488dy2;
                    for (int i3 = 0; i3 < c0737Jf.e0; i3++) {
                        C3488dy c3488dy3 = c0737Jf.d0[i3];
                        int i4 = c0737Jf.f0;
                        if (i4 == 0 || i4 == 1) {
                            c3488dy3.H[0] = true;
                        } else if (i4 == 2 || i4 == 3) {
                            c3488dy3.H[1] = true;
                        }
                    }
                }
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            C3488dy c3488dy4 = (C3488dy) this.d0.get(i5);
            c3488dy4.getClass();
            if ((c3488dy4 instanceof C6663qW) || (c3488dy4 instanceof C4077h20)) {
                c3488dy4.a(c2569cj0);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            C3488dy c3488dy5 = (C3488dy) this.d0.get(i6);
            if (c3488dy5 instanceof C3679ey) {
                int[] iArr = c3488dy5.c0;
                int i7 = iArr[0];
                int i8 = iArr[1];
                if (i7 == 2) {
                    c3488dy5.w(1);
                }
                if (i8 == 2) {
                    c3488dy5.x(1);
                }
                c3488dy5.a(c2569cj0);
                if (i7 == 2) {
                    c3488dy5.w(i7);
                }
                if (i8 == 2) {
                    c3488dy5.x(i8);
                }
            } else {
                c3488dy5.h = -1;
                c3488dy5.i = -1;
                int[] iArr2 = this.c0;
                int i9 = iArr2[0];
                int[] iArr3 = c3488dy5.c0;
                if (i9 != 2 && iArr3[0] == 4) {
                    C0791Jx c0791Jx = c3488dy5.x;
                    int i10 = c0791Jx.e;
                    int iL = l();
                    C0791Jx c0791Jx2 = c3488dy5.z;
                    int i11 = iL - c0791Jx2.e;
                    c0791Jx.g = c2569cj0.j(c0791Jx);
                    c0791Jx2.g = c2569cj0.j(c0791Jx2);
                    c2569cj0.d(c0791Jx.g, i10);
                    c2569cj0.d(c0791Jx2.g, i11);
                    c3488dy5.h = 2;
                    c3488dy5.N = i10;
                    int i12 = i11 - i10;
                    c3488dy5.J = i12;
                    int i13 = c3488dy5.Q;
                    if (i12 < i13) {
                        c3488dy5.J = i13;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    C0791Jx c0791Jx3 = c3488dy5.y;
                    int i14 = c0791Jx3.e;
                    int i15 = i();
                    C0791Jx c0791Jx4 = c3488dy5.A;
                    int i16 = i15 - c0791Jx4.e;
                    c0791Jx3.g = c2569cj0.j(c0791Jx3);
                    c0791Jx4.g = c2569cj0.j(c0791Jx4);
                    c2569cj0.d(c0791Jx3.g, i14);
                    c2569cj0.d(c0791Jx4.g, i16);
                    if (c3488dy5.P > 0 || c3488dy5.V == 8) {
                        C0791Jx c0791Jx5 = c3488dy5.B;
                        P21 p21J = c2569cj0.j(c0791Jx5);
                        c0791Jx5.g = p21J;
                        c2569cj0.d(p21J, c3488dy5.P + i14);
                    }
                    c3488dy5.i = 2;
                    c3488dy5.O = i14;
                    int i17 = i16 - i14;
                    c3488dy5.K = i17;
                    int i18 = c3488dy5.R;
                    if (i17 < i18) {
                        c3488dy5.K = i18;
                    }
                }
                if (!(c3488dy5 instanceof C6663qW) && !(c3488dy5 instanceof C4077h20)) {
                    c3488dy5.a(c2569cj0);
                }
            }
        }
        if (this.l0 > 0) {
            AbstractC7987xS1.a(this, c2569cj0, 0);
        }
        if (this.m0 > 0) {
            AbstractC7987xS1.a(this, c2569cj0, 1);
        }
    }

    public final boolean D(int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        WH wh = this.f0;
        C3679ey c3679ey = wh.a;
        int iH = c3679ey.h(0);
        int iH2 = c3679ey.h(1);
        int iM = c3679ey.m();
        int iN = c3679ey.n();
        ArrayList arrayList = wh.e;
        C0514Gi1 c0514Gi1 = c3679ey.e;
        M30 m30 = c3679ey.d;
        if (z && (iH == 2 || iH2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z5 = z;
                    break;
                }
                AbstractC6716qn1 abstractC6716qn1 = (AbstractC6716qn1) it.next();
                if (abstractC6716qn1.f == i && !abstractC6716qn1.k()) {
                    z5 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z5 && iH == 2) {
                    c3679ey.w(1);
                    c3679ey.y(wh.d(c3679ey, 0));
                    m30.e.d(c3679ey.l());
                }
            } else if (z5 && iH2 == 2) {
                c3679ey.x(1);
                c3679ey.v(wh.d(c3679ey, 1));
                c0514Gi1.e.d(c3679ey.i());
            }
        }
        int[] iArr = c3679ey.c0;
        if (i == 0) {
            z2 = false;
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iL = c3679ey.l() + iM;
                m30.i.d(iL);
                m30.e.d(iL - iM);
                z3 = true;
            }
            z3 = z2;
        } else {
            z2 = false;
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int i4 = c3679ey.i() + iN;
                c0514Gi1.i.d(i4);
                c0514Gi1.e.d(i4 - iN);
                z3 = true;
            }
            z3 = z2;
        }
        wh.g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC6716qn1 abstractC6716qn12 = (AbstractC6716qn1) it2.next();
            if (abstractC6716qn12.f == i && (abstractC6716qn12.b != c3679ey || abstractC6716qn12.g)) {
                abstractC6716qn12.e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC6716qn1 abstractC6716qn13 = (AbstractC6716qn1) it3.next();
            if (abstractC6716qn13.f == i && (z3 || abstractC6716qn13.b != c3679ey)) {
                if (!abstractC6716qn13.h.j || !abstractC6716qn13.i.j || (!(abstractC6716qn13 instanceof C2402br) && !abstractC6716qn13.e.j)) {
                    z4 = z2;
                    break;
                }
            }
        }
        z4 = true;
        c3679ey.w(iH);
        c3679ey.x(iH2);
        return z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x01f1  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void E() {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3679ey.E():void");
    }

    @Override // defpackage.C3488dy
    public final void s() {
        this.i0.r();
        this.j0 = 0;
        this.k0 = 0;
        this.d0.clear();
        super.s();
    }

    @Override // defpackage.C3488dy
    public final void u(T71 t71) {
        super.u(t71);
        int size = this.d0.size();
        for (int i = 0; i < size; i++) {
            ((C3488dy) this.d0.get(i)).u(t71);
        }
    }

    @Override // defpackage.C3488dy
    public final void z(boolean z, boolean z2) {
        super.z(z, z2);
        int size = this.d0.size();
        for (int i = 0; i < size; i++) {
            ((C3488dy) this.d0.get(i)).z(z, z2);
        }
    }
}
