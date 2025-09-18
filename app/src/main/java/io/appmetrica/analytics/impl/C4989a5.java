package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.a5 */
/* loaded from: classes2.dex */
public final class C4989a5 {

    /* renamed from: a */
    public final CopyOnWriteArrayList f31241a = new CopyOnWriteArrayList();

    /* renamed from: a */
    public final void m20098a(InterfaceC5463t4 interfaceC5463t4) {
        this.f31241a.add(interfaceC5463t4);
    }

    /* renamed from: b */
    public final void m20099b(InterfaceC5463t4 interfaceC5463t4) {
        this.f31241a.remove(interfaceC5463t4);
    }

    /* renamed from: a */
    public final List<InterfaceC5463t4> m20097a() {
        return this.f31241a;
    }
}
