package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class QS1 {
    public static C2005Zm a(boolean z, boolean z2, C0240Cv0 c0240Cv0, C1052Ng0 c1052Ng0, C1130Og0 c1130Og0, int i) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            c0240Cv0 = C0240Cv0.g;
        }
        C0240Cv0 c0240Cv02 = c0240Cv0;
        if ((i & 8) != 0) {
            c1052Ng0 = C1052Ng0.a;
        }
        C1052Ng0 c1052Ng02 = c1052Ng0;
        if ((i & 16) != 0) {
            c1130Og0 = C1130Og0.a;
        }
        C1130Og0 c1130Og02 = c1130Og0;
        O90.f(c0240Cv02, "typeSystemContext");
        O90.f(c1052Ng02, "kotlinTypePreparator");
        O90.f(c1130Og02, "kotlinTypeRefiner");
        return new C2005Zm(z, z3, c0240Cv02, c1052Ng02, c1130Og02);
    }

    public static final AbstractC0663Ig0 b(InterfaceC5925me1 interfaceC5925me1) {
        O90.f(interfaceC5925me1, "<this>");
        CD cdI = interfaceC5925me1.i();
        O90.e(cdI, "getContainingDeclaration(...)");
        if (cdI instanceof InterfaceC1165Os) {
            List parameters = ((InterfaceC1165Os) cdI).v().getParameters();
            O90.e(parameters, "getParameters(...)");
            List list = parameters;
            ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC1200Pd1 interfaceC1200Pd1V = ((InterfaceC5925me1) it.next()).v();
                O90.e(interfaceC1200Pd1V, "getTypeConstructor(...)");
                arrayList.add(interfaceC1200Pd1V);
            }
            List upperBounds = interfaceC5925me1.getUpperBounds();
            O90.e(upperBounds, "getUpperBounds(...)");
            AbstractC8408zg0 abstractC8408zg0E = AbstractC7384uI.e(interfaceC5925me1);
            AbstractC0663Ig0 abstractC0663Ig0I = new C7833we1(new C7153t41(arrayList)).i((AbstractC0663Ig0) AbstractC8069xu.A(upperBounds), EnumC4015gi1.e);
            return abstractC0663Ig0I == null ? abstractC8408zg0E.m() : abstractC0663Ig0I;
        }
        if (!(cdI instanceof AZ)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((AZ) cdI).getTypeParameters();
        O90.e(typeParameters, "getTypeParameters(...)");
        List list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(list2));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            InterfaceC1200Pd1 interfaceC1200Pd1V2 = ((InterfaceC5925me1) it2.next()).v();
            O90.e(interfaceC1200Pd1V2, "getTypeConstructor(...)");
            arrayList2.add(interfaceC1200Pd1V2);
        }
        List upperBounds2 = interfaceC5925me1.getUpperBounds();
        O90.e(upperBounds2, "getUpperBounds(...)");
        AbstractC8408zg0 abstractC8408zg0E2 = AbstractC7384uI.e(interfaceC5925me1);
        AbstractC0663Ig0 abstractC0663Ig0I2 = new C7833we1(new C7153t41(arrayList2)).i((AbstractC0663Ig0) AbstractC8069xu.A(upperBounds2), EnumC4015gi1.e);
        return abstractC0663Ig0I2 == null ? abstractC8408zg0E2.m() : abstractC0663Ig0I2;
    }
}
