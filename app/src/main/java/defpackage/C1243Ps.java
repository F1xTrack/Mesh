package defpackage;

import java.util.ArrayList;

/* renamed from: Ps */
/* loaded from: classes2.dex */
public final class C1243Ps implements InterfaceC1321Qs {
    public static final C1243Ps b = new C1243Ps(0);
    public static final C1243Ps c = new C1243Ps(1);
    public static final C1243Ps d = new C1243Ps(2);
    public final /* synthetic */ int a;

    public /* synthetic */ C1243Ps(int i) {
        this.a = i;
    }

    public static String b(InterfaceC1087Ns interfaceC1087Ns) {
        String strC;
        C1559Tt0 name = interfaceC1087Ns.getName();
        O90.e(name, "getName(...)");
        String strB = AbstractC4343iQ1.b(name);
        if (interfaceC1087Ns instanceof InterfaceC5925me1) {
            return strB;
        }
        CD cdI = interfaceC1087Ns.i();
        O90.e(cdI, "getContainingDeclaration(...)");
        if (cdI instanceof InterfaceC7492us) {
            strC = b((InterfaceC1087Ns) cdI);
        } else if (cdI instanceof InterfaceC8465zz0) {
            MX mxI = ((AbstractC0096Az0) ((InterfaceC8465zz0) cdI)).f.i();
            O90.e(mxI, "toUnsafe(...)");
            strC = AbstractC4343iQ1.c(mxI.e());
        } else {
            strC = null;
        }
        if (strC == null || strC.equals("")) {
            return strB;
        }
        return strC + '.' + strB;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [CD, Ns] */
    /* JADX WARN: Type inference failed for: r2v8, types: [CD] */
    /* JADX WARN: Type inference failed for: r2v9, types: [CD] */
    @Override // defpackage.InterfaceC1321Qs
    public final String a(InterfaceC1087Ns interfaceC1087Ns, C5857mI c5857mI) {
        switch (this.a) {
            case 0:
                O90.f(c5857mI, "renderer");
                if (interfaceC1087Ns instanceof InterfaceC5925me1) {
                    C1559Tt0 name = ((InterfaceC5925me1) interfaceC1087Ns).getName();
                    O90.e(name, "getName(...)");
                    return c5857mI.N(name, false);
                }
                MX mxG = AbstractC7002sI.g(interfaceC1087Ns);
                O90.e(mxG, "getFqName(...)");
                return c5857mI.o(AbstractC4343iQ1.c(mxG.e()));
            case 1:
                O90.f(c5857mI, "renderer");
                if (interfaceC1087Ns instanceof InterfaceC5925me1) {
                    C1559Tt0 name2 = ((InterfaceC5925me1) interfaceC1087Ns).getName();
                    O90.e(name2, "getName(...)");
                    return c5857mI.N(name2, false);
                }
                ArrayList arrayList = new ArrayList();
                do {
                    arrayList.add(interfaceC1087Ns.getName());
                    interfaceC1087Ns = interfaceC1087Ns.i();
                } while (interfaceC1087Ns instanceof InterfaceC7492us);
                return AbstractC4343iQ1.c(new C3969gT0(arrayList));
            default:
                O90.f(c5857mI, "renderer");
                return b(interfaceC1087Ns);
        }
    }
}
