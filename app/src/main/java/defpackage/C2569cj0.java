package defpackage;

import java.util.Arrays;

/* renamed from: cj0 */
/* loaded from: classes.dex */
public final class C2569cj0 {
    public static int o = 1000;
    public static boolean p = true;
    public final C7941xD0 b;
    public B8[] e;
    public final T71 k;
    public B8 n;
    public int a = 0;
    public int c = 32;
    public int d = 32;
    public boolean f = false;
    public boolean[] g = new boolean[32];
    public int h = 1;
    public int i = 0;
    public int j = 32;
    public P21[] l = new P21[o];
    public int m = 0;

    public C2569cj0() {
        this.e = null;
        this.e = new B8[32];
        q();
        T71 t71 = new T71();
        t71.a = new C1204Pf(16, (byte) 0);
        t71.b = new C1204Pf(16, (byte) 0);
        t71.c = new C1204Pf(16, (byte) 0);
        t71.d = new P21[32];
        this.k = t71;
        C7941xD0 c7941xD0 = new C7941xD0(t71);
        c7941xD0.f = new P21[128];
        c7941xD0.g = new P21[128];
        c7941xD0.h = 0;
        c7941xD0.i = new C7751wD0(c7941xD0);
        this.b = c7941xD0;
        if (p) {
            this.n = new C2379bj0(t71);
        } else {
            this.n = new B8(t71);
        }
    }

    public static int m(Object obj) {
        P21 p21 = ((C0791Jx) obj).g;
        if (p21 != null) {
            return (int) (p21.e + 0.5f);
        }
        return 0;
    }

    public final P21 a(int i) {
        P21 p21 = (P21) ((C1204Pf) this.k.c).b();
        if (p21 == null) {
            p21 = new P21(i);
            p21.l = i;
        } else {
            p21.c();
            p21.l = i;
        }
        int i2 = this.m;
        int i3 = o;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            o = i4;
            this.l = (P21[]) Arrays.copyOf(this.l, i4);
        }
        P21[] p21Arr = this.l;
        int i5 = this.m;
        this.m = i5 + 1;
        p21Arr[i5] = p21;
        return p21;
    }

    public final void b(P21 p21, P21 p212, int i, float f, P21 p213, P21 p214, int i2, int i3) {
        B8 b8K = k();
        if (p212 == p213) {
            b8K.d.k(p21, 1.0f);
            b8K.d.k(p214, 1.0f);
            b8K.d.k(p212, -2.0f);
        } else if (f == 0.5f) {
            b8K.d.k(p21, 1.0f);
            b8K.d.k(p212, -1.0f);
            b8K.d.k(p213, -1.0f);
            b8K.d.k(p214, 1.0f);
            if (i > 0 || i2 > 0) {
                b8K.b = (-i) + i2;
            }
        } else if (f <= 0.0f) {
            b8K.d.k(p21, -1.0f);
            b8K.d.k(p212, 1.0f);
            b8K.b = i;
        } else if (f >= 1.0f) {
            b8K.d.k(p214, -1.0f);
            b8K.d.k(p213, 1.0f);
            b8K.b = -i2;
        } else {
            float f2 = 1.0f - f;
            b8K.d.k(p21, f2 * 1.0f);
            b8K.d.k(p212, f2 * (-1.0f));
            b8K.d.k(p213, (-1.0f) * f);
            b8K.d.k(p214, 1.0f * f);
            if (i > 0 || i2 > 0) {
                b8K.b = (i2 * f) + ((-i) * f2);
            }
        }
        if (i3 != 8) {
            b8K.a(this, i3);
        }
        c(b8K);
    }

    /* JADX WARN: Removed duplicated region for block: B:203:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.B8 r17) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C2569cj0.c(B8):void");
    }

    public final void d(P21 p21, int i) {
        int i2 = p21.c;
        if (i2 == -1) {
            p21.e = i;
            p21.f = true;
            int i3 = p21.j;
            for (int i4 = 0; i4 < i3; i4++) {
                p21.i[i4].g(p21, false);
            }
            p21.j = 0;
            return;
        }
        if (i2 == -1) {
            B8 b8K = k();
            b8K.a = p21;
            float f = i;
            p21.e = f;
            b8K.b = f;
            b8K.e = true;
            c(b8K);
            return;
        }
        B8 b8 = this.e[i2];
        if (b8.e) {
            b8.b = i;
            return;
        }
        if (b8.d.c() == 0) {
            b8.e = true;
            b8.b = i;
            return;
        }
        B8 b8K2 = k();
        if (i < 0) {
            b8K2.b = i * (-1);
            b8K2.d.k(p21, 1.0f);
        } else {
            b8K2.b = i;
            b8K2.d.k(p21, -1.0f);
        }
        c(b8K2);
    }

    public final void e(P21 p21, P21 p212, int i, int i2) {
        boolean z = false;
        if (i2 == 8 && p212.f && p21.c == -1) {
            p21.e = p212.e + i;
            p21.f = true;
            int i3 = p21.j;
            for (int i4 = 0; i4 < i3; i4++) {
                p21.i[i4].g(p21, false);
            }
            p21.j = 0;
            return;
        }
        B8 b8K = k();
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            b8K.b = i;
        }
        if (z) {
            b8K.d.k(p21, 1.0f);
            b8K.d.k(p212, -1.0f);
        } else {
            b8K.d.k(p21, -1.0f);
            b8K.d.k(p212, 1.0f);
        }
        if (i2 != 8) {
            b8K.a(this, i2);
        }
        c(b8K);
    }

    public final void f(P21 p21, P21 p212, int i, int i2) {
        B8 b8K = k();
        P21 p21L = l();
        p21L.d = 0;
        b8K.b(p21, p212, p21L, i);
        if (i2 != 8) {
            b8K.d.k(i(i2), (int) (b8K.d.a(p21L) * (-1.0f)));
        }
        c(b8K);
    }

    public final void g(P21 p21, P21 p212, int i, int i2) {
        B8 b8K = k();
        P21 p21L = l();
        p21L.d = 0;
        b8K.c(p21, p212, p21L, i);
        if (i2 != 8) {
            b8K.d.k(i(i2), (int) (b8K.d.a(p21L) * (-1.0f)));
        }
        c(b8K);
    }

    public final void h(B8 b8) {
        boolean z = p;
        T71 t71 = this.k;
        if (z) {
            B8 b82 = this.e[this.i];
            if (b82 != null) {
                ((C1204Pf) t71.a).s(b82);
            }
        } else {
            B8 b83 = this.e[this.i];
            if (b83 != null) {
                ((C1204Pf) t71.b).s(b83);
            }
        }
        B8[] b8Arr = this.e;
        int i = this.i;
        b8Arr[i] = b8;
        P21 p21 = b8.a;
        p21.c = i;
        this.i = i + 1;
        p21.d(b8);
    }

    public final P21 i(int i) {
        if (this.h + 1 >= this.d) {
            n();
        }
        P21 p21A = a(4);
        int i2 = this.a + 1;
        this.a = i2;
        this.h++;
        p21A.b = i2;
        p21A.d = i;
        ((P21[]) this.k.d)[i2] = p21A;
        C7941xD0 c7941xD0 = this.b;
        c7941xD0.i.a = p21A;
        float[] fArr = p21A.h;
        Arrays.fill(fArr, 0.0f);
        fArr[p21A.d] = 1.0f;
        c7941xD0.i(p21A);
        return p21A;
    }

    public final P21 j(Object obj) {
        P21 p21 = null;
        if (obj == null) {
            return null;
        }
        if (this.h + 1 >= this.d) {
            n();
        }
        if (obj instanceof C0791Jx) {
            C0791Jx c0791Jx = (C0791Jx) obj;
            p21 = c0791Jx.g;
            if (p21 == null) {
                c0791Jx.i();
                p21 = c0791Jx.g;
            }
            int i = p21.b;
            T71 t71 = this.k;
            if (i == -1 || i > this.a || ((P21[]) t71.d)[i] == null) {
                if (i != -1) {
                    p21.c();
                }
                int i2 = this.a + 1;
                this.a = i2;
                this.h++;
                p21.b = i2;
                p21.l = 1;
                ((P21[]) t71.d)[i2] = p21;
            }
        }
        return p21;
    }

    public final B8 k() {
        boolean z = p;
        T71 t71 = this.k;
        if (z) {
            B8 b8 = (B8) ((C1204Pf) t71.a).b();
            if (b8 == null) {
                return new C2379bj0(t71);
            }
            b8.a = null;
            b8.d.clear();
            b8.b = 0.0f;
            b8.e = false;
            return b8;
        }
        B8 b82 = (B8) ((C1204Pf) t71.b).b();
        if (b82 == null) {
            return new B8(t71);
        }
        b82.a = null;
        b82.d.clear();
        b82.b = 0.0f;
        b82.e = false;
        return b82;
    }

    public final P21 l() {
        if (this.h + 1 >= this.d) {
            n();
        }
        P21 p21A = a(3);
        int i = this.a + 1;
        this.a = i;
        this.h++;
        p21A.b = i;
        ((P21[]) this.k.d)[i] = p21A;
        return p21A;
    }

    public final void n() {
        int i = this.c * 2;
        this.c = i;
        this.e = (B8[]) Arrays.copyOf(this.e, i);
        T71 t71 = this.k;
        t71.d = (P21[]) Arrays.copyOf((P21[]) t71.d, this.c);
        int i2 = this.c;
        this.g = new boolean[i2];
        this.d = i2;
        this.j = i2;
    }

    public final void o(C7941xD0 c7941xD0) {
        T71 t71;
        int i = 0;
        while (true) {
            if (i >= this.i) {
                break;
            }
            B8 b8 = this.e[i];
            int i2 = 1;
            if (b8.a.l != 1) {
                float f = 0.0f;
                if (b8.b < 0.0f) {
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
                            int i8 = this.i;
                            t71 = this.k;
                            if (i6 >= i8) {
                                break;
                            }
                            B8 b82 = this.e[i6];
                            if (b82.a.l != i2 && !b82.e && b82.b < f) {
                                int i9 = i2;
                                while (i9 < this.h) {
                                    P21 p21 = ((P21[]) t71.d)[i9];
                                    float fA = b82.d.a(p21);
                                    if (fA > f) {
                                        for (int i10 = 0; i10 < 9; i10++) {
                                            float f3 = p21.g[i10] / fA;
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
                            B8 b83 = this.e[i4];
                            b83.a.c = -1;
                            b83.f(((P21[]) t71.d)[i5]);
                            P21 p212 = b83.a;
                            p212.c = i4;
                            p212.d(b83);
                        } else {
                            z = true;
                        }
                        if (i3 > this.h / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                }
            }
            i++;
        }
        p(c7941xD0);
        for (int i11 = 0; i11 < this.i; i11++) {
            B8 b84 = this.e[i11];
            b84.a.e = b84.b;
        }
    }

    public final void p(B8 b8) {
        for (int i = 0; i < this.h; i++) {
            this.g[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.h * 2) {
                return;
            }
            P21 p21 = b8.a;
            if (p21 != null) {
                this.g[p21.b] = true;
            }
            P21 p21D = b8.d(this.g);
            if (p21D != null) {
                boolean[] zArr = this.g;
                int i3 = p21D.b;
                if (zArr[i3]) {
                    return;
                } else {
                    zArr[i3] = true;
                }
            }
            if (p21D != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.i; i5++) {
                    B8 b82 = this.e[i5];
                    if (b82.a.l != 1 && !b82.e && b82.d.b(p21D)) {
                        float fA = b82.d.a(p21D);
                        if (fA < 0.0f) {
                            float f2 = (-b82.b) / fA;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    B8 b83 = this.e[i4];
                    b83.a.c = -1;
                    b83.f(p21D);
                    P21 p212 = b83.a;
                    p212.c = i4;
                    p212.d(b83);
                }
            } else {
                z = true;
            }
        }
    }

    public final void q() {
        boolean z = p;
        T71 t71 = this.k;
        int i = 0;
        if (z) {
            while (true) {
                B8[] b8Arr = this.e;
                if (i >= b8Arr.length) {
                    return;
                }
                B8 b8 = b8Arr[i];
                if (b8 != null) {
                    ((C1204Pf) t71.a).s(b8);
                }
                this.e[i] = null;
                i++;
            }
        } else {
            while (true) {
                B8[] b8Arr2 = this.e;
                if (i >= b8Arr2.length) {
                    return;
                }
                B8 b82 = b8Arr2[i];
                if (b82 != null) {
                    ((C1204Pf) t71.b).s(b82);
                }
                this.e[i] = null;
                i++;
            }
        }
    }

    public final void r() {
        T71 t71;
        int i = 0;
        while (true) {
            t71 = this.k;
            P21[] p21Arr = (P21[]) t71.d;
            if (i >= p21Arr.length) {
                break;
            }
            P21 p21 = p21Arr[i];
            if (p21 != null) {
                p21.c();
            }
            i++;
        }
        C1204Pf c1204Pf = (C1204Pf) t71.c;
        P21[] p21Arr2 = this.l;
        int length = this.m;
        c1204Pf.getClass();
        if (length > p21Arr2.length) {
            length = p21Arr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            P21 p212 = p21Arr2[i2];
            int i3 = c1204Pf.b;
            Object[] objArr = (Object[]) c1204Pf.c;
            if (i3 < objArr.length) {
                objArr[i3] = p212;
                c1204Pf.b = i3 + 1;
            }
        }
        this.m = 0;
        Arrays.fill((P21[]) t71.d, (Object) null);
        this.a = 0;
        C7941xD0 c7941xD0 = this.b;
        c7941xD0.h = 0;
        c7941xD0.b = 0.0f;
        this.h = 1;
        for (int i4 = 0; i4 < this.i; i4++) {
            this.e[i4].getClass();
        }
        q();
        this.i = 0;
        if (p) {
            this.n = new C2379bj0(t71);
        } else {
            this.n = new B8(t71);
        }
    }
}
