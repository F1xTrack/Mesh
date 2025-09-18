package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* renamed from: Ba1 */
/* loaded from: classes.dex */
public final class C0100Ba1 {
    public static final Object q = new Object();
    public static final C6721qp0 r;
    public Object b;
    public Object d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public C5766lp0 j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object a = q;
    public C6721qp0 c = r;

    static {
        SV sv = new SV();
        N70 n70 = P70.b;
        C3769fQ0 c3769fQ0 = C3769fQ0.e;
        List listEmptyList = Collections.emptyList();
        C3769fQ0 c3769fQ02 = C3769fQ0.e;
        C5575kp0 c5575kp0 = new C5575kp0();
        C6148np0 c6148np0 = C6148np0.a;
        Uri uri = Uri.EMPTY;
        r = new C6721qp0("androidx.media3.common.Timeline", new C5384jp0(sv), uri != null ? new C5957mp0(uri, null, null, listEmptyList, c3769fQ02, -9223372036854775807L) : null, new C5766lp0(c5575kp0), C7484up0.A, c6148np0);
        AbstractC8235ym.t(1, 2, 3, 4, 5);
        AbstractC8235ym.t(6, 7, 8, 9, 10);
        AbstractC0277Dh1.L(11);
        AbstractC0277Dh1.L(12);
        AbstractC0277Dh1.L(13);
    }

    public final boolean a() {
        return this.j != null;
    }

    public final void b(C6721qp0 c6721qp0, Object obj, long j, long j2, long j3, boolean z, boolean z2, C5766lp0 c5766lp0, long j4, long j5, int i, long j6) {
        this.a = q;
        this.c = c6721qp0 != null ? c6721qp0 : r;
        if (c6721qp0 != null) {
            C5957mp0 c5957mp0 = c6721qp0.b;
        }
        this.d = obj;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z;
        this.i = z2;
        this.j = c5766lp0;
        this.l = j4;
        this.m = j5;
        this.n = 0;
        this.o = i;
        this.p = j6;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C0100Ba1.class.equals(obj.getClass())) {
            return false;
        }
        C0100Ba1 c0100Ba1 = (C0100Ba1) obj;
        return AbstractC0277Dh1.a(this.a, c0100Ba1.a) && AbstractC0277Dh1.a(this.c, c0100Ba1.c) && AbstractC0277Dh1.a(this.d, c0100Ba1.d) && AbstractC0277Dh1.a(this.j, c0100Ba1.j) && this.e == c0100Ba1.e && this.f == c0100Ba1.f && this.g == c0100Ba1.g && this.h == c0100Ba1.h && this.i == c0100Ba1.i && this.k == c0100Ba1.k && this.l == c0100Ba1.l && this.m == c0100Ba1.m && this.n == c0100Ba1.n && this.o == c0100Ba1.o && this.p == c0100Ba1.p;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C5766lp0 c5766lp0 = this.j;
        int iHashCode3 = (iHashCode2 + (c5766lp0 != null ? c5766lp0.hashCode() : 0)) * 31;
        long j = this.e;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j4 = this.l;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.m;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j6 = this.p;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
