package io.appmetrica.analytics.impl;

import defpackage.AbstractC8069xu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class E3 implements Xm {
    @Override // io.appmetrica.analytics.impl.Xm, kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<I3> invoke(List<I3> list, I3 i3) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                P7 p7 = ((I3) it.next()).b;
                P7 p72 = i3.b;
                if (p7 == p72) {
                    if (p72 != P7.c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((I3) obj).b != P7.c) {
                            arrayList.add(obj);
                        }
                    }
                    return AbstractC8069xu.O(arrayList, i3);
                }
            }
        }
        return AbstractC8069xu.O(list, i3);
    }
}
