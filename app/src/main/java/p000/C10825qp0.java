package p000;

import java.util.Collections;

/* renamed from: qp0 */
/* loaded from: classes.dex */
public final class C10825qp0 {

    /* renamed from: a */
    public final String f41185a;

    /* renamed from: b */
    public final C10313mp0 f41186b;

    /* renamed from: c */
    public final C10185lp0 f41187c;

    /* renamed from: d */
    public final C11337up0 f41188d;

    /* renamed from: e */
    public final C9929jp0 f41189e;

    /* renamed from: f */
    public final C10441np0 f41190f;

    static {
        C1164SV c1164sv = new C1164SV();
        N70 n70 = P70.f8867b;
        C9367fQ0 c9367fQ0 = C9367fQ0.f27184e;
        Collections.emptyList();
        C9367fQ0 c9367fQ02 = C9367fQ0.f27184e;
        C10057kp0 c10057kp0 = new C10057kp0();
        C10441np0 c10441np0 = C10441np0.f38550a;
        c1164sv.m7374a();
        c10057kp0.m22273a();
        C11337up0 c11337up0 = C11337up0.f43931A;
        AbstractC7222ym.m26243t(0, 1, 2, 3, 4);
        AbstractC7485Dh1.m1797L(5);
    }

    public C10825qp0(String str, C9929jp0 c9929jp0, C10313mp0 c10313mp0, C10185lp0 c10185lp0, C11337up0 c11337up0, C10441np0 c10441np0) {
        this.f41185a = str;
        this.f41186b = c10313mp0;
        this.f41187c = c10185lp0;
        this.f41188d = c11337up0;
        this.f41189e = c9929jp0;
        this.f41190f = c10441np0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10825qp0)) {
            return false;
        }
        C10825qp0 c10825qp0 = (C10825qp0) obj;
        return AbstractC7485Dh1.m1812a(this.f41185a, c10825qp0.f41185a) && this.f41189e.equals(c10825qp0.f41189e) && AbstractC7485Dh1.m1812a(this.f41186b, c10825qp0.f41186b) && this.f41187c.equals(c10825qp0.f41187c) && AbstractC7485Dh1.m1812a(this.f41188d, c10825qp0.f41188d) && AbstractC7485Dh1.m1812a(this.f41190f, c10825qp0.f41190f);
    }

    public final int hashCode() {
        int iHashCode = this.f41185a.hashCode() * 31;
        C10313mp0 c10313mp0 = this.f41186b;
        int iHashCode2 = (this.f41188d.hashCode() + ((this.f41189e.hashCode() + ((this.f41187c.hashCode() + ((iHashCode + (c10313mp0 != null ? c10313mp0.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f41190f.getClass();
        return iHashCode2;
    }
}
