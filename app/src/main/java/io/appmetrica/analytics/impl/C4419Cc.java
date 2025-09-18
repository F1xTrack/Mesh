package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import p000.AbstractC0246Du;
import p000.AbstractC7167xu;
import p000.AbstractC7293zu;

/* renamed from: io.appmetrica.analytics.impl.Cc */
/* loaded from: classes2.dex */
public final class C4419Cc {

    /* renamed from: a */
    public final LinkedHashSet f29955a = new LinkedHashSet();

    /* renamed from: a */
    public final synchronized Set m19269a() {
        ArrayList arrayList;
        try {
            LinkedHashSet linkedHashSet = this.f29955a;
            ArrayList arrayList2 = new ArrayList(AbstractC7293zu.m26586k(linkedHashSet));
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                arrayList2.add(((InterfaceC4394Bc) it.next()).mo19232a());
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
        return AbstractC7167xu.m25987g0(arrayList);
    }

    /* renamed from: a */
    public final synchronized void m19270a(InterfaceC4394Bc... interfaceC4394BcArr) {
        AbstractC0246Du.m1921n(this.f29955a, interfaceC4394BcArr);
    }
}
