package p000;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public final class NX0 extends LX0 {

    /* renamed from: j */
    public final C8539Xo1 f7857j;

    /* renamed from: k */
    public final C8539Xo1 f7858k;

    /* renamed from: l */
    public final long f7859l;

    public NX0(C9481gJ0 c9481gJ0, long j, long j2, long j3, long j4, long j5, List list, long j6, C8539Xo1 c8539Xo1, C8539Xo1 c8539Xo12, long j7, long j8) {
        super(c9481gJ0, j, j2, j3, j5, list, j6, j7, j8);
        this.f7857j = c8539Xo1;
        this.f7858k = c8539Xo12;
        this.f7859l = j4;
    }

    @Override // p000.QX0
    /* renamed from: a */
    public final C9481gJ0 mo5776a(AbstractC10649pR0 abstractC10649pR0) {
        C8539Xo1 c8539Xo1 = this.f7857j;
        if (c8539Xo1 == null) {
            return this.f9656a;
        }
        C6686qX c6686qX = abstractC10649pR0.f40076a;
        return new C9481gJ0(0L, -1L, c8539Xo1.m9146o(c6686qX.f40962a, 0L, c6686qX.f40970i, 0L));
    }

    @Override // p000.LX0
    /* renamed from: d */
    public final long mo5017d(long j) {
        if (this.f6697f != null) {
            return r0.size();
        }
        long j2 = this.f7859l;
        if (j2 != -1) {
            return (j2 - this.f6695d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.f9657b));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.f6696e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = AbstractC4195hh.f28528a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // p000.LX0
    /* renamed from: h */
    public final C9481gJ0 mo5021h(C10393nR0 c10393nR0, long j) {
        long j2 = this.f6695d;
        List list = this.f6697f;
        long j3 = list != null ? ((OX0) list.get((int) (j - j2))).f8474a : (j - j2) * this.f6696e;
        C6686qX c6686qX = c10393nR0.f40076a;
        return new C9481gJ0(0L, -1L, this.f7858k.m9146o(c6686qX.f40962a, j, c6686qX.f40970i, j3));
    }
}
