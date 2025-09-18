package defpackage;

/* renamed from: gf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4004gf implements CX0 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ C4004gf(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.CX0
    public final boolean e() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.CX0
    public final BX0 i(long j) {
        switch (this.a) {
            case 0:
                C4195hf c4195hf = (C4195hf) this.c;
                BX0 bx0B = c4195hf.i[0].b(j);
                int i = 1;
                while (true) {
                    C1552Tr[] c1552TrArr = c4195hf.i;
                    if (i >= c1552TrArr.length) {
                        return bx0B;
                    }
                    BX0 bx0B2 = c1552TrArr[i].b(j);
                    if (bx0B2.a.b < bx0B.a.b) {
                        bx0B = bx0B2;
                    }
                    i++;
                }
            case 1:
                UV uv = (UV) this.c;
                YN1.h(uv.k);
                ES1 es1 = uv.k;
                long[] jArr = (long[]) es1.b;
                int iF = AbstractC0277Dh1.f(jArr, AbstractC0277Dh1.k((uv.e * j) / 1000000, 0L, uv.j - 1), false);
                long j2 = iF == -1 ? 0L : jArr[iF];
                long[] jArr2 = (long[]) es1.c;
                long j3 = iF != -1 ? jArr2[iF] : 0L;
                int i2 = uv.e;
                long j4 = (j2 * 1000000) / i2;
                long j5 = this.b;
                EX0 ex0 = new EX0(j4, j3 + j5);
                if (j4 == j || iF == jArr.length - 1) {
                    return new BX0(ex0, ex0);
                }
                int i3 = iF + 1;
                return new BX0(ex0, new EX0((jArr[i3] * 1000000) / i2, j5 + jArr2[i3]));
            default:
                return (BX0) this.c;
        }
    }

    @Override // defpackage.CX0
    public final long k() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((UV) this.c).b();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4004gf(long j) {
        this(j, 0L);
        this.a = 2;
    }

    public C4004gf(long j, long j2) {
        this.a = 2;
        this.b = j;
        EX0 ex0 = j2 == 0 ? EX0.c : new EX0(0L, j2);
        this.c = new BX0(ex0, ex0);
    }
}
