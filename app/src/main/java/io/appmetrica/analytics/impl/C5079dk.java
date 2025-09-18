package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.dk */
/* loaded from: classes2.dex */
public final class C5079dk implements InterfaceC4967Z7 {

    /* renamed from: a */
    public final C5352oi f31493a;

    /* renamed from: b */
    public final C4830Te f31494b;

    public C5079dk() {
        this(new C5352oi(), new C4830Te());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C4833Th> fromModel(C5054ck c5054ck) {
        C5442s8 c5442s8 = new C5442s8();
        c5442s8.f32547a = 2;
        c5442s8.f32549c = new C5367p8();
        C4833Th c4833ThFromModel = this.f31493a.fromModel(c5054ck.f31435b);
        c5442s8.f32549c.f32392b = (C5342o8) c4833ThFromModel.f30788a;
        C4833Th c4833ThFromModel2 = this.f31494b.fromModel(c5054ck.f31434a);
        c5442s8.f32549c.f32391a = (C5267l8) c4833ThFromModel2.f30788a;
        return Collections.singletonList(new C4833Th(c5442s8, new C5412r3(C5412r3.m21006b(c4833ThFromModel, c4833ThFromModel2))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5079dk(C5352oi c5352oi, C4830Te c4830Te) {
        this.f31493a = c5352oi;
        this.f31494b = c4830Te;
    }

    /* renamed from: a */
    public final C5054ck m20289a(List<C4833Th> list) {
        throw new UnsupportedOperationException();
    }
}
