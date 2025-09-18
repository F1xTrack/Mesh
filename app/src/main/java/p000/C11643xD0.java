package p000;

import java.util.Arrays;

/* renamed from: xD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11643xD0 extends C0072B8 {

    /* renamed from: f */
    public P21[] f45479f;

    /* renamed from: g */
    public P21[] f45480g;

    /* renamed from: h */
    public int f45481h;

    /* renamed from: i */
    public C11516wD0 f45482i;

    @Override // p000.C0072B8
    /* renamed from: d */
    public final P21 mo521d(boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f45481h; i2++) {
            P21[] p21Arr = this.f45479f;
            P21 p21 = p21Arr[i2];
            if (!zArr[p21.f8793b]) {
                C11516wD0 c11516wD0 = this.f45482i;
                c11516wD0.f44713a = p21;
                int i3 = 8;
                if (i == -1) {
                    while (i3 >= 0) {
                        float f = c11516wD0.f44713a.f8799h[i3];
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
                            float f2 = p212.f8799h[i3];
                            float f3 = c11516wD0.f44713a.f8799h[i3];
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
        return this.f45479f[i];
    }

    @Override // p000.C0072B8
    /* renamed from: h */
    public final void mo525h(C0072B8 c0072b8, boolean z) {
        P21 p21 = c0072b8.f580a;
        if (p21 == null) {
            return;
        }
        InterfaceC0009A8 interfaceC0009A8 = c0072b8.f583d;
        int iMo68c = interfaceC0009A8.mo68c();
        for (int i = 0; i < iMo68c; i++) {
            P21 p21Mo69d = interfaceC0009A8.mo69d(i);
            float fMo72g = interfaceC0009A8.mo72g(i);
            C11516wD0 c11516wD0 = this.f45482i;
            c11516wD0.f44713a = p21Mo69d;
            boolean z2 = p21Mo69d.f8792a;
            float[] fArr = p21.f8799h;
            if (z2) {
                boolean z3 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = c11516wD0.f44713a.f8799h;
                    float f = (fArr[i2] * fMo72g) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        c11516wD0.f44713a.f8799h[i2] = 0.0f;
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    c11516wD0.f44714b.m25820j(c11516wD0.f44713a);
                }
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * fMo72g;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        c11516wD0.f44713a.f8799h[i3] = f3;
                    } else {
                        c11516wD0.f44713a.f8799h[i3] = 0.0f;
                    }
                }
                m25819i(p21Mo69d);
            }
            this.f581b = (c0072b8.f581b * fMo72g) + this.f581b;
        }
        m25820j(p21);
    }

    /* renamed from: i */
    public final void m25819i(P21 p21) {
        int i;
        int i2 = this.f45481h + 1;
        P21[] p21Arr = this.f45479f;
        if (i2 > p21Arr.length) {
            P21[] p21Arr2 = (P21[]) Arrays.copyOf(p21Arr, p21Arr.length * 2);
            this.f45479f = p21Arr2;
            this.f45480g = (P21[]) Arrays.copyOf(p21Arr2, p21Arr2.length * 2);
        }
        P21[] p21Arr3 = this.f45479f;
        int i3 = this.f45481h;
        p21Arr3[i3] = p21;
        int i4 = i3 + 1;
        this.f45481h = i4;
        if (i4 > 1 && p21Arr3[i3].f8793b > p21.f8793b) {
            int i5 = 0;
            while (true) {
                i = this.f45481h;
                if (i5 >= i) {
                    break;
                }
                this.f45480g[i5] = this.f45479f[i5];
                i5++;
            }
            Arrays.sort(this.f45480g, 0, i, new C8774aq0(20));
            for (int i6 = 0; i6 < this.f45481h; i6++) {
                this.f45479f[i6] = this.f45480g[i6];
            }
        }
        p21.f8792a = true;
        p21.m6208a(this);
    }

    /* renamed from: j */
    public final void m25820j(P21 p21) {
        int i = 0;
        while (i < this.f45481h) {
            if (this.f45479f[i] == p21) {
                while (true) {
                    int i2 = this.f45481h;
                    if (i >= i2 - 1) {
                        this.f45481h = i2 - 1;
                        p21.f8792a = false;
                        return;
                    } else {
                        P21[] p21Arr = this.f45479f;
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

    @Override // p000.C0072B8
    public final String toString() {
        String str = " goal -> (" + this.f581b + ") : ";
        for (int i = 0; i < this.f45481h; i++) {
            P21 p21 = this.f45479f[i];
            C11516wD0 c11516wD0 = this.f45482i;
            c11516wD0.f44713a = p21;
            str = str + c11516wD0 + " ";
        }
        return str;
    }
}
