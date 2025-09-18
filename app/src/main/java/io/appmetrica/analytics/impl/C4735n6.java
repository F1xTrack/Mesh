package io.appmetrica.analytics.impl;

import defpackage.AbstractC0314Du;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: io.appmetrica.analytics.impl.n6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4735n6 implements Ca {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.Ca
    public final void a(Throwable th, T t) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((Ca) it.next()).a(th, t);
        }
    }

    public final void a(Ca... caArr) {
        AbstractC0314Du.n(this.a, caArr);
    }

    public final void a(List<? extends Ca> list) {
        this.a.addAll(list);
    }

    public final void a() {
        this.a.clear();
    }
}
