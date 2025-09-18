package p000;

import android.net.Uri;
import java.util.List;

/* renamed from: mp0 */
/* loaded from: classes.dex */
public final class C10313mp0 {

    /* renamed from: a */
    public final Uri f37951a;

    /* renamed from: b */
    public final String f37952b;

    /* renamed from: c */
    public final List f37953c;

    /* renamed from: d */
    public final P70 f37954d;

    /* renamed from: e */
    public final long f37955e;

    static {
        AbstractC7222ym.m26243t(0, 1, 2, 3, 4);
        AbstractC7485Dh1.m1797L(5);
        AbstractC7485Dh1.m1797L(6);
        AbstractC7485Dh1.m1797L(7);
    }

    public C10313mp0(Uri uri, String str, AbstractC10872rA1 abstractC10872rA1, List list, P70 p70, long j) {
        this.f37951a = uri;
        this.f37952b = AbstractC8544Xr0.m9171n(str);
        this.f37953c = list;
        this.f37954d = p70;
        M70 m70M6233t = P70.m6233t();
        for (int i = 0; i < p70.size(); i++) {
            C10697pp0 c10697pp0 = (C10697pp0) p70.get(i);
            C11967zm0 c11967zm0 = new C11967zm0();
            c11967zm0.f46990c = c10697pp0.f40406a;
            c11967zm0.f46991d = c10697pp0.f40407b;
            c11967zm0.f46992e = c10697pp0.f40408c;
            c11967zm0.f46988a = c10697pp0.f40409d;
            c11967zm0.f46989b = c10697pp0.f40410e;
            c11967zm0.f46993f = c10697pp0.f40411f;
            m70M6233t.m3758d(new C10569op0(c11967zm0));
        }
        m70M6233t.m5273h();
        this.f37955e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10313mp0)) {
            return false;
        }
        C10313mp0 c10313mp0 = (C10313mp0) obj;
        return this.f37951a.equals(c10313mp0.f37951a) && AbstractC7485Dh1.m1812a(this.f37952b, c10313mp0.f37952b) && AbstractC7485Dh1.m1812a(null, null) && AbstractC7485Dh1.m1812a(null, null) && this.f37953c.equals(c10313mp0.f37953c) && AbstractC7485Dh1.m1812a(null, null) && this.f37954d.equals(c10313mp0.f37954d) && AbstractC7485Dh1.m1812a(null, null) && Long.valueOf(this.f37955e).equals(Long.valueOf(c10313mp0.f37955e));
    }

    public final int hashCode() {
        int iHashCode = this.f37951a.hashCode() * 31;
        return (int) (((this.f37954d.hashCode() + ((this.f37953c.hashCode() + ((iHashCode + (this.f37952b == null ? 0 : r1.hashCode())) * 29791)) * 961)) * 31 * 31) + this.f37955e);
    }
}
