package defpackage;

import java.util.Arrays;

/* renamed from: xD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7941xD0 extends B8 {
    public P21[] f;
    public P21[] g;
    public int h;
    public C7751wD0 i;

    @Override // defpackage.B8
    public final P21 d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.h; i2++) {
            P21[] p21Arr = this.f;
            P21 p21 = p21Arr[i2];
            if (!zArr[p21.b]) {
                C7751wD0 c7751wD0 = this.i;
                c7751wD0.a = p21;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = c7751wD0.a.h[i3];
                        if (f <= 0.0f) {
                            if (f < 0.0f) {
                                i = i2;
                                break;
                            }
                            i3--;
                        }
                    }
                } else {
                    P21 p212 = p21Arr[i];
                    while (true) {
                        if (i3 >= 0) {
                            float f2 = p212.h[i3];
                            float f3 = c7751wD0.a.h[i3];
                            if (f3 == f2) {
                                i3--;
                            } else if (f3 < f2) {
                            }
                        }
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f[i];
    }

    @Override // defpackage.B8
    public final void h(B8 b8, boolean z) {
        P21 p21 = b8.a;
        if (p21 == null) {
            return;
        }
        A8 a8 = b8.d;
        int iC = a8.c();
        for (int i = 0; i < iC; i++) {
            P21 p21D = a8.d(i);
            float fG = a8.g(i);
            C7751wD0 c7751wD0 = this.i;
            c7751wD0.a = p21D;
            boolean z2 = p21D.a;
            float[] fArr = p21.h;
            if (z2) {
                boolean z3 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = c7751wD0.a.h;
                    float f = (fArr[i2] * fG) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        c7751wD0.a.h[i2] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    c7751wD0.b.j(c7751wD0.a);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fG;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        c7751wD0.a.h[i3] = f3;
                    } else {
                        c7751wD0.a.h[i3] = 0.0f;
                    }
                }
                i(p21D);
            }
            this.b = (b8.b * fG) + this.b;
        }
        j(p21);
    }

    public final void i(P21 p21) {
        int i;
        int i2 = this.h + 1;
        P21[] p21Arr = this.f;
        if (i2 > p21Arr.length) {
            P21[] p21Arr2 = (P21[]) Arrays.copyOf(p21Arr, p21Arr.length * 2);
            this.f = p21Arr2;
            this.g = (P21[]) Arrays.copyOf(p21Arr2, p21Arr2.length * 2);
        }
        P21[] p21Arr3 = this.f;
        int i3 = this.h;
        p21Arr3[i3] = p21;
        int i4 = i3 + 1;
        this.h = i4;
        if (i4 > 1 && p21Arr3[i3].b > p21.b) {
            int i5 = 0;
            while (true) {
                i = this.h;
                if (i5 >= i) {
                    break;
                }
                this.g[i5] = this.f[i5];
                i5++;
            }
            Arrays.sort(this.g, 0, i, new C2209aq0(20));
            for (int i6 = 0; i6 < this.h; i6++) {
                this.f[i6] = this.g[i6];
            }
        }
        p21.a = true;
        p21.a(this);
    }

    public final void j(P21 p21) {
        int i = 0;
        while (i < this.h) {
            if (this.f[i] == p21) {
                while (true) {
                    int i2 = this.h;
                    if (i >= i2 - 1) {
                        this.h = i2 - 1;
                        p21.a = false;
                        return;
                    } else {
                        P21[] p21Arr = this.f;
                        int i3 = i + 1;
                        p21Arr[i] = p21Arr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.B8
    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i = 0; i < this.h; i++) {
            P21 p21 = this.f[i];
            C7751wD0 c7751wD0 = this.i;
            c7751wD0.a = p21;
            str = str + c7751wD0 + " ";
        }
        return str;
    }
}
