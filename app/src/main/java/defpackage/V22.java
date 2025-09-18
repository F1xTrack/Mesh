package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class V22 {
    public static final C7835wf0 a(InterfaceC4384ie0 interfaceC4384ie0, List list, boolean z, List list2) {
        InterfaceC1087Ns interfaceC1087NsK;
        C0733Jd1 c0733Jd1;
        C6962s41 c6962s41;
        O90.f(interfaceC4384ie0, "<this>");
        O90.f(list, "arguments");
        O90.f(list2, "annotations");
        InterfaceC5351je0 interfaceC5351je0 = interfaceC4384ie0 instanceof InterfaceC5351je0 ? (InterfaceC5351je0) interfaceC4384ie0 : null;
        if (interfaceC5351je0 == null || (interfaceC1087NsK = interfaceC5351je0.k()) == null) {
            throw new C1420Rz("Cannot create type for an unsupported classifier: " + interfaceC4384ie0 + " (" + interfaceC4384ie0.getClass() + ')', 1);
        }
        InterfaceC1200Pd1 interfaceC1200Pd1V = interfaceC1087NsK.v();
        O90.e(interfaceC1200Pd1V, "getTypeConstructor(...)");
        List parameters = interfaceC1200Pd1V.getParameters();
        O90.e(parameters, "getParameters(...)");
        if (parameters.size() != list.size()) {
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + list.size() + " were provided.");
        }
        if (list2.isEmpty()) {
            C0733Jd1.b.getClass();
            c0733Jd1 = C0733Jd1.c;
        } else {
            C0733Jd1.b.getClass();
            c0733Jd1 = C0733Jd1.c;
        }
        List parameters2 = interfaceC1200Pd1V.getParameters();
        O90.e(parameters2, "getParameters(...)");
        List list3 = list;
        ArrayList arrayList = new ArrayList(AbstractC8449zu.k(list3));
        int i = 0;
        for (Object obj : list3) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC8259yu.j();
                throw null;
            }
            C0114Bf0 c0114Bf0 = (C0114Bf0) obj;
            C7835wf0 c7835wf0 = c0114Bf0.b;
            AbstractC0663Ig0 abstractC0663Ig0 = c7835wf0 != null ? c7835wf0.a : null;
            EnumC0192Cf0 enumC0192Cf0 = c0114Bf0.a;
            int i3 = enumC0192Cf0 == null ? -1 : AbstractC5542ke0.a[enumC0192Cf0.ordinal()];
            if (i3 == -1) {
                Object obj2 = parameters2.get(i);
                O90.e(obj2, "get(...)");
                c6962s41 = new C6962s41((InterfaceC5925me1) obj2);
            } else if (i3 == 1) {
                EnumC4015gi1 enumC4015gi1 = EnumC4015gi1.c;
                O90.c(abstractC0663Ig0);
                c6962s41 = new C6962s41(abstractC0663Ig0, enumC4015gi1);
            } else if (i3 == 2) {
                EnumC4015gi1 enumC4015gi12 = EnumC4015gi1.d;
                O90.c(abstractC0663Ig0);
                c6962s41 = new C6962s41(abstractC0663Ig0, enumC4015gi12);
            } else {
                if (i3 != 3) {
                    throw new C7074sg();
                }
                EnumC4015gi1 enumC4015gi13 = EnumC4015gi1.e;
                O90.c(abstractC0663Ig0);
                c6962s41 = new C6962s41(abstractC0663Ig0, enumC4015gi13);
            }
            arrayList.add(c6962s41);
            i = i2;
        }
        return new C7835wf0(NV1.A(c0733Jd1, interfaceC1200Pd1V, arrayList, z), null);
    }

    public static /* synthetic */ C7835wf0 b(InterfaceC4384ie0 interfaceC4384ie0, boolean z, int i) {
        MN mn = MN.a;
        if ((i & 2) != 0) {
            z = false;
        }
        return a(interfaceC4384ie0, mn, z, mn);
    }
}
