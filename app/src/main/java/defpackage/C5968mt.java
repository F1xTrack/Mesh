package defpackage;

/* renamed from: mt, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5968mt extends GX {
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;

    public C5968mt(AbstractC0178Ca1 abstractC0178Ca1, long j, long j2) throws C6159nt {
        super(abstractC0178Ca1);
        boolean z = false;
        if (abstractC0178Ca1.h() != 1) {
            throw new C6159nt(0);
        }
        C0100Ba1 c0100Ba1M = abstractC0178Ca1.m(0, new C0100Ba1(), 0L);
        long jMax = Math.max(0L, j);
        if (!c0100Ba1M.k && jMax != 0 && !c0100Ba1M.h) {
            throw new C6159nt(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? c0100Ba1M.m : Math.max(0L, j2);
        long j3 = c0100Ba1M.m;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                throw new C6159nt(2);
            }
        }
        this.c = jMax;
        this.d = jMax2;
        this.e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (c0100Ba1M.i && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z = true;
        }
        this.f = z;
    }

    @Override // defpackage.GX, defpackage.AbstractC0178Ca1
    public final C0022Aa1 f(int i, C0022Aa1 c0022Aa1, boolean z) {
        this.b.f(0, c0022Aa1, z);
        long j = c0022Aa1.e - this.c;
        long j2 = this.e;
        c0022Aa1.h(c0022Aa1.a, c0022Aa1.b, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, C3507e3.c, false);
        return c0022Aa1;
    }

    @Override // defpackage.GX, defpackage.AbstractC0178Ca1
    public final C0100Ba1 m(int i, C0100Ba1 c0100Ba1, long j) {
        this.b.m(0, c0100Ba1, 0L);
        long j2 = c0100Ba1.p;
        long j3 = this.c;
        c0100Ba1.p = j2 + j3;
        c0100Ba1.m = this.e;
        c0100Ba1.i = this.f;
        long j4 = c0100Ba1.l;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            c0100Ba1.l = jMax;
            long j5 = this.d;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            c0100Ba1.l = jMax - j3;
        }
        long jD0 = AbstractC0277Dh1.d0(j3);
        long j6 = c0100Ba1.e;
        if (j6 != -9223372036854775807L) {
            c0100Ba1.e = j6 + jD0;
        }
        long j7 = c0100Ba1.f;
        if (j7 != -9223372036854775807L) {
            c0100Ba1.f = j7 + jD0;
        }
        return c0100Ba1;
    }
}
