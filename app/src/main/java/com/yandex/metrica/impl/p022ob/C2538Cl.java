package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3037Wl;

/* renamed from: com.yandex.metrica.impl.ob.Cl */
/* loaded from: classes2.dex */
public class C2538Cl implements InterfaceC3320hm {

    /* renamed from: a */
    private final int f20986a;

    public C2538Cl(int i) {
        this.f20986a = i;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3320hm
    /* renamed from: a */
    public boolean mo13972a(Object obj) {
        return ((String) obj).length() > this.f20986a;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3320hm
    /* renamed from: a */
    public C3037Wl.b mo13971a() {
        return C3037Wl.b.TEXT_TOO_LONG;
    }
}
