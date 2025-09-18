package com.yandex.metrica.impl.p022ob;

import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Vl */
/* loaded from: classes2.dex */
class C3012Vl implements InterfaceC3449ml {

    /* renamed from: a */
    private final InterfaceC2838Ol f22662a;

    /* renamed from: b */
    private final C2987Ul f22663b;

    /* renamed from: com.yandex.metrica.impl.ob.Vl$a */
    public static class a {
    }

    public C3012Vl(InterfaceC2838Ol interfaceC2838Ol, C2987Ul c2987Ul) {
        this.f22662a = interfaceC2838Ol;
        this.f22663b = c2987Ul;
        c2987Ul.m15289b();
    }

    /* renamed from: a */
    public void m15379a(boolean z) {
        this.f22663b.m15288a(z);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3449ml
    public void onError(String str) {
        this.f22663b.m15287a();
        this.f22662a.onError(str);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3449ml
    public void onResult(JSONObject jSONObject) {
        this.f22663b.m15287a();
        this.f22662a.onResult(jSONObject);
    }
}
