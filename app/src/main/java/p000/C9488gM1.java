package p000;

import java.util.Arrays;

/* renamed from: gM1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9488gM1 {

    /* renamed from: f */
    public static final C9488gM1 f27699f = new C9488gM1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f27700a;

    /* renamed from: b */
    public int[] f27701b;

    /* renamed from: c */
    public Object[] f27702c;

    /* renamed from: d */
    public int f27703d = -1;

    /* renamed from: e */
    public boolean f27704e;

    public C9488gM1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f27700a = i;
        this.f27701b = iArr;
        this.f27702c = objArr;
        this.f27704e = z;
    }

    /* renamed from: b */
    public static C9488gM1 m18470b() {
        return new C9488gM1(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m18471a() {
        int iM8717b;
        int iM8718c;
        int iM8717b2;
        int i = this.f27703d;
        if (i != -1) {
            return i;
        }
        int iM8717b3 = 0;
        for (int i2 = 0; i2 < this.f27700a; i2++) {
            int i3 = this.f27701b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.f27702c[i2]).getClass();
                    iM8717b2 = WE1.m8717b(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    JE1 je1 = (JE1) this.f27702c[i2];
                    int iM8717b4 = WE1.m8717b(i6);
                    int iMo3006i = je1.mo3006i();
                    iM8717b3 = WE1.m8717b(iMo3006i) + iMo3006i + iM8717b4 + iM8717b3;
                } else if (i5 == 3) {
                    int iM8717b5 = WE1.m8717b(i4 << 3);
                    iM8717b = iM8717b5 + iM8717b5;
                    iM8718c = ((C9488gM1) this.f27702c[i2]).m18471a();
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(new C11906zH1());
                    }
                    ((Integer) this.f27702c[i2]).getClass();
                    iM8717b2 = WE1.m8717b(i4 << 3) + 4;
                }
                iM8717b3 = iM8717b2 + iM8717b3;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.f27702c[i2]).longValue();
                iM8717b = WE1.m8717b(i7);
                iM8718c = WE1.m8718c(jLongValue);
            }
            iM8717b3 = iM8718c + iM8717b + iM8717b3;
        }
        this.f27703d = iM8717b3;
        return iM8717b3;
    }

    /* renamed from: c */
    public final void m18472c(int i, Object obj) {
        if (!this.f27704e) {
            throw new UnsupportedOperationException();
        }
        m18474e(this.f27700a + 1);
        int[] iArr = this.f27701b;
        int i2 = this.f27700a;
        iArr[i2] = i;
        this.f27702c[i2] = obj;
        this.f27700a = i2 + 1;
    }

    /* renamed from: d */
    public final void m18473d(L21 l21) {
        if (this.f27700a != 0) {
            for (int i = 0; i < this.f27700a; i++) {
                int i2 = this.f27701b[i];
                Object obj = this.f27702c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    l21.m4891w(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    l21.m4887s(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    l21.m4882n(i4, (JE1) obj);
                } else if (i3 == 3) {
                    ((WE1) l21.f6473b).m8732n(i4, 3);
                    ((C9488gM1) obj).m18473d(l21);
                    ((WE1) l21.f6473b).m8732n(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new C11906zH1());
                    }
                    l21.m4886r(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    /* renamed from: e */
    public final void m18474e(int i) {
        int[] iArr = this.f27701b;
        if (i > iArr.length) {
            int i2 = this.f27700a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.f27701b = Arrays.copyOf(iArr, i);
            this.f27702c = Arrays.copyOf(this.f27702c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C9488gM1)) {
            return false;
        }
        C9488gM1 c9488gM1 = (C9488gM1) obj;
        int i = this.f27700a;
        if (i == c9488gM1.f27700a) {
            int[] iArr = this.f27701b;
            int[] iArr2 = c9488gM1.f27701b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f27702c;
                    Object[] objArr2 = c9488gM1.f27702c;
                    int i3 = this.f27700a;
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
        int i = this.f27700a;
        int i2 = i + 527;
        int[] iArr = this.f27701b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.f27702c;
        int i6 = this.f27700a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
