package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* loaded from: classes2.dex */
public final class A3 implements Converter {
    public final Te a;
    public final C4951w7 b;
    public final Ne c;
    public final C4935vf d;

    public A3() {
        this(new Te(), new C4951w7(), new Ne(), new C4935vf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final Th fromModel(B3 b3) {
        Th thFromModel;
        C4472c8 c4472c8 = new C4472c8();
        Th thFromModel2 = this.a.fromModel(b3.a);
        c4472c8.a = (C4689l8) thFromModel2.a;
        c4472c8.c = this.b.fromModel(b3.b);
        Th thFromModel3 = this.c.fromModel(b3.c);
        c4472c8.d = (C4665k8) thFromModel3.a;
        Of of = b3.d;
        if (of != null) {
            thFromModel = this.d.fromModel(of);
            c4472c8.b = (C4737n8) thFromModel.a;
        } else {
            thFromModel = null;
        }
        return new Th(c4472c8, new C4827r3(C4827r3.b(thFromModel2, thFromModel3, thFromModel)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public A3(Te te, C4951w7 c4951w7, Ne ne, C4935vf c4935vf) {
        this.a = te;
        this.b = c4951w7;
        this.c = ne;
        this.d = c4935vf;
    }

    public final B3 a(Th th) {
        throw new UnsupportedOperationException();
    }
}
