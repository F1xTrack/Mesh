package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3037Wl;

/* renamed from: com.yandex.metrica.impl.ob.Kk */
/* loaded from: classes2.dex */
class C2737Kk implements InterfaceC3320hm {

    /* renamed from: a */
    private final String f21591a;

    public C2737Kk(String str) {
        this.f21591a = str;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3320hm
    /* renamed from: a */
    public boolean mo13972a(Object obj) {
        return ((String) obj).contains(this.f21591a);
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3320hm
    /* renamed from: a */
    public C3037Wl.b mo13971a() {
        return C3037Wl.b.CONTAINS;
    }
}
