package p000;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class MI1 {

    /* renamed from: f */
    public static final MI1 f7082f = new MI1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f7083a;

    /* renamed from: b */
    public int[] f7084b;

    /* renamed from: c */
    public Object[] f7085c;

    /* renamed from: d */
    public int f7086d = -1;

    /* renamed from: e */
    public boolean f7087e;

    public MI1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f7083a = i;
        this.f7084b = iArr;
        this.f7085c = objArr;
        this.f7087e = z;
    }

    /* renamed from: b */
    public static MI1 m5297b() {
        return new MI1(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m5298a() {
        int iM21992r;
        int iM21993s;
        int iM21992r2;
        int i = this.f7086d;
        if (i != -1) {
            return i;
        }
        int iM21992r3 = 0;
        for (int i2 = 0; i2 < this.f7083a; i2++) {
            int i3 = this.f7084b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.f7085c[i2]).getClass();
                    iM21992r2 = C9854jD1.m21992r(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    C11769yC1 c11769yC1 = (C11769yC1) this.f7085c[i2];
                    int iM21992r4 = C9854jD1.m21992r(i6);
                    int iMo23955h = c11769yC1.mo23955h();
                    iM21992r3 = C9854jD1.m21992r(iMo23955h) + iMo23955h + iM21992r4 + iM21992r3;
                } else if (i5 == 3) {
                    int iM21992r5 = C9854jD1.m21992r(i4 << 3);
                    iM21992r = iM21992r5 + iM21992r5;
                    iM21993s = ((MI1) this.f7085c[i2]).m5298a();
                } else {
                    if (i5 != 5) {
                        int i7 = C10114lF1.f36988a;
                        throw new IllegalStateException(new C9602hF1("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.f7085c[i2]).getClass();
                    iM21992r2 = C9854jD1.m21992r(i4 << 3) + 4;
                }
                iM21992r3 = iM21992r2 + iM21992r3;
            } else {
                int i8 = i4 << 3;
                long jLongValue = ((Long) this.f7085c[i2]).longValue();
                iM21992r = C9854jD1.m21992r(i8);
                iM21993s = C9854jD1.m21993s(jLongValue);
            }
            iM21992r3 = iM21993s + iM21992r + iM21992r3;
        }
        this.f7086d = iM21992r3;
        return iM21992r3;
    }

    /* renamed from: c */
    public final void m5299c(int i, Object obj) {
        if (!this.f7087e) {
            throw new UnsupportedOperationException();
        }
        m5301e(this.f7083a + 1);
        int[] iArr = this.f7084b;
        int i2 = this.f7083a;
        iArr[i2] = i;
        this.f7085c[i2] = obj;
        this.f7083a = i2 + 1;
    }

    /* renamed from: d */
    public final void m5300d(C10525oT0 c10525oT0) {
        if (this.f7083a != 0) {
            for (int i = 0; i < this.f7083a; i++) {
                int i2 = this.f7084b[i];
                Object obj = this.f7085c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    c10525oT0.m23423H(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    c10525oT0.m23419D(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    c10525oT0.m23436y(i4, (C11769yC1) obj);
                } else if (i3 == 3) {
                    ((C9854jD1) c10525oT0.f39025a).m22002k(i4, 3);
                    ((MI1) obj).m5300d(c10525oT0);
                    ((C9854jD1) c10525oT0.f39025a).m22002k(i4, 4);
                } else {
                    if (i3 != 5) {
                        int i5 = C10114lF1.f36988a;
                        throw new RuntimeException(new C9602hF1("Protocol message tag had invalid wire type."));
                    }
                    c10525oT0.m23418C(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* renamed from: e */
    public final void m5301e(int i) {
        int[] iArr = this.f7084b;
        if (i > iArr.length) {
            int i2 = this.f7083a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f7084b = Arrays.copyOf(iArr, i);
            this.f7085c = Arrays.copyOf(this.f7085c, i);
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
        int i = this.f7083a;
        if (i == mi1.f7083a) {
            int[] iArr = this.f7084b;
            int[] iArr2 = mi1.f7084b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f7085c;
                    Object[] objArr2 = mi1.f7085c;
                    int i3 = this.f7083a;
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
        int i = this.f7083a;
        int i2 = i + 527;
        int[] iArr = this.f7084b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f7085c;
        int i6 = this.f7083a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
