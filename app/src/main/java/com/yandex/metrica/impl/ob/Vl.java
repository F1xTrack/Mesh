package com.yandex.metrica.impl.ob;

import org.json.JSONObject;

/* loaded from: classes2.dex */
class Vl implements InterfaceC2935ml {
    private final Ol a;
    private final Ul b;

    public static class a {
    }

    public Vl(Ol ol, Ul ul) {
        this.a = ol;
        this.b = ul;
        ul.b();
    }

    public void a(boolean z) {
        this.b.a(z);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2935ml
    public void onError(String str) {
        this.b.a();
        this.a.onError(str);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2935ml
    public void onResult(JSONObject jSONObject) {
        this.b.a();
        this.a.onResult(jSONObject);
    }
}
