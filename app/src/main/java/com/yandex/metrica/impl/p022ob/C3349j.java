package com.yandex.metrica.impl.p022ob;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p000.C8905br1;

/* renamed from: com.yandex.metrica.impl.ob.j */
/* loaded from: classes2.dex */
public class C3349j implements InterfaceC3583s {

    /* renamed from: a */
    private boolean f23668a;

    /* renamed from: b */
    private final InterfaceC3635u f23669b;

    /* renamed from: c */
    private final Map<String, C8905br1> f23670c = new HashMap();

    public C3349j(InterfaceC3635u interfaceC3635u) {
        C3691w3 c3691w3 = (C3691w3) interfaceC3635u;
        for (C8905br1 c8905br1 : c3691w3.m17113a()) {
            this.f23670c.put(c8905br1.f17191b, c8905br1);
        }
        this.f23668a = c3691w3.m17115b();
        this.f23669b = c3691w3;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3583s
    /* renamed from: a */
    public void mo16102a(Map<String, C8905br1> map) {
        for (C8905br1 c8905br1 : map.values()) {
            this.f23670c.put(c8905br1.f17191b, c8905br1);
        }
        ((C3691w3) this.f23669b).m17114a(new ArrayList(this.f23670c.values()), this.f23668a);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3583s
    /* renamed from: b */
    public void mo16104b() {
        if (this.f23668a) {
            return;
        }
        this.f23668a = true;
        ((C3691w3) this.f23669b).m17114a(new ArrayList(this.f23670c.values()), this.f23668a);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3583s
    /* renamed from: a */
    public C8905br1 mo16101a(String str) {
        return this.f23670c.get(str);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3583s
    /* renamed from: a */
    public boolean mo16103a() {
        return this.f23668a;
    }
}
