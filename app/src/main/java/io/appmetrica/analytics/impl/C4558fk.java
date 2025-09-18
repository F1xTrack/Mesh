package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.fk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4558fk implements Z7 {
    public final Te a;
    public final C4935vf b;

    public C4558fk() {
        this(new Te(), new C4935vf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Th> fromModel(C4534ek c4534ek) {
        Th thFromModel;
        C4856s8 c4856s8 = new C4856s8();
        c4856s8.a = 3;
        c4856s8.d = new C4809q8();
        Th thFromModel2 = this.a.fromModel(c4534ek.a);
        c4856s8.d.a = (C4689l8) thFromModel2.a;
        Of of = c4534ek.b;
        if (of != null) {
            thFromModel = this.b.fromModel(of);
            c4856s8.d.b = (C4737n8) thFromModel.a;
        } else {
            thFromModel = null;
        }
        return Collections.singletonList(new Th(c4856s8, new C4827r3(C4827r3.b(thFromModel2, thFromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4558fk(Te te, C4935vf c4935vf) {
        this.a = te;
        this.b = c4935vf;
    }

    public final C4534ek a(List<Th> list) {
        throw new UnsupportedOperationException();
    }
}
