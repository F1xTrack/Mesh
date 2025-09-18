package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.dk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4509dk implements Z7 {
    public final C4771oi a;
    public final Te b;

    public C4509dk() {
        this(new C4771oi(), new Te());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Th> fromModel(C4484ck c4484ck) {
        C4856s8 c4856s8 = new C4856s8();
        c4856s8.a = 2;
        c4856s8.c = new C4785p8();
        Th thFromModel = this.a.fromModel(c4484ck.b);
        c4856s8.c.b = (C4761o8) thFromModel.a;
        Th thFromModel2 = this.b.fromModel(c4484ck.a);
        c4856s8.c.a = (C4689l8) thFromModel2.a;
        return Collections.singletonList(new Th(c4856s8, new C4827r3(C4827r3.b(thFromModel, thFromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4509dk(C4771oi c4771oi, Te te) {
        this.a = c4771oi;
        this.b = te;
    }

    public final C4484ck a(List<Th> list) {
        throw new UnsupportedOperationException();
    }
}
