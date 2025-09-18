package p000;

import java.util.Arrays;

/* renamed from: cj0 */
/* loaded from: classes.dex */
public final class C9016cj0 {

    /* renamed from: o */
    public static int f17697o = 1000;

    /* renamed from: p */
    public static boolean f17698p = true;

    /* renamed from: b */
    public final C11643xD0 f17700b;

    /* renamed from: e */
    public C0072B8[] f17703e;

    /* renamed from: k */
    public final T71 f17709k;

    /* renamed from: n */
    public C0072B8 f17712n;

    /* renamed from: a */
    public int f17699a = 0;

    /* renamed from: c */
    public int f17701c = 32;

    /* renamed from: d */
    public int f17702d = 32;

    /* renamed from: f */
    public boolean f17704f = false;

    /* renamed from: g */
    public boolean[] f17705g = new boolean[32];

    /* renamed from: h */
    public int f17706h = 1;

    /* renamed from: i */
    public int f17707i = 0;

    /* renamed from: j */
    public int f17708j = 32;

    /* renamed from: l */
    public P21[] f17710l = new P21[f17697o];

    /* renamed from: m */
    public int f17711m = 0;

    public C9016cj0() {
        this.f17703e = null;
        this.f17703e = new C0072B8[32];
        m10850q();
        T71 t71 = new T71();
        t71.f11173a = new C0986Pf(16, (byte) 0);
        t71.f11174b = new C0986Pf(16, (byte) 0);
        t71.f11175c = new C0986Pf(16, (byte) 0);
        t71.f11176d = new P21[32];
        this.f17709k = t71;
        C11643xD0 c11643xD0 = new C11643xD0(t71);
        c11643xD0.f45479f = new P21[128];
        c11643xD0.f45480g = new P21[128];
        c11643xD0.f45481h = 0;
        c11643xD0.f45482i = new C11516wD0(c11643xD0);
        this.f17700b = c11643xD0;
        if (f17698p) {
            this.f17712n = new C8888bj0(t71);
        } else {
            this.f17712n = new C0072B8(t71);
        }
    }

    /* renamed from: m */
    public static int m10834m(Object obj) {
        P21 p21 = ((C0627Jx) obj).f5812g;
        if (p21 != null) {
            return (int) (p21.f8796e + 0.5f);
        }
        return 0;
    }

    /* renamed from: a */
    public final P21 m10835a(int i) {
        P21 p21 = (P21) ((C0986Pf) this.f17709k.f11175c).m6393b();
        if (p21 == null) {
            p21 = new P21(i);
            p21.f8803l = i;
        } else {
            p21.m6210c();
            p21.f8803l = i;
        }
        int i2 = this.f17711m;
        int i3 = f17697o;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f17697o = i4;
            this.f17710l = (P21[]) Arrays.copyOf(this.f17710l, i4);
        }
        P21[] p21Arr = this.f17710l;
        int i5 = this.f17711m;
        this.f17711m = i5 + 1;
        p21Arr[i5] = p21;
        return p21;
    }

    /* renamed from: b */
    public final void m10836b(P21 p21, P21 p212, int i, float f, P21 p213, P21 p214, int i2, int i3) {
        C0072B8 c0072b8M10845k = m10845k();
        if (p212 == p213) {
            c0072b8M10845k.f583d.mo76k(p21, 1.0f);
            c0072b8M10845k.f583d.mo76k(p214, 1.0f);
            c0072b8M10845k.f583d.mo76k(p212, -2.0f);
        } else if (f == 0.5f) {
            c0072b8M10845k.f583d.mo76k(p21, 1.0f);
            c0072b8M10845k.f583d.mo76k(p212, -1.0f);
            c0072b8M10845k.f583d.mo76k(p213, -1.0f);
            c0072b8M10845k.f583d.mo76k(p214, 1.0f);
            if (i > 0 || i2 > 0) {
                c0072b8M10845k.f581b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            c0072b8M10845k.f583d.mo76k(p21, -1.0f);
            c0072b8M10845k.f583d.mo76k(p212, 1.0f);
            c0072b8M10845k.f581b = i;
        } else if (f >= 1.0f) {
            c0072b8M10845k.f583d.mo76k(p214, -1.0f);
            c0072b8M10845k.f583d.mo76k(p213, 1.0f);
            c0072b8M10845k.f581b = -i2;
        } else {
            float f2 = 1.0f - f;
            c0072b8M10845k.f583d.mo76k(p21, f2 * 1.0f);
            c0072b8M10845k.f583d.mo76k(p212, f2 * (-1.0f));
            c0072b8M10845k.f583d.mo76k(p213, (-1.0f) * f);
            c0072b8M10845k.f583d.mo76k(p214, 1.0f * f);
            if (i > 0 || i2 > 0) {
                c0072b8M10845k.f581b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            c0072b8M10845k.m518a(this, i3);
        }
        m10837c(c0072b8M10845k);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00de  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10837c(p000.C0072B8 r17) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C9016cj0.m10837c(B8):void");
    }

    /* renamed from: d */
    public final void m10838d(P21 p21, int i) {
        int i2 = p21.f8794c;
        if (i2 == -1) {
            p21.f8796e = i;
            p21.f8797f = true;
            int i3 = p21.f8801j;
            for (int i4 = 0; i4 < i3; i4++) {
                p21.f8800i[i4].m524g(p21, false);
            }
            p21.f8801j = 0;
            return;
        }
        if (i2 == -1) {
            C0072B8 c0072b8M10845k = m10845k();
            c0072b8M10845k.f580a = p21;
            float f = i;
            p21.f8796e = f;
            c0072b8M10845k.f581b = f;
            c0072b8M10845k.f584e = true;
            m10837c(c0072b8M10845k);
            return;
        }
        C0072B8 c0072b8 = this.f17703e[i2];
        if (c0072b8.f584e) {
            c0072b8.f581b = i;
            return;
        }
        if (c0072b8.f583d.mo68c() == 0) {
            c0072b8.f584e = true;
            c0072b8.f581b = i;
            return;
        }
        C0072B8 c0072b8M10845k2 = m10845k();
        if (i < 0) {
            c0072b8M10845k2.f581b = i * (-1);
            c0072b8M10845k2.f583d.mo76k(p21, 1.0f);
        } else {
            c0072b8M10845k2.f581b = i;
            c0072b8M10845k2.f583d.mo76k(p21, -1.0f);
        }
        m10837c(c0072b8M10845k2);
    }

    /* renamed from: e */
    public final void m10839e(P21 p21, P21 p212, int i, int i2) {
        boolean z = false;
        if (i2 == 8 && p212.f8797f && p21.f8794c == -1) {
            p21.f8796e = p212.f8796e + i;
            p21.f8797f = true;
            int i3 = p21.f8801j;
            for (int i4 = 0; i4 < i3; i4++) {
                p21.f8800i[i4].m524g(p21, false);
            }
            p21.f8801j = 0;
            return;
        }
        C0072B8 c0072b8M10845k = m10845k();
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c0072b8M10845k.f581b = i;
        }
        if (z) {
            c0072b8M10845k.f583d.mo76k(p21, 1.0f);
            c0072b8M10845k.f583d.mo76k(p212, -1.0f);
        } else {
            c0072b8M10845k.f583d.mo76k(p21, -1.0f);
            c0072b8M10845k.f583d.mo76k(p212, 1.0f);
        }
        if (i2 != 8) {
            c0072b8M10845k.m518a(this, i2);
        }
        m10837c(c0072b8M10845k);
    }

    /* renamed from: f */
    public final void m10840f(P21 p21, P21 p212, int i, int i2) {
        C0072B8 c0072b8M10845k = m10845k();
        P21 p21M10846l = m10846l();
        p21M10846l.f8795d = 0;
        c0072b8M10845k.m519b(p21, p212, p21M10846l, i);
        if (i2 != 8) {
            c0072b8M10845k.f583d.mo76k(m10843i(i2), (int) (c0072b8M10845k.f583d.mo66a(p21M10846l) * (-1.0f)));
        }
        m10837c(c0072b8M10845k);
    }

    /* renamed from: g */
    public final void m10841g(P21 p21, P21 p212, int i, int i2) {
        C0072B8 c0072b8M10845k = m10845k();
        P21 p21M10846l = m10846l();
        p21M10846l.f8795d = 0;
        c0072b8M10845k.m520c(p21, p212, p21M10846l, i);
        if (i2 != 8) {
            c0072b8M10845k.f583d.mo76k(m10843i(i2), (int) (c0072b8M10845k.f583d.mo66a(p21M10846l) * (-1.0f)));
        }
        m10837c(c0072b8M10845k);
    }

    /* renamed from: h */
    public final void m10842h(C0072B8 c0072b8) {
        boolean z = f17698p;
        T71 t71 = this.f17709k;
        if (z) {
            C0072B8 c0072b82 = this.f17703e[this.f17707i];
            if (c0072b82 != null) {
                ((C0986Pf) t71.f11173a).m6405s(c0072b82);
            }
        } else {
            C0072B8 c0072b83 = this.f17703e[this.f17707i];
            if (c0072b83 != null) {
                ((C0986Pf) t71.f11174b).m6405s(c0072b83);
            }
        }
        C0072B8[] c0072b8Arr = this.f17703e;
        int i = this.f17707i;
        c0072b8Arr[i] = c0072b8;
        P21 p21 = c0072b8.f580a;
        p21.f8794c = i;
        this.f17707i = i + 1;
        p21.m6211d(c0072b8);
    }

    /* renamed from: i */
    public final P21 m10843i(int i) {
        if (this.f17706h + 1 >= this.f17702d) {
            m10847n();
        }
        P21 p21M10835a = m10835a(4);
        int i2 = this.f17699a + 1;
        this.f17699a = i2;
        this.f17706h++;
        p21M10835a.f8793b = i2;
        p21M10835a.f8795d = i;
        ((P21[]) this.f17709k.f11176d)[i2] = p21M10835a;
        C11643xD0 c11643xD0 = this.f17700b;
        c11643xD0.f45482i.f44713a = p21M10835a;
        float[] fArr = p21M10835a.f8799h;
        Arrays.fill(fArr, 0.0f);
        fArr[p21M10835a.f8795d] = 1.0f;
        c11643xD0.m25819i(p21M10835a);
        return p21M10835a;
    }

    /* renamed from: j */
    public final P21 m10844j(Object obj) {
        P21 p21 = null;
        if (obj == null) {
            return null;
        }
        if (this.f17706h + 1 >= this.f17702d) {
            m10847n();
        }
        if (obj instanceof C0627Jx) {
            C0627Jx c0627Jx = (C0627Jx) obj;
            p21 = c0627Jx.f5812g;
            if (p21 == null) {
                c0627Jx.m4478i();
                p21 = c0627Jx.f5812g;
            }
            int i = p21.f8793b;
            T71 t71 = this.f17709k;
            if (i == -1 || i > this.f17699a || ((P21[]) t71.f11176d)[i] == null) {
                if (i != -1) {
                    p21.m6210c();
                }
                int i2 = this.f17699a + 1;
                this.f17699a = i2;
                this.f17706h++;
                p21.f8793b = i2;
                p21.f8803l = 1;
                ((P21[]) t71.f11176d)[i2] = p21;
            }
        }
        return p21;
    }

    /* renamed from: k */
    public final C0072B8 m10845k() {
        boolean z = f17698p;
        T71 t71 = this.f17709k;
        if (z) {
            C0072B8 c0072b8 = (C0072B8) ((C0986Pf) t71.f11173a).m6393b();
            if (c0072b8 == null) {
                return new C8888bj0(t71);
            }
            c0072b8.f580a = null;
            c0072b8.f583d.clear();
            c0072b8.f581b = 0.0f;
            c0072b8.f584e = false;
            return c0072b8;
        }
        C0072B8 c0072b82 = (C0072B8) ((C0986Pf) t71.f11174b).m6393b();
        if (c0072b82 == null) {
            return new C0072B8(t71);
        }
        c0072b82.f580a = null;
        c0072b82.f583d.clear();
        c0072b82.f581b = 0.0f;
        c0072b82.f584e = false;
        return c0072b82;
    }

    /* renamed from: l */
    public final P21 m10846l() {
        if (this.f17706h + 1 >= this.f17702d) {
            m10847n();
        }
        P21 p21M10835a = m10835a(3);
        int i = this.f17699a + 1;
        this.f17699a = i;
        this.f17706h++;
        p21M10835a.f8793b = i;
        ((P21[]) this.f17709k.f11176d)[i] = p21M10835a;
        return p21M10835a;
    }

    /* renamed from: n */
    public final void m10847n() {
        int i = this.f17701c * 2;
        this.f17701c = i;
        this.f17703e = (C0072B8[]) Arrays.copyOf(this.f17703e, i);
        T71 t71 = this.f17709k;
        t71.f11176d = (P21[]) Arrays.copyOf((P21[]) t71.f11176d, this.f17701c);
        int i2 = this.f17701c;
        this.f17705g = new boolean[i2];
        this.f17702d = i2;
        this.f17708j = i2;
    }

    /* renamed from: o */
    public final void m10848o(C11643xD0 c11643xD0) {
        T71 t71;
        int i = 0;
        while (true) {
            if (i >= this.f17707i) {
                break;
            }
            C0072B8 c0072b8 = this.f17703e[i];
            int i2 = 1;
            if (c0072b8.f580a.f8803l != 1) {
                float f = 0.0f;
                if (c0072b8.f581b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (true) {
                            int i8 = this.f17707i;
                            t71 = this.f17709k;
                            if (i6 >= i8) {
                                break;
                            }
                            C0072B8 c0072b82 = this.f17703e[i6];
                            if (c0072b82.f580a.f8803l != i2 && !c0072b82.f584e && c0072b82.f581b < f) {
                                int i9 = i2;
                                while (i9 < this.f17706h) {
                                    P21 p21 = ((P21[]) t71.f11176d)[i9];
                                    float fMo66a = c0072b82.f583d.mo66a(p21);
                                    if (fMo66a > f) {
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f3 = p21.f8798g[i10] / fMo66a;
                                            if ((f3 < f2 && i10 == i7) || i10 > i7) {
                                                i7 = i10;
                                                f2 = f3;
                                                i4 = i6;
                                                i5 = i9;
                                            }
                                        }
                                    }
                                    i9++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0072B8 c0072b83 = this.f17703e[i4];
                            c0072b83.f580a.f8794c = -1;
                            c0072b83.m523f(((P21[]) t71.f11176d)[i5]);
                            P21 p212 = c0072b83.f580a;
                            p212.f8794c = i4;
                            p212.m6211d(c0072b83);
                        } else {
                            z = true;
                        }
                        if (i3 > this.f17706h / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        m10849p(c11643xD0);
        for (int i11 = 0; i11 < this.f17707i; i11++) {
            C0072B8 c0072b84 = this.f17703e[i11];
            c0072b84.f580a.f8796e = c0072b84.f581b;
        }
    }

    /* renamed from: p */
    public final void m10849p(C0072B8 c0072b8) {
        for (int i = 0; i < this.f17706h; i++) {
            this.f17705g[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f17706h * 2) {
                return;
            }
            P21 p21 = c0072b8.f580a;
            if (p21 != null) {
                this.f17705g[p21.f8793b] = true;
            }
            P21 p21Mo521d = c0072b8.mo521d(this.f17705g);
            if (p21Mo521d != null) {
                boolean[] zArr = this.f17705g;
                int i3 = p21Mo521d.f8793b;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (p21Mo521d != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f17707i; i5++) {
                    C0072B8 c0072b82 = this.f17703e[i5];
                    if (c0072b82.f580a.f8803l != 1 && !c0072b82.f584e && c0072b82.f583d.mo67b(p21Mo521d)) {
                        float fMo66a = c0072b82.f583d.mo66a(p21Mo521d);
                        if (fMo66a < 0.0f) {
                            float f2 = (-c0072b82.f581b) / fMo66a;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    C0072B8 c0072b83 = this.f17703e[i4];
                    c0072b83.f580a.f8794c = -1;
                    c0072b83.m523f(p21Mo521d);
                    P21 p212 = c0072b83.f580a;
                    p212.f8794c = i4;
                    p212.m6211d(c0072b83);
                }
            } else {
                z = true;
            }
        }
    }

    /* renamed from: q */
    public final void m10850q() {
        boolean z = f17698p;
        T71 t71 = this.f17709k;
        int i = 0;
        if (z) {
            while (true) {
                C0072B8[] c0072b8Arr = this.f17703e;
                if (i >= c0072b8Arr.length) {
                    return;
                }
                C0072B8 c0072b8 = c0072b8Arr[i];
                if (c0072b8 != null) {
                    ((C0986Pf) t71.f11173a).m6405s(c0072b8);
                }
                this.f17703e[i] = null;
                i++;
            }
        } else {
            while (true) {
                C0072B8[] c0072b8Arr2 = this.f17703e;
                if (i >= c0072b8Arr2.length) {
                    return;
                }
                C0072B8 c0072b82 = c0072b8Arr2[i];
                if (c0072b82 != null) {
                    ((C0986Pf) t71.f11174b).m6405s(c0072b82);
                }
                this.f17703e[i] = null;
                i++;
            }
        }
    }

    /* renamed from: r */
    public final void m10851r() {
        T71 t71;
        int i = 0;
        while (true) {
            t71 = this.f17709k;
            P21[] p21Arr = (P21[]) t71.f11176d;
            if (i >= p21Arr.length) {
                break;
            }
            P21 p21 = p21Arr[i];
            if (p21 != null) {
                p21.m6210c();
            }
            i++;
        }
        C0986Pf c0986Pf = (C0986Pf) t71.f11175c;
        P21[] p21Arr2 = this.f17710l;
        int length = this.f17711m;
        c0986Pf.getClass();
        if (length > p21Arr2.length) {
            length = p21Arr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            P21 p212 = p21Arr2[i2];
            int i3 = c0986Pf.f9216b;
            Object[] objArr = (Object[]) c0986Pf.f9217c;
            if (i3 < objArr.length) {
                objArr[i3] = p212;
                c0986Pf.f9216b = i3 + 1;
            }
        }
        this.f17711m = 0;
        Arrays.fill((P21[]) t71.f11176d, (Object) null);
        this.f17699a = 0;
        C11643xD0 c11643xD0 = this.f17700b;
        c11643xD0.f45481h = 0;
        c11643xD0.f581b = 0.0f;
        this.f17706h = 1;
        for (int i4 = 0; i4 < this.f17707i; i4++) {
            this.f17703e[i4].getClass();
        }
        m10850q();
        this.f17707i = 0;
        if (f17698p) {
            this.f17712n = new C8888bj0(t71);
        } else {
            this.f17712n = new C0072B8(t71);
        }
    }
}
