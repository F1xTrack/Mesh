package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class MI1 {
    public static final MI1 f = new MI1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public MI1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static MI1 b() {
        return new MI1(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iR;
        int iS;
        int iR2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iR3 = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.c[i2]).getClass();
                    iR2 = C5271jD1.r(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    C8129yC1 c8129yC1 = (C8129yC1) this.c[i2];
                    int iR4 = C5271jD1.r(i6);
                    int iH = c8129yC1.h();
                    iR3 = C5271jD1.r(iH) + iH + iR4 + iR3;
                } else if (i5 == 3) {
                    int iR5 = C5271jD1.r(i4 << 3);
                    iR = iR5 + iR5;
                    iS = ((MI1) this.c[i2]).a();
                } else {
                    if (i5 != 5) {
                        int i7 = C5659lF1.a;
                        throw new IllegalStateException(new C4119hF1("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.c[i2]).getClass();
                    iR2 = C5271jD1.r(i4 << 3) + 4;
                }
                iR3 = iR2 + iR3;
            } else {
                int i8 = i4 << 3;
                long jLongValue = ((Long) this.c[i2]).longValue();
                iR = C5271jD1.r(i8);
                iS = C5271jD1.s(jLongValue);
            }
            iR3 = iS + iR + iR3;
        }
        this.d = iR3;
        return iR3;
    }

    public final void c(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(C6273oT0 c6273oT0) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    c6273oT0.H(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    c6273oT0.D(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    c6273oT0.y(i4, (C8129yC1) obj);
                } else if (i3 == 3) {
                    ((C5271jD1) c6273oT0.a).k(i4, 3);
                    ((MI1) obj).d(c6273oT0);
                    ((C5271jD1) c6273oT0.a).k(i4, 4);
                } else {
                    if (i3 != 5) {
                        int i5 = C5659lF1.a;
                        throw new RuntimeException(new C4119hF1("Protocol message tag had invalid wire type."));
                    }
                    c6273oT0.C(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MI1)) {
            return false;
        }
        MI1 mi1 = (MI1) obj;
        int i = this.a;
        if (i == mi1.a) {
            int[] iArr = this.b;
            int[] iArr2 = mi1.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = mi1.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
