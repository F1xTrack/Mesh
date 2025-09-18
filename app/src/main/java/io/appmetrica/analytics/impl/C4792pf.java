package io.appmetrica.analytics.impl;

import defpackage.AbstractC8069xu;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.pf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4792pf implements InterfaceC4696lf {
    public final /* synthetic */ C4887tf a;

    public C4792pf(C4887tf c4887tf) {
        this.a = c4887tf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4696lf
    public final void a() {
        C4887tf c4887tf = this.a;
        ArrayList arrayList = c4887tf.g;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Ef ef = (Ef) next;
            c4887tf.c.getClass();
            String str = ef != null ? ef.a : null;
            if (str != null && str.length() != 0) {
                arrayList2.add(next);
            }
        }
        c4887tf.a(c4887tf.c.a(AbstractC8069xu.y(arrayList2)));
    }
}
