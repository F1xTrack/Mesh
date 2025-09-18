package defpackage;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;

/* renamed from: xg0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C8028xg0 implements InterfaceC5908mZ {
    public final /* synthetic */ int a;
    public final /* synthetic */ AbstractC8408zg0 b;

    public /* synthetic */ C8028xg0(AbstractC8408zg0 abstractC8408zg0, int i) {
        this.a = i;
        this.b = abstractC8408zg0;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        AbstractC8408zg0 abstractC8408zg0 = this.b;
        switch (this.a) {
            case 0:
                return Arrays.asList(abstractC8408zg0.k().C0(AbstractC6581q41.l), abstractC8408zg0.k().C0(AbstractC6581q41.n), abstractC8408zg0.k().C0(AbstractC6581q41.o), abstractC8408zg0.k().C0(AbstractC6581q41.m));
            default:
                EnumMap enumMap = new EnumMap(EnumC6988sD0.class);
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                for (EnumC6988sD0 enumC6988sD0 : EnumC6988sD0.values()) {
                    String strB = enumC6988sD0.a.b();
                    if (strB == null) {
                        abstractC8408zg0.getClass();
                        AbstractC8408zg0.a(47);
                        throw null;
                    }
                    X01 x01M = abstractC8408zg0.j(strB).m();
                    if (x01M == null) {
                        AbstractC8408zg0.a(48);
                        throw null;
                    }
                    String strB2 = enumC6988sD0.b.b();
                    if (strB2 == null) {
                        AbstractC8408zg0.a(47);
                        throw null;
                    }
                    X01 x01M2 = abstractC8408zg0.j(strB2).m();
                    if (x01M2 == null) {
                        AbstractC8408zg0.a(48);
                        throw null;
                    }
                    enumMap.put((EnumMap) enumC6988sD0, (EnumC6988sD0) x01M2);
                    map.put(x01M, x01M2);
                    map2.put(x01M2, x01M);
                }
                return new C8218yg0(enumMap, map, map2);
        }
    }
}
