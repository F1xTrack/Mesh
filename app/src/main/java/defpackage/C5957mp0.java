package defpackage;

import android.net.Uri;
import java.util.List;

/* renamed from: mp0 */
/* loaded from: classes.dex */
public final class C5957mp0 {
    public final Uri a;
    public final String b;
    public final List c;
    public final P70 d;
    public final long e;

    static {
        AbstractC8235ym.t(0, 1, 2, 3, 4);
        AbstractC0277Dh1.L(5);
        AbstractC0277Dh1.L(6);
        AbstractC0277Dh1.L(7);
    }

    public C5957mp0(Uri uri, String str, AbstractC6789rA1 abstractC6789rA1, List list, P70 p70, long j) {
        this.a = uri;
        this.b = AbstractC1865Xr0.n(str);
        this.c = list;
        this.d = p70;
        M70 m70T = P70.t();
        for (int i = 0; i < p70.size(); i++) {
            C6530pp0 c6530pp0 = (C6530pp0) p70.get(i);
            C8426zm0 c8426zm0 = new C8426zm0();
            c8426zm0.c = c6530pp0.a;
            c8426zm0.d = c6530pp0.b;
            c8426zm0.e = c6530pp0.c;
            c8426zm0.a = c6530pp0.d;
            c8426zm0.b = c6530pp0.e;
            c8426zm0.f = c6530pp0.f;
            m70T.d(new C6339op0(c8426zm0));
        }
        m70T.h();
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5957mp0)) {
            return false;
        }
        C5957mp0 c5957mp0 = (C5957mp0) obj;
        return this.a.equals(c5957mp0.a) && AbstractC0277Dh1.a(this.b, c5957mp0.b) && AbstractC0277Dh1.a(null, null) && AbstractC0277Dh1.a(null, null) && this.c.equals(c5957mp0.c) && AbstractC0277Dh1.a(null, null) && this.d.equals(c5957mp0.d) && AbstractC0277Dh1.a(null, null) && Long.valueOf(this.e).equals(Long.valueOf(c5957mp0.e));
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        return (int) (((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (this.b == null ? 0 : r1.hashCode())) * 29791)) * 961)) * 31 * 31) + this.e);
    }
}
