package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class U implements ProtobufConverter {
    public final C4894tm a;

    public U(C4894tm c4894tm) {
        this.a = c4894tm;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final V5 fromModel(T t) {
        V5 v5 = new V5();
        C4870sm c4870sm = t.a;
        if (c4870sm != null) {
            v5.a = this.a.fromModel(c4870sm);
        }
        v5.b = new C4520e6[t.b.size()];
        Iterator it = t.b.iterator();
        int i = 0;
        while (it.hasNext()) {
            v5.b[i] = this.a.fromModel((C4870sm) it.next());
            i++;
        }
        String str = t.c;
        if (str != null) {
            v5.c = str;
        }
        return v5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final T a(V5 v5) {
        throw new UnsupportedOperationException();
    }
}
