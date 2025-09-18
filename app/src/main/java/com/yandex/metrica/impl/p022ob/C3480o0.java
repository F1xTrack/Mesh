package com.yandex.metrica.impl.p022ob;

/* renamed from: com.yandex.metrica.impl.ob.o0 */
/* loaded from: classes2.dex */
class C3480o0 implements InterfaceC2512Bk {

    /* renamed from: a */
    final /* synthetic */ C3532q0 f24332a;

    public C3480o0(C3532q0 c3532q0) {
        this.f24332a = c3532q0;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2512Bk
    /* renamed from: a */
    public void mo859a(C2487Ak c2487Ak) {
        C3010Vj c3010VjM13869b = c2487Ak.m13869b();
        if (c3010VjM13869b != null) {
            this.f24332a.f24526f.put("cellular_connection_type", c3010VjM13869b.m15340m());
        }
        this.f24332a.f24526f.put("call_state", Integer.valueOf(c2487Ak.m13868a()));
    }
}
