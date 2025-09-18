package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.tm */
/* loaded from: classes2.dex */
public final class C5481tm implements ProtobufConverter {

    /* renamed from: a */
    public final C4427Ck f32655a;

    public C5481tm() {
        this(new C4427Ck());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final C5090e6 fromModel(C5456sm c5456sm) {
        C5090e6 c5090e6 = new C5090e6();
        Integer num = c5456sm.f32584e;
        c5090e6.f31535e = num == null ? -1 : num.intValue();
        c5090e6.f31534d = c5456sm.f32583d;
        c5090e6.f31532b = c5456sm.f32581b;
        c5090e6.f31531a = c5456sm.f32580a;
        c5090e6.f31533c = c5456sm.f32582c;
        C4427Ck c4427Ck = this.f32655a;
        List list = c5456sm.f32585f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C4477Ek((StackTraceElement) it.next()));
        }
        c5090e6.f31536f = c4427Ck.fromModel(arrayList);
        return c5090e6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5481tm(C4427Ck c4427Ck) {
        this.f32655a = c4427Ck;
    }

    /* renamed from: a */
    public final C5456sm m21093a(C5090e6 c5090e6) {
        throw new UnsupportedOperationException();
    }
}
