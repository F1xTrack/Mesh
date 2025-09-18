package com.yandex.metrica.impl.ob;

import defpackage.AbstractC8069xu;
import defpackage.C2404br1;
import defpackage.O90;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2913m implements InterfaceC3062s {
    private boolean a;
    private final Map<String, C2404br1> b;
    private final InterfaceC3112u c;

    public C2913m(InterfaceC3112u interfaceC3112u) {
        O90.f(interfaceC3112u, "storage");
        this.c = interfaceC3112u;
        C3171w3 c3171w3 = (C3171w3) interfaceC3112u;
        this.a = c3171w3.b();
        List<C2404br1> listA = c3171w3.a();
        O90.e(listA, "storage.billingInfo");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listA) {
            linkedHashMap.put(((C2404br1) obj).b, obj);
        }
        this.b = linkedHashMap;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3062s
    public void a(Map<String, ? extends C2404br1> map) {
        O90.f(map, "history");
        for (C2404br1 c2404br1 : map.values()) {
            Map<String, C2404br1> map2 = this.b;
            String str = c2404br1.b;
            O90.e(str, "billingInfo.sku");
            map2.put(str, c2404br1);
        }
        ((C3171w3) this.c).a(AbstractC8069xu.b0(this.b.values()), this.a);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3062s
    public void b() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((C3171w3) this.c).a(AbstractC8069xu.b0(this.b.values()), this.a);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3062s
    public C2404br1 a(String str) {
        O90.f(str, "sku");
        return this.b.get(str);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3062s
    public boolean a() {
        return this.a;
    }
}
