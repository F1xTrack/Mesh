package p000;

import java.util.Arrays;

/* renamed from: p8 */
/* loaded from: classes.dex */
public final class C6598p8 implements InterfaceC0009A8 {

    /* renamed from: b */
    public final C0072B8 f39849b;

    /* renamed from: c */
    public final T71 f39850c;

    /* renamed from: a */
    public int f39848a = 0;

    /* renamed from: d */
    public int f39851d = 8;

    /* renamed from: e */
    public int[] f39852e = new int[8];

    /* renamed from: f */
    public int[] f39853f = new int[8];

    /* renamed from: g */
    public float[] f39854g = new float[8];

    /* renamed from: h */
    public int f39855h = -1;

    /* renamed from: i */
    public int f39856i = -1;

    /* renamed from: j */
    public boolean f39857j = false;

    public C6598p8(C0072B8 c0072b8, T71 t71) {
        this.f39849b = c0072b8;
        this.f39850c = t71;
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: a */
    public final float mo66a(P21 p21) {
        int i = this.f39855h;
        for (int i2 = 0; i != -1 && i2 < this.f39848a; i2++) {
            if (this.f39852e[i] == p21.f8793b) {
                return this.f39854g[i];
            }
            i = this.f39853f[i];
        }
        return 0.0f;
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: b */
    public final boolean mo67b(P21 p21) {
        int i = this.f39855h;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f39848a; i2++) {
            if (this.f39852e[i] == p21.f8793b) {
                return true;
            }
            i = this.f39853f[i];
        }
        return false;
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: c */
    public final int mo68c() {
        return this.f39848a;
    }

    @Override // p000.InterfaceC0009A8
    public final void clear() {
        int i = this.f39855h;
        for (int i2 = 0; i != -1 && i2 < this.f39848a; i2++) {
            P21 p21 = ((P21[]) this.f39850c.f11176d)[this.f39852e[i]];
            if (p21 != null) {
                p21.m6209b(this.f39849b);
            }
            i = this.f39853f[i];
        }
        this.f39855h = -1;
        this.f39856i = -1;
        this.f39857j = false;
        this.f39848a = 0;
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: d */
    public final P21 mo69d(int i) {
        int i2 = this.f39855h;
        for (int i3 = 0; i2 != -1 && i3 < this.f39848a; i3++) {
            if (i3 == i) {
                return ((P21[]) this.f39850c.f11176d)[this.f39852e[i2]];
            }
            i2 = this.f39853f[i2];
        }
        return null;
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: e */
    public final void mo70e(P21 p21, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f39855h;
            C0072B8 c0072b8 = this.f39849b;
            if (i == -1) {
                this.f39855h = 0;
                this.f39854g[0] = f;
                this.f39852e[0] = p21.f8793b;
                this.f39853f[0] = -1;
                p21.f8802k++;
                p21.m6208a(c0072b8);
                this.f39848a++;
                if (this.f39857j) {
                    return;
                }
                int i2 = this.f39856i + 1;
                this.f39856i = i2;
                int[] iArr = this.f39852e;
                if (i2 >= iArr.length) {
                    this.f39857j = true;
                    this.f39856i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f39848a; i4++) {
                int i5 = this.f39852e[i];
                int i6 = p21.f8793b;
                if (i5 == i6) {
                    float[] fArr = this.f39854g;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f39855h) {
                            this.f39855h = this.f39853f[i];
                        } else {
                            int[] iArr2 = this.f39853f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            p21.m6209b(c0072b8);
                        }
                        if (this.f39857j) {
                            this.f39856i = i;
                        }
                        p21.f8802k--;
                        this.f39848a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f39853f[i];
            }
            int length = this.f39856i;
            int i7 = length + 1;
            if (this.f39857j) {
                int[] iArr3 = this.f39852e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i7;
            }
            int[] iArr4 = this.f39852e;
            if (length >= iArr4.length && this.f39848a < iArr4.length) {
                int i8 = 0;
                while (true) {
                    int[] iArr5 = this.f39852e;
                    if (i8 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i8] == -1) {
                        length = i8;
                        break;
                    }
                    i8++;
                }
            }
            int[] iArr6 = this.f39852e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i9 = this.f39851d * 2;
                this.f39851d = i9;
                this.f39857j = false;
                this.f39856i = length - 1;
                this.f39854g = Arrays.copyOf(this.f39854g, i9);
                this.f39852e = Arrays.copyOf(this.f39852e, this.f39851d);
                this.f39853f = Arrays.copyOf(this.f39853f, this.f39851d);
            }
            this.f39852e[length] = p21.f8793b;
            this.f39854g[length] = f;
            if (i3 != -1) {
                int[] iArr7 = this.f39853f;
                iArr7[length] = iArr7[i3];
                iArr7[i3] = length;
            } else {
                this.f39853f[length] = this.f39855h;
                this.f39855h = length;
            }
            p21.f8802k++;
            p21.m6208a(c0072b8);
            this.f39848a++;
            if (!this.f39857j) {
                this.f39856i++;
            }
            int i10 = this.f39856i;
            int[] iArr8 = this.f39852e;
            if (i10 >= iArr8.length) {
                this.f39857j = true;
                this.f39856i = iArr8.length - 1;
            }
        }
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: f */
    public final void mo71f() {
        int i = this.f39855h;
        for (int i2 = 0; i != -1 && i2 < this.f39848a; i2++) {
            float[] fArr = this.f39854g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f39853f[i];
        }
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: g */
    public final float mo72g(int i) {
        int i2 = this.f39855h;
        for (int i3 = 0; i2 != -1 && i3 < this.f39848a; i3++) {
            if (i3 == i) {
                return this.f39854g[i2];
            }
            i2 = this.f39853f[i2];
        }
        return 0.0f;
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: h */
    public final float mo73h(P21 p21, boolean z) {
        int i = this.f39855h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f39848a) {
            if (this.f39852e[i] == p21.f8793b) {
                if (i == this.f39855h) {
                    this.f39855h = this.f39853f[i];
                } else {
                    int[] iArr = this.f39853f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    p21.m6209b(this.f39849b);
                }
                p21.f8802k--;
                this.f39848a--;
                this.f39852e[i] = -1;
                if (this.f39857j) {
                    this.f39856i = i;
                }
                return this.f39854g[i];
            }
            i2++;
            i3 = i;
            i = this.f39853f[i];
        }
        return 0.0f;
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: i */
    public final float mo74i(C0072B8 c0072b8, boolean z) {
        float fMo66a = mo66a(c0072b8.f580a);
        mo73h(c0072b8.f580a, z);
        InterfaceC0009A8 interfaceC0009A8 = c0072b8.f583d;
        int iMo68c = interfaceC0009A8.mo68c();
        for (int i = 0; i < iMo68c; i++) {
            P21 p21Mo69d = interfaceC0009A8.mo69d(i);
            mo70e(p21Mo69d, interfaceC0009A8.mo66a(p21Mo69d) * fMo66a, z);
        }
        return fMo66a;
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: j */
    public final void mo75j(float f) {
        int i = this.f39855h;
        for (int i2 = 0; i != -1 && i2 < this.f39848a; i2++) {
            float[] fArr = this.f39854g;
            fArr[i] = fArr[i] / f;
            i = this.f39853f[i];
        }
    }

    @Override // p000.InterfaceC0009A8
    /* renamed from: k */
    public final void mo76k(P21 p21, float f) {
        if (f == 0.0f) {
            mo73h(p21, true);
            return;
        }
        int i = this.f39855h;
        C0072B8 c0072b8 = this.f39849b;
        if (i == -1) {
            this.f39855h = 0;
            this.f39854g[0] = f;
            this.f39852e[0] = p21.f8793b;
            this.f39853f[0] = -1;
            p21.f8802k++;
            p21.m6208a(c0072b8);
            this.f39848a++;
            if (this.f39857j) {
                return;
            }
            int i2 = this.f39856i + 1;
            this.f39856i = i2;
            int[] iArr = this.f39852e;
            if (i2 >= iArr.length) {
                this.f39857j = true;
                this.f39856i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f39848a; i4++) {
            int i5 = this.f39852e[i];
            int i6 = p21.f8793b;
            if (i5 == i6) {
                this.f39854g[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f39853f[i];
        }
        int length = this.f39856i;
        int i7 = length + 1;
        if (this.f39857j) {
            int[] iArr2 = this.f39852e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i7;
        }
        int[] iArr3 = this.f39852e;
        if (length >= iArr3.length && this.f39848a < iArr3.length) {
            int i8 = 0;
            while (true) {
                int[] iArr4 = this.f39852e;
                if (i8 >= iArr4.length) {
                    break;
                }
                if (iArr4[i8] == -1) {
                    length = i8;
                    break;
                }
                i8++;
            }
        }
        int[] iArr5 = this.f39852e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i9 = this.f39851d * 2;
            this.f39851d = i9;
            this.f39857j = false;
            this.f39856i = length - 1;
            this.f39854g = Arrays.copyOf(this.f39854g, i9);
            this.f39852e = Arrays.copyOf(this.f39852e, this.f39851d);
            this.f39853f = Arrays.copyOf(this.f39853f, this.f39851d);
        }
        this.f39852e[length] = p21.f8793b;
        this.f39854g[length] = f;
        if (i3 != -1) {
            int[] iArr6 = this.f39853f;
            iArr6[length] = iArr6[i3];
            iArr6[i3] = length;
        } else {
            this.f39853f[length] = this.f39855h;
            this.f39855h = length;
        }
        p21.f8802k++;
        p21.m6208a(c0072b8);
        int i10 = this.f39848a + 1;
        this.f39848a = i10;
        if (!this.f39857j) {
            this.f39856i++;
        }
        int[] iArr7 = this.f39852e;
        if (i10 >= iArr7.length) {
            this.f39857j = true;
        }
        if (this.f39856i >= iArr7.length) {
            this.f39857j = true;
            this.f39856i = iArr7.length - 1;
        }
    }

    public final String toString() {
        int i = this.f39855h;
        String string = "";
        for (int i2 = 0; i != -1 && i2 < this.f39848a; i2++) {
            StringBuilder sbM26238o = AbstractC7222ym.m26238o(AbstractC7222ym.m26232i(string, " -> "));
            sbM26238o.append(this.f39854g[i]);
            sbM26238o.append(" : ");
            StringBuilder sbM26238o2 = AbstractC7222ym.m26238o(sbM26238o.toString());
            sbM26238o2.append(((P21[]) this.f39850c.f11176d)[this.f39852e[i]]);
            string = sbM26238o2.toString();
            i = this.f39853f[i];
        }
        return string;
    }
}
