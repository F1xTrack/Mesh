package p000;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;

/* renamed from: xg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C11701xg0 implements InterfaceC6434mZ {

    /* renamed from: a */
    public final /* synthetic */ int f45733a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC11955zg0 f45734b;

    public /* synthetic */ C11701xg0(AbstractC11955zg0 abstractC11955zg0, int i) {
        this.f45733a = i;
        this.f45734b = abstractC11955zg0;
    }

    @Override // p000.InterfaceC6434mZ
    public final Object invoke() {
        AbstractC11955zg0 abstractC11955zg0 = this.f45734b;
        switch (this.f45733a) {
            case 0:
                return Arrays.asList(abstractC11955zg0.m26504k().mo895C0(AbstractC10732q41.f40588l), abstractC11955zg0.m26504k().mo895C0(AbstractC10732q41.f40590n), abstractC11955zg0.m26504k().mo895C0(AbstractC10732q41.f40591o), abstractC11955zg0.m26504k().mo895C0(AbstractC10732q41.f40589m));
            default:
                EnumMap enumMap = new EnumMap(EnumC11005sD0.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (EnumC11005sD0 enumC11005sD0 : EnumC11005sD0.values()) {
                    String strM7801b = enumC11005sD0.f42314a.m7801b();
                    if (strM7801b == null) {
                        abstractC11955zg0.getClass();
                        AbstractC11955zg0.m26490a(47);
                        throw null;
                    }
                    X01 x01Mo1492m = abstractC11955zg0.m26503j(strM7801b).mo1492m();
                    if (x01Mo1492m == null) {
                        AbstractC11955zg0.m26490a(48);
                        throw null;
                    }
                    String strM7801b2 = enumC11005sD0.f42315b.m7801b();
                    if (strM7801b2 == null) {
                        AbstractC11955zg0.m26490a(47);
                        throw null;
                    }
                    X01 x01Mo1492m2 = abstractC11955zg0.m26503j(strM7801b2).mo1492m();
                    if (x01Mo1492m2 == null) {
                        AbstractC11955zg0.m26490a(48);
                        throw null;
                    }
                    enumMap.put((EnumMap) enumC11005sD0, (EnumC11005sD0) x01Mo1492m2);
                    map.put(x01Mo1492m, x01Mo1492m2);
                    map2.put(x01Mo1492m2, x01Mo1492m);
                }
                return new C11828yg0(enumMap, map, map2);
        }
    }
}
