package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.oi */
/* loaded from: classes2.dex */
public final class C4771oi implements Converter {
    public final Md a;
    public final C3 b;
    public final C4787pa c;
    public final C4787pa d;

    public C4771oi() {
        this(new Md(), new C3(), new C4787pa(100), new C4787pa(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final Th fromModel(C4866si c4866si) {
        Th thFromModel;
        C4761o8 c4761o8 = new C4761o8();
        Im imA = this.c.a(c4866si.a);
        c4761o8.a = StringUtils.getUTF8Bytes((String) imA.a);
        List<String> list = c4866si.b;
        Th thFromModel2 = null;
        if (list != null) {
            thFromModel = this.b.fromModel(list);
            c4761o8.b = (C4497d8) thFromModel.a;
        } else {
            thFromModel = null;
        }
        Im imA2 = this.d.a(c4866si.c);
        c4761o8.c = StringUtils.getUTF8Bytes((String) imA2.a);
        Map<String, String> map = c4866si.d;
        if (map != null) {
            thFromModel2 = this.a.fromModel(map);
            c4761o8.d = (C4641j8) thFromModel2.a;
        }
        return new Th(c4761o8, new C4827r3(C4827r3.b(imA, thFromModel, imA2, thFromModel2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4771oi(Md md, C3 c3, C4787pa c4787pa, C4787pa c4787pa2) {
        this.a = md;
        this.b = c3;
        this.c = c4787pa;
        this.d = c4787pa2;
    }

    public final C4866si a(Th th) {
        throw new UnsupportedOperationException();
    }
}
