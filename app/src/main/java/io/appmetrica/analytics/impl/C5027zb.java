package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.zb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5027zb {
    public final W2 a;
    public final C4588h2 b;
    public final ArrayList c;

    public C5027zb(W2 w2, C4588h2 c4588h2) {
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        this.a = w2;
        arrayList.add(w2);
        this.b = c4588h2;
        arrayList.add(c4588h2);
    }

    public final synchronized void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((InterfaceC4939vj) it.next()).onCreate();
        }
    }

    public final synchronized void a(C4643ja c4643ja) {
        this.c.add(c4643ja);
    }
}
