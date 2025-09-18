package p000;

import java.math.RoundingMode;

/* renamed from: h80, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9587h80 implements GX0 {

    /* renamed from: a */
    public final long f28270a;

    /* renamed from: b */
    public final C0986Pf f28271b;

    /* renamed from: c */
    public final C0986Pf f28272c;

    /* renamed from: d */
    public final int f28273d;

    /* renamed from: e */
    public long f28274e;

    public C9587h80(long j, long j2, long j3) {
        this.f28274e = j;
        this.f28270a = j3;
        C0986Pf c0986Pf = new C0986Pf(10, (byte) 0);
        this.f28271b = c0986Pf;
        C0986Pf c0986Pf2 = new C0986Pf(10, (byte) 0);
        this.f28272c = c0986Pf2;
        c0986Pf.m6394c(0L);
        c0986Pf2.m6394c(j2);
        int i = -2147483647;
        if (j == -9223372036854775807L) {
            this.f28273d = -2147483647;
            return;
        }
        long jM1810Y = AbstractC7485Dh1.m1810Y(j2 - j3, 8L, j, RoundingMode.HALF_UP);
        if (jM1810Y > 0 && jM1810Y <= 2147483647L) {
            i = (int) jM1810Y;
        }
        this.f28273d = i;
    }

    @Override // p000.GX0
    /* renamed from: a */
    public final long mo927a(long j) {
        return this.f28271b.m6397h(AbstractC7485Dh1.m1816c(this.f28272c, j));
    }

    /* renamed from: b */
    public final boolean m18726b(long j) {
        C0986Pf c0986Pf = this.f28271b;
        return j - c0986Pf.m6397h(c0986Pf.f9216b - 1) < 100000;
    }

    @Override // p000.GX0
    /* renamed from: c */
    public final long mo928c() {
        return this.f28270a;
    }

    @Override // p000.CX0
    /* renamed from: e */
    public final boolean mo413e() {
        return true;
    }

    @Override // p000.CX0
    /* renamed from: i */
    public final BX0 mo414i(long j) {
        C0986Pf c0986Pf = this.f28271b;
        int iM1816c = AbstractC7485Dh1.m1816c(c0986Pf, j);
        long jM6397h = c0986Pf.m6397h(iM1816c);
        C0986Pf c0986Pf2 = this.f28272c;
        EX0 ex0 = new EX0(jM6397h, c0986Pf2.m6397h(iM1816c));
        if (jM6397h == j || iM1816c == c0986Pf.f9216b - 1) {
            return new BX0(ex0, ex0);
        }
        int i = iM1816c + 1;
        return new BX0(ex0, new EX0(c0986Pf.m6397h(i), c0986Pf2.m6397h(i)));
    }

    @Override // p000.GX0
    /* renamed from: j */
    public final int mo929j() {
        return this.f28273d;
    }

    @Override // p000.CX0
    /* renamed from: k */
    public final long mo415k() {
        return this.f28274e;
    }
}
