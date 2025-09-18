package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* renamed from: oJ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C10505oJ0 extends AbstractC11316ue1 {

    /* renamed from: c */
    public static final C11818yb0 f38947c;

    /* renamed from: d */
    public static final C11818yb0 f38948d;

    /* renamed from: b */
    public final ES1 f38949b = new ES1(new NV1(19));

    static {
        EnumC11952ze1 enumC11952ze1 = EnumC11952ze1.f46923b;
        f38947c = C11818yb0.m26174a(K22.m4530a(enumC11952ze1, false, true, null, 5), EnumC7368Bb0.f936c, false, null, null, 61);
        f38948d = C11818yb0.m26174a(K22.m4530a(enumC11952ze1, false, true, null, 5), EnumC7368Bb0.f935b, false, null, null, 61);
    }

    @Override // p000.AbstractC11316ue1
    /* renamed from: d */
    public final AbstractC10804qe1 mo7400d(AbstractC7742Ig0 abstractC7742Ig0) {
        return new C10988s41(m23366h(abstractC7742Ig0, new C11818yb0(EnumC11952ze1.f46923b, false, false, null, 62)));
    }

    /* renamed from: g */
    public final Pair m23365g(X01 x01, InterfaceC6976us interfaceC6976us, C11818yb0 c11818yb0) {
        if (x01.mo3797E().getParameters().isEmpty()) {
            return new Pair(x01, Boolean.FALSE);
        }
        if (AbstractC11955zg0.m26495y(x01)) {
            AbstractC10804qe1 abstractC10804qe1 = (AbstractC10804qe1) x01.mo3800u().get(0);
            EnumC9532gi1 enumC9532gi1Mo24037a = abstractC10804qe1.mo24037a();
            AbstractC7742Ig0 abstractC7742Ig0Mo24038b = abstractC10804qe1.mo24038b();
            O90.m5967e(abstractC7742Ig0Mo24038b, "getType(...)");
            return new Pair(NV1.m5726A(x01.mo3796B(), x01.mo3797E(), AbstractC7230yu.m26274e(new C10988s41(m23366h(abstractC7742Ig0Mo24038b, c11818yb0), enumC9532gi1Mo24037a)), x01.mo3798G()), Boolean.FALSE);
        }
        if (AbstractC1141S8.m7182b(x01)) {
            return new Pair(C6298kP.m22197c(EnumC6235jP.f35129n, x01.mo3797E().toString()), Boolean.FALSE);
        }
        InterfaceC10059kq0 interfaceC10059kq0Mo1490c0 = interfaceC6976us.mo1490c0(this);
        O90.m5967e(interfaceC10059kq0Mo1490c0, "getMemberScope(...)");
        C7789Jd1 c7789Jd1Mo3796B = x01.mo3796B();
        InterfaceC8101Pd1 interfaceC8101Pd1Mo1439v = interfaceC6976us.mo1439v();
        O90.m5967e(interfaceC8101Pd1Mo1439v, "getTypeConstructor(...)");
        List parameters = interfaceC6976us.mo1439v().getParameters();
        O90.m5967e(parameters, "getParameters(...)");
        List<InterfaceC10292me1> list = parameters;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
        for (InterfaceC10292me1 interfaceC10292me1 : list) {
            O90.m5965c(interfaceC10292me1);
            ES1 es1 = this.f38949b;
            arrayList.add(NV1.m5736r(interfaceC10292me1, c11818yb0, es1, es1.m2301w(interfaceC10292me1, c11818yb0)));
        }
        return new Pair(NV1.m5728C(c7789Jd1Mo3796B, interfaceC8101Pd1Mo1439v, arrayList, x01.mo3798G(), interfaceC10059kq0Mo1490c0, new C10115lG0(interfaceC6976us, this, x01, c11818yb0)), Boolean.TRUE);
    }

    /* renamed from: h */
    public final AbstractC7742Ig0 m23366h(AbstractC7742Ig0 abstractC7742Ig0, C11818yb0 c11818yb0) {
        InterfaceC0873Ns interfaceC0873NsMo1962a = abstractC7742Ig0.mo3797E().mo1962a();
        if (interfaceC0873NsMo1962a instanceof InterfaceC10292me1) {
            c11818yb0.getClass();
            return m23366h(this.f38949b.m2301w((InterfaceC10292me1) interfaceC0873NsMo1962a, C11818yb0.m26174a(c11818yb0, null, true, null, null, 59)), c11818yb0);
        }
        if (!(interfaceC0873NsMo1962a instanceof InterfaceC6976us)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + interfaceC0873NsMo1962a).toString());
        }
        InterfaceC0873Ns interfaceC0873NsMo1962a2 = AbstractC9572h12.m18698j(abstractC7742Ig0).mo3797E().mo1962a();
        if (interfaceC0873NsMo1962a2 instanceof InterfaceC6976us) {
            Pair pairM23365g = m23365g(AbstractC9572h12.m18697e(abstractC7742Ig0), (InterfaceC6976us) interfaceC0873NsMo1962a, f38947c);
            X01 x01 = (X01) pairM23365g.f36702a;
            boolean zBooleanValue = ((Boolean) pairM23365g.f36703b).booleanValue();
            Pair pairM23365g2 = m23365g(AbstractC9572h12.m18698j(abstractC7742Ig0), (InterfaceC6976us) interfaceC0873NsMo1962a2, f38948d);
            X01 x012 = (X01) pairM23365g2.f36702a;
            return (zBooleanValue || ((Boolean) pairM23365g2.f36703b).booleanValue()) ? new C10633pJ0(x01, x012) : NV1.m5738t(x01, x012);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC0873NsMo1962a2 + "\" while for lower it's \"" + interfaceC0873NsMo1962a + '\"').toString());
    }
}
