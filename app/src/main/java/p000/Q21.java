package p000;

import com.huawei.hms.p015rn.push.constants.LocalNotification;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Q21 implements InterfaceC0009A8 {

    /* renamed from: a */
    public int f9406a = 16;

    /* renamed from: b */
    public final int[] f9407b = new int[16];

    /* renamed from: c */
    public int[] f9408c = new int[16];

    /* renamed from: d */
    public int[] f9409d = new int[16];

    /* renamed from: e */
    public float[] f9410e = new float[16];

    /* renamed from: f */
    public int[] f9411f = new int[16];

    /* renamed from: g */
    public int[] f9412g = new int[16];

    /* renamed from: h */
    public int f9413h = 0;

    /* renamed from: i */
    public int f9414i = -1;

    /* renamed from: j */
    public final C8888bj0 f9415j;

    /* renamed from: k */
    public final T71 f9416k;

    public Q21(C8888bj0 c8888bj0, T71 t71) {
        this.f9415j = c8888bj0;
        this.f9416k = t71;
        clear();
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: a */
    public final float mo66a(P21 p21) {
        int iM6556n = m6556n(p21);
        if (iM6556n != -1) {
            return this.f9410e[iM6556n];
        }
        return 0.0f;
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: b */
    public final boolean mo67b(P21 p21) {
        return m6556n(p21) != -1;
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: c */
    public final int mo68c() {
        return this.f9413h;
    }

    @Override // p000.InterfaceC0009A8
    public final void clear() {
        int i = this.f9413h;
        for (int i2 = 0; i2 < i; i2++) {
            P21 p21Mo69d = mo69d(i2);
            if (p21Mo69d != null) {
                p21Mo69d.m6209b(this.f9415j);
            }
        }
        for (int i3 = 0; i3 < this.f9406a; i3++) {
            this.f9409d[i3] = -1;
            this.f9408c[i3] = -1;
        }
        for (int i4 = 0; i4 < 16; i4++) {
            this.f9407b[i4] = -1;
        }
        this.f9413h = 0;
        this.f9414i = -1;
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: d */
    public final P21 mo69d(int i) {
        int i2 = this.f9413h;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f9414i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return ((P21[]) this.f9416k.f11176d)[this.f9409d[i3]];
            }
            i3 = this.f9412g[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: e */
    public final void mo70e(P21 p21, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int iM6556n = m6556n(p21);
            if (iM6556n == -1) {
                mo76k(p21, f);
                return;
            }
            float[] fArr = this.f9410e;
            float f2 = fArr[iM6556n] + f;
            fArr[iM6556n] = f2;
            if (f2 <= -0.001f || f2 >= 0.001f) {
                return;
            }
            fArr[iM6556n] = 0.0f;
            mo73h(p21, z);
        }
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: f */
    public final void mo71f() {
        int i = this.f9413h;
        int i2 = this.f9414i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f9410e;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f9412g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: g */
    public final float mo72g(int i) {
        int i2 = this.f9413h;
        int i3 = this.f9414i;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f9410e[i3];
            }
            i3 = this.f9412g[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: h */
    public final float mo73h(P21 p21, boolean z) {
        int[] iArr;
        int i;
        int iM6556n = m6556n(p21);
        if (iM6556n == -1) {
            return 0.0f;
        }
        int i2 = p21.f8793b;
        int i3 = i2 % 16;
        int[] iArr2 = this.f9407b;
        int i4 = iArr2[i3];
        if (i4 != -1) {
            if (this.f9409d[i4] == i2) {
                int[] iArr3 = this.f9408c;
                iArr2[i3] = iArr3[i4];
                iArr3[i4] = -1;
            } else {
                while (true) {
                    iArr = this.f9408c;
                    i = iArr[i4];
                    if (i == -1 || this.f9409d[i] == i2) {
                        break;
                    }
                    i4 = i;
                }
                if (i != -1 && this.f9409d[i] == i2) {
                    iArr[i4] = iArr[i];
                    iArr[i] = -1;
                }
            }
        }
        float f = this.f9410e[iM6556n];
        if (this.f9414i == iM6556n) {
            this.f9414i = this.f9412g[iM6556n];
        }
        this.f9409d[iM6556n] = -1;
        int[] iArr4 = this.f9411f;
        int i5 = iArr4[iM6556n];
        if (i5 != -1) {
            int[] iArr5 = this.f9412g;
            iArr5[i5] = iArr5[iM6556n];
        }
        int i6 = this.f9412g[iM6556n];
        if (i6 != -1) {
            iArr4[i6] = iArr4[iM6556n];
        }
        this.f9413h--;
        p21.f8802k--;
        if (z) {
            p21.m6209b(this.f9415j);
        }
        return f;
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: i */
    public final float mo74i(C0072B8 c0072b8, boolean z) {
        float fMo66a = mo66a(c0072b8.f580a);
        mo73h(c0072b8.f580a, z);
        Q21 q21 = (Q21) c0072b8.f583d;
        int i = q21.f9413h;
        int i2 = 0;
        int i3 = 0;
        while (i2 < i) {
            int i4 = q21.f9409d[i3];
            if (i4 != -1) {
                mo70e(((P21[]) this.f9416k.f11176d)[i4], q21.f9410e[i3] * fMo66a, z);
                i2++;
            }
            i3++;
        }
        return fMo66a;
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: j */
    public final void mo75j(float f) {
        int i = this.f9413h;
        int i2 = this.f9414i;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f9410e;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f9412g[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: k */
    public final void mo76k(P21 p21, float f) {
        if (f > -0.001f && f < 0.001f) {
            mo73h(p21, true);
            return;
        }
        int i = 0;
        if (this.f9413h == 0) {
            m6555m(0, p21, f);
            m6554l(p21, 0);
            this.f9414i = 0;
            return;
        }
        int iM6556n = m6556n(p21);
        if (iM6556n != -1) {
            this.f9410e[iM6556n] = f;
            return;
        }
        int i2 = this.f9413h + 1;
        int i3 = this.f9406a;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            this.f9409d = Arrays.copyOf(this.f9409d, i4);
            this.f9410e = Arrays.copyOf(this.f9410e, i4);
            this.f9411f = Arrays.copyOf(this.f9411f, i4);
            this.f9412g = Arrays.copyOf(this.f9412g, i4);
            this.f9408c = Arrays.copyOf(this.f9408c, i4);
            for (int i5 = this.f9406a; i5 < i4; i5++) {
                this.f9409d[i5] = -1;
                this.f9408c[i5] = -1;
            }
            this.f9406a = i4;
        }
        int i6 = this.f9413h;
        int i7 = this.f9414i;
        int i8 = -1;
        for (int i9 = 0; i9 < i6; i9++) {
            int i10 = this.f9409d[i7];
            int i11 = p21.f8793b;
            if (i10 == i11) {
                this.f9410e[i7] = f;
                return;
            }
            if (i10 < i11) {
                i8 = i7;
            }
            i7 = this.f9412g[i7];
            if (i7 == -1) {
                break;
            }
        }
        while (true) {
            if (i >= this.f9406a) {
                i = -1;
                break;
            } else if (this.f9409d[i] == -1) {
                break;
            } else {
                i++;
            }
        }
        m6555m(i, p21, f);
        if (i8 != -1) {
            this.f9411f[i] = i8;
            int[] iArr = this.f9412g;
            iArr[i] = iArr[i8];
            iArr[i8] = i;
        } else {
            this.f9411f[i] = -1;
            if (this.f9413h > 0) {
                this.f9412g[i] = this.f9414i;
                this.f9414i = i;
            } else {
                this.f9412g[i] = -1;
            }
        }
        int i12 = this.f9412g[i];
        if (i12 != -1) {
            this.f9411f[i12] = i;
        }
        m6554l(p21, i);
    }

    /* renamed from: l */
    public final void m6554l(P21 p21, int i) {
        int[] iArr;
        int i2 = p21.f8793b % 16;
        int[] iArr2 = this.f9407b;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f9408c;
                int i4 = iArr[i3];
                if (i4 == -1) {
                    break;
                } else {
                    i3 = i4;
                }
            }
            iArr[i3] = i;
        }
        this.f9408c[i] = -1;
    }

    /* renamed from: m */
    public final void m6555m(int i, P21 p21, float f) {
        this.f9409d[i] = p21.f8793b;
        this.f9410e[i] = f;
        this.f9411f[i] = -1;
        this.f9412g[i] = -1;
        p21.m6208a(this.f9415j);
        p21.f8802k++;
        this.f9413h++;
    }

    /* renamed from: n */
    public final int m6556n(P21 p21) {
        if (this.f9413h == 0) {
            return -1;
        }
        int i = p21.f8793b;
        int i2 = this.f9407b[i % 16];
        if (i2 == -1) {
            return -1;
        }
        if (this.f9409d[i2] == i) {
            return i2;
        }
        do {
            i2 = this.f9408c[i2];
            if (i2 == -1) {
                break;
            }
        } while (this.f9409d[i2] != i);
        if (i2 != -1 && this.f9409d[i2] == i) {
            return i2;
        }
        return -1;
    }

    public final String toString() {
        String strM26232i;
        String strM26232i2;
        String strM26232i3 = hashCode() + " { ";
        int i = this.f9413h;
        for (int i2 = 0; i2 < i; i2++) {
            P21 p21Mo69d = mo69d(i2);
            if (p21Mo69d != null) {
                String str = strM26232i3 + p21Mo69d + " = " + mo72g(i2) + " ";
                int iM6556n = m6556n(p21Mo69d);
                String strM26232i4 = AbstractC7222ym.m26232i(str, "[p: ");
                int i3 = this.f9411f[iM6556n];
                T71 t71 = this.f9416k;
                if (i3 != -1) {
                    StringBuilder sbM26238o = AbstractC7222ym.m26238o(strM26232i4);
                    sbM26238o.append(((P21[]) t71.f11176d)[this.f9409d[this.f9411f[iM6556n]]]);
                    strM26232i = sbM26238o.toString();
                } else {
                    strM26232i = AbstractC7222ym.m26232i(strM26232i4, LocalNotification.Importance.NONE);
                }
                String strM26232i5 = AbstractC7222ym.m26232i(strM26232i, ", n: ");
                if (this.f9412g[iM6556n] != -1) {
                    StringBuilder sbM26238o2 = AbstractC7222ym.m26238o(strM26232i5);
                    sbM26238o2.append(((P21[]) t71.f11176d)[this.f9409d[this.f9412g[iM6556n]]]);
                    strM26232i2 = sbM26238o2.toString();
                } else {
                    strM26232i2 = AbstractC7222ym.m26232i(strM26232i5, LocalNotification.Importance.NONE);
                }
                strM26232i3 = AbstractC7222ym.m26232i(strM26232i2, "]");
            }
        }
        return AbstractC7222ym.m26232i(strM26232i3, " }");
    }
}
