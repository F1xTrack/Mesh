package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.z3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5019z3 implements Z7 {
    public final A3 a;

    public C5019z3() {
        this(new A3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Th> fromModel(C4995y3 c4995y3) {
        C4856s8 c4856s8 = new C4856s8();
        c4856s8.e = new C4447b8();
        Th thFromModel = this.a.fromModel(c4995y3.b);
        c4856s8.e.a = (C4472c8) thFromModel.a;
        c4856s8.a = c4995y3.a;
        return Collections.singletonList(new Th(c4856s8, new C4827r3(C4827r3.b(thFromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5019z3(A3 a3) {
        this.a = a3;
    }

    public final C4995y3 a(List<Th> list) {
        throw new UnsupportedOperationException();
    }
}
