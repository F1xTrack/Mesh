package p000;

/* renamed from: ji1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9916ji1 implements GX0 {

    /* renamed from: a */
    public final long[] f35343a;

    /* renamed from: b */
    public final long[] f35344b;

    /* renamed from: c */
    public final long f35345c;

    /* renamed from: d */
    public final long f35346d;

    /* renamed from: e */
    public final int f35347e;

    public C9916ji1(long[] jArr, long[] jArr2, long j, long j2, int i) {
        this.f35343a = jArr;
        this.f35344b = jArr2;
        this.f35345c = j;
        this.f35346d = j2;
        this.f35347e = i;
    }

    @Override // p000.GX0
    /* renamed from: a */
    public final long mo927a(long j) {
        return this.f35343a[AbstractC7485Dh1.m1821f(this.f35344b, j, true)];
    }

    @Override // p000.GX0
    /* renamed from: c */
    public final long mo928c() {
        return this.f35346d;
    }

    @Override // p000.CX0
    /* renamed from: e */
    public final boolean mo413e() {
        return true;
    }

    @Override // p000.CX0
    /* renamed from: i */
    public final BX0 mo414i(long j) {
        long[] jArr = this.f35343a;
        int iM1821f = AbstractC7485Dh1.m1821f(jArr, j, true);
        long j2 = jArr[iM1821f];
        long[] jArr2 = this.f35344b;
        EX0 ex0 = new EX0(j2, jArr2[iM1821f]);
        if (j2 >= j || iM1821f == jArr.length - 1) {
            return new BX0(ex0, ex0);
        }
        int i = iM1821f + 1;
        return new BX0(ex0, new EX0(jArr[i], jArr2[i]));
    }

    @Override // p000.GX0
    /* renamed from: j */
    public final int mo929j() {
        return this.f35347e;
    }

    @Override // p000.CX0
    /* renamed from: k */
    public final long mo415k() {
        return this.f35345c;
    }
}
