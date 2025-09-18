package io.appmetrica.analytics.impl;

import java.util.Collections;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.fk */
/* loaded from: classes2.dex */
public final class C5129fk implements InterfaceC4967Z7 {

    /* renamed from: a */
    public final C4830Te f31694a;

    /* renamed from: b */
    public final C5524vf f31695b;

    public C5129fk() {
        this(new C4830Te(), new C5524vf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C4833Th> fromModel(C5104ek c5104ek) {
        C4833Th c4833ThFromModel;
        C5442s8 c5442s8 = new C5442s8();
        c5442s8.f32547a = 3;
        c5442s8.f32550d = new C5392q8();
        C4833Th c4833ThFromModel2 = this.f31694a.fromModel(c5104ek.f31611a);
        c5442s8.f32550d.f32437a = (C5267l8) c4833ThFromModel2.f30788a;
        C4712Of c4712Of = c5104ek.f31612b;
        if (c4712Of != null) {
            c4833ThFromModel = this.f31695b.fromModel(c4712Of);
            c5442s8.f32550d.f32438b = (C5317n8) c4833ThFromModel.f30788a;
        } else {
            c4833ThFromModel = null;
        }
        return Collections.singletonList(new C4833Th(c5442s8, new C5412r3(C5412r3.m21006b(c4833ThFromModel2, c4833ThFromModel))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5129fk(C4830Te c4830Te, C5524vf c5524vf) {
        this.f31694a = c4830Te;
        this.f31695b = c5524vf;
    }

    /* renamed from: a */
    public final C5104ek m20395a(List<C4833Th> list) {
        throw new UnsupportedOperationException();
    }
}
