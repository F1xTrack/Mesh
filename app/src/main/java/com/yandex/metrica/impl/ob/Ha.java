package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import com.yandex.metrica.impl.ob.Vi;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class Ha implements InterfaceC2725ea<Vi, C2880kg.s> {
    private static final EnumMap<Vi.b, String> a;
    private static final Map<String, Vi.b> b;

    static {
        EnumMap<Vi.b, String> enumMap = new EnumMap<>(Vi.b.class);
        a = enumMap;
        HashMap map = new HashMap();
        b = map;
        Vi.b bVar = Vi.b.WIFI;
        enumMap.put((EnumMap<Vi.b, String>) bVar, (Vi.b) "wifi");
        Vi.b bVar2 = Vi.b.CELL;
        enumMap.put((EnumMap<Vi.b, String>) bVar2, (Vi.b) "cell");
        map.put("wifi", bVar);
        map.put("cell", bVar2);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.s b(Vi vi) {
        C2880kg.s sVar = new C2880kg.s();
        if (vi.a != null) {
            C2880kg.t tVar = new C2880kg.t();
            sVar.b = tVar;
            Vi.a aVar = vi.a;
            tVar.b = aVar.a;
            tVar.c = aVar.b;
        }
        if (vi.b != null) {
            C2880kg.t tVar2 = new C2880kg.t();
            sVar.c = tVar2;
            Vi.a aVar2 = vi.b;
            tVar2.b = aVar2.a;
            tVar2.c = aVar2.b;
        }
        return sVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Vi a(C2880kg.s sVar) {
        C2880kg.t tVar = sVar.b;
        Vi.a aVar = tVar != null ? new Vi.a(tVar.b, tVar.c) : null;
        C2880kg.t tVar2 = sVar.c;
        return new Vi(aVar, tVar2 != null ? new Vi.a(tVar2.b, tVar2.c) : null);
    }
}
