package p000;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class V22 {
    /* renamed from: a */
    public static final C11572wf0 m8286a(InterfaceC9779ie0 interfaceC9779ie0, List list, boolean z, List list2) {
        InterfaceC0873Ns interfaceC0873NsMo17722k;
        C7789Jd1 c7789Jd1;
        C10988s41 c10988s41;
        O90.m5968f(interfaceC9779ie0, "<this>");
        O90.m5968f(list, "arguments");
        O90.m5968f(list2, "annotations");
        InterfaceC9907je0 interfaceC9907je0 = interfaceC9779ie0 instanceof InterfaceC9907je0 ? (InterfaceC9907je0) interfaceC9779ie0 : null;
        if (interfaceC9907je0 == null || (interfaceC0873NsMo17722k = interfaceC9907je0.mo17722k()) == null) {
            throw new C1131Rz("Cannot create type for an unsupported classifier: " + interfaceC9779ie0 + " (" + interfaceC9779ie0.getClass() + ')', 1);
        }
        InterfaceC8101Pd1 interfaceC8101Pd1Mo1439v = interfaceC0873NsMo17722k.mo1439v();
        O90.m5967e(interfaceC8101Pd1Mo1439v, "getTypeConstructor(...)");
        List parameters = interfaceC8101Pd1Mo1439v.getParameters();
        O90.m5967e(parameters, "getParameters(...)");
        if (parameters.size() != list.size()) {
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but " + list.size() + " were provided.");
        }
        if (list2.isEmpty()) {
            C7789Jd1.f5652b.getClass();
            c7789Jd1 = C7789Jd1.f5653c;
        } else {
            C7789Jd1.f5652b.getClass();
            c7789Jd1 = C7789Jd1.f5653c;
        }
        List parameters2 = interfaceC8101Pd1Mo1439v.getParameters();
        O90.m5967e(parameters2, "getParameters(...)");
        List list3 = list;
        ArrayList arrayList = new ArrayList(AbstractC7293zu.m26586k(list3));
        int i = 0;
        for (Object obj : list3) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC7230yu.m26279j();
                throw null;
            }
            C7376Bf0 c7376Bf0 = (C7376Bf0) obj;
            C11572wf0 c11572wf0 = c7376Bf0.f969b;
            AbstractC7742Ig0 abstractC7742Ig0 = c11572wf0 != null ? c11572wf0.f45016a : null;
            EnumC7428Cf0 enumC7428Cf0 = c7376Bf0.f968a;
            int i3 = enumC7428Cf0 == null ? -1 : AbstractC10035ke0.f36589a[enumC7428Cf0.ordinal()];
            if (i3 == -1) {
                Object obj2 = parameters2.get(i);
                O90.m5967e(obj2, "get(...)");
                c10988s41 = new C10988s41((InterfaceC10292me1) obj2);
            } else if (i3 == 1) {
                EnumC9532gi1 enumC9532gi1 = EnumC9532gi1.f27947c;
                O90.m5965c(abstractC7742Ig0);
                c10988s41 = new C10988s41(abstractC7742Ig0, enumC9532gi1);
            } else if (i3 == 2) {
                EnumC9532gi1 enumC9532gi12 = EnumC9532gi1.f27948d;
                O90.m5965c(abstractC7742Ig0);
                c10988s41 = new C10988s41(abstractC7742Ig0, enumC9532gi12);
            } else {
                if (i3 != 3) {
                    throw new C6838sg();
                }
                EnumC9532gi1 enumC9532gi13 = EnumC9532gi1.f27949e;
                O90.m5965c(abstractC7742Ig0);
                c10988s41 = new C10988s41(abstractC7742Ig0, enumC9532gi13);
            }
            arrayList.add(c10988s41);
            i = i2;
        }
        return new C11572wf0(NV1.m5726A(c7789Jd1, interfaceC8101Pd1Mo1439v, arrayList, z), null);
    }

    /* renamed from: b */
    public static /* synthetic */ C11572wf0 m8287b(InterfaceC9779ie0 interfaceC9779ie0, boolean z, int i) {
        C0779MN c0779mn = C0779MN.f7117a;
        if ((i & 2) != 0) {
            z = false;
        }
        return m8286a(interfaceC9779ie0, c0779mn, z, c0779mn);
    }
}
