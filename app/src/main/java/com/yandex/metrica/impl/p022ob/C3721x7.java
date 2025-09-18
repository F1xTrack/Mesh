package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2757Lf;
import java.util.EnumMap;

/* renamed from: com.yandex.metrica.impl.ob.x7 */
/* loaded from: classes2.dex */
public class C3721x7 implements InterfaceC3230ea<C2749L7, C2757Lf> {

    /* renamed from: a */
    private static final EnumMap<EnumC2824O7, Integer> f25234a;

    static {
        EnumMap<EnumC2824O7, Integer> enumMap = new EnumMap<>(EnumC2824O7.class);
        f25234a = enumMap;
        enumMap.put((EnumMap<EnumC2824O7, Integer>) EnumC2824O7.UNKNOWN, (EnumC2824O7) 0);
        enumMap.put((EnumMap<EnumC2824O7, Integer>) EnumC2824O7.BREAKPAD, (EnumC2824O7) 2);
        enumMap.put((EnumMap<EnumC2824O7, Integer>) EnumC2824O7.CRASHPAD, (EnumC2824O7) 3);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C2749L7 mo13846a(C2757Lf c2757Lf) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C2757Lf mo13847b(C2749L7 c2749l7) {
        C2757Lf c2757Lf = new C2757Lf();
        c2757Lf.f21650g = 1;
        C2757Lf.a aVar = new C2757Lf.a();
        c2757Lf.f21651h = aVar;
        aVar.f21655b = c2749l7.m14510a();
        C2724K7 c2724k7M14511b = c2749l7.m14511b();
        c2757Lf.f21651h.f21656c = new C2807Nf();
        Integer num = f25234a.get(c2724k7M14511b.m14469b());
        if (num != null) {
            c2757Lf.f21651h.f21656c.f21778b = num.intValue();
        }
        C2807Nf c2807Nf = c2757Lf.f21651h.f21656c;
        String strM14468a = c2724k7M14511b.m14468a();
        if (strM14468a == null) {
            strM14468a = "";
        }
        c2807Nf.f21779c = strM14468a;
        return c2757Lf;
    }
}
