package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.hk */
/* loaded from: classes2.dex */
public final class C5179hk implements InterfaceC4967Z7 {

    /* renamed from: a */
    public final C5352oi f31864a;

    public C5179hk() {
        this(new C5352oi());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C4833Th> fromModel(C5154gk c5154gk) {
        C5442s8 c5442s8 = new C5442s8();
        c5442s8.f32547a = 1;
        c5442s8.f32548b = new C5417r8();
        C4833Th c4833ThFromModel = this.f31864a.fromModel(c5154gk.f31777a);
        c5442s8.f32548b.f32503a = (C5342o8) c4833ThFromModel.f30788a;
        C5412r3 c5412r3 = new C5412r3(C5412r3.m21006b(c4833ThFromModel));
        c4833ThFromModel.f30789b.getBytesTruncated();
        return Collections.singletonList(new C4833Th(c5442s8, c5412r3));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5179hk(C5352oi c5352oi) {
        this.f31864a = c5352oi;
    }

    /* renamed from: a */
    public final C5154gk m20501a(List<C4833Th> list) {
        throw new UnsupportedOperationException();
    }
}
