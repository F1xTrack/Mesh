package defpackage;

import java.math.BigInteger;

/* renamed from: nG */
/* loaded from: classes.dex */
public final class C6042nG implements CX0 {
    public final /* synthetic */ C6233oG a;

    public C6042nG(C6233oG c6233oG) {
        this.a = c6233oG;
    }

    @Override // defpackage.CX0
    public final boolean e() {
        return true;
    }

    @Override // defpackage.CX0
    public final BX0 i(long j) {
        C6233oG c6233oG = this.a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((c6233oG.d.i * j) / 1000000);
        long j2 = c6233oG.c;
        long j3 = c6233oG.b;
        EX0 ex0 = new EX0(j, AbstractC0277Dh1.k((bigIntegerValueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(c6233oG.f)).longValue() + j3) - 30000, c6233oG.b, j2 - 1));
        return new BX0(ex0, ex0);
    }

    @Override // defpackage.CX0
    public final long k() {
        return (this.a.f * 1000000) / r0.d.i;
    }
}
