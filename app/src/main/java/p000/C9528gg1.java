package p000;

/* renamed from: gg1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9528gg1 {

    /* renamed from: f */
    public static final C9528gg1 f27928f = new C9528gg1(0, new int[0], new Object[0], false);

    /* renamed from: a */
    public int f27929a;

    /* renamed from: b */
    public int[] f27930b;

    /* renamed from: c */
    public Object[] f27931c;

    /* renamed from: d */
    public int f27932d = -1;

    /* renamed from: e */
    public boolean f27933e;

    public C9528gg1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f27929a = i;
        this.f27930b = iArr;
        this.f27931c = objArr;
        this.f27933e = z;
    }

    /* renamed from: a */
    public final int m18596a() {
        int iM23265w;
        int i = this.f27932d;
        if (i != -1) {
            return i;
        }
        int iM18596a = 0;
        for (int i2 = 0; i2 < this.f27929a; i2++) {
            int i3 = this.f27930b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM23265w = C6518nu.m23265w(i4, ((Long) this.f27931c[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f27931c[i2]).getClass();
                iM23265w = C6518nu.m23250h(i4);
            } else if (i5 == 2) {
                iM23265w = C6518nu.m23245c(i4, (C0299Ek) this.f27931c[i2]);
            } else if (i5 == 3) {
                iM18596a = ((C9528gg1) this.f27931c[i2]).m18596a() + (C6518nu.m23262t(i4) * 2) + iM18596a;
            } else {
                if (i5 != 5) {
                    int i6 = X90.f13582a;
                    throw new IllegalStateException(new V90("Protocol message tag had invalid wire type."));
                }
                ((Integer) this.f27931c[i2]).getClass();
                iM23265w = C6518nu.m23249g(i4);
            }
            iM18596a = iM23265w + iM18596a;
        }
        this.f27932d = iM18596a;
        return iM18596a;
    }

    /* renamed from: b */
    public final void m18597b(C8342Tu0 c8342Tu0) {
        if (this.f27929a == 0) {
            return;
        }
        c8342Tu0.getClass();
        for (int i = 0; i < this.f27929a; i++) {
            int i2 = this.f27930b[i];
            Object obj = this.f27931c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c8342Tu0.m7807D0(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c8342Tu0.m7825z0(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c8342Tu0.m7821u0(i3, (C0299Ek) obj);
            } else if (i4 == 3) {
                C6518nu c6518nu = (C6518nu) c8342Tu0.f11590b;
                c6518nu.m23274H(i3, 3);
                ((C9528gg1) obj).m18597b(c8342Tu0);
                c6518nu.m23274H(i3, 4);
            } else {
                if (i4 != 5) {
                    int i5 = X90.f13582a;
                    throw new RuntimeException(new V90("Protocol message tag had invalid wire type."));
                }
                c8342Tu0.m7824y0(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C9528gg1)) {
            return false;
        }
        C9528gg1 c9528gg1 = (C9528gg1) obj;
        int i = this.f27929a;
        if (i == c9528gg1.f27929a) {
            int[] iArr = this.f27930b;
            int[] iArr2 = c9528gg1.f27930b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.f27931c;
                    Object[] objArr2 = c9528gg1.f27931c;
                    int i3 = this.f27929a;
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
        int i = this.f27929a;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f27930b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f27931c;
        int i6 = this.f27929a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
