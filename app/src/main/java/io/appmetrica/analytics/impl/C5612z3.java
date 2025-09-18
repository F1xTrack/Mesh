package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.z3 */
/* loaded from: classes2.dex */
public final class C5612z3 implements InterfaceC4967Z7 {

    /* renamed from: a */
    public final C4360A3 f32906a;

    public C5612z3() {
        this(new C4360A3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C4833Th> fromModel(C5587y3 c5587y3) {
        C5442s8 c5442s8 = new C5442s8();
        c5442s8.f32551e = new C5017b8();
        C4833Th c4833ThFromModel = this.f32906a.fromModel(c5587y3.f32840b);
        c5442s8.f32551e.f31309a = (C5042c8) c4833ThFromModel.f30788a;
        c5442s8.f32547a = c5587y3.f32839a;
        return Collections.singletonList(new C4833Th(c5442s8, new C5412r3(C5412r3.m21006b(c4833ThFromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5612z3(C4360A3 c4360a3) {
        this.f32906a = c4360a3;
    }

    /* renamed from: a */
    public final C5587y3 m21230a(List<C4833Th> list) {
        throw new UnsupportedOperationException();
    }
}
