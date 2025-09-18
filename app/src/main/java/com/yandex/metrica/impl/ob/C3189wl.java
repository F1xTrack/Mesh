package com.yandex.metrica.impl.ob;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.wl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3189wl implements InterfaceC2835il {
    private final List<Wl> a = new ArrayList();

    @Override // com.yandex.metrica.impl.ob.InterfaceC3084sl
    public void a(Wl wl) {
        this.a.add(wl);
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2835il
    public List<Wl> a() {
        return this.a;
    }
}
