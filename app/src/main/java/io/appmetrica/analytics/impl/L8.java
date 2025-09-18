package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class L8 implements ProtobufConverter {
    public static C4810q9 a(K8 k8) {
        C4810q9 c4810q9 = new C4810q9();
        c4810q9.d = new int[k8.b.size()];
        Iterator it = k8.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c4810q9.d[i] = ((Integer) it.next()).intValue();
            i++;
        }
        c4810q9.c = k8.d;
        c4810q9.b = k8.c;
        c4810q9.a = k8.a;
        return c4810q9;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final /* bridge */ /* synthetic */ Object fromModel(Object obj) {
        return a((K8) obj);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        C4810q9 c4810q9 = (C4810q9) obj;
        return new K8(c4810q9.a, c4810q9.b, c4810q9.c, CollectionUtils.hashSetFromIntArray(c4810q9.d));
    }
}
