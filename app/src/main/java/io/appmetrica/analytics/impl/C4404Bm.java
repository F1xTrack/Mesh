package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Bm */
/* loaded from: classes2.dex */
public final class C4404Bm implements ProtobufConverter {

    /* renamed from: a */
    public final C4427Ck f29917a;

    public C4404Bm() {
        this(new C4427Ck());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final C5115f6 fromModel(C4429Cm c4429Cm) {
        C5115f6 c5115f6 = new C5115f6();
        c5115f6.f31654a = (String) WrapUtils.getOrDefault(c4429Cm.f29974a, "");
        c5115f6.f31655b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(c4429Cm.f29975b, ""));
        List<C4477Ek> list = c4429Cm.f29976c;
        if (list != null) {
            c5115f6.f31656c = this.f29917a.fromModel(list);
        }
        C4429Cm c4429Cm2 = c4429Cm.f29977d;
        if (c4429Cm2 != null) {
            c5115f6.f31657d = fromModel(c4429Cm2);
        }
        List list2 = c4429Cm.f29978e;
        int i = 0;
        if (list2 == null) {
            c5115f6.f31658e = new C5115f6[0];
        } else {
            c5115f6.f31658e = new C5115f6[list2.size()];
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                c5115f6.f31658e[i] = fromModel((C4429Cm) it.next());
                i++;
            }
        }
        return c5115f6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4404Bm(C4427Ck c4427Ck) {
        this.f29917a = c4427Ck;
    }

    /* renamed from: a */
    public final C4429Cm m19247a(C5115f6 c5115f6) {
        throw new UnsupportedOperationException();
    }
}
