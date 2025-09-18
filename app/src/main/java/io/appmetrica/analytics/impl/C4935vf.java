package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.vf */
/* loaded from: classes2.dex */
public final class C4935vf implements Converter {
    public final C4771oi a;
    public final C4787pa b;
    public final C4787pa c;

    public C4935vf() {
        this(new C4771oi(), new C4787pa(100), new C4787pa(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final Th fromModel(Of of) {
        Th thFromModel;
        C4737n8 c4737n8 = new C4737n8();
        Im imA = this.b.a(of.a);
        c4737n8.a = StringUtils.getUTF8Bytes((String) imA.a);
        Im imA2 = this.c.a(of.b);
        c4737n8.b = StringUtils.getUTF8Bytes((String) imA2.a);
        C4866si c4866si = of.c;
        if (c4866si != null) {
            thFromModel = this.a.fromModel(c4866si);
            c4737n8.c = (C4761o8) thFromModel.a;
        } else {
            thFromModel = null;
        }
        return new Th(c4737n8, new C4827r3(C4827r3.b(imA, imA2, thFromModel)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4935vf(C4771oi c4771oi, C4787pa c4787pa, C4787pa c4787pa2) {
        this.a = c4771oi;
        this.b = c4787pa;
        this.c = c4787pa2;
    }

    public final Of a(Th th) {
        throw new UnsupportedOperationException();
    }
}
