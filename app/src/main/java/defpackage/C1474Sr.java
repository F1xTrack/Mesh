package defpackage;

import java.util.Arrays;

/* renamed from: Sr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1474Sr implements CX0 {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public C1474Sr(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // defpackage.CX0
    public final boolean e() {
        return true;
    }

    @Override // defpackage.CX0
    public final BX0 i(long j) {
        long[] jArr = this.e;
        int iF = AbstractC0277Dh1.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.c;
        EX0 ex0 = new EX0(j2, jArr2[iF]);
        if (j2 >= j || iF == this.a - 1) {
            return new BX0(ex0, ex0);
        }
        int i = iF + 1;
        return new BX0(ex0, new EX0(jArr[i], jArr2[i]));
    }

    @Override // defpackage.CX0
    public final long k() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
