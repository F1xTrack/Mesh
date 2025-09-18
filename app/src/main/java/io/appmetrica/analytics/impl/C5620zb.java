package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.zb */
/* loaded from: classes2.dex */
public final class C5620zb {

    /* renamed from: a */
    public final C4890W2 f32917a;

    /* renamed from: b */
    public final C5161h2 f32918b;

    /* renamed from: c */
    public final ArrayList f32919c;

    public C5620zb(C4890W2 c4890w2, C5161h2 c5161h2) {
        ArrayList arrayList = new ArrayList();
        this.f32919c = arrayList;
        this.f32917a = c4890w2;
        arrayList.add(c4890w2);
        this.f32918b = c5161h2;
        arrayList.add(c5161h2);
    }

    /* renamed from: a */
    public final synchronized void m21235a() {
        Iterator it = this.f32919c.iterator();
        while (it.hasNext()) {
            ((InterfaceC5528vj) it.next()).onCreate();
        }
    }

    /* renamed from: a */
    public final synchronized void m21236a(C5219ja c5219ja) {
        this.f32919c.add(c5219ja);
    }
}
