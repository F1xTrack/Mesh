package p000;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: Ba1 */
/* loaded from: classes.dex */
public final class C7367Ba1 {

    /* renamed from: q */
    public static final Object f912q = new Object();

    /* renamed from: r */
    public static final C10825qp0 f913r;

    /* renamed from: b */
    public Object f915b;

    /* renamed from: d */
    public Object f917d;

    /* renamed from: e */
    public long f918e;

    /* renamed from: f */
    public long f919f;

    /* renamed from: g */
    public long f920g;

    /* renamed from: h */
    public boolean f921h;

    /* renamed from: i */
    public boolean f922i;

    /* renamed from: j */
    public C10185lp0 f923j;

    /* renamed from: k */
    public boolean f924k;

    /* renamed from: l */
    public long f925l;

    /* renamed from: m */
    public long f926m;

    /* renamed from: n */
    public int f927n;

    /* renamed from: o */
    public int f928o;

    /* renamed from: p */
    public long f929p;

    /* renamed from: a */
    public Object f914a = f912q;

    /* renamed from: c */
    public C10825qp0 f916c = f913r;

    static {
        C1164SV c1164sv = new C1164SV();
        N70 n70 = P70.f8867b;
        C9367fQ0 c9367fQ0 = C9367fQ0.f27184e;
        List listEmptyList = Collections.emptyList();
        C9367fQ0 c9367fQ02 = C9367fQ0.f27184e;
        C10057kp0 c10057kp0 = new C10057kp0();
        C10441np0 c10441np0 = C10441np0.f38550a;
        Uri uri = Uri.EMPTY;
        f913r = new C10825qp0("androidx.media3.common.Timeline", new C9929jp0(c1164sv), uri != null ? new C10313mp0(uri, null, null, listEmptyList, c9367fQ02, -9223372036854775807L) : null, new C10185lp0(c10057kp0), C11337up0.f43931A, c10441np0);
        AbstractC7222ym.m26243t(1, 2, 3, 4, 5);
        AbstractC7222ym.m26243t(6, 7, 8, 9, 10);
        AbstractC7485Dh1.m1797L(11);
        AbstractC7485Dh1.m1797L(12);
        AbstractC7485Dh1.m1797L(13);
    }

    /* renamed from: a */
    public final boolean m772a() {
        return this.f923j != null;
    }

    /* renamed from: b */
    public final void m773b(C10825qp0 c10825qp0, Object obj, long j, long j2, long j3, boolean z, boolean z2, C10185lp0 c10185lp0, long j4, long j5, int i, long j6) {
        this.f914a = f912q;
        this.f916c = c10825qp0 != null ? c10825qp0 : f913r;
        if (c10825qp0 != null) {
            C10313mp0 c10313mp0 = c10825qp0.f41186b;
        }
        this.f917d = obj;
        this.f918e = j;
        this.f919f = j2;
        this.f920g = j3;
        this.f921h = z;
        this.f922i = z2;
        this.f923j = c10185lp0;
        this.f925l = j4;
        this.f926m = j5;
        this.f927n = 0;
        this.f928o = i;
        this.f929p = j6;
        this.f924k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C7367Ba1.class.equals(obj.getClass())) {
            return false;
        }
        C7367Ba1 c7367Ba1 = (C7367Ba1) obj;
        return AbstractC7485Dh1.m1812a(this.f914a, c7367Ba1.f914a) && AbstractC7485Dh1.m1812a(this.f916c, c7367Ba1.f916c) && AbstractC7485Dh1.m1812a(this.f917d, c7367Ba1.f917d) && AbstractC7485Dh1.m1812a(this.f923j, c7367Ba1.f923j) && this.f918e == c7367Ba1.f918e && this.f919f == c7367Ba1.f919f && this.f920g == c7367Ba1.f920g && this.f921h == c7367Ba1.f921h && this.f922i == c7367Ba1.f922i && this.f924k == c7367Ba1.f924k && this.f925l == c7367Ba1.f925l && this.f926m == c7367Ba1.f926m && this.f927n == c7367Ba1.f927n && this.f928o == c7367Ba1.f928o && this.f929p == c7367Ba1.f929p;
    }

    public final int hashCode() {
        int iHashCode = (this.f916c.hashCode() + ((this.f914a.hashCode() + 217) * 31)) * 31;
        Object obj = this.f917d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C10185lp0 c10185lp0 = this.f923j;
        int iHashCode3 = (iHashCode2 + (c10185lp0 != null ? c10185lp0.hashCode() : 0)) * 31;
        long j = this.f918e;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f919f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f920g;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f921h ? 1 : 0)) * 31) + (this.f922i ? 1 : 0)) * 31) + (this.f924k ? 1 : 0)) * 31;
        long j4 = this.f925l;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f926m;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.f927n) * 31) + this.f928o) * 31;
        long j6 = this.f929p;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
