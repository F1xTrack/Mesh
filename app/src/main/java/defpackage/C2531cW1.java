package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: cW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2531cW1 extends C0331Dz1 {
    public final C2216as1 b;

    public C2531cW1(C2216as1 c2216as1) {
        this.b = c2216as1;
    }

    @Override // defpackage.C0331Dz1, defpackage.InterfaceC0877Kz1
    public final InterfaceC0877Kz1 q(String str, C6860rY0 c6860rY0, ArrayList arrayList) {
        C2216as1 c2216as1;
        c2216as1 = this.b;
        switch (str) {
            case "getEventName":
                AbstractC6955s22.l(0, "getEventName", arrayList);
                return new C1812Wz1(((C4254hy1) c2216as1.c).a);
            case "getTimestamp":
                AbstractC6955s22.l(0, "getTimestamp", arrayList);
                return new C1029My1(Double.valueOf(((C4254hy1) c2216as1.c).b));
            case "getParamValue":
                AbstractC6955s22.l(1, "getParamValue", arrayList);
                String strZzf = ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) arrayList.get(0)).zzf();
                HashMap map = ((C4254hy1) c2216as1.c).c;
                return G22.a(map.containsKey(strZzf) ? map.get(strZzf) : null);
            case "getParams":
                AbstractC6955s22.l(0, "getParams", arrayList);
                HashMap map2 = ((C4254hy1) c2216as1.c).c;
                C0331Dz1 c0331Dz1 = new C0331Dz1();
                for (String str2 : map2.keySet()) {
                    c0331Dz1.h(str2, G22.a(map2.get(str2)));
                }
                return c0331Dz1;
            case "setParamValue":
                AbstractC6955s22.l(2, "setParamValue", arrayList);
                String strZzf2 = ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) arrayList.get(0)).zzf();
                InterfaceC0877Kz1 interfaceC0877Kz1D = ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) arrayList.get(1));
                C4254hy1 c4254hy1 = (C4254hy1) c2216as1.c;
                Object objI = AbstractC6955s22.i(interfaceC0877Kz1D);
                HashMap map3 = c4254hy1.c;
                if (objI == null) {
                    map3.remove(strZzf2);
                } else {
                    map3.put(strZzf2, C4254hy1.a(map3.get(strZzf2), objI, strZzf2));
                }
                return interfaceC0877Kz1D;
            case "setEventName":
                AbstractC6955s22.l(1, "setEventName", arrayList);
                InterfaceC0877Kz1 interfaceC0877Kz1D2 = ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) arrayList.get(0));
                if (InterfaceC0877Kz1.i1.equals(interfaceC0877Kz1D2) || InterfaceC0877Kz1.j1.equals(interfaceC0877Kz1D2)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                ((C4254hy1) c2216as1.c).a = interfaceC0877Kz1D2.zzf();
                return new C1812Wz1(interfaceC0877Kz1D2.zzf());
            default:
                return super.q(str, c6860rY0, arrayList);
        }
    }
}
