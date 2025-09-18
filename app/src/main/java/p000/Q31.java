package p000;

import java.util.AbstractList;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Q31 implements InterfaceC11973zp0, InterfaceC9383fY0 {

    /* renamed from: a */
    public final X11 f9446a;

    /* renamed from: b */
    public final InterfaceC9648hc1 f9447b;

    /* renamed from: c */
    public final InterfaceC10687pk0 f9448c;

    /* renamed from: d */
    public final InterfaceC1091RL f9449d;

    /* renamed from: e */
    public final C22 f9450e;

    /* renamed from: f */
    public final C0903OL f9451f;

    /* renamed from: g */
    public final C3979eG f9452g;

    /* renamed from: h */
    public final C1356VY f9453h;

    /* renamed from: i */
    public final C6224jE f9454i;

    /* renamed from: j */
    public final C8201Rb1 f9455j;

    /* renamed from: k */
    public final C6914tt f9456k;

    /* renamed from: l */
    public InterfaceC11846yp0 f9457l;

    /* renamed from: m */
    public J31 f9458m;

    /* renamed from: n */
    public C1375Vr[] f9459n;

    /* renamed from: o */
    public C1568Yv f9460o;

    public Q31(J31 j31, X11 x11, InterfaceC9648hc1 interfaceC9648hc1, C6914tt c6914tt, C22 c22, InterfaceC1091RL interfaceC1091RL, C0903OL c0903ol, C3979eG c3979eG, C1356VY c1356vy, InterfaceC10687pk0 interfaceC10687pk0, C6224jE c6224jE) {
        this.f9458m = j31;
        this.f9446a = x11;
        this.f9447b = interfaceC9648hc1;
        this.f9448c = interfaceC10687pk0;
        this.f9450e = c22;
        this.f9449d = interfaceC1091RL;
        this.f9451f = c0903ol;
        this.f9452g = c3979eG;
        this.f9453h = c1356vy;
        this.f9454i = c6224jE;
        this.f9456k = c6914tt;
        C8149Qb1[] c8149Qb1Arr = new C8149Qb1[j31.f5301f.length];
        int i = 0;
        while (true) {
            I31[] i31Arr = j31.f5301f;
            if (i >= i31Arr.length) {
                this.f9455j = new C8201Rb1(c8149Qb1Arr);
                this.f9459n = new C1375Vr[0];
                c6914tt.getClass();
                N70 n70 = P70.f8867b;
                C9367fQ0 c9367fQ0 = C9367fQ0.f27184e;
                this.f9460o = new C1568Yv(c9367fQ0, c9367fQ0);
                return;
            }
            C6686qX[] c6686qXArr = i31Arr[i].f4683j;
            C6686qX[] c6686qXArr2 = new C6686qX[c6686qXArr.length];
            for (int i2 = 0; i2 < c6686qXArr.length; i2++) {
                C6686qX c6686qX = c6686qXArr[i2];
                C6623pX c6623pXM24020a = c6686qX.m24020a();
                c6623pXM24020a.f40149I = interfaceC1091RL.mo6999j(c6686qX);
                C6686qX c6686qX2 = new C6686qX(c6623pXM24020a);
                if (x11.f13487b && ((C7408Bv0) x11.f13489d).mo911b(c6686qX2)) {
                    C6623pX c6623pXM24020a2 = c6686qX2.m24020a();
                    c6623pXM24020a2.f40161l = AbstractC8544Xr0.m9171n("application/x-media3-cues");
                    c6623pXM24020a2.f40146F = ((C7408Bv0) x11.f13489d).mo917h(c6686qX2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(c6686qX2.f40974m);
                    String str = c6686qX2.f40971j;
                    sb.append(str != null ? " ".concat(str) : "");
                    c6623pXM24020a2.f40158i = sb.toString();
                    c6623pXM24020a2.f40166q = Long.MAX_VALUE;
                    c6686qX2 = new C6686qX(c6623pXM24020a2);
                }
                c6686qXArr2[i2] = c6686qX2;
            }
            c8149Qb1Arr[i] = new C8149Qb1(Integer.toString(i), c6686qXArr2);
            i++;
        }
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: b */
    public final long mo1877b(long j, DX0 dx0) {
        for (C1375Vr c1375Vr : this.f9459n) {
            if (c1375Vr.f12802a == 2) {
                return c1375Vr.f12806e.mo2564b(j, dx0);
            }
        }
        return j;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: d */
    public final long mo1879d(InterfaceC6237jR[] interfaceC6237jRArr, boolean[] zArr, InterfaceC9121dV0[] interfaceC9121dV0Arr, boolean[] zArr2, long j) {
        int i;
        InterfaceC6237jR interfaceC6237jR;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < interfaceC6237jRArr.length) {
            InterfaceC9121dV0 interfaceC9121dV0 = interfaceC9121dV0Arr[i2];
            if (interfaceC9121dV0 != null) {
                C1375Vr c1375Vr = (C1375Vr) interfaceC9121dV0;
                InterfaceC6237jR interfaceC6237jR2 = interfaceC6237jRArr[i2];
                if (interfaceC6237jR2 == null || !zArr[i2]) {
                    c1375Vr.m8603A(null);
                    interfaceC9121dV0Arr[i2] = null;
                } else {
                    ((C0332FG) c1375Vr.f12806e).f3129f = interfaceC6237jR2;
                    arrayList.add(c1375Vr);
                }
            }
            if (interfaceC9121dV0Arr[i2] != null || (interfaceC6237jR = interfaceC6237jRArr[i2]) == null) {
                i = i2;
            } else {
                int iM7047b = this.f9455j.m7047b(interfaceC6237jR.mo2724d());
                J31 j31 = this.f9458m;
                X11 x11 = this.f9446a;
                InterfaceC1586ZC interfaceC1586ZCMo506s0 = ((InterfaceC1397WC) x11.f13488c).mo506s0();
                InterfaceC9648hc1 interfaceC9648hc1 = this.f9447b;
                if (interfaceC9648hc1 != null) {
                    interfaceC1586ZCMo506s0.mo5255d(interfaceC9648hc1);
                }
                i = i2;
                C1375Vr c1375Vr2 = new C1375Vr(this.f9458m.f5301f[iM7047b].f4674a, null, null, new C0332FG(this.f9448c, j31, iM7047b, interfaceC6237jR, interfaceC1586ZCMo506s0, this.f9450e, (C7408Bv0) x11.f13489d, x11.f13487b), this, this.f9454i, j, this.f9449d, this.f9451f, this.f9452g, this.f9453h);
                arrayList.add(c1375Vr2);
                interfaceC9121dV0Arr[i] = c1375Vr2;
                zArr2[i] = true;
            }
            i2 = i + 1;
        }
        C1375Vr[] c1375VrArr = new C1375Vr[arrayList.size()];
        this.f9459n = c1375VrArr;
        arrayList.toArray(c1375VrArr);
        AbstractList abstractListM24577b = AbstractC10978s10.m24577b(arrayList, new C7754Im0(21));
        this.f9456k.getClass();
        this.f9460o = new C1568Yv(arrayList, abstractListM24577b);
        return j;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: e */
    public final long mo1880e() {
        return this.f9460o.mo1880e();
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: g */
    public final void mo1881g() {
        this.f9448c.mo858a();
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: h */
    public final long mo1882h(long j) {
        for (C1375Vr c1375Vr : this.f9459n) {
            c1375Vr.m8604B(j);
        }
        return j;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: i */
    public final void mo1883i(long j) {
        for (C1375Vr c1375Vr : this.f9459n) {
            c1375Vr.m8605i(j);
        }
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: l */
    public final boolean mo1884l() {
        return this.f9460o.mo1884l();
    }

    @Override // p000.InterfaceC9383fY0
    /* renamed from: m */
    public final void mo1885m(InterfaceC9511gY0 interfaceC9511gY0) {
        InterfaceC11846yp0 interfaceC11846yp0 = this.f9457l;
        interfaceC11846yp0.getClass();
        interfaceC11846yp0.mo1885m(this);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: n */
    public final long mo1886n() {
        return -9223372036854775807L;
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: o */
    public final void mo1887o(InterfaceC11846yp0 interfaceC11846yp0, long j) {
        this.f9457l = interfaceC11846yp0;
        interfaceC11846yp0.mo1876a(this);
    }

    @Override // p000.InterfaceC11973zp0
    /* renamed from: q */
    public final C8201Rb1 mo1888q() {
        return this.f9455j;
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: r */
    public final boolean mo1889r(C11455vk0 c11455vk0) {
        return this.f9460o.mo1889r(c11455vk0);
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: s */
    public final long mo1890s() {
        return this.f9460o.mo1890s();
    }

    @Override // p000.InterfaceC9511gY0
    /* renamed from: t */
    public final void mo1891t(long j) {
        this.f9460o.mo1891t(j);
    }
}
