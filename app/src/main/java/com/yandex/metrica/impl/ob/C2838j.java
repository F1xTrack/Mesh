package com.yandex.metrica.impl.ob;

import defpackage.C2404br1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2838j implements InterfaceC3062s {
    private boolean a;
    private final InterfaceC3112u b;
    private final Map<String, C2404br1> c = new HashMap();

    public C2838j(InterfaceC3112u interfaceC3112u) {
        C3171w3 c3171w3 = (C3171w3) interfaceC3112u;
        for (C2404br1 c2404br1 : c3171w3.a()) {
            this.c.put(c2404br1.b, c2404br1);
        }
        this.a = c3171w3.b();
        this.b = c3171w3;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3062s
    public void a(Map<String, C2404br1> map) {
        for (C2404br1 c2404br1 : map.values()) {
            this.c.put(c2404br1.b, c2404br1);
        }
        ((C3171w3) this.b).a(new ArrayList(this.c.values()), this.a);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3062s
    public void b() {
        if (this.a) {
            return;
        }
        this.a = true;
        ((C3171w3) this.b).a(new ArrayList(this.c.values()), this.a);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3062s
    public C2404br1 a(String str) {
        return this.c.get(str);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3062s
    public boolean a() {
        return this.a;
    }
}
