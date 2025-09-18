package p000;

import com.huawei.hms.p015rn.push.constants.NotificationConstants;

/* renamed from: Uo1 */
/* loaded from: classes.dex */
public final class C8383Uo1 {

    /* renamed from: u */
    public static final C0553Im f12133u;

    /* renamed from: a */
    public final String f12134a;

    /* renamed from: b */
    public int f12135b;

    /* renamed from: c */
    public final String f12136c;

    /* renamed from: d */
    public String f12137d;

    /* renamed from: e */
    public C7249zC f12138e;

    /* renamed from: f */
    public final C7249zC f12139f;

    /* renamed from: g */
    public long f12140g;

    /* renamed from: h */
    public long f12141h;

    /* renamed from: i */
    public long f12142i;

    /* renamed from: j */
    public C4149gy f12143j;

    /* renamed from: k */
    public final int f12144k;

    /* renamed from: l */
    public int f12145l;

    /* renamed from: m */
    public long f12146m;

    /* renamed from: n */
    public long f12147n;

    /* renamed from: o */
    public final long f12148o;

    /* renamed from: p */
    public final long f12149p;

    /* renamed from: q */
    public boolean f12150q;

    /* renamed from: r */
    public final int f12151r;

    /* renamed from: s */
    public final int f12152s;

    /* renamed from: t */
    public final int f12153t;

    static {
        O90.m5967e(C1210TE.m7637M("WorkSpec"), "tagWithPrefix(\"WorkSpec\")");
        f12133u = new C0553Im(9);
    }

    public C8383Uo1(String str, int i, String str2, String str3, C7249zC c7249zC, C7249zC c7249zC2, long j, long j2, long j3, C4149gy c4149gy, int i2, int i3, long j4, long j5, long j6, long j7, boolean z, int i4, int i5, int i6) {
        O90.m5968f(str, NotificationConstants.f19487ID);
        AbstractC0852NX.m5764m(i, "state");
        O90.m5968f(str2, "workerClassName");
        O90.m5968f(c7249zC, "input");
        O90.m5968f(c7249zC2, "output");
        O90.m5968f(c4149gy, "constraints");
        AbstractC0852NX.m5764m(i3, "backoffPolicy");
        AbstractC0852NX.m5764m(i4, "outOfQuotaPolicy");
        this.f12134a = str;
        this.f12135b = i;
        this.f12136c = str2;
        this.f12137d = str3;
        this.f12138e = c7249zC;
        this.f12139f = c7249zC2;
        this.f12140g = j;
        this.f12141h = j2;
        this.f12142i = j3;
        this.f12143j = c4149gy;
        this.f12144k = i2;
        this.f12145l = i3;
        this.f12146m = j4;
        this.f12147n = j5;
        this.f12148o = j6;
        this.f12149p = j7;
        this.f12150q = z;
        this.f12151r = i4;
        this.f12152s = i5;
        this.f12153t = i6;
    }

    /* renamed from: b */
    public static C8383Uo1 m8182b(C8383Uo1 c8383Uo1, String str, int i, String str2, C7249zC c7249zC, int i2, long j, int i3, int i4) {
        String str3 = (i4 & 1) != 0 ? c8383Uo1.f12134a : str;
        int i5 = (i4 & 2) != 0 ? c8383Uo1.f12135b : i;
        String str4 = (i4 & 4) != 0 ? c8383Uo1.f12136c : str2;
        String str5 = c8383Uo1.f12137d;
        C7249zC c7249zC2 = (i4 & 16) != 0 ? c8383Uo1.f12138e : c7249zC;
        C7249zC c7249zC3 = c8383Uo1.f12139f;
        long j2 = c8383Uo1.f12140g;
        long j3 = c8383Uo1.f12141h;
        long j4 = c8383Uo1.f12142i;
        C4149gy c4149gy = c8383Uo1.f12143j;
        int i6 = (i4 & 1024) != 0 ? c8383Uo1.f12144k : i2;
        int i7 = c8383Uo1.f12145l;
        long j5 = c8383Uo1.f12146m;
        long j6 = (i4 & 8192) != 0 ? c8383Uo1.f12147n : j;
        long j7 = c8383Uo1.f12148o;
        long j8 = c8383Uo1.f12149p;
        boolean z = c8383Uo1.f12150q;
        int i8 = c8383Uo1.f12151r;
        int i9 = c8383Uo1.f12152s;
        int i10 = (i4 & 524288) != 0 ? c8383Uo1.f12153t : i3;
        c8383Uo1.getClass();
        O90.m5968f(str3, NotificationConstants.f19487ID);
        AbstractC0852NX.m5764m(i5, "state");
        O90.m5968f(str4, "workerClassName");
        O90.m5968f(c7249zC2, "input");
        O90.m5968f(c7249zC3, "output");
        O90.m5968f(c4149gy, "constraints");
        AbstractC0852NX.m5764m(i7, "backoffPolicy");
        AbstractC0852NX.m5764m(i8, "outOfQuotaPolicy");
        return new C8383Uo1(str3, i5, str4, str5, c7249zC2, c7249zC3, j2, j3, j4, c4149gy, i6, i7, j5, j6, j7, j8, z, i8, i9, i10);
    }

    /* renamed from: a */
    public final long m8183a() {
        int i;
        if (this.f12135b == 1 && (i = this.f12144k) > 0) {
            return AbstractC10132lO1.m22417b(this.f12145l == 2 ? this.f12146m * i : (long) Math.scalb(this.f12146m, i - 1), 18000000L) + this.f12147n;
        }
        if (!m8185d()) {
            long jCurrentTimeMillis = this.f12147n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return this.f12140g + jCurrentTimeMillis;
        }
        int i2 = this.f12152s;
        long j = this.f12147n;
        if (i2 == 0) {
            j += this.f12140g;
        }
        long j2 = this.f12142i;
        long j3 = this.f12141h;
        if (j2 != j3) {
            j = i2 == 0 ? (-1) * j2 : 0L;
            j += j3;
        } else if (i2 != 0) {
            j = j3;
        }
        return j + j;
    }

    /* renamed from: c */
    public final boolean m8184c() {
        return !O90.m5963a(C4149gy.f28115i, this.f12143j);
    }

    /* renamed from: d */
    public final boolean m8185d() {
        return this.f12141h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8383Uo1)) {
            return false;
        }
        C8383Uo1 c8383Uo1 = (C8383Uo1) obj;
        return O90.m5963a(this.f12134a, c8383Uo1.f12134a) && this.f12135b == c8383Uo1.f12135b && O90.m5963a(this.f12136c, c8383Uo1.f12136c) && O90.m5963a(this.f12137d, c8383Uo1.f12137d) && O90.m5963a(this.f12138e, c8383Uo1.f12138e) && O90.m5963a(this.f12139f, c8383Uo1.f12139f) && this.f12140g == c8383Uo1.f12140g && this.f12141h == c8383Uo1.f12141h && this.f12142i == c8383Uo1.f12142i && O90.m5963a(this.f12143j, c8383Uo1.f12143j) && this.f12144k == c8383Uo1.f12144k && this.f12145l == c8383Uo1.f12145l && this.f12146m == c8383Uo1.f12146m && this.f12147n == c8383Uo1.f12147n && this.f12148o == c8383Uo1.f12148o && this.f12149p == c8383Uo1.f12149p && this.f12150q == c8383Uo1.f12150q && this.f12151r == c8383Uo1.f12151r && this.f12152s == c8383Uo1.f12152s && this.f12153t == c8383Uo1.f12153t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int iM8586e = AbstractC1374Vq.m8586e((AbstractC7222ym.m26247x(this.f12135b) + (this.f12134a.hashCode() * 31)) * 31, 31, this.f12136c);
        String str = this.f12137d;
        int iHashCode = (this.f12139f.hashCode() + ((this.f12138e.hashCode() + ((iM8586e + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        long j = this.f12140g;
        int i = (iHashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f12141h;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f12142i;
        int iM26247x = (AbstractC7222ym.m26247x(this.f12145l) + ((((this.f12143j.hashCode() + ((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.f12144k) * 31)) * 31;
        long j4 = this.f12146m;
        int i3 = (iM26247x + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f12147n;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.f12148o;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.f12149p;
        int i6 = (i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        boolean z = this.f12150q;
        int i7 = z;
        if (z != 0) {
            i7 = 1;
        }
        return ((((AbstractC7222ym.m26247x(this.f12151r) + ((i6 + i7) * 31)) * 31) + this.f12152s) * 31) + this.f12153t;
    }

    public final String toString() {
        return F91.m2539v(new StringBuilder("{WorkSpec: "), this.f12134a, '}');
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C8383Uo1(String str, int i, String str2, String str3, C7249zC c7249zC, C7249zC c7249zC2, long j, long j2, long j3, C4149gy c4149gy, int i2, int i3, long j4, long j5, long j6, long j7, boolean z, int i4, int i5, int i6, int i7) {
        C7249zC c7249zC3;
        C7249zC c7249zC4;
        int i8 = (i6 & 2) != 0 ? 1 : i;
        String str4 = (i6 & 8) != 0 ? null : str3;
        if ((i6 & 16) != 0) {
            C7249zC c7249zC5 = C7249zC.f46721b;
            O90.m5967e(c7249zC5, "EMPTY");
            c7249zC3 = c7249zC5;
        } else {
            c7249zC3 = c7249zC;
        }
        if ((i6 & 32) != 0) {
            C7249zC c7249zC6 = C7249zC.f46721b;
            O90.m5967e(c7249zC6, "EMPTY");
            c7249zC4 = c7249zC6;
        } else {
            c7249zC4 = c7249zC2;
        }
        this(str, i8, str2, str4, c7249zC3, c7249zC4, (i6 & 64) != 0 ? 0L : j, (i6 & 128) != 0 ? 0L : j2, (i6 & 256) != 0 ? 0L : j3, (i6 & 512) != 0 ? C4149gy.f28115i : c4149gy, (i6 & 1024) != 0 ? 0 : i2, (i6 & 2048) != 0 ? 1 : i3, (i6 & 4096) != 0 ? 30000L : j4, (i6 & 8192) != 0 ? 0L : j5, (i6 & 16384) != 0 ? 0L : j6, (32768 & i6) != 0 ? -1L : j7, (65536 & i6) != 0 ? false : z, (131072 & i6) != 0 ? 1 : i4, (i6 & 262144) != 0 ? 0 : i5, 0);
    }
}
