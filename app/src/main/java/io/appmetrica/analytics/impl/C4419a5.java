package io.appmetrica.analytics.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.a5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4419a5 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public final void a(InterfaceC4876t4 interfaceC4876t4) {
        this.a.add(interfaceC4876t4);
    }

    public final void b(InterfaceC4876t4 interfaceC4876t4) {
        this.a.remove(interfaceC4876t4);
    }

    public final List<InterfaceC4876t4> a() {
        return this.a;
    }
}
