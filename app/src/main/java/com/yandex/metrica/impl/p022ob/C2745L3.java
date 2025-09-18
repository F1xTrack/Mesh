package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2845P3;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC7167xu;

/* renamed from: com.yandex.metrica.impl.ob.L3 */
/* loaded from: classes2.dex */
public final class C2745L3 implements InterfaceC2943T2<C2845P3.a, C2845P3.a> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC2943T2, kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<C2845P3.a> invoke(List<C2845P3.a> list, C2845P3.a aVar) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C2845P3.a) it.next()).mo14053a() == aVar.mo14053a()) {
                    if (aVar.mo14053a() != EnumC2567E0.APP) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C2845P3.a) obj).mo14053a() != EnumC2567E0.APP) {
                            arrayList.add(obj);
                        }
                    }
                    return AbstractC7167xu.m25969O(arrayList, aVar);
                }
            }
        }
        return AbstractC7167xu.m25969O(list, aVar);
    }
}
