package defpackage;

/* renamed from: gg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4009gg1 {
    public static final C4009gg1 f = new C4009gg1(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public C4009gg1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public final int a() {
        int iW;
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
                iW = C6162nu.w(i4, ((Long) this.c[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.c[i2]).getClass();
                iW = C6162nu.h(i4);
            } else if (i5 == 2) {
                iW = C6162nu.c(i4, (C0362Ek) this.c[i2]);
            } else if (i5 == 3) {
                iA = ((C4009gg1) this.c[i2]).a() + (C6162nu.t(i4) * 2) + iA;
            } else {
                if (i5 != 5) {
                    int i6 = X90.a;
                    throw new IllegalStateException(new V90("Protocol message tag had invalid wire type."));
                }
                ((Integer) this.c[i2]).getClass();
                iW = C6162nu.g(i4);
            }
            iA = iW + iA;
        }
        this.d = iA;
        return iA;
    }

    public final void b(C1562Tu0 c1562Tu0) {
        if (this.a == 0) {
            return;
        }
        c1562Tu0.getClass();
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c1562Tu0.D0(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c1562Tu0.z0(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c1562Tu0.u0(i3, (C0362Ek) obj);
            } else if (i4 == 3) {
                C6162nu c6162nu = (C6162nu) c1562Tu0.b;
                c6162nu.H(i3, 3);
                ((C4009gg1) obj).b(c1562Tu0);
                c6162nu.H(i3, 4);
            } else {
                if (i4 != 5) {
                    int i5 = X90.a;
                    throw new RuntimeException(new V90("Protocol message tag had invalid wire type."));
                }
                c1562Tu0.y0(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C4009gg1)) {
            return false;
        }
        C4009gg1 c4009gg1 = (C4009gg1) obj;
        int i = this.a;
        if (i == c4009gg1.a) {
            int[] iArr = this.b;
            int[] iArr2 = c4009gg1.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = c4009gg1.c;
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
        int i2 = (527 + i) * 31;
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
