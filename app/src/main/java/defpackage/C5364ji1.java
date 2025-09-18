package defpackage;

/* renamed from: ji1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5364ji1 implements GX0 {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public C5364ji1(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // defpackage.GX0
    public final long a(long j) {
        return this.a[AbstractC0277Dh1.f(this.b, j, true)];
    }

    @Override // defpackage.GX0
    public final long c() {
        return this.d;
    }

    @Override // defpackage.CX0
    public final boolean e() {
        return true;
    }

    @Override // defpackage.CX0
    public final BX0 i(long j) {
        long[] jArr = this.a;
        int iF = AbstractC0277Dh1.f(jArr, j, true);
        long j2 = jArr[iF];
        long[] jArr2 = this.b;
        EX0 ex0 = new EX0(j2, jArr2[iF]);
        if (j2 >= j || iF == jArr.length - 1) {
            return new BX0(ex0, ex0);
        }
        int i = iF + 1;
        return new BX0(ex0, new EX0(jArr[i], jArr2[i]));
    }

    @Override // defpackage.GX0
    public final int j() {
        return this.e;
    }

    @Override // defpackage.CX0
    public final long k() {
        return this.c;
    }
}
