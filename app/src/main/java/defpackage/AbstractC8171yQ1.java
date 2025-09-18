package defpackage;

import java.util.Collection;

/* renamed from: yQ1 */
/* loaded from: classes.dex */
public abstract class AbstractC8171yQ1 {
    public static /* synthetic */ Collection a(InterfaceC5578kq0 interfaceC5578kq0, C4317iI c4317iI, int i) {
        if ((i & 1) != 0) {
            c4317iI = C4317iI.m;
        }
        InterfaceC5578kq0.a.getClass();
        return interfaceC5578kq0.g(c4317iI, C3808fd0.o);
    }

    public static C0599Hl b(InterfaceC0443Fl interfaceC0443Fl) {
        C0365El c0365El = new C0365El();
        c0365El.c = new C5315jS0();
        C0599Hl c0599Hl = new C0599Hl(c0365El);
        c0365El.b = c0599Hl;
        c0365El.a = interfaceC0443Fl.getClass();
        try {
            Object objH0 = interfaceC0443Fl.h0(c0365El);
            if (objH0 != null) {
                c0365El.a = objH0;
            }
        } catch (Exception e) {
            c0599Hl.b.k(e);
        }
        return c0599Hl;
    }
}
