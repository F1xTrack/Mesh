package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class VO implements SR {
    @Override // defpackage.SR
    public QR a() {
        return QR.b;
    }

    @Override // defpackage.SR
    public RR b(InterfaceC7662vl interfaceC7662vl, InterfaceC7662vl interfaceC7662vl2, InterfaceC7492us interfaceC7492us) {
        O90.f(interfaceC7662vl, "superDescriptor");
        O90.f(interfaceC7662vl2, "subDescriptor");
        boolean z = interfaceC7662vl2 instanceof C3611eb0;
        RR rr = RR.c;
        if (!z) {
            return rr;
        }
        C3611eb0 c3611eb0 = (C3611eb0) interfaceC7662vl2;
        if (!c3611eb0.getTypeParameters().isEmpty()) {
            return rr;
        }
        C7132sz0 c7132sz0I = C7323tz0.i(interfaceC7662vl, interfaceC7662vl2);
        if ((c7132sz0I != null ? c7132sz0I.c() : 0) != 0) {
            return rr;
        }
        List listF0 = c3611eb0.f0();
        O90.e(listF0, "getValueParameters(...)");
        C0028Ac1 c0028Ac1L = AbstractC4175hY0.l(AbstractC8069xu.t(listF0), C5284jI.v);
        AbstractC0663Ig0 abstractC0663Ig0 = c3611eb0.h;
        O90.c(abstractC0663Ig0);
        C2339bW c2339bWI = AbstractC4175hY0.i(J8.d(new InterfaceC3412dY0[]{c0028Ac1L, J8.d(new Object[]{abstractC0663Ig0})}));
        C6887rh0 c6887rh0 = c3611eb0.j;
        C7801wU c7801wU = new C7801wU(AbstractC4175hY0.i(J8.d(new InterfaceC3412dY0[]{c2339bWI, AbstractC8069xu.t(AbstractC8259yu.g(c6887rh0 != null ? c6887rh0.getType() : null))})));
        while (c7801wU.hasNext()) {
            AbstractC0663Ig0 abstractC0663Ig02 = (AbstractC0663Ig0) c7801wU.next();
            if (!abstractC0663Ig02.u().isEmpty() && !(abstractC0663Ig02.L() instanceof C6434pJ0)) {
                return rr;
            }
        }
        InterfaceC7662vl interfaceC7662vlA = (InterfaceC7662vl) interfaceC7662vl.b(new C7833we1(new C6243oJ0()));
        if (interfaceC7662vlA == null) {
            return rr;
        }
        if (interfaceC7662vlA instanceof U01) {
            U01 u01 = (U01) interfaceC7662vlA;
            if (!u01.getTypeParameters().isEmpty()) {
                interfaceC7662vlA = u01.N0().z().a();
                O90.c(interfaceC7662vlA);
            }
        }
        int iC = C7323tz0.c.n(interfaceC7662vlA, interfaceC7662vl2, false).c();
        NX.q(iC, "getResult(...)");
        return UO.a[AbstractC8235ym.x(iC)] == 1 ? RR.a : rr;
    }
}
