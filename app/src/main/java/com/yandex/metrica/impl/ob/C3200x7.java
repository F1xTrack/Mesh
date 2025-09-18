package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Lf;
import java.util.EnumMap;

/* renamed from: com.yandex.metrica.impl.ob.x7 */
/* loaded from: classes2.dex */
public class C3200x7 implements InterfaceC2725ea<L7, Lf> {
    private static final EnumMap<O7, Integer> a;

    static {
        EnumMap<O7, Integer> enumMap = new EnumMap<>(O7.class);
        a = enumMap;
        enumMap.put((EnumMap<O7, Integer>) O7.UNKNOWN, (O7) 0);
        enumMap.put((EnumMap<O7, Integer>) O7.BREAKPAD, (O7) 2);
        enumMap.put((EnumMap<O7, Integer>) O7.CRASHPAD, (O7) 3);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public L7 a(Lf lf) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a */
    public Lf b(L7 l7) {
        Lf lf = new Lf();
        lf.g = 1;
        Lf.a aVar = new Lf.a();
        lf.h = aVar;
        aVar.b = l7.a();
        K7 k7B = l7.b();
        lf.h.c = new Nf();
        Integer num = a.get(k7B.b());
        if (num != null) {
            lf.h.c.b = num.intValue();
        }
        Nf nf = lf.h.c;
        String strA = k7B.a();
        if (strA == null) {
            strA = "";
        }
        nf.c = strA;
        return lf;
    }
}
