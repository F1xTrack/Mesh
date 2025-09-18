package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class QS1 {
    /* renamed from: a */
    public static C1622Zm m6717a(boolean z, boolean z2, C7460Cv0 c7460Cv0, C8002Ng0 c8002Ng0, C8054Og0 c8054Og0, int i) {
        if ((i & 2) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i & 4) != 0) {
            c7460Cv0 = C7460Cv0.f1757g;
        }
        C7460Cv0 c7460Cv02 = c7460Cv0;
        if ((i & 8) != 0) {
            c8002Ng0 = C8002Ng0.f7948a;
        }
        C8002Ng0 c8002Ng02 = c8002Ng0;
        if ((i & 16) != 0) {
            c8054Og0 = C8054Og0.f8561a;
        }
        C8054Og0 c8054Og02 = c8054Og0;
        O90.m5968f(c7460Cv02, "typeSystemContext");
        O90.m5968f(c8002Ng02, "kotlinTypePreparator");
        O90.m5968f(c8054Og02, "kotlinTypeRefiner");
        return new C1622Zm(z, z3, c7460Cv02, c8002Ng02, c8054Og02);
    }

    /* renamed from: b */
    public static final AbstractC7742Ig0 m6718b(InterfaceC10292me1 interfaceC10292me1) {
        O90.m5968f(interfaceC10292me1, "<this>");
        InterfaceC0140CD interfaceC0140CDMo423i = interfaceC10292me1.mo423i();
        O90.m5967e(interfaceC0140CDMo423i, "getContainingDeclaration(...)");
        if (interfaceC0140CDMo423i instanceof InterfaceC0936Os) {
            List parameters = ((InterfaceC0936Os) interfaceC0140CDMo423i).mo1439v().getParameters();
            O90.m5967e(parameters, "getParameters(...)");
            List list = parameters;
            ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC8101Pd1 interfaceC8101Pd1Mo1439v = ((InterfaceC10292me1) it.next()).mo1439v();
                O90.m5967e(interfaceC8101Pd1Mo1439v, "getTypeConstructor(...)");
                arrayList.add(interfaceC8101Pd1Mo1439v);
            }
            List upperBounds = interfaceC10292me1.getUpperBounds();
            O90.m5967e(upperBounds, "getUpperBounds(...)");
            AbstractC11955zg0 abstractC11955zg0M25152e = AbstractC6940uI.m25152e(interfaceC10292me1);
            AbstractC7742Ig0 abstractC7742Ig0M25667i = new C11571we1(new C11116t41(arrayList)).m25667i((AbstractC7742Ig0) AbstractC7167xu.m25955A(upperBounds), EnumC9532gi1.f27949e);
            return abstractC7742Ig0M25667i == null ? abstractC11955zg0M25152e.m26505m() : abstractC7742Ig0M25667i;
        }
        if (!(interfaceC0140CDMo423i instanceof InterfaceC0036AZ)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((InterfaceC0036AZ) interfaceC0140CDMo423i).getTypeParameters();
        O90.m5967e(typeParameters, "getTypeParameters(...)");
        List list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(list2));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            InterfaceC8101Pd1 interfaceC8101Pd1Mo1439v2 = ((InterfaceC10292me1) it2.next()).mo1439v();
            O90.m5967e(interfaceC8101Pd1Mo1439v2, "getTypeConstructor(...)");
            arrayList2.add(interfaceC8101Pd1Mo1439v2);
        }
        List upperBounds2 = interfaceC10292me1.getUpperBounds();
        O90.m5967e(upperBounds2, "getUpperBounds(...)");
        AbstractC11955zg0 abstractC11955zg0M25152e2 = AbstractC6940uI.m25152e(interfaceC10292me1);
        AbstractC7742Ig0 abstractC7742Ig0M25667i2 = new C11571we1(new C11116t41(arrayList2)).m25667i((AbstractC7742Ig0) AbstractC7167xu.m25955A(upperBounds2), EnumC9532gi1.f27949e);
        return abstractC7742Ig0M25667i2 == null ? abstractC11955zg0M25152e2.m26505m() : abstractC7742Ig0M25667i2;
    }
}
