package p000;

/* renamed from: gf */
/* loaded from: classes.dex */
public class C4130gf implements CX0 {

    /* renamed from: a */
    public final /* synthetic */ int f27901a;

    /* renamed from: b */
    public final long f27902b;

    /* renamed from: c */
    public final Object f27903c;

    public /* synthetic */ C4130gf(Object obj, long j, int i) {
        this.f27901a = i;
        this.f27903c = obj;
        this.f27902b = j;
    }

    @Override // p000.CX0
    /* renamed from: e */
    public final boolean mo413e() {
        switch (this.f27901a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // p000.CX0
    /* renamed from: i */
    public final BX0 mo414i(long j) {
        switch (this.f27901a) {
            case 0:
                C4193hf c4193hf = (C4193hf) this.f27903c;
                BX0 bx0M7793b = c4193hf.f28509i[0].m7793b(j);
                int i = 1;
                while (true) {
                    C1249Tr[] c1249TrArr = c4193hf.f28509i;
                    if (i >= c1249TrArr.length) {
                        return bx0M7793b;
                    }
                    BX0 bx0M7793b2 = c1249TrArr[i].m7793b(j);
                    if (bx0M7793b2.f867a.f2739b < bx0M7793b.f867a.f2739b) {
                        bx0M7793b = bx0M7793b2;
                    }
                    i++;
                }
            case 1:
                C1290UV c1290uv = (C1290UV) this.f27903c;
                YN1.m9283h(c1290uv.f11828k);
                ES1 es1 = c1290uv.f11828k;
                long[] jArr = (long[]) es1.f2708b;
                int iM1821f = AbstractC7485Dh1.m1821f(jArr, AbstractC7485Dh1.m1826k((c1290uv.f11822e * j) / 1000000, 0L, c1290uv.f11827j - 1), false);
                long j2 = iM1821f == -1 ? 0L : jArr[iM1821f];
                long[] jArr2 = (long[]) es1.f2709c;
                long j3 = iM1821f != -1 ? jArr2[iM1821f] : 0L;
                int i2 = c1290uv.f11822e;
                long j4 = (j2 * 1000000) / i2;
                long j5 = this.f27902b;
                EX0 ex0 = new EX0(j4, j3 + j5);
                if (j4 == j || iM1821f == jArr.length - 1) {
                    return new BX0(ex0, ex0);
                }
                int i3 = iM1821f + 1;
                return new BX0(ex0, new EX0((jArr[i3] * 1000000) / i2, j5 + jArr2[i3]));
            default:
                return (BX0) this.f27903c;
        }
    }

    @Override // p000.CX0
    /* renamed from: k */
    public final long mo415k() {
        switch (this.f27901a) {
            case 0:
                return this.f27902b;
            case 1:
                return ((C1290UV) this.f27903c).m8078b();
            default:
                return this.f27902b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4130gf(long j) {
        this(j, 0L);
        this.f27901a = 2;
    }

    public C4130gf(long j, long j2) {
        this.f27901a = 2;
        this.f27902b = j;
        EX0 ex0 = j2 == 0 ? EX0.f2737c : new EX0(0L, j2);
        this.f27903c = new BX0(ex0, ex0);
    }
}
