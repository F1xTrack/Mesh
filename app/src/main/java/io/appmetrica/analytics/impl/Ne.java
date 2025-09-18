package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public final class Ne implements Converter {
    public final V a;
    public final Oe b;

    public Ne() {
        this(new V(), new Oe(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Th fromModel(Pe pe) {
        int bytesTruncated;
        C4665k8 c4665k8 = new C4665k8();
        Th thFromModel = this.a.fromModel(pe.a);
        c4665k8.a = (C4422a8) thFromModel.a;
        Im imA = this.b.a(pe.b);
        if (hn.a((Collection) imA.a)) {
            bytesTruncated = 0;
        } else {
            c4665k8.b = new C4422a8[((List) imA.a).size()];
            bytesTruncated = 0;
            for (int i = 0; i < ((List) imA.a).size(); i++) {
                Th thFromModel2 = this.a.fromModel((W) ((List) imA.a).get(i));
                c4665k8.b[i] = (C4422a8) thFromModel2.a;
                bytesTruncated += thFromModel2.b.getBytesTruncated();
            }
        }
        return new Th(c4665k8, new C4827r3(C4827r3.b(thFromModel, imA, new C4827r3(bytesTruncated))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Ne(V v, Oe oe) {
        this.a = v;
        this.b = oe;
    }

    public final Pe a(Th th) {
        throw new UnsupportedOperationException();
    }
}
