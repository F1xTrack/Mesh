package defpackage;

/* renamed from: uI */
/* loaded from: classes2.dex */
public abstract class AbstractC7384uI {
    public static final /* synthetic */ int a = 0;

    static {
        C1559Tt0.e("value");
    }

    public static final boolean a(C1758Wh1 c1758Wh1) {
        Boolean boolC = WY1.c(AbstractC8259yu.e(c1758Wh1), OJ1.b, C7193tI.a);
        O90.e(boolC, "ifAny(...)");
        return boolC.booleanValue();
    }

    public static InterfaceC8042xl b(InterfaceC8042xl interfaceC8042xl, InterfaceC6099nZ interfaceC6099nZ) {
        O90.f(interfaceC8042xl, "<this>");
        return (InterfaceC8042xl) WY1.a(AbstractC8259yu.e(interfaceC8042xl), new FC(false, false), new C5648lC(new TO0(), interfaceC6099nZ));
    }

    public static final KX c(ED ed) {
        O90.f(ed, "<this>");
        MX mxH = h(ed);
        if (!mxH.d()) {
            mxH = null;
        }
        if (mxH != null) {
            return mxH.g();
        }
        return null;
    }

    public static final InterfaceC7492us d(InterfaceC7916x5 interfaceC7916x5) {
        O90.f(interfaceC7916x5, "<this>");
        InterfaceC1087Ns interfaceC1087NsA = interfaceC7916x5.getType().E().a();
        if (interfaceC1087NsA instanceof InterfaceC7492us) {
            return (InterfaceC7492us) interfaceC1087NsA;
        }
        return null;
    }

    public static final AbstractC8408zg0 e(CD cd) {
        O90.f(cd, "<this>");
        return j(cd).h();
    }

    public static final C0074As f(InterfaceC1087Ns interfaceC1087Ns) {
        CD cdI;
        C0074As c0074AsF;
        if (interfaceC1087Ns == null || (cdI = interfaceC1087Ns.i()) == null) {
            return null;
        }
        if (cdI instanceof InterfaceC8465zz0) {
            return new C0074As(((AbstractC0096Az0) ((InterfaceC8465zz0) cdI)).f, interfaceC1087Ns.getName());
        }
        if (!(cdI instanceof InterfaceC1165Os) || (c0074AsF = f((InterfaceC1087Ns) cdI)) == null) {
            return null;
        }
        return c0074AsF.d(interfaceC1087Ns.getName());
    }

    public static final KX g(CD cd) {
        O90.f(cd, "<this>");
        KX kxH = AbstractC7002sI.h(cd);
        if (kxH == null) {
            kxH = AbstractC7002sI.g(cd.i()).b(cd.getName()).g();
        }
        if (kxH != null) {
            return kxH;
        }
        AbstractC7002sI.a(4);
        throw null;
    }

    public static final MX h(CD cd) {
        O90.f(cd, "<this>");
        MX mxG = AbstractC7002sI.g(cd);
        O90.e(mxG, "getFqName(...)");
        return mxG;
    }

    public static final void i(InterfaceC0153Bs0 interfaceC0153Bs0) {
        O90.f(interfaceC0153Bs0, "<this>");
        if (interfaceC0153Bs0.q(AbstractC6026nA1.a) != null) {
            throw new ClassCastException();
        }
    }

    public static final InterfaceC0153Bs0 j(CD cd) {
        O90.f(cd, "<this>");
        InterfaceC0153Bs0 interfaceC0153Bs0D = AbstractC7002sI.d(cd);
        O90.e(interfaceC0153Bs0D, "getContainingModule(...)");
        return interfaceC0153Bs0D;
    }

    public static final InterfaceC8042xl k(InterfaceC8042xl interfaceC8042xl) {
        O90.f(interfaceC8042xl, "<this>");
        if (!(interfaceC8042xl instanceof InterfaceC8324zE0)) {
            return interfaceC8042xl;
        }
        CE0 ce0Y1 = ((AE0) ((InterfaceC8324zE0) interfaceC8042xl)).y1();
        O90.e(ce0Y1, "getCorrespondingProperty(...)");
        return ce0Y1;
    }
}
