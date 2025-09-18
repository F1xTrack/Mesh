package p000;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: cW1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8991cW1 extends C7521Dz1 {

    /* renamed from: b */
    public final C8779as1 f17582b;

    public C8991cW1(C8779as1 c8779as1) {
        this.f17582b = c8779as1;
    }

    @Override // p000.C7521Dz1, p000.InterfaceC7885Kz1
    /* renamed from: q */
    public final InterfaceC7885Kz1 mo1960q(String str, C10919rY0 c10919rY0, ArrayList arrayList) {
        C8779as1 c8779as1;
        c8779as1 = this.f17582b;
        switch (str) {
            case "getEventName":
                AbstractC10983s22.m24590l(0, "getEventName", arrayList);
                return new C8509Wz1(((C9692hy1) c8779as1.f16641c).f28701a);
            case "getTimestamp":
                AbstractC10983s22.m24590l(0, "getTimestamp", arrayList);
                return new C7987My1(Double.valueOf(((C9692hy1) c8779as1.f16641c).f28702b));
            case "getParamValue":
                AbstractC10983s22.m24590l(1, "getParamValue", arrayList);
                String strZzf = ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) arrayList.get(0)).zzf();
                HashMap map = ((C9692hy1) c8779as1.f16641c).f28703c;
                return G22.m2915a(map.containsKey(strZzf) ? map.get(strZzf) : null);
            case "getParams":
                AbstractC10983s22.m24590l(0, "getParams", arrayList);
                HashMap map2 = ((C9692hy1) c8779as1.f16641c).f28703c;
                C7521Dz1 c7521Dz1 = new C7521Dz1();
                for (String str2 : map2.keySet()) {
                    c7521Dz1.mo1958h(str2, G22.m2915a(map2.get(str2)));
                }
                return c7521Dz1;
            case "setParamValue":
                AbstractC10983s22.m24590l(2, "setParamValue", arrayList);
                String strZzf2 = ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) arrayList.get(0)).zzf();
                InterfaceC7885Kz1 interfaceC7885Kz1M9804d = ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) arrayList.get(1));
                C9692hy1 c9692hy1 = (C9692hy1) c8779as1.f16641c;
                Object objM24587i = AbstractC10983s22.m24587i(interfaceC7885Kz1M9804d);
                HashMap map3 = c9692hy1.f28703c;
                if (objM24587i == null) {
                    map3.remove(strZzf2);
                } else {
                    map3.put(strZzf2, C9692hy1.m18930a(map3.get(strZzf2), objM24587i, strZzf2));
                }
                return interfaceC7885Kz1M9804d;
            case "setEventName":
                AbstractC10983s22.m24590l(1, "setEventName", arrayList);
                InterfaceC7885Kz1 interfaceC7885Kz1M9804d2 = ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) arrayList.get(0));
                if (InterfaceC7885Kz1.f6417i1.equals(interfaceC7885Kz1M9804d2) || InterfaceC7885Kz1.f6418j1.equals(interfaceC7885Kz1M9804d2)) {
                    throw new IllegalArgumentException("Illegal event name");
                }
                ((C9692hy1) c8779as1.f16641c).f28701a = interfaceC7885Kz1M9804d2.zzf();
                return new C8509Wz1(interfaceC7885Kz1M9804d2.zzf());
            default:
                return super.mo1960q(str, c10919rY0, arrayList);
        }
    }
}
