package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: z12, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8285z12 {
    public static final Q81 a(C4074h11 c4074h11) {
        Q81 q81 = new Q81();
        K81 k81 = new K81(q81);
        q81.a(new C4045gs1(AbstractC6080nS1.a(c4074h11, new C5967ms1(k81, 0), new C5967ms1(k81, 1)), 0), null);
        return q81;
    }

    public static DZ b(C7816wZ c7816wZ, boolean z) {
        String lowerCase;
        O90.f(c7816wZ, "functionClass");
        DZ dz = new DZ(c7816wZ, null, 1, z);
        C6887rh0 c6887rh0A1 = c7816wZ.a1();
        MN mn = MN.a;
        List list = c7816wZ.k;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((InterfaceC5925me1) obj).O() != EnumC4015gi1.d) {
                break;
            }
            arrayList.add(obj);
        }
        L8 l8H0 = AbstractC8069xu.h0(arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(l8H0));
        Iterator it = l8H0.iterator();
        while (true) {
            C2309bM c2309bM = (C2309bM) it;
            if (!c2309bM.b.hasNext()) {
                dz.D1(null, c6887rh0A1, mn, mn, arrayList2, ((InterfaceC5925me1) AbstractC8069xu.J(list)).m(), EnumC6348os0.e, AbstractC7765wI.e);
                dz.x = true;
                return dz;
            }
            C5255j80 c5255j80 = (C5255j80) c2309bM.next();
            int i = c5255j80.a;
            InterfaceC5925me1 interfaceC5925me1 = (InterfaceC5925me1) c5255j80.b;
            String strB = interfaceC5925me1.getName().b();
            O90.e(strB, "asString(...)");
            if (strB.equals("T")) {
                lowerCase = "instance";
            } else if (strB.equals("E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = strB.toLowerCase(Locale.ROOT);
                O90.e(lowerCase, "toLowerCase(...)");
            }
            H5 h5 = S20.b;
            C1559Tt0 c1559Tt0E = C1559Tt0.e(lowerCase);
            X01 x01M = interfaceC5925me1.m();
            O90.e(x01M, "getDefaultType(...)");
            C6887rh0 c6887rh0 = c6887rh0A1;
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(new C1758Wh1(dz, null, i, h5, c1559Tt0E, x01M, false, false, false, null, W21.O0));
            arrayList2 = arrayList3;
            c6887rh0A1 = c6887rh0;
        }
    }
}
