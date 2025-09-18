package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;

/* renamed from: io.appmetrica.analytics.impl.A3 */
/* loaded from: classes2.dex */
public final class C4360A3 implements Converter {

    /* renamed from: a */
    public final C4830Te f29840a;

    /* renamed from: b */
    public final C5541w7 f29841b;

    /* renamed from: c */
    public final C4687Ne f29842c;

    /* renamed from: d */
    public final C5524vf f29843d;

    public C4360A3() {
        this(new C4830Te(), new C5541w7(), new C4687Ne(), new C5524vf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final C4833Th fromModel(C4385B3 c4385b3) {
        C4833Th c4833ThFromModel;
        C5042c8 c5042c8 = new C5042c8();
        C4833Th c4833ThFromModel2 = this.f29840a.fromModel(c4385b3.f29889a);
        c5042c8.f31361a = (C5267l8) c4833ThFromModel2.f30788a;
        c5042c8.f31363c = this.f29841b.fromModel(c4385b3.f29890b);
        C4833Th c4833ThFromModel3 = this.f29842c.fromModel(c4385b3.f29891c);
        c5042c8.f31364d = (C5242k8) c4833ThFromModel3.f30788a;
        C4712Of c4712Of = c4385b3.f29892d;
        if (c4712Of != null) {
            c4833ThFromModel = this.f29843d.fromModel(c4712Of);
            c5042c8.f31362b = (C5317n8) c4833ThFromModel.f30788a;
        } else {
            c4833ThFromModel = null;
        }
        return new C4833Th(c5042c8, new C5412r3(C5412r3.m21006b(c4833ThFromModel2, c4833ThFromModel3, c4833ThFromModel)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4360A3(C4830Te c4830Te, C5541w7 c5541w7, C4687Ne c4687Ne, C5524vf c5524vf) {
        this.f29840a = c4830Te;
        this.f29841b = c5541w7;
        this.f29842c = c4687Ne;
        this.f29843d = c5524vf;
    }

    /* renamed from: a */
    public final C4385B3 m19183a(C4833Th c4833Th) {
        throw new UnsupportedOperationException();
    }
}
