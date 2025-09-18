package p000;

import java.util.Arrays;

/* renamed from: Sr */
/* loaded from: classes.dex */
public final class C1186Sr implements CX0 {

    /* renamed from: a */
    public final int f11004a;

    /* renamed from: b */
    public final int[] f11005b;

    /* renamed from: c */
    public final long[] f11006c;

    /* renamed from: d */
    public final long[] f11007d;

    /* renamed from: e */
    public final long[] f11008e;

    /* renamed from: f */
    public final long f11009f;

    public C1186Sr(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f11005b = iArr;
        this.f11006c = jArr;
        this.f11007d = jArr2;
        this.f11008e = jArr3;
        int length = iArr.length;
        this.f11004a = length;
        if (length > 0) {
            this.f11009f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f11009f = 0L;
        }
    }

    @Override // p000.CX0
    /* renamed from: e */
    public final boolean mo413e() {
        return true;
    }

    @Override // p000.CX0
    /* renamed from: i */
    public final BX0 mo414i(long j) {
        long[] jArr = this.f11008e;
        int iM1821f = AbstractC7485Dh1.m1821f(jArr, j, true);
        long j2 = jArr[iM1821f];
        long[] jArr2 = this.f11006c;
        EX0 ex0 = new EX0(j2, jArr2[iM1821f]);
        if (j2 >= j || iM1821f == this.f11004a - 1) {
            return new BX0(ex0, ex0);
        }
        int i = iM1821f + 1;
        return new BX0(ex0, new EX0(jArr[i], jArr2[i]));
    }

    @Override // p000.CX0
    /* renamed from: k */
    public final long mo415k() {
        return this.f11009f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f11004a + ", sizes=" + Arrays.toString(this.f11005b) + ", offsets=" + Arrays.toString(this.f11006c) + ", timeUs=" + Arrays.toString(this.f11008e) + ", durationsUs=" + Arrays.toString(this.f11007d) + ")";
    }
}
