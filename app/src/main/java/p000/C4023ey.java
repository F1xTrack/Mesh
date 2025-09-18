package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: ey */
/* loaded from: classes.dex */
public final class C4023ey extends C3960dy {

    /* renamed from: d0 */
    public ArrayList f26968d0 = new ArrayList();

    /* renamed from: e0 */
    public final C10910rT1 f26969e0 = new C10910rT1(this);

    /* renamed from: f0 */
    public final C1402WH f26970f0;

    /* renamed from: g0 */
    public C1004Px f26971g0;

    /* renamed from: h0 */
    public boolean f26972h0;

    /* renamed from: i0 */
    public final C9016cj0 f26973i0;

    /* renamed from: j0 */
    public int f26974j0;

    /* renamed from: k0 */
    public int f26975k0;

    /* renamed from: l0 */
    public int f26976l0;

    /* renamed from: m0 */
    public int f26977m0;

    /* renamed from: n0 */
    public C1748ar[] f26978n0;

    /* renamed from: o0 */
    public C1748ar[] f26979o0;

    /* renamed from: p0 */
    public int f26980p0;

    /* renamed from: q0 */
    public boolean f26981q0;

    /* renamed from: r0 */
    public boolean f26982r0;

    public C4023ey() {
        C1402WH c1402wh = new C1402WH();
        c1402wh.f13110b = true;
        c1402wh.f13111c = true;
        c1402wh.f13113e = new ArrayList();
        new ArrayList();
        c1402wh.f13114f = null;
        c1402wh.f13115g = new C1050Qg();
        c1402wh.f13116h = new ArrayList();
        c1402wh.f13109a = this;
        c1402wh.f13112d = this;
        this.f26970f0 = c1402wh;
        this.f26971g0 = null;
        this.f26972h0 = false;
        this.f26973i0 = new C9016cj0();
        this.f26976l0 = 0;
        this.f26977m0 = 0;
        this.f26978n0 = new C1748ar[4];
        this.f26979o0 = new C1748ar[4];
        this.f26980p0 = 263;
        this.f26981q0 = false;
        this.f26982r0 = false;
    }

    /* renamed from: B */
    public final void m18107B(C3960dy c3960dy, int i) {
        if (i == 0) {
            int i2 = this.f26976l0 + 1;
            C1748ar[] c1748arArr = this.f26979o0;
            if (i2 >= c1748arArr.length) {
                this.f26979o0 = (C1748ar[]) Arrays.copyOf(c1748arArr, c1748arArr.length * 2);
            }
            C1748ar[] c1748arArr2 = this.f26979o0;
            int i3 = this.f26976l0;
            c1748arArr2[i3] = new C1748ar(c3960dy, 0, this.f26972h0);
            this.f26976l0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f26977m0 + 1;
            C1748ar[] c1748arArr3 = this.f26978n0;
            if (i4 >= c1748arArr3.length) {
                this.f26978n0 = (C1748ar[]) Arrays.copyOf(c1748arArr3, c1748arArr3.length * 2);
            }
            C1748ar[] c1748arArr4 = this.f26978n0;
            int i5 = this.f26977m0;
            c1748arArr4[i5] = new C1748ar(c3960dy, 1, this.f26972h0);
            this.f26977m0 = i5 + 1;
        }
    }

    /* renamed from: C */
    public final void m18108C(C9016cj0 c9016cj0) {
        mo4383a(c9016cj0);
        int size = this.f26968d0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C3960dy c3960dy = (C3960dy) this.f26968d0.get(i);
            boolean[] zArr = c3960dy.f26409H;
            zArr[0] = false;
            zArr[1] = false;
            if (c3960dy instanceof C0609Jf) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C3960dy c3960dy2 = (C3960dy) this.f26968d0.get(i2);
                if (c3960dy2 instanceof C0609Jf) {
                    C0609Jf c0609Jf = (C0609Jf) c3960dy2;
                    for (int i3 = 0; i3 < c0609Jf.f13525e0; i3++) {
                        C3960dy c3960dy3 = c0609Jf.f13524d0[i3];
                        int i4 = c0609Jf.f5662f0;
                        if (i4 == 0 || i4 == 1) {
                            c3960dy3.f26409H[0] = true;
                        } else if (i4 == 2 || i4 == 3) {
                            c3960dy3.f26409H[1] = true;
                        }
                    }
                }
            }
        }
        for (int i5 = 0; i5 < size; i5++) {
            C3960dy c3960dy4 = (C3960dy) this.f26968d0.get(i5);
            c3960dy4.getClass();
            if ((c3960dy4 instanceof C6685qW) || (c3960dy4 instanceof C9573h20)) {
                c3960dy4.mo4383a(c9016cj0);
            }
        }
        for (int i6 = 0; i6 < size; i6++) {
            C3960dy c3960dy5 = (C3960dy) this.f26968d0.get(i6);
            if (c3960dy5 instanceof C4023ey) {
                int[] iArr = c3960dy5.f26433c0;
                int i7 = iArr[0];
                int i8 = iArr[1];
                if (i7 == 2) {
                    c3960dy5.m17800w(1);
                }
                if (i8 == 2) {
                    c3960dy5.m17801x(1);
                }
                c3960dy5.mo4383a(c9016cj0);
                if (i7 == 2) {
                    c3960dy5.m17800w(i7);
                }
                if (i8 == 2) {
                    c3960dy5.m17801x(i8);
                }
            } else {
                c3960dy5.f26438h = -1;
                c3960dy5.f26439i = -1;
                int[] iArr2 = this.f26433c0;
                int i9 = iArr2[0];
                int[] iArr3 = c3960dy5.f26433c0;
                if (i9 != 2 && iArr3[0] == 4) {
                    C0627Jx c0627Jx = c3960dy5.f26454x;
                    int i10 = c0627Jx.f5810e;
                    int iM17789l = m17789l();
                    C0627Jx c0627Jx2 = c3960dy5.f26456z;
                    int i11 = iM17789l - c0627Jx2.f5810e;
                    c0627Jx.f5812g = c9016cj0.m10844j(c0627Jx);
                    c0627Jx2.f5812g = c9016cj0.m10844j(c0627Jx2);
                    c9016cj0.m10838d(c0627Jx.f5812g, i10);
                    c9016cj0.m10838d(c0627Jx2.f5812g, i11);
                    c3960dy5.f26438h = 2;
                    c3960dy5.f26415N = i10;
                    int i12 = i11 - i10;
                    c3960dy5.f26411J = i12;
                    int i13 = c3960dy5.f26418Q;
                    if (i12 < i13) {
                        c3960dy5.f26411J = i13;
                    }
                }
                if (iArr2[1] != 2 && iArr3[1] == 4) {
                    C0627Jx c0627Jx3 = c3960dy5.f26455y;
                    int i14 = c0627Jx3.f5810e;
                    int iM17786i = m17786i();
                    C0627Jx c0627Jx4 = c3960dy5.f26402A;
                    int i15 = iM17786i - c0627Jx4.f5810e;
                    c0627Jx3.f5812g = c9016cj0.m10844j(c0627Jx3);
                    c0627Jx4.f5812g = c9016cj0.m10844j(c0627Jx4);
                    c9016cj0.m10838d(c0627Jx3.f5812g, i14);
                    c9016cj0.m10838d(c0627Jx4.f5812g, i15);
                    if (c3960dy5.f26417P > 0 || c3960dy5.f26423V == 8) {
                        C0627Jx c0627Jx5 = c3960dy5.f26403B;
                        P21 p21M10844j = c9016cj0.m10844j(c0627Jx5);
                        c0627Jx5.f5812g = p21M10844j;
                        c9016cj0.m10838d(p21M10844j, c3960dy5.f26417P + i14);
                    }
                    c3960dy5.f26439i = 2;
                    c3960dy5.f26416O = i14;
                    int i16 = i15 - i14;
                    c3960dy5.f26412K = i16;
                    int i17 = c3960dy5.f26419R;
                    if (i16 < i17) {
                        c3960dy5.f26412K = i17;
                    }
                }
                if (!(c3960dy5 instanceof C6685qW) && !(c3960dy5 instanceof C9573h20)) {
                    c3960dy5.mo4383a(c9016cj0);
                }
            }
        }
        if (this.f26976l0 > 0) {
            AbstractC11674xS1.m25894a(this, c9016cj0, 0);
        }
        if (this.f26977m0 > 0) {
            AbstractC11674xS1.m25894a(this, c9016cj0, 1);
        }
    }

    /* renamed from: D */
    public final boolean m18109D(int i, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C1402WH c1402wh = this.f26970f0;
        C4023ey c4023ey = c1402wh.f13109a;
        int iM17785h = c4023ey.m17785h(0);
        int iM17785h2 = c4023ey.m17785h(1);
        int iM17790m = c4023ey.m17790m();
        int iM17791n = c4023ey.m17791n();
        ArrayList arrayList = c1402wh.f13113e;
        C7643Gi1 c7643Gi1 = c4023ey.f26435e;
        M30 m30 = c4023ey.f26434d;
        if (z && (iM17785h == 2 || iM17785h2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z5 = z;
                    break;
                }
                AbstractC10822qn1 abstractC10822qn1 = (AbstractC10822qn1) it.next();
                if (abstractC10822qn1.f41161f == i && !abstractC10822qn1.mo3130k()) {
                    z5 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z5 && iM17785h == 2) {
                    c4023ey.m17800w(1);
                    c4023ey.m17802y(c1402wh.m8743d(c4023ey, 0));
                    m30.f41160e.mo5302d(c4023ey.m17789l());
                }
            } else if (z5 && iM17785h2 == 2) {
                c4023ey.m17801x(1);
                c4023ey.m17799v(c1402wh.m8743d(c4023ey, 1));
                c7643Gi1.f41160e.mo5302d(c4023ey.m17786i());
            }
        }
        int[] iArr = c4023ey.f26433c0;
        if (i == 0) {
            z2 = false;
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int iM17789l = c4023ey.m17789l() + iM17790m;
                m30.f41164i.mo5302d(iM17789l);
                m30.f41160e.mo5302d(iM17789l - iM17790m);
                z3 = true;
            }
            z3 = z2;
        } else {
            z2 = false;
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int iM17786i = c4023ey.m17786i() + iM17791n;
                c7643Gi1.f41164i.mo5302d(iM17786i);
                c7643Gi1.f41160e.mo5302d(iM17786i - iM17791n);
                z3 = true;
            }
            z3 = z2;
        }
        c1402wh.m8746g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC10822qn1 abstractC10822qn12 = (AbstractC10822qn1) it2.next();
            if (abstractC10822qn12.f41161f == i && (abstractC10822qn12.f41157b != c4023ey || abstractC10822qn12.f41162g)) {
                abstractC10822qn12.mo3128e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            AbstractC10822qn1 abstractC10822qn13 = (AbstractC10822qn1) it3.next();
            if (abstractC10822qn13.f41161f == i && (z3 || abstractC10822qn13.f41157b != c4023ey)) {
                if (!abstractC10822qn13.f41163h.f13660j || !abstractC10822qn13.f41164i.f13660j || (!(abstractC10822qn13 instanceof C1811br) && !abstractC10822qn13.f41160e.f13660j)) {
                    z4 = z2;
                    break;
                }
            }
        }
        z4 = true;
        c4023ey.m17800w(iM17785h);
        c4023ey.m17801x(iM17785h2);
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
    /* renamed from: E */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m18110E() {
        /*
            Method dump skipped, instructions count: 523
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C4023ey.m18110E():void");
    }

    @Override // p000.C3960dy
    /* renamed from: s */
    public final void mo17796s() {
        this.f26973i0.m10851r();
        this.f26974j0 = 0;
        this.f26975k0 = 0;
        this.f26968d0.clear();
        super.mo17796s();
    }

    @Override // p000.C3960dy
    /* renamed from: u */
    public final void mo17798u(T71 t71) {
        super.mo17798u(t71);
        int size = this.f26968d0.size();
        for (int i = 0; i < size; i++) {
            ((C3960dy) this.f26968d0.get(i)).mo17798u(t71);
        }
    }

    @Override // p000.C3960dy
    /* renamed from: z */
    public final void mo17803z(boolean z, boolean z2) {
        super.mo17803z(z, z2);
        int size = this.f26968d0.size();
        for (int i = 0; i < size; i++) {
            ((C3960dy) this.f26968d0.get(i)).mo17803z(z, z2);
        }
    }
}
