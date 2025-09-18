package p000;

/* renamed from: Vb1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8409Vb1 {

    /* renamed from: a */
    public final C7993Nb1 f12631a;

    /* renamed from: b */
    public final int f12632b;

    /* renamed from: c */
    public final long[] f12633c;

    /* renamed from: d */
    public final int[] f12634d;

    /* renamed from: e */
    public final int f12635e;

    /* renamed from: f */
    public final long[] f12636f;

    /* renamed from: g */
    public final int[] f12637g;

    /* renamed from: h */
    public final long f12638h;

    public C8409Vb1(C7993Nb1 c7993Nb1, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        YN1.m9278c(iArr.length == jArr2.length);
        YN1.m9278c(jArr.length == jArr2.length);
        YN1.m9278c(iArr2.length == jArr2.length);
        this.f12631a = c7993Nb1;
        this.f12633c = jArr;
        this.f12634d = iArr;
        this.f12635e = i;
        this.f12636f = jArr2;
        this.f12637g = iArr2;
        this.f12638h = j;
        this.f12632b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* renamed from: a */
    public final int m8512a(long j) {
        long[] jArr = this.f12636f;
        for (int iM1814b = AbstractC7485Dh1.m1814b(jArr, j, true); iM1814b < jArr.length; iM1814b++) {
            if ((this.f12637g[iM1814b] & 1) != 0) {
                return iM1814b;
            }
        }
        return -1;
    }
}
