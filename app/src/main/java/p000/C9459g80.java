package p000;

/* renamed from: g80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9459g80 implements CX0 {

    /* renamed from: a */
    public final long[] f27579a;

    /* renamed from: b */
    public final long[] f27580b;

    /* renamed from: c */
    public final long f27581c;

    /* renamed from: d */
    public final boolean f27582d;

    public C9459g80(long j, long[] jArr, long[] jArr2) {
        YN1.m9278c(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f27582d = z;
        if (!z || jArr2[0] <= 0) {
            this.f27579a = jArr;
            this.f27580b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f27579a = jArr3;
            long[] jArr4 = new long[i];
            this.f27580b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f27581c = j;
    }

    @Override // p000.CX0
    /* renamed from: e */
    public final boolean mo413e() {
        return this.f27582d;
    }

    @Override // p000.CX0
    /* renamed from: i */
    public final BX0 mo414i(long j) {
        if (!this.f27582d) {
            EX0 ex0 = EX0.f2737c;
            return new BX0(ex0, ex0);
        }
        long[] jArr = this.f27580b;
        int iM1821f = AbstractC7485Dh1.m1821f(jArr, j, true);
        long j2 = jArr[iM1821f];
        long[] jArr2 = this.f27579a;
        EX0 ex02 = new EX0(j2, jArr2[iM1821f]);
        if (j2 == j || iM1821f == jArr.length - 1) {
            return new BX0(ex02, ex02);
        }
        int i = iM1821f + 1;
        return new BX0(ex02, new EX0(jArr[i], jArr2[i]));
    }

    @Override // p000.CX0
    /* renamed from: k */
    public final long mo415k() {
        return this.f27581c;
    }
}
