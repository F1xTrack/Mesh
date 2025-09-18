package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.hk, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4606hk implements Z7 {
    public final C4771oi a;

    public C4606hk() {
        this(new C4771oi());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<Th> fromModel(C4582gk c4582gk) {
        C4856s8 c4856s8 = new C4856s8();
        c4856s8.a = 1;
        c4856s8.b = new C4832r8();
        Th thFromModel = this.a.fromModel(c4582gk.a);
        c4856s8.b.a = (C4761o8) thFromModel.a;
        C4827r3 c4827r3 = new C4827r3(C4827r3.b(thFromModel));
        thFromModel.b.getBytesTruncated();
        return Collections.singletonList(new Th(c4856s8, c4827r3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4606hk(C4771oi c4771oi) {
        this.a = c4771oi;
    }

    public final C4582gk a(List<Th> list) {
        throw new UnsupportedOperationException();
    }
}
