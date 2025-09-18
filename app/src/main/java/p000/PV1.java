package p000;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class PV1 {

    /* renamed from: f */
    public static final PV1 f9096f = new PV1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f9097a;

    /* renamed from: b */
    public int[] f9098b;

    /* renamed from: c */
    public Object[] f9099c;

    /* renamed from: d */
    public int f9100d = -1;

    /* renamed from: e */
    public boolean f9101e;

    public PV1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f9097a = i;
        this.f9098b = iArr;
        this.f9099c = objArr;
        this.f9101e = z;
    }

    /* renamed from: e */
    public static PV1 m6377e() {
        return new PV1(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m6378a() {
        int iM18539u;
        int i = this.f9100d;
        if (i != -1) {
            return i;
        }
        int iM6378a = 0;
        for (int i2 = 0; i2 < this.f9097a; i2++) {
            int i3 = this.f9098b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM18539u = C9498gR1.m18539u(i4, ((Long) this.f9099c[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f9099c[i2]).getClass();
                iM18539u = C9498gR1.m18531j(i4);
            } else if (i5 == 2) {
                iM18539u = C9498gR1.m18527e(i4, (JQ1) this.f9099c[i2]);
            } else if (i5 == 3) {
                iM6378a = ((PV1) this.f9099c[i2]).m6378a() + (C9498gR1.m18541w(i4) << 1) + iM6378a;
            } else {
                if (i5 != 5) {
                    int i6 = VS1.f12585a;
                    throw new IllegalStateException(new SS1("Protocol message tag had invalid wire type."));
                }
                ((Integer) this.f9099c[i2]).getClass();
                iM18539u = C9498gR1.m18532l(i4);
            }
            iM6378a = iM18539u + iM6378a;
        }
        this.f9100d = iM6378a;
        return iM6378a;
    }

    /* renamed from: b */
    public final void m6379b(int i) {
        int[] iArr = this.f9098b;
        if (i > iArr.length) {
            int i2 = this.f9097a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f9098b = Arrays.copyOf(iArr, i);
            this.f9099c = Arrays.copyOf(this.f9099c, i);
        }
    }

    /* renamed from: c */
    public final void m6380c(int i, Object obj) {
        if (!this.f9101e) {
            throw new UnsupportedOperationException();
        }
        m6379b(this.f9097a + 1);
        int[] iArr = this.f9098b;
        int i2 = this.f9097a;
        iArr[i2] = i;
        this.f9099c[i2] = obj;
        this.f9097a = i2 + 1;
    }

    /* renamed from: d */
    public final void m6381d(C10641pN0 c10641pN0) {
        if (this.f9097a == 0) {
            return;
        }
        c10641pN0.getClass();
        for (int i = 0; i < this.f9097a; i++) {
            int i2 = this.f9098b[i];
            Object obj = this.f9099c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c10641pN0.m23748B(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c10641pN0.m23764w(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c10641pN0.m23766y(i3, (JQ1) obj);
            } else if (i4 == 3) {
                C9498gR1 c9498gR1 = (C9498gR1) c10641pN0.f40042b;
                c9498gR1.m18549H(i3, 3);
                ((PV1) obj).m6381d(c10641pN0);
                c9498gR1.m18549H(i3, 4);
            } else {
                if (i4 != 5) {
                    int i5 = VS1.f12585a;
                    throw new RuntimeException(new SS1("Protocol message tag had invalid wire type."));
                }
                c10641pN0.m23747A(i3, ((Integer) obj).intValue());
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
        int i = this.f9097a;
        if (i == pv1.f9097a) {
            int[] iArr = this.f9098b;
            int[] iArr2 = pv1.f9098b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f9099c;
                    Object[] objArr2 = pv1.f9099c;
                    int i3 = this.f9097a;
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
        int i = this.f9097a;
        int i2 = (i + 527) * 31;
        int[] iArr = this.f9098b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f9099c;
        int i6 = this.f9097a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
