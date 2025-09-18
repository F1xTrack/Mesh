package p000;

/* renamed from: mt */
/* loaded from: classes.dex */
public final class C6454mt extends AbstractC0412GX {

    /* renamed from: c */
    public final long f37974c;

    /* renamed from: d */
    public final long f37975d;

    /* renamed from: e */
    public final long f37976e;

    /* renamed from: f */
    public final boolean f37977f;

    public C6454mt(AbstractC7419Ca1 abstractC7419Ca1, long j, long j2) throws C6517nt {
        super(abstractC7419Ca1);
        boolean z = false;
        if (abstractC7419Ca1.mo1251h() != 1) {
            throw new C6517nt(0);
        }
        C7367Ba1 c7367Ba1Mo1256m = abstractC7419Ca1.mo1256m(0, new C7367Ba1(), 0L);
        long jMax = Math.max(0L, j);
        if (!c7367Ba1Mo1256m.f924k && jMax != 0 && !c7367Ba1Mo1256m.f921h) {
            throw new C6517nt(1);
        }
        long jMax2 = j2 == Long.MIN_VALUE ? c7367Ba1Mo1256m.f926m : Math.max(0L, j2);
        long j3 = c7367Ba1Mo1256m.f926m;
        if (j3 != -9223372036854775807L) {
            jMax2 = jMax2 > j3 ? j3 : jMax2;
            if (jMax > jMax2) {
                throw new C6517nt(2);
            }
        }
        this.f37974c = jMax;
        this.f37975d = jMax2;
        this.f37976e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (c7367Ba1Mo1256m.f922i && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
            z = true;
        }
        this.f37977f = z;
    }

    @Override // p000.AbstractC0412GX, p000.AbstractC7419Ca1
    /* renamed from: f */
    public final C7315Aa1 mo1249f(int i, C7315Aa1 c7315Aa1, boolean z) {
        this.f3796b.mo1249f(0, c7315Aa1, z);
        long j = c7315Aa1.f260e - this.f37974c;
        long j2 = this.f37976e;
        c7315Aa1.m243h(c7315Aa1.f256a, c7315Aa1.f257b, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, C3966e3.f26513c, false);
        return c7315Aa1;
    }

    @Override // p000.AbstractC0412GX, p000.AbstractC7419Ca1
    /* renamed from: m */
    public final C7367Ba1 mo1256m(int i, C7367Ba1 c7367Ba1, long j) {
        this.f3796b.mo1256m(0, c7367Ba1, 0L);
        long j2 = c7367Ba1.f929p;
        long j3 = this.f37974c;
        c7367Ba1.f929p = j2 + j3;
        c7367Ba1.f926m = this.f37976e;
        c7367Ba1.f922i = this.f37977f;
        long j4 = c7367Ba1.f925l;
        if (j4 != -9223372036854775807L) {
            long jMax = Math.max(j4, j3);
            c7367Ba1.f925l = jMax;
            long j5 = this.f37975d;
            if (j5 != -9223372036854775807L) {
                jMax = Math.min(jMax, j5);
            }
            c7367Ba1.f925l = jMax - j3;
        }
        long jM1819d0 = AbstractC7485Dh1.m1819d0(j3);
        long j6 = c7367Ba1.f918e;
        if (j6 != -9223372036854775807L) {
            c7367Ba1.f918e = j6 + jM1819d0;
        }
        long j7 = c7367Ba1.f919f;
        if (j7 != -9223372036854775807L) {
            c7367Ba1.f919f = j7 + jM1819d0;
        }
        return c7367Ba1;
    }
}
