package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* renamed from: oJ0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6243oJ0 extends AbstractC7452ue1 {
    public static final C8203yb0 c;
    public static final C8203yb0 d;
    public final ES1 b = new ES1(new NV1(19));

    static {
        EnumC8403ze1 enumC8403ze1 = EnumC8403ze1.b;
        c = C8203yb0.a(K22.a(enumC8403ze1, false, true, null, 5), EnumC0102Bb0.c, false, null, null, 61);
        d = C8203yb0.a(K22.a(enumC8403ze1, false, true, null, 5), EnumC0102Bb0.b, false, null, null, 61);
    }

    @Override // defpackage.AbstractC7452ue1
    public final AbstractC6689qe1 d(AbstractC0663Ig0 abstractC0663Ig0) {
        return new C6962s41(h(abstractC0663Ig0, new C8203yb0(EnumC8403ze1.b, false, false, null, 62)));
    }

    public final Pair g(X01 x01, InterfaceC7492us interfaceC7492us, C8203yb0 c8203yb0) {
        if (x01.E().getParameters().isEmpty()) {
            return new Pair(x01, Boolean.FALSE);
        }
        if (AbstractC8408zg0.y(x01)) {
            AbstractC6689qe1 abstractC6689qe1 = (AbstractC6689qe1) x01.u().get(0);
            EnumC4015gi1 enumC4015gi1A = abstractC6689qe1.a();
            AbstractC0663Ig0 abstractC0663Ig0B = abstractC6689qe1.b();
            O90.e(abstractC0663Ig0B, "getType(...)");
            return new Pair(NV1.A(x01.B(), x01.E(), AbstractC8259yu.e(new C6962s41(h(abstractC0663Ig0B, c8203yb0), enumC4015gi1A)), x01.G()), Boolean.FALSE);
        }
        if (S8.b(x01)) {
            return new Pair(C5496kP.c(EnumC5305jP.n, x01.E().toString()), Boolean.FALSE);
        }
        InterfaceC5578kq0 interfaceC5578kq0C0 = interfaceC7492us.c0(this);
        O90.e(interfaceC5578kq0C0, "getMemberScope(...)");
        C0733Jd1 c0733Jd1B = x01.B();
        InterfaceC1200Pd1 interfaceC1200Pd1V = interfaceC7492us.v();
        O90.e(interfaceC1200Pd1V, "getTypeConstructor(...)");
        List parameters = interfaceC7492us.v().getParameters();
        O90.e(parameters, "getParameters(...)");
        List<InterfaceC5925me1> list = parameters;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list));
        for (InterfaceC5925me1 interfaceC5925me1 : list) {
            O90.c(interfaceC5925me1);
            ES1 es1 = this.b;
            arrayList.add(NV1.r(interfaceC5925me1, c8203yb0, es1, es1.w(interfaceC5925me1, c8203yb0)));
        }
        return new Pair(NV1.C(c0733Jd1B, interfaceC1200Pd1V, arrayList, x01.G(), interfaceC5578kq0C0, new C5661lG0(interfaceC7492us, this, x01, c8203yb0)), Boolean.TRUE);
    }

    public final AbstractC0663Ig0 h(AbstractC0663Ig0 abstractC0663Ig0, C8203yb0 c8203yb0) {
        InterfaceC1087Ns interfaceC1087NsA = abstractC0663Ig0.E().a();
        if (interfaceC1087NsA instanceof InterfaceC5925me1) {
            c8203yb0.getClass();
            return h(this.b.w((InterfaceC5925me1) interfaceC1087NsA, C8203yb0.a(c8203yb0, null, true, null, null, 59)), c8203yb0);
        }
        if (!(interfaceC1087NsA instanceof InterfaceC7492us)) {
            throw new IllegalStateException(("Unexpected declaration kind: " + interfaceC1087NsA).toString());
        }
        InterfaceC1087Ns interfaceC1087NsA2 = AbstractC4075h12.j(abstractC0663Ig0).E().a();
        if (interfaceC1087NsA2 instanceof InterfaceC7492us) {
            Pair pairG = g(AbstractC4075h12.e(abstractC0663Ig0), (InterfaceC7492us) interfaceC1087NsA, c);
            X01 x01 = (X01) pairG.a;
            boolean zBooleanValue = ((Boolean) pairG.b).booleanValue();
            Pair pairG2 = g(AbstractC4075h12.j(abstractC0663Ig0), (InterfaceC7492us) interfaceC1087NsA2, d);
            X01 x012 = (X01) pairG2.a;
            return (zBooleanValue || ((Boolean) pairG2.b).booleanValue()) ? new C6434pJ0(x01, x012) : NV1.t(x01, x012);
        }
        throw new IllegalStateException(("For some reason declaration for upper bound is not a class but \"" + interfaceC1087NsA2 + "\" while for lower it's \"" + interfaceC1087NsA + '\"').toString());
    }
}
