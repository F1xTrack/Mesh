package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class UR1 extends AbstractC4257hz1 {
    public final /* synthetic */ int c = 1;
    public Object d;

    public /* synthetic */ UR1(String str) {
        super(str);
    }

    @Override // defpackage.AbstractC4257hz1
    public final InterfaceC0877Kz1 a(C6860rY0 c6860rY0, List list) {
        TreeMap treeMap;
        switch (this.c) {
            case 0:
                AbstractC6955s22.l(3, this.a, list);
                String strZzf = ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) list.get(0)).zzf();
                long jH = (long) AbstractC6955s22.h(((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) list.get(1)).zze().doubleValue());
                InterfaceC0877Kz1 interfaceC0877Kz1D = ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) list.get(2));
                HashMap mapJ = interfaceC0877Kz1D instanceof C0331Dz1 ? AbstractC6955s22.j((C0331Dz1) interfaceC0877Kz1D) : new HashMap();
                C2216as1 c2216as1 = (C2216as1) this.d;
                c2216as1.getClass();
                HashMap map = new HashMap();
                for (String str : mapJ.keySet()) {
                    HashMap map2 = ((C4254hy1) c2216as1.b).c;
                    map.put(str, C4254hy1.a(map2.containsKey(str) ? map2.get(str) : null, mapJ.get(str), str));
                }
                ((ArrayList) c2216as1.d).add(new C4254hy1(strZzf, jH, map));
                return InterfaceC0877Kz1.i1;
            case 1:
                AbstractC6955s22.l(2, "getValue", list);
                InterfaceC0877Kz1 interfaceC0877Kz1D2 = ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) list.get(0));
                InterfaceC0877Kz1 interfaceC0877Kz1D3 = ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) list.get(1));
                String strZzf2 = interfaceC0877Kz1D2.zzf();
                C0999Mo1 c0999Mo1 = (C0999Mo1) this.d;
                String str2 = null;
                Map map3 = (Map) ((NN1) c0999Mo1.b).e.getOrDefault((String) c0999Mo1.a, null);
                if (map3 != null && map3.containsKey(strZzf2)) {
                    str2 = (String) map3.get(strZzf2);
                }
                return str2 != null ? new C1812Wz1(str2) : interfaceC0877Kz1D3;
            case 2:
                return InterfaceC0877Kz1.i1;
            case 3:
                AbstractC6955s22.l(3, this.a, list);
                ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) list.get(0)).zzf();
                InterfaceC0877Kz1 interfaceC0877Kz1D4 = ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) list.get(1));
                if (!(interfaceC0877Kz1D4 instanceof C1344Qz1)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                InterfaceC0877Kz1 interfaceC0877Kz1D5 = ((C2192ak1) c6860rY0.c).d(c6860rY0, (InterfaceC0877Kz1) list.get(2));
                if (!(interfaceC0877Kz1D5 instanceof C0331Dz1)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                C0331Dz1 c0331Dz1 = (C0331Dz1) interfaceC0877Kz1D5;
                if (!c0331Dz1.a.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strZzf3 = c0331Dz1.b("type").zzf();
                int iP = c0331Dz1.a.containsKey("priority") ? AbstractC6955s22.p(c0331Dz1.b("priority").zze().doubleValue()) : 1000;
                C1344Qz1 c1344Qz1 = (C1344Qz1) interfaceC0877Kz1D4;
                VH vh = (VH) this.d;
                vh.getClass();
                if ("create".equals(strZzf3)) {
                    treeMap = (TreeMap) vh.c;
                } else {
                    if (!"edit".equals(strZzf3)) {
                        throw new IllegalStateException(AbstractC8235ym.v("Unknown callback type: ", strZzf3));
                    }
                    treeMap = (TreeMap) vh.b;
                }
                if (treeMap.containsKey(Integer.valueOf(iP))) {
                    iP = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iP), c1344Qz1);
                return InterfaceC0877Kz1.i1;
            default:
                try {
                    return G22.a(((RN1) this.d).call());
                } catch (Exception unused) {
                    return InterfaceC0877Kz1.i1;
                }
        }
    }

    public UR1(C6273oT0 c6273oT0) {
        super("internal.logger");
        this.d = c6273oT0;
        this.b.put("log", new X12(this, false, true));
        this.b.put("silent", new C2234ay1("silent", 2));
        ((AbstractC4257hz1) this.b.get("silent")).h("log", new X12(this, true, true));
        this.b.put("unmonitored", new C2234ay1("unmonitored", 3));
        ((AbstractC4257hz1) this.b.get("unmonitored")).h("log", new X12(this, false, false));
    }

    public UR1(RN1 rn1) {
        super("internal.appMetadata");
        this.d = rn1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UR1(C0999Mo1 c0999Mo1) {
        super("getValue");
        this.d = c0999Mo1;
    }

    public UR1(C2216as1 c2216as1) {
        super("internal.eventLogger");
        this.d = c2216as1;
    }
}
