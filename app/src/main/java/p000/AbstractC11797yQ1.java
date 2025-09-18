package p000;

import java.util.Collection;

/* renamed from: yQ1 */
/* loaded from: classes.dex */
public abstract class AbstractC11797yQ1 {
    /* renamed from: a */
    public static /* synthetic */ Collection m26148a(InterfaceC10059kq0 interfaceC10059kq0, C4233iI c4233iI, int i) {
        if ((i & 1) != 0) {
            c4233iI = C4233iI.f29058m;
        }
        InterfaceC10059kq0.f36722a.getClass();
        return interfaceC10059kq0.mo2108g(c4233iI, C9393fd0.f27289o);
    }

    /* renamed from: b */
    public static C0489Hl m26149b(InterfaceC0363Fl interfaceC0363Fl) {
        C0300El c0300El = new C0300El();
        c0300El.f2878c = new C9883jS0();
        C0489Hl c0489Hl = new C0489Hl(c0300El);
        c0300El.f2877b = c0489Hl;
        c0300El.f2876a = interfaceC0363Fl.getClass();
        try {
            Object objMo411h0 = interfaceC0363Fl.mo411h0(c0300El);
            if (objMo411h0 != null) {
                c0300El.f2876a = objMo411h0;
            }
        } catch (Exception e) {
            c0489Hl.f4484b.mo10414k(e);
        }
        return c0489Hl;
    }
}
