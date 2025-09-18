package defpackage;


/* renamed from: Uo1 */
/* loaded from: classes.dex */
public final class C1623Uo1 {
    public static final C0680Im u;
    public final String a;
    public int b;
    public final String c;
    public String d;
    public C8317zC e;
    public final C8317zC f;
    public long g;
    public long h;
    public long i;
    public C4061gy j;
    public final int k;
    public int l;
    public long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final int r;
    public final int s;
    public final int t;

    static {
        O90.e(TE.M("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
        u = new C0680Im(9);
    }

    public C1623Uo1(String str, int i, String str2, String str3, C8317zC c8317zC, C8317zC c8317zC2, long j, long j2, long j3, C4061gy c4061gy, int i2, int i3, long j4, long j5, long j6, long j7, boolean z, int i4, int i5, int i6) {
        O90.f(str, NotificationConstants.ID);
        NX.m(i, "state");
        O90.f(str2, "workerClassName");
        O90.f(c8317zC, "input");
        O90.f(c8317zC2, "output");
        O90.f(c4061gy, "constraints");
        NX.m(i3, "backoffPolicy");
        NX.m(i4, "outOfQuotaPolicy");
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = c8317zC;
        this.f = c8317zC2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = c4061gy;
        this.k = i2;
        this.l = i3;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z;
        this.r = i4;
        this.s = i5;
        this.t = i6;
    }

    public static C1623Uo1 b(C1623Uo1 c1623Uo1, String str, int i, String str2, C8317zC c8317zC, int i2, long j, int i3, int i4) {
        String str3 = (i4 & 1) != 0 ? c1623Uo1.a : str;
        int i5 = (i4 & 2) != 0 ? c1623Uo1.b : i;
        String str4 = (i4 & 4) != 0 ? c1623Uo1.c : str2;
        String str5 = c1623Uo1.d;
        C8317zC c8317zC2 = (i4 & 16) != 0 ? c1623Uo1.e : c8317zC;
        C8317zC c8317zC3 = c1623Uo1.f;
        long j2 = c1623Uo1.g;
        long j3 = c1623Uo1.h;
        long j4 = c1623Uo1.i;
        C4061gy c4061gy = c1623Uo1.j;
        int i6 = (i4 & 1024) != 0 ? c1623Uo1.k : i2;
        int i7 = c1623Uo1.l;
        long j5 = c1623Uo1.m;
        long j6 = (i4 & 8192) != 0 ? c1623Uo1.n : j;
        long j7 = c1623Uo1.o;
        long j8 = c1623Uo1.p;
        boolean z = c1623Uo1.q;
        int i8 = c1623Uo1.r;
        int i9 = c1623Uo1.s;
        int i10 = (i4 & 524288) != 0 ? c1623Uo1.t : i3;
        c1623Uo1.getClass();
        O90.f(str3, NotificationConstants.ID);
        NX.m(i5, "state");
        O90.f(str4, "workerClassName");
        O90.f(c8317zC2, "input");
        O90.f(c8317zC3, "output");
        O90.f(c4061gy, "constraints");
        NX.m(i7, "backoffPolicy");
        NX.m(i8, "outOfQuotaPolicy");
        return new C1623Uo1(str3, i5, str4, str5, c8317zC2, c8317zC3, j2, j3, j4, c4061gy, i6, i7, j5, j6, j7, j8, z, i8, i9, i10);
    }

    public final long a() {
        int i;
        if (this.b == 1 && (i = this.k) > 0) {
            return AbstractC5686lO1.b(this.l == 2 ? this.m * i : (long) Math.scalb(this.m, i - 1), 18000000L) + this.n;
        }
        if (!d()) {
            long jCurrentTimeMillis = this.n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return this.g + jCurrentTimeMillis;
        }
        int i2 = this.s;
        long j = this.n;
        if (i2 == 0) {
            j += this.g;
        }
        long j2 = this.i;
        long j3 = this.h;
        if (j2 != j3) {
            j = i2 == 0 ? (-1) * j2 : 0L;
            j += j3;
        } else if (i2 != 0) {
            j = j3;
        }
        return j + j;
    }

    public final boolean c() {
        return !O90.a(C4061gy.i, this.j);
    }

    public final boolean d() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1623Uo1)) {
            return false;
        }
        C1623Uo1 c1623Uo1 = (C1623Uo1) obj;
        return O90.a(this.a, c1623Uo1.a) && this.b == c1623Uo1.b && O90.a(this.c, c1623Uo1.c) && O90.a(this.d, c1623Uo1.d) && O90.a(this.e, c1623Uo1.e) && O90.a(this.f, c1623Uo1.f) && this.g == c1623Uo1.g && this.h == c1623Uo1.h && this.i == c1623Uo1.i && O90.a(this.j, c1623Uo1.j) && this.k == c1623Uo1.k && this.l == c1623Uo1.l && this.m == c1623Uo1.m && this.n == c1623Uo1.n && this.o == c1623Uo1.o && this.p == c1623Uo1.p && this.q == c1623Uo1.q && this.r == c1623Uo1.r && this.s == c1623Uo1.s && this.t == c1623Uo1.t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iE = AbstractC1705Vq.e((AbstractC8235ym.x(this.b) + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        long j = this.g;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.h;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.i;
        int iX = (AbstractC8235ym.x(this.l) + ((((this.j.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.k) * 31)) * 31;
        long j4 = this.m;
        int i3 = (iX + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.n;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.o;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.p;
        int i6 = (i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        boolean z = this.q;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        return ((((AbstractC8235ym.x(this.r) + ((i6 + i7) * 31)) * 31) + this.s) * 31) + this.t;
    }

    public final String toString() {
        return F91.v(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1623Uo1(String str, int i, String str2, String str3, C8317zC c8317zC, C8317zC c8317zC2, long j, long j2, long j3, C4061gy c4061gy, int i2, int i3, long j4, long j5, long j6, long j7, boolean z, int i4, int i5, int i6, int i7) {
        C8317zC c8317zC3;
        C8317zC c8317zC4;
        int i8 = (i6 & 2) != 0 ? 1 : i;
        String str4 = (i6 & 8) != 0 ? null : str3;
        if ((i6 & 16) != 0) {
            C8317zC c8317zC5 = C8317zC.b;
            O90.e(c8317zC5, "EMPTY");
            c8317zC3 = c8317zC5;
        } else {
            c8317zC3 = c8317zC;
        }
        if ((i6 & 32) != 0) {
            C8317zC c8317zC6 = C8317zC.b;
            O90.e(c8317zC6, "EMPTY");
            c8317zC4 = c8317zC6;
        } else {
            c8317zC4 = c8317zC2;
        }
        this(str, i8, str2, str4, c8317zC3, c8317zC4, (i6 & 64) != 0 ? 0L : j, (i6 & 128) != 0 ? 0L : j2, (i6 & 256) != 0 ? 0L : j3, (i6 & 512) != 0 ? C4061gy.i : c4061gy, (i6 & 1024) != 0 ? 0 : i2, (i6 & 2048) != 0 ? 1 : i3, (i6 & 4096) != 0 ? 30000L : j4, (i6 & 8192) != 0 ? 0L : j5, (i6 & 16384) != 0 ? 0L : j6, (32768 & i6) != 0 ? -1L : j7, (65536 & i6) != 0 ? false : z, (131072 & i6) != 0 ? 1 : i4, (i6 & 262144) != 0 ? 0 : i5, 0);
    }
}
