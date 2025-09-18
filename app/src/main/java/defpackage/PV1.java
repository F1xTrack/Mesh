package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class PV1 {
    public static final PV1 f = new PV1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public PV1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static PV1 e() {
        return new PV1(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iU;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iA = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iU = C3964gR1.u(i4, ((Long) this.c[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.c[i2]).getClass();
                iU = C3964gR1.j(i4);
            } else if (i5 == 2) {
                iU = C3964gR1.e(i4, (JQ1) this.c[i2]);
            } else if (i5 == 3) {
                iA = ((PV1) this.c[i2]).a() + (C3964gR1.w(i4) << 1) + iA;
            } else {
                if (i5 != 5) {
                    int i6 = VS1.a;
                    throw new IllegalStateException(new SS1("Protocol message tag had invalid wire type."));
                }
                ((Integer) this.c[i2]).getClass();
                iU = C3964gR1.l(i4);
            }
            iA = iU + iA;
        }
        this.d = iA;
        return iA;
    }

    public final void b(int i) {
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

    public final void c(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        b(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void d(C6446pN0 c6446pN0) {
        if (this.a == 0) {
            return;
        }
        c6446pN0.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c6446pN0.B(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c6446pN0.w(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c6446pN0.y(i3, (JQ1) obj);
            } else if (i4 == 3) {
                C3964gR1 c3964gR1 = (C3964gR1) c6446pN0.b;
                c3964gR1.H(i3, 3);
                ((PV1) obj).d(c6446pN0);
                c3964gR1.H(i3, 4);
            } else {
                if (i4 != 5) {
                    int i5 = VS1.a;
                    throw new RuntimeException(new SS1("Protocol message tag had invalid wire type."));
                }
                c6446pN0.A(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof PV1)) {
            return false;
        }
        PV1 pv1 = (PV1) obj;
        int i = this.a;
        if (i == pv1.a) {
            int[] iArr = this.b;
            int[] iArr2 = pv1.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = pv1.c;
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
        int i2 = (i + 527) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
