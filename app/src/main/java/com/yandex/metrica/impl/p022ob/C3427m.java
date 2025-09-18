package com.yandex.metrica.impl.p022ob;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.AbstractC7167xu;
import p000.C8905br1;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.m */
/* loaded from: classes2.dex */
public final class C3427m implements InterfaceC3583s {

    /* renamed from: a */
    private boolean f24233a;

    /* renamed from: b */
    private final Map<String, C8905br1> f24234b;

    /* renamed from: c */
    private final InterfaceC3635u f24235c;

    public C3427m(InterfaceC3635u interfaceC3635u) {
        O90.m5968f(interfaceC3635u, "storage");
        this.f24235c = interfaceC3635u;
        C3691w3 c3691w3 = (C3691w3) interfaceC3635u;
        this.f24233a = c3691w3.m17115b();
        List<C8905br1> listM17113a = c3691w3.m17113a();
        O90.m5967e(listM17113a, "storage.billingInfo");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : listM17113a) {
            linkedHashMap.put(((C8905br1) obj).f17191b, obj);
        }
        this.f24234b = linkedHashMap;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3583s
    /* renamed from: a */
    public void mo16102a(Map<String, ? extends C8905br1> map) {
        O90.m5968f(map, "history");
        for (C8905br1 c8905br1 : map.values()) {
            Map<String, C8905br1> map2 = this.f24234b;
            String str = c8905br1.f17191b;
            O90.m5967e(str, "billingInfo.sku");
            map2.put(str, c8905br1);
        }
        ((C3691w3) this.f24235c).m17114a(AbstractC7167xu.m25982b0(this.f24234b.values()), this.f24233a);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3583s
    /* renamed from: b */
    public void mo16104b() {
        if (this.f24233a) {
            return;
        }
        this.f24233a = true;
        ((C3691w3) this.f24235c).m17114a(AbstractC7167xu.m25982b0(this.f24234b.values()), this.f24233a);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3583s
    /* renamed from: a */
    public C8905br1 mo16101a(String str) {
        O90.m5968f(str, "sku");
        return this.f24234b.get(str);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3583s
    /* renamed from: a */
    public boolean mo16103a() {
        return this.f24233a;
    }
}
