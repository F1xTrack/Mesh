package defpackage;

/* renamed from: u80 */
/* loaded from: classes2.dex */
public abstract class AbstractC7355u80 {
    public static final /* synthetic */ int a = 0;

    static {
        C0074As.j(new KX("kotlin.jvm.JvmInline"));
    }

    public static final boolean a(InterfaceC8042xl interfaceC8042xl) {
        AbstractC1134Oh1 abstractC1134Oh1J0;
        O90.f(interfaceC8042xl, "<this>");
        if (interfaceC8042xl instanceof FE0) {
            CE0 ce0Y1 = ((FE0) interfaceC8042xl).y1();
            O90.e(ce0Y1, "getCorrespondingProperty(...)");
            if (ce0Y1.t0() == null) {
                CD cdI = ce0Y1.i();
                InterfaceC7492us interfaceC7492us = cdI instanceof InterfaceC7492us ? (InterfaceC7492us) cdI : null;
                if (interfaceC7492us != null && (abstractC1134Oh1J0 = interfaceC7492us.J0()) != null) {
                    C1559Tt0 name = ce0Y1.getName();
                    O90.e(name, "getName(...)");
                    if (abstractC1134Oh1J0.a(name)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean b(CD cd) {
        O90.f(cd, "<this>");
        return (cd instanceof InterfaceC7492us) && (((InterfaceC7492us) cd).J0() instanceof C7164t80);
    }

    public static final boolean c(CD cd) {
        O90.f(cd, "<this>");
        return (cd instanceof InterfaceC7492us) && (((InterfaceC7492us) cd).J0() instanceof C4238ht0);
    }

    public static final boolean d(InterfaceC3633ei1 interfaceC3633ei1) {
        if (interfaceC3633ei1.t0() == null) {
            CD cdI = interfaceC3633ei1.i();
            C1559Tt0 c1559Tt0 = null;
            InterfaceC7492us interfaceC7492us = cdI instanceof InterfaceC7492us ? (InterfaceC7492us) cdI : null;
            if (interfaceC7492us != null) {
                int i = AbstractC7384uI.a;
                AbstractC1134Oh1 abstractC1134Oh1J0 = interfaceC7492us.J0();
                C7164t80 c7164t80 = abstractC1134Oh1J0 instanceof C7164t80 ? (C7164t80) abstractC1134Oh1J0 : null;
                if (c7164t80 != null) {
                    c1559Tt0 = c7164t80.a;
                }
            }
            if (O90.a(c1559Tt0, interfaceC3633ei1.getName())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean e(CD cd) {
        O90.f(cd, "<this>");
        return b(cd) || c(cd);
    }

    public static final boolean f(AbstractC0663Ig0 abstractC0663Ig0) {
        InterfaceC1087Ns interfaceC1087NsA = abstractC0663Ig0.E().a();
        if (interfaceC1087NsA != null) {
            return e(interfaceC1087NsA);
        }
        return false;
    }

    public static final boolean g(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "<this>");
        InterfaceC1087Ns interfaceC1087NsA = abstractC0663Ig0.E().a();
        return (interfaceC1087NsA == null || !c(interfaceC1087NsA) || AbstractC0112Be1.e(abstractC0663Ig0)) ? false : true;
    }

    public static final X01 h(AbstractC0663Ig0 abstractC0663Ig0) {
        O90.f(abstractC0663Ig0, "<this>");
        InterfaceC1087Ns interfaceC1087NsA = abstractC0663Ig0.E().a();
        InterfaceC7492us interfaceC7492us = interfaceC1087NsA instanceof InterfaceC7492us ? (InterfaceC7492us) interfaceC1087NsA : null;
        if (interfaceC7492us == null) {
            return null;
        }
        int i = AbstractC7384uI.a;
        AbstractC1134Oh1 abstractC1134Oh1J0 = interfaceC7492us.J0();
        C7164t80 c7164t80 = abstractC1134Oh1J0 instanceof C7164t80 ? (C7164t80) abstractC1134Oh1J0 : null;
        if (c7164t80 != null) {
            return (X01) c7164t80.b;
        }
        return null;
    }
}
