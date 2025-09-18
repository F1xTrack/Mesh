package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.P3;
import defpackage.AbstractC8069xu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class L3 implements T2<P3.a, P3.a> {
    @Override // com.yandex.metrica.impl.ob.T2, kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<P3.a> invoke(List<P3.a> list, P3.a aVar) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((P3.a) it.next()).a() == aVar.a()) {
                    if (aVar.a() != E0.APP) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((P3.a) obj).a() != E0.APP) {
                            arrayList.add(obj);
                        }
                    }
                    return AbstractC8069xu.O(arrayList, aVar);
                }
            }
        }
        return AbstractC8069xu.O(list, aVar);
    }
}
