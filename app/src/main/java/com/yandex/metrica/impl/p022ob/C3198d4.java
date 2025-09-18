package com.yandex.metrica.impl.p022ob;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.metrica.impl.ob.d4 */
/* loaded from: classes2.dex */
public class C3198d4 {

    /* renamed from: a */
    private final List<InterfaceC2571E4> f23213a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public void m15738a(InterfaceC2571E4 interfaceC2571E4) {
        this.f23213a.add(interfaceC2571E4);
    }

    /* renamed from: b */
    public void m15739b(InterfaceC2571E4 interfaceC2571E4) {
        this.f23213a.remove(interfaceC2571E4);
    }

    /* renamed from: a */
    public List<InterfaceC2571E4> m15737a() {
        return this.f23213a;
    }
}
