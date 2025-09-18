package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import p000.AbstractC7167xu;

/* renamed from: io.appmetrica.analytics.impl.pf */
/* loaded from: classes2.dex */
public final class C5374pf implements InterfaceC5274lf {

    /* renamed from: a */
    public final /* synthetic */ C5474tf f32398a;

    public C5374pf(C5474tf c5474tf) {
        this.f32398a = c5474tf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5274lf
    /* renamed from: a */
    public final void mo20693a() {
        C5474tf c5474tf = this.f32398a;
        ArrayList arrayList = c5474tf.f32639g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C4472Ef c4472Ef = (C4472Ef) next;
            c5474tf.f32635c.getClass();
            String str = c4472Ef != null ? c4472Ef.f30076a : null;
            if (str != null && str.length() != 0) {
                arrayList2.add(next);
            }
        }
        c5474tf.m21082a(c5474tf.f32635c.m19659a(AbstractC7167xu.m25997y(arrayList2)));
    }
}
