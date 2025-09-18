package defpackage;

import java.util.Arrays;

/* renamed from: gM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3949gM1 {
    public static final C3949gM1 f = new C3949gM1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public C3949gM1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static C3949gM1 b() {
        return new C3949gM1(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int iB;
        int iC;
        int iB2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iB3 = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.c[i2]).getClass();
                    iB2 = WE1.b(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    JE1 je1 = (JE1) this.c[i2];
                    int iB4 = WE1.b(i6);
                    int i7 = je1.i();
                    iB3 = WE1.b(i7) + i7 + iB4 + iB3;
                } else if (i5 == 3) {
                    int iB5 = WE1.b(i4 << 3);
                    iB = iB5 + iB5;
                    iC = ((C3949gM1) this.c[i2]).a();
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(new C8334zH1());
                    }
                    ((Integer) this.c[i2]).getClass();
                    iB2 = WE1.b(i4 << 3) + 4;
                }
                iB3 = iB2 + iB3;
            } else {
                int i8 = i4 << 3;
                long jLongValue = ((Long) this.c[i2]).longValue();
                iB = WE1.b(i8);
                iC = WE1.c(jLongValue);
            }
            iB3 = iC + iB + iB3;
        }
        this.d = iB3;
        return iB3;
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

    public final void d(L21 l21) {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    l21.w(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    l21.s(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    l21.n(i4, (JE1) obj);
                } else if (i3 == 3) {
                    ((WE1) l21.b).n(i4, 3);
                    ((C3949gM1) obj).d(l21);
                    ((WE1) l21.b).n(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new C8334zH1());
                    }
                    l21.r(i4, ((Integer) obj).intValue());
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
        if (obj == null || !(obj instanceof C3949gM1)) {
            return false;
        }
        C3949gM1 c3949gM1 = (C3949gM1) obj;
        int i = this.a;
        if (i == c3949gM1.a) {
            int[] iArr = this.b;
            int[] iArr2 = c3949gM1.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = c3949gM1.c;
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
