package defpackage;

import java.util.Collections;

/* renamed from: qp0 */
/* loaded from: classes.dex */
public final class C6721qp0 {
    public final String a;
    public final C5957mp0 b;
    public final C5766lp0 c;
    public final C7484up0 d;
    public final C5384jp0 e;
    public final C6148np0 f;

    static {
        SV sv = new SV();
        N70 n70 = P70.b;
        C3769fQ0 c3769fQ0 = C3769fQ0.e;
        Collections.emptyList();
        C3769fQ0 c3769fQ02 = C3769fQ0.e;
        C5575kp0 c5575kp0 = new C5575kp0();
        C6148np0 c6148np0 = C6148np0.a;
        sv.a();
        c5575kp0.a();
        C7484up0 c7484up0 = C7484up0.A;
        AbstractC8235ym.t(0, 1, 2, 3, 4);
        AbstractC0277Dh1.L(5);
    }

    public C6721qp0(String str, C5384jp0 c5384jp0, C5957mp0 c5957mp0, C5766lp0 c5766lp0, C7484up0 c7484up0, C6148np0 c6148np0) {
        this.a = str;
        this.b = c5957mp0;
        this.c = c5766lp0;
        this.d = c7484up0;
        this.e = c5384jp0;
        this.f = c6148np0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6721qp0)) {
            return false;
        }
        C6721qp0 c6721qp0 = (C6721qp0) obj;
        return AbstractC0277Dh1.a(this.a, c6721qp0.a) && this.e.equals(c6721qp0.e) && AbstractC0277Dh1.a(this.b, c6721qp0.b) && this.c.equals(c6721qp0.c) && AbstractC0277Dh1.a(this.d, c6721qp0.d) && AbstractC0277Dh1.a(this.f, c6721qp0.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        C5957mp0 c5957mp0 = this.b;
        int iHashCode2 = (this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (c5957mp0 != null ? c5957mp0.hashCode() : 0)) * 31)) * 31)) * 31)) * 31;
        this.f.getClass();
        return iHashCode2;
    }
}
