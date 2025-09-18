package io.appmetrica.analytics.impl;

import defpackage.AbstractC0314Du;
import defpackage.AbstractC8069xu;
import defpackage.AbstractC8449zu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class Cc {
    public final LinkedHashSet a = new LinkedHashSet();

    public final synchronized Set a() {
        ArrayList arrayList;
        try {
            LinkedHashSet linkedHashSet = this.a;
            ArrayList arrayList2 = new ArrayList(AbstractC8449zu.k(linkedHashSet));
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Bc) it.next()).a());
            }
            arrayList = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((String) next).length() > 0) {
                    arrayList.add(next);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return AbstractC8069xu.g0(arrayList);
    }

    public final synchronized void a(Bc... bcArr) {
        AbstractC0314Du.n(this.a, bcArr);
    }
}
