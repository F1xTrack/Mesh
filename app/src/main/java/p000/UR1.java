package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class UR1 extends AbstractC9694hz1 {

    /* renamed from: c */
    public final /* synthetic */ int f11789c = 1;

    /* renamed from: d */
    public Object f11790d;

    public /* synthetic */ UR1(String str) {
        super(str);
    }

    @Override // p000.AbstractC9694hz1
    /* renamed from: a */
    public final InterfaceC7885Kz1 mo6842a(C10919rY0 c10919rY0, List list) {
        TreeMap treeMap;
        switch (this.f11789c) {
            case 0:
                AbstractC10983s22.m24590l(3, this.f28710a, list);
                String strZzf = ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) list.get(0)).zzf();
                long jM24586h = (long) AbstractC10983s22.m24586h(((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) list.get(1)).zze().doubleValue());
                InterfaceC7885Kz1 interfaceC7885Kz1M9804d = ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) list.get(2));
                HashMap mapM24588j = interfaceC7885Kz1M9804d instanceof C7521Dz1 ? AbstractC10983s22.m24588j((C7521Dz1) interfaceC7885Kz1M9804d) : new HashMap();
                C8779as1 c8779as1 = (C8779as1) this.f11790d;
                c8779as1.getClass();
                HashMap map = new HashMap();
                for (String str : mapM24588j.keySet()) {
                    HashMap map2 = ((C9692hy1) c8779as1.f16640b).f28703c;
                    map.put(str, C9692hy1.m18930a(map2.containsKey(str) ? map2.get(str) : null, mapM24588j.get(str), str));
                }
                ((ArrayList) c8779as1.f16642d).add(new C9692hy1(strZzf, jM24586h, map));
                return InterfaceC7885Kz1.f6417i1;
            case 1:
                AbstractC10983s22.m24590l(2, "getValue", list);
                InterfaceC7885Kz1 interfaceC7885Kz1M9804d2 = ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) list.get(0));
                InterfaceC7885Kz1 interfaceC7885Kz1M9804d3 = ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) list.get(1));
                String strZzf2 = interfaceC7885Kz1M9804d2.zzf();
                C7967Mo1 c7967Mo1 = (C7967Mo1) this.f11790d;
                String str2 = null;
                Map map3 = (Map) ((NN1) c7967Mo1.f7363b).f7736e.getOrDefault((String) c7967Mo1.f7362a, null);
                if (map3 != null && map3.containsKey(strZzf2)) {
                    str2 = (String) map3.get(strZzf2);
                }
                return str2 != null ? new C8509Wz1(str2) : interfaceC7885Kz1M9804d3;
            case 2:
                return InterfaceC7885Kz1.f6417i1;
            case 3:
                AbstractC10983s22.m24590l(3, this.f28710a, list);
                ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) list.get(0)).zzf();
                InterfaceC7885Kz1 interfaceC7885Kz1M9804d4 = ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) list.get(1));
                if (!(interfaceC7885Kz1M9804d4 instanceof C8197Qz1)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                InterfaceC7885Kz1 interfaceC7885Kz1M9804d5 = ((C8763ak1) c10919rY0.f41729c).m9804d(c10919rY0, (InterfaceC7885Kz1) list.get(2));
                if (!(interfaceC7885Kz1M9804d5 instanceof C7521Dz1)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                C7521Dz1 c7521Dz1 = (C7521Dz1) interfaceC7885Kz1M9804d5;
                if (!c7521Dz1.f2333a.containsKey("type")) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strZzf3 = c7521Dz1.mo1956b("type").zzf();
                int iM24594p = c7521Dz1.f2333a.containsKey("priority") ? AbstractC10983s22.m24594p(c7521Dz1.mo1956b("priority").zze().doubleValue()) : 1000;
                C8197Qz1 c8197Qz1 = (C8197Qz1) interfaceC7885Kz1M9804d4;
                C1339VH c1339vh = (C1339VH) this.f11790d;
                c1339vh.getClass();
                if ("create".equals(strZzf3)) {
                    treeMap = (TreeMap) c1339vh.f12487c;
                } else {
                    if (!"edit".equals(strZzf3)) {
                        throw new IllegalStateException(AbstractC7222ym.m26245v("Unknown callback type: ", strZzf3));
                    }
                    treeMap = (TreeMap) c1339vh.f12486b;
                }
                if (treeMap.containsKey(Integer.valueOf(iM24594p))) {
                    iM24594p = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iM24594p), c8197Qz1);
                return InterfaceC7885Kz1.f6417i1;
            default:
                try {
                    return G22.m2915a(((RN1) this.f11790d).call());
                } catch (Exception unused) {
                    return InterfaceC7885Kz1.f6417i1;
                }
        }
    }

    public UR1(C10525oT0 c10525oT0) {
        super("internal.logger");
        this.f11790d = c10525oT0;
        this.f28711b.put("log", new X12(this, false, true));
        this.f28711b.put("silent", new C8791ay1("silent", 2));
        ((AbstractC9694hz1) this.f28711b.get("silent")).mo1958h("log", new X12(this, true, true));
        this.f28711b.put("unmonitored", new C8791ay1("unmonitored", 3));
        ((AbstractC9694hz1) this.f28711b.get("unmonitored")).mo1958h("log", new X12(this, false, false));
    }

    public UR1(RN1 rn1) {
        super("internal.appMetadata");
        this.f11790d = rn1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UR1(C7967Mo1 c7967Mo1) {
        super("getValue");
        this.f11790d = c7967Mo1;
    }

    public UR1(C8779as1 c8779as1) {
        super("internal.eventLogger");
        this.f11790d = c8779as1;
    }
}
