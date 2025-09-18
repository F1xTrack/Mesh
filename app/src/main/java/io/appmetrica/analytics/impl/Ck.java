package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ListConverter;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Ck implements ListConverter {
    public final Dk a = new Dk();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4495d6[] fromModel(List<Ek> list) {
        C4495d6[] c4495d6Arr = new C4495d6[list.size()];
        Iterator<Ek> it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            c4495d6Arr[i] = this.a.fromModel(it.next());
            i++;
        }
        return c4495d6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final List<Ek> a(C4495d6[] c4495d6Arr) {
        throw new UnsupportedOperationException();
    }
}
