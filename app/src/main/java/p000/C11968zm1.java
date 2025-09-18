package p000;

import java.math.RoundingMode;

/* renamed from: zm1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11968zm1 implements CX0 {

    /* renamed from: a */
    public final C0640K9 f46994a;

    /* renamed from: b */
    public final int f46995b;

    /* renamed from: c */
    public final long f46996c;

    /* renamed from: d */
    public final long f46997d;

    /* renamed from: e */
    public final long f46998e;

    public C11968zm1(C0640K9 c0640k9, int i, long j, long j2) {
        this.f46994a = c0640k9;
        this.f46995b = i;
        this.f46996c = j;
        long j3 = (j2 - j) / c0640k9.f5922d;
        this.f46997d = j3;
        this.f46998e = m26548b(j3);
    }

    /* renamed from: b */
    public final long m26548b(long j) {
        long j2 = j * this.f46995b;
        long j3 = this.f46994a.f5921c;
        int i = AbstractC7485Dh1.f2166a;
        return AbstractC7485Dh1.m1810Y(j2, 1000000L, j3, RoundingMode.FLOOR);
    }

    @Override // p000.CX0
    /* renamed from: e */
    public final boolean mo413e() {
        return true;
    }

    @Override // p000.CX0
    /* renamed from: i */
    public final BX0 mo414i(long j) {
        C0640K9 c0640k9 = this.f46994a;
        long j2 = this.f46997d;
        long jM1826k = AbstractC7485Dh1.m1826k((c0640k9.f5921c * j) / (this.f46995b * 1000000), 0L, j2 - 1);
        long j3 = this.f46996c;
        long jM26548b = m26548b(jM1826k);
        EX0 ex0 = new EX0(jM26548b, (c0640k9.f5922d * jM1826k) + j3);
        if (jM26548b >= j || jM1826k == j2 - 1) {
            return new BX0(ex0, ex0);
        }
        long j4 = jM1826k + 1;
        return new BX0(ex0, new EX0(m26548b(j4), (c0640k9.f5922d * j4) + j3));
    }

    @Override // p000.CX0
    /* renamed from: k */
    public final long mo415k() {
        return this.f46998e;
    }
}
