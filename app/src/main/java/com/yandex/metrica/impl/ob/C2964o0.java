package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.o0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C2964o0 implements Bk {
    final /* synthetic */ C3014q0 a;

    public C2964o0(C3014q0 c3014q0) {
        this.a = c3014q0;
    }

    @Override // com.yandex.metrica.impl.ob.Bk
    public void a(Ak ak) {
        Vj vjB = ak.b();
        if (vjB != null) {
            this.a.f.put("cellular_connection_type", vjB.m());
        }
        this.a.f.put("call_state", Integer.valueOf(ak.a()));
    }
}
