package p000;

import java.util.Arrays;

/* renamed from: hg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9656hg1 {

    /* renamed from: f */
    public static final C9656hg1 f28522f = new C9656hg1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f28523a;

    /* renamed from: b */
    public int[] f28524b;

    /* renamed from: c */
    public Object[] f28525c;

    /* renamed from: d */
    public int f28526d = -1;

    /* renamed from: e */
    public boolean f28527e;

    public C9656hg1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f28523a = i;
        this.f28524b = iArr;
        this.f28525c = objArr;
        this.f28527e = z;
    }

    /* renamed from: b */
    public static C9656hg1 m18844b() {
        return new C9656hg1(0, new int[8], new Object[8], true);
    }

    /* renamed from: a */
    public final int m18845a() {
        int iM24081C;
        int i = this.f28526d;
        if (i != -1) {
            return i;
        }
        int iM18845a = 0;
        for (int i2 = 0; i2 < this.f28523a; i2++) {
            int i3 = this.f28524b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM24081C = C6709qu.m24081C(i4, ((Long) this.f28525c[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f28525c[i2]).getClass();
                iM24081C = C6709qu.m24089n(i4);
            } else if (i5 == 2) {
                iM24081C = C6709qu.m24084i(i4, (C0362Fk) this.f28525c[i2]);
            } else if (i5 == 3) {
                iM18845a = ((C9656hg1) this.f28525c[i2]).m18845a() + (C6709qu.m24101z(i4) * 2) + iM18845a;
            } else {
                if (i5 != 5) {
                    throw new IllegalStateException(Z90.m9497b());
                }
                ((Integer) this.f28525c[i2]).getClass();
                iM24081C = C6709qu.m24088m(i4);
            }
            iM18845a = iM24081C + iM18845a;
        }
        this.f28526d = iM18845a;
        return iM18845a;
    }

    /* renamed from: c */
    public final void m18846c(int i, Object obj) {
        if (!this.f28527e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.f28523a;
        int[] iArr = this.f28524b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f28524b = Arrays.copyOf(iArr, i3);
            this.f28525c = Arrays.copyOf(this.f28525c, i3);
        }
        int[] iArr2 = this.f28524b;
        int i4 = this.f28523a;
        iArr2[i4] = i;
        this.f28525c[i4] = obj;
        this.f28523a = i4 + 1;
    }

    /* renamed from: d */
    public final void m18847d(C8170Qm0 c8170Qm0) {
        if (this.f28523a == 0) {
            return;
        }
        c8170Qm0.getClass();
        for (int i = 0; i < this.f28523a; i++) {
            int i2 = this.f28524b[i];
            Object obj = this.f28525c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c8170Qm0.m6764K(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c8170Qm0.m6758E(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c8170Qm0.m6754A(i3, (C0362Fk) obj);
            } else if (i4 == 3) {
                C6709qu c6709qu = (C6709qu) c8170Qm0.f9780b;
                c6709qu.m24117T(i3, 3);
                ((C9656hg1) obj).m18847d(c8170Qm0);
                c6709qu.m24117T(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(Z90.m9497b());
                }
                c8170Qm0.m6757D(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C9656hg1)) {
            return false;
        }
        C9656hg1 c9656hg1 = (C9656hg1) obj;
        int i = this.f28523a;
        if (i == c9656hg1.f28523a) {
            int[] iArr = this.f28524b;
            int[] iArr2 = c9656hg1.f28524b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f28525c;
                    Object[] objArr2 = c9656hg1.f28525c;
                    int i3 = this.f28523a;
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
        int i = this.f28523a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f28524b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f28525c;
        int i6 = this.f28523a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
