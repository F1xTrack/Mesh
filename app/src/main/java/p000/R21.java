package p000;

import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class R21 {

    /* renamed from: a */
    public final int f9929a;

    /* renamed from: b */
    public final int f9930b;

    /* renamed from: c */
    public final float f9931c;

    /* renamed from: d */
    public final float f9932d;

    /* renamed from: e */
    public final float f9933e;

    /* renamed from: f */
    public final int f9934f;

    /* renamed from: g */
    public final int f9935g;

    /* renamed from: h */
    public final int f9936h;

    /* renamed from: i */
    public final short[] f9937i;

    /* renamed from: j */
    public short[] f9938j;

    /* renamed from: k */
    public int f9939k;

    /* renamed from: l */
    public short[] f9940l;

    /* renamed from: m */
    public int f9941m;

    /* renamed from: n */
    public short[] f9942n;

    /* renamed from: o */
    public int f9943o;

    /* renamed from: p */
    public int f9944p;

    /* renamed from: q */
    public int f9945q;

    /* renamed from: r */
    public int f9946r;

    /* renamed from: s */
    public int f9947s;

    /* renamed from: t */
    public int f9948t;

    /* renamed from: u */
    public int f9949u;

    /* renamed from: v */
    public int f9950v;

    public R21(int i, int i2, float f, float f2, int i3) {
        this.f9929a = i;
        this.f9930b = i2;
        this.f9931c = f;
        this.f9932d = f2;
        this.f9933e = i / i3;
        this.f9934f = i / 400;
        int i4 = i / 65;
        this.f9935g = i4;
        int i5 = i4 * 2;
        this.f9936h = i5;
        this.f9937i = new short[i5];
        this.f9938j = new short[i5 * i2];
        this.f9940l = new short[i5 * i2];
        this.f9942n = new short[i5 * i2];
    }

    /* renamed from: e */
    public static void m6881e(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* renamed from: a */
    public final void m6882a(short[] sArr, int i, int i2) {
        short[] sArrM6884c = m6884c(this.f9940l, this.f9941m, i2);
        this.f9940l = sArrM6884c;
        int i3 = this.f9930b;
        System.arraycopy(sArr, i * i3, sArrM6884c, this.f9941m * i3, i3 * i2);
        this.f9941m += i2;
    }

    /* renamed from: b */
    public final void m6883b(short[] sArr, int i, int i2) {
        int i3 = this.f9936h / i2;
        int i4 = this.f9930b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f9937i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: c */
    public final short[] m6884c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f9930b;
        int i4 = length / i3;
        return i + i2 <= i4 ? sArr : Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: d */
    public final int m6885d(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f9930b;
        int i5 = KotlinVersion.MAX_COMPONENT_VALUE;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int iAbs = 0;
            for (int i9 = 0; i9 < i2; i9++) {
                iAbs += Math.abs(sArr[i4 + i9] - sArr[(i4 + i2) + i9]);
            }
            if (iAbs * i7 < i6 * i2) {
                i7 = i2;
                i6 = iAbs;
            }
            if (iAbs * i5 > i8 * i2) {
                i5 = i2;
                i8 = iAbs;
            }
            i2++;
        }
        this.f9949u = i6 / i7;
        this.f9950v = i8 / i5;
        return i7;
    }

    /* renamed from: f */
    public final void m6886f() {
        int i;
        int i2;
        float f;
        int iM6885d;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = this.f9941m;
        float f2 = this.f9931c;
        float f3 = this.f9932d;
        float f4 = f2 / f3;
        float f5 = this.f9933e * f3;
        double d = f4;
        int i12 = this.f9929a;
        int i13 = this.f9930b;
        int i14 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i15 = this.f9939k;
            int i16 = this.f9936h;
            if (i15 >= i16) {
                int i17 = 0;
                while (true) {
                    int i18 = this.f9946r;
                    if (i18 > 0) {
                        int iMin = Math.min(i16, i18);
                        m6882a(this.f9938j, i17, iMin);
                        this.f9946r -= iMin;
                        i17 += iMin;
                        i2 = i11;
                        f = f5;
                        i = i12;
                    } else {
                        short[] sArr = this.f9938j;
                        int i19 = i12 > 4000 ? i12 / 4000 : i14;
                        int i20 = this.f9935g;
                        int i21 = this.f9934f;
                        if (i13 == i14 && i19 == i14) {
                            iM6885d = m6885d(sArr, i17, i21, i20);
                            i2 = i11;
                            f = f5;
                            i = i12;
                        } else {
                            m6883b(sArr, i17, i19);
                            i = i12;
                            i2 = i11;
                            short[] sArr2 = this.f9937i;
                            f = f5;
                            int iM6885d2 = m6885d(sArr2, 0, i21 / i19, i20 / i19);
                            if (i19 != 1) {
                                int i22 = iM6885d2 * i19;
                                int i23 = i19 * 4;
                                int i24 = i22 - i23;
                                int i25 = i22 + i23;
                                if (i24 >= i21) {
                                    i21 = i24;
                                }
                                if (i25 <= i20) {
                                    i20 = i25;
                                }
                                if (i13 == 1) {
                                    iM6885d = m6885d(sArr, i17, i21, i20);
                                } else {
                                    m6883b(sArr, i17, 1);
                                    iM6885d = m6885d(sArr2, 0, i21, i20);
                                }
                            } else {
                                iM6885d = iM6885d2;
                            }
                        }
                        int i26 = this.f9949u;
                        int i27 = this.f9950v;
                        if (i26 == 0 || (i3 = this.f9947s) == 0 || i27 > i26 * 3 || i26 * 2 <= this.f9948t * 3) {
                            i3 = iM6885d;
                        }
                        this.f9948t = i26;
                        this.f9947s = iM6885d;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f9938j;
                            if (f4 >= 2.0f) {
                                i5 = (int) (i3 / (f4 - 1.0f));
                            } else {
                                this.f9946r = (int) (((2.0f - f4) * i3) / (f4 - 1.0f));
                                i5 = i3;
                            }
                            short[] sArrM6884c = m6884c(this.f9940l, this.f9941m, i5);
                            this.f9940l = sArrM6884c;
                            int i28 = i17;
                            m6881e(i5, this.f9930b, sArrM6884c, this.f9941m, sArr3, i28, sArr3, i17 + i3);
                            this.f9941m += i5;
                            i17 = i3 + i5 + i28;
                        } else {
                            int i29 = i17;
                            short[] sArr4 = this.f9938j;
                            if (f4 < 0.5f) {
                                i4 = (int) ((i3 * f4) / (1.0f - f4));
                            } else {
                                this.f9946r = (int) ((((2.0f * f4) - 1.0f) * i3) / (1.0f - f4));
                                i4 = i3;
                            }
                            int i30 = i3 + i4;
                            short[] sArrM6884c2 = m6884c(this.f9940l, this.f9941m, i30);
                            this.f9940l = sArrM6884c2;
                            System.arraycopy(sArr4, i29 * i13, sArrM6884c2, this.f9941m * i13, i3 * i13);
                            m6881e(i4, this.f9930b, this.f9940l, this.f9941m + i3, sArr4, i29 + i3, sArr4, i29);
                            this.f9941m += i30;
                            i17 = i29 + i4;
                        }
                    }
                    if (i17 + i16 > i15) {
                        break;
                    }
                    i12 = i;
                    i11 = i2;
                    f5 = f;
                    i14 = 1;
                }
                int i31 = this.f9939k - i17;
                short[] sArr5 = this.f9938j;
                System.arraycopy(sArr5, i17 * i13, sArr5, 0, i31 * i13);
                this.f9939k = i31;
            }
            if (f != 1.0f || this.f9941m == (i6 = i2)) {
            }
            int i32 = i;
            int i33 = (int) (i32 / f);
            int i34 = i32;
            while (true) {
                if (i33 <= 16384 && i34 <= 16384) {
                    break;
                }
                i33 /= 2;
                i34 /= 2;
            }
            int i35 = this.f9941m - i6;
            short[] sArrM6884c3 = m6884c(this.f9942n, this.f9943o, i35);
            this.f9942n = sArrM6884c3;
            System.arraycopy(this.f9940l, i6 * i13, sArrM6884c3, this.f9943o * i13, i35 * i13);
            this.f9941m = i6;
            this.f9943o += i35;
            int i36 = 0;
            while (true) {
                i7 = this.f9943o;
                i8 = i7 - 1;
                if (i36 >= i8) {
                    break;
                }
                while (true) {
                    i9 = this.f9944p + 1;
                    int i37 = i9 * i33;
                    i10 = this.f9945q;
                    if (i37 <= i10 * i34) {
                        break;
                    }
                    this.f9940l = m6884c(this.f9940l, this.f9941m, 1);
                    for (int i38 = 0; i38 < i13; i38++) {
                        short[] sArr6 = this.f9940l;
                        int i39 = (this.f9941m * i13) + i38;
                        short[] sArr7 = this.f9942n;
                        int i40 = (i36 * i13) + i38;
                        short s = sArr7[i40];
                        short s2 = sArr7[i40 + i13];
                        int i41 = this.f9945q * i34;
                        int i42 = this.f9944p;
                        int i43 = i42 * i33;
                        int i44 = (i42 + 1) * i33;
                        int i45 = i44 - i41;
                        int i46 = i44 - i43;
                        sArr6[i39] = (short) ((((i46 - i45) * s2) + (s * i45)) / i46);
                    }
                    this.f9945q++;
                    this.f9941m++;
                }
                this.f9944p = i9;
                if (i9 == i34) {
                    this.f9944p = 0;
                    YN1.m9281f(i10 == i33);
                    this.f9945q = 0;
                }
                i36++;
            }
            if (i8 == 0) {
                return;
            }
            short[] sArr8 = this.f9942n;
            System.arraycopy(sArr8, i8 * i13, sArr8, 0, (i7 - i8) * i13);
            this.f9943o -= i8;
            return;
        }
        m6882a(this.f9938j, 0, this.f9939k);
        this.f9939k = 0;
        i2 = i11;
        f = f5;
        i = i12;
        if (f != 1.0f) {
        }
    }
}
