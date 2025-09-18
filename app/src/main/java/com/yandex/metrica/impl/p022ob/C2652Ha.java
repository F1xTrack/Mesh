package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3009Vi;
import com.yandex.metrica.impl.p022ob.C3392kg;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.Ha */
/* loaded from: classes2.dex */
public class C2652Ha implements InterfaceC3230ea<C3009Vi, C3392kg.s> {

    /* renamed from: a */
    private static final EnumMap<C3009Vi.b, String> f21353a;

    /* renamed from: b */
    private static final Map<String, C3009Vi.b> f21354b;

    static {
        EnumMap<C3009Vi.b, String> enumMap = new EnumMap<>(C3009Vi.b.class);
        f21353a = enumMap;
        HashMap map = new HashMap();
        f21354b = map;
        C3009Vi.b bVar = C3009Vi.b.WIFI;
        enumMap.put((EnumMap<C3009Vi.b, String>) bVar, (C3009Vi.b) "wifi");
        C3009Vi.b bVar2 = C3009Vi.b.CELL;
        enumMap.put((EnumMap<C3009Vi.b, String>) bVar2, (C3009Vi.b) "cell");
        map.put("wifi", bVar);
        map.put("cell", bVar2);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3392kg.s mo13847b(C3009Vi c3009Vi) {
        C3392kg.s sVar = new C3392kg.s();
        if (c3009Vi.f22621a != null) {
            C3392kg.t tVar = new C3392kg.t();
            sVar.f24088b = tVar;
            C3009Vi.a aVar = c3009Vi.f22621a;
            tVar.f24090b = aVar.f22623a;
            tVar.f24091c = aVar.f22624b;
        }
        if (c3009Vi.f22622b != null) {
            C3392kg.t tVar2 = new C3392kg.t();
            sVar.f24089c = tVar2;
            C3009Vi.a aVar2 = c3009Vi.f22622b;
            tVar2.f24090b = aVar2.f22623a;
            tVar2.f24091c = aVar2.f22624b;
        }
        return sVar;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3009Vi mo13846a(C3392kg.s sVar) {
        C3392kg.t tVar = sVar.f24088b;
        C3009Vi.a aVar = tVar != null ? new C3009Vi.a(tVar.f24090b, tVar.f24091c) : null;
        C3392kg.t tVar2 = sVar.f24089c;
        return new C3009Vi(aVar, tVar2 != null ? new C3009Vi.a(tVar2.f24090b, tVar2.f24091c) : null);
    }
}
