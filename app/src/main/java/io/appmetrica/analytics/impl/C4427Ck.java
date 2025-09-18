package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Ck */
/* loaded from: classes2.dex */
public final class C4427Ck implements ListConverter {

    /* renamed from: a */
    public final C4452Dk f29971a = new C4452Dk();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5065d6[] fromModel(List<C4477Ek> list) {
        C5065d6[] c5065d6Arr = new C5065d6[list.size()];
        Iterator<C4477Ek> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            c5065d6Arr[i] = this.f29971a.fromModel(it.next());
            i++;
        }
        return c5065d6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final List<C4477Ek> m19285a(C5065d6[] c5065d6Arr) {
        throw new UnsupportedOperationException();
    }
}
