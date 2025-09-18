package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class Q21 implements A8 {
    public int a = 16;
    public final int[] b = new int[16];
    public int[] c = new int[16];
    public int[] d = new int[16];
    public float[] e = new float[16];
    public int[] f = new int[16];
    public int[] g = new int[16];
    public int h = 0;
    public int i = -1;
    public final C2379bj0 j;
    public final T71 k;

    public Q21(C2379bj0 c2379bj0, T71 t71) {
        this.j = c2379bj0;
        this.k = t71;
        clear();
    }

    @Override // defpackage.A8
    public final float a(P21 p21) {
        int iN = n(p21);
        if (iN != -1) {
            return this.e[iN];
        }
        return 0.0f;
    }

    @Override // defpackage.A8
    public final boolean b(P21 p21) {
        return n(p21) != -1;
    }

    @Override // defpackage.A8
    public final int c() {
        return this.h;
    }

    @Override // defpackage.A8
    public final void clear() {
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            P21 p21D = d(i2);
            if (p21D != null) {
                p21D.b(this.j);
            }
        }
        for (int i3 = 0; i3 < this.a; i3++) {
            this.d[i3] = -1;
            this.c[i3] = -1;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            this.b[i4] = -1;
        }
        this.h = 0;
        this.i = -1;
    }

    @Override // defpackage.A8
    public final P21 d(int i) {
        int i2 = this.h;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return ((P21[]) this.k.d)[this.d[i3]];
            }
            i3 = this.g[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // defpackage.A8
    public final void e(P21 p21, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int iN = n(p21);
            if (iN == -1) {
                k(p21, f);
                return;
            }
            float[] fArr = this.e;
            float f2 = fArr[iN] + f;
            fArr[iN] = f2;
            if (f2 <= -0.001f || f2 >= 0.001f) {
                return;
            }
            fArr[iN] = 0.0f;
            h(p21, z);
        }
    }

    @Override // defpackage.A8
    public final void f() {
        int i = this.h;
        int i2 = this.i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.e;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // defpackage.A8
    public final float g(int i) {
        int i2 = this.h;
        int i3 = this.i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.e[i3];
            }
            i3 = this.g[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // defpackage.A8
    public final float h(P21 p21, boolean z) {
        int[] iArr;
        int i;
        int iN = n(p21);
        if (iN == -1) {
            return 0.0f;
        }
        int i2 = p21.b;
        int i3 = i2 % 16;
        int[] iArr2 = this.b;
        int i4 = iArr2[i3];
        if (i4 != -1) {
            if (this.d[i4] == i2) {
                int[] iArr3 = this.c;
                iArr2[i3] = iArr3[i4];
                iArr3[i4] = -1;
            } else {
                while (true) {
                    iArr = this.c;
                    i = iArr[i4];
                    if (i == -1 || this.d[i] == i2) {
                        break;
                    }
                    i4 = i;
                }
                if (i != -1 && this.d[i] == i2) {
                    iArr[i4] = iArr[i];
                    iArr[i] = -1;
                }
            }
        }
        float f = this.e[iN];
        if (this.i == iN) {
            this.i = this.g[iN];
        }
        this.d[iN] = -1;
        int[] iArr4 = this.f;
        int i5 = iArr4[iN];
        if (i5 != -1) {
            int[] iArr5 = this.g;
            iArr5[i5] = iArr5[iN];
        }
        int i6 = this.g[iN];
        if (i6 != -1) {
            iArr4[i6] = iArr4[iN];
        }
        this.h--;
        p21.k--;
        if (z) {
            p21.b(this.j);
        }
        return f;
    }

    @Override // defpackage.A8
    public final float i(B8 b8, boolean z) {
        float fA = a(b8.a);
        h(b8.a, z);
        Q21 q21 = (Q21) b8.d;
        int i = q21.h;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = q21.d[i3];
            if (i4 != -1) {
                e(((P21[]) this.k.d)[i4], q21.e[i3] * fA, z);
                i2++;
            }
            i3++;
        }
        return fA;
    }

    @Override // defpackage.A8
    public final void j(float f) {
        int i = this.h;
        int i2 = this.i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.e;
            fArr[i2] = fArr[i2] / f;
            i2 = this.g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // defpackage.A8
    public final void k(P21 p21, float f) {
        if (f > -0.001f && f < 0.001f) {
            h(p21, true);
            return;
        }
        int i = 0;
        if (this.h == 0) {
            m(0, p21, f);
            l(p21, 0);
            this.i = 0;
            return;
        }
        int iN = n(p21);
        if (iN != -1) {
            this.e[iN] = f;
            return;
        }
        int i2 = this.h + 1;
        int i3 = this.a;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            this.d = Arrays.copyOf(this.d, i4);
            this.e = Arrays.copyOf(this.e, i4);
            this.f = Arrays.copyOf(this.f, i4);
            this.g = Arrays.copyOf(this.g, i4);
            this.c = Arrays.copyOf(this.c, i4);
            for (int i5 = this.a; i5 < i4; i5++) {
                this.d[i5] = -1;
                this.c[i5] = -1;
            }
            this.a = i4;
        }
        int i6 = this.h;
        int i7 = this.i;
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = this.d[i7];
            int i11 = p21.b;
            if (i10 == i11) {
                this.e[i7] = f;
                return;
            }
            if (i10 < i11) {
                i8 = i7;
            }
            i7 = this.g[i7];
            if (i7 == -1) {
                break;
            }
        }
        while (true) {
            if (i >= this.a) {
                i = -1;
                break;
            } else if (this.d[i] == -1) {
                break;
            } else {
                i++;
            }
        }
        m(i, p21, f);
        if (i8 != -1) {
            this.f[i] = i8;
            int[] iArr = this.g;
            iArr[i] = iArr[i8];
            iArr[i8] = i;
        } else {
            this.f[i] = -1;
            if (this.h > 0) {
                this.g[i] = this.i;
                this.i = i;
            } else {
                this.g[i] = -1;
            }
        }
        int i12 = this.g[i];
        if (i12 != -1) {
            this.f[i12] = i;
        }
        l(p21, i);
    }

    public final void l(P21 p21, int i) {
        int[] iArr;
        int i2 = p21.b % 16;
        int[] iArr2 = this.b;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.c;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.c[i] = -1;
    }

    public final void m(int i, P21 p21, float f) {
        this.d[i] = p21.b;
        this.e[i] = f;
        this.f[i] = -1;
        this.g[i] = -1;
        p21.a(this.j);
        p21.k++;
        this.h++;
    }

    public final int n(P21 p21) {
        if (this.h == 0) {
            return -1;
        }
        int i = p21.b;
        int i2 = this.b[i % 16];
        if (i2 == -1) {
            return -1;
        }
        if (this.d[i2] == i) {
            return i2;
        }
        do {
            i2 = this.c[i2];
            if (i2 == -1) {
                break;
            }
        } while (this.d[i2] != i);
        if (i2 != -1 && this.d[i2] == i) {
            return i2;
        }
        return -1;
    }

    public final String toString() {
        String strI;
        String strI2;
        String strI3 = hashCode() + " { ";
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            P21 p21D = d(i2);
            if (p21D != null) {
                String str = strI3 + p21D + " = " + g(i2) + " ";
                int iN = n(p21D);
                String strI4 = AbstractC8235ym.i(str, "[p: ");
                int i3 = this.f[iN];
                T71 t71 = this.k;
                if (i3 != -1) {
                    StringBuilder sbO = AbstractC8235ym.o(strI4);
                    sbO.append(((P21[]) t71.d)[this.d[this.f[iN]]]);
                    strI = sbO.toString();
                } else {
                    strI = AbstractC8235ym.i(strI4, LocalNotification.Importance.NONE);
                }
                String strI5 = AbstractC8235ym.i(strI, ", n: ");
                if (this.g[iN] != -1) {
                    StringBuilder sbO2 = AbstractC8235ym.o(strI5);
                    sbO2.append(((P21[]) t71.d)[this.d[this.g[iN]]]);
                    strI2 = sbO2.toString();
                } else {
                    strI2 = AbstractC8235ym.i(strI5, LocalNotification.Importance.NONE);
                }
                strI3 = AbstractC8235ym.i(strI2, "]");
            }
        }
        return AbstractC8235ym.i(strI3, " }");
    }
}
