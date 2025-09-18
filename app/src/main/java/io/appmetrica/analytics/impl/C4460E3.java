package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC7167xu;

/* renamed from: io.appmetrica.analytics.impl.E3 */
/* loaded from: classes2.dex */
public final class C4460E3 implements InterfaceC4934Xm {
    @Override // io.appmetrica.analytics.impl.InterfaceC4934Xm, kotlin.jvm.functions.Function2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C4556I3> invoke(List<C4556I3> list, C4556I3 c4556i3) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                EnumC4728P7 enumC4728P7 = ((C4556I3) it.next()).f30268b;
                EnumC4728P7 enumC4728P72 = c4556i3.f30268b;
                if (enumC4728P7 == enumC4728P72) {
                    if (enumC4728P72 != EnumC4728P7.f30605c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C4556I3) obj).f30268b != EnumC4728P7.f30605c) {
                            arrayList.add(obj);
                        }
                    }
                    return AbstractC7167xu.m25969O(arrayList, c4556i3);
                }
            }
        }
        return AbstractC7167xu.m25969O(list, c4556i3);
    }
}
