package defpackage;

/* renamed from: g80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3906g80 implements CX0 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final boolean d;

    public C3906g80(long j, long[] jArr, long[] jArr2) {
        YN1.c(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.d = z;
        if (!z || jArr2[0] <= 0) {
            this.a = jArr;
            this.b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.a = jArr3;
            long[] jArr4 = new long[i];
            this.b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.c = j;
    }

    @Override // defpackage.CX0
    public final boolean e() {
        return this.d;
    }

    @Override // defpackage.CX0
    public final BX0 i(long j) {
        if (!this.d) {
            EX0 ex0 = EX0.c;
            return new BX0(ex0, ex0);
        }
        long[] jArr = this.b;
        int iF = AbstractC0277Dh1.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.a;
        EX0 ex02 = new EX0(j2, jArr2[iF]);
        if (j2 == j || iF == jArr.length - 1) {
            return new BX0(ex02, ex02);
        }
        int i = iF + 1;
        return new BX0(ex02, new EX0(jArr[i], jArr2[i]));
    }

    @Override // defpackage.CX0
    public final long k() {
        return this.c;
    }
}
