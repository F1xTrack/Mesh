package p000;

import java.math.BigInteger;

/* renamed from: nG */
/* loaded from: classes.dex */
public final class C6478nG implements CX0 {

    /* renamed from: a */
    public final /* synthetic */ C6541oG f38222a;

    public C6478nG(C6541oG c6541oG) {
        this.f38222a = c6541oG;
    }

    @Override // p000.CX0
    /* renamed from: e */
    public final boolean mo413e() {
        return true;
    }

    @Override // p000.CX0
    /* renamed from: i */
    public final BX0 mo414i(long j) {
        C6541oG c6541oG = this.f38222a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((c6541oG.f38918d.f28254i * j) / 1000000);
        long j2 = c6541oG.f38917c;
        long j3 = c6541oG.f38916b;
        EX0 ex0 = new EX0(j, AbstractC7485Dh1.m1826k((bigIntegerValueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(c6541oG.f38920f)).longValue() + j3) - 30000, c6541oG.f38916b, j2 - 1));
        return new BX0(ex0, ex0);
    }

    @Override // p000.CX0
    /* renamed from: k */
    public final long mo415k() {
        return (this.f38222a.f38920f * 1000000) / r0.f38918d.f28254i;
    }
}
