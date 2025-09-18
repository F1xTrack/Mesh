package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.tm */
/* loaded from: classes2.dex */
public final class C4894tm implements ProtobufConverter {
    public final Ck a;

    public C4894tm() {
        this(new Ck());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final C4520e6 fromModel(C4870sm c4870sm) {
        C4520e6 c4520e6 = new C4520e6();
        Integer num = c4870sm.e;
        c4520e6.e = num == null ? -1 : num.intValue();
        c4520e6.d = c4870sm.d;
        c4520e6.b = c4870sm.b;
        c4520e6.a = c4870sm.a;
        c4520e6.c = c4870sm.c;
        Ck ck = this.a;
        List list = c4870sm.f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Ek((StackTraceElement) it.next()));
        }
        c4520e6.f = ck.fromModel(arrayList);
        return c4520e6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4894tm(Ck ck) {
        this.a = ck;
    }

    public final C4870sm a(C4520e6 c4520e6) {
        throw new UnsupportedOperationException();
    }
}
