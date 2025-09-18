package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Bm implements ProtobufConverter {
    public final Ck a;

    public Bm() {
        this(new Ck());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final C4544f6 fromModel(Cm cm) {
        C4544f6 c4544f6 = new C4544f6();
        c4544f6.a = (String) WrapUtils.getOrDefault(cm.a, "");
        c4544f6.b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(cm.b, ""));
        List<Ek> list = cm.c;
        if (list != null) {
            c4544f6.c = this.a.fromModel(list);
        }
        Cm cm2 = cm.d;
        if (cm2 != null) {
            c4544f6.d = fromModel(cm2);
        }
        List list2 = cm.e;
        int i = 0;
        if (list2 == null) {
            c4544f6.e = new C4544f6[0];
        } else {
            c4544f6.e = new C4544f6[list2.size()];
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                c4544f6.e[i] = fromModel((Cm) it.next());
                i++;
            }
        }
        return c4544f6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Bm(Ck ck) {
        this.a = ck;
    }

    public final Cm a(C4544f6 c4544f6) {
        throw new UnsupportedOperationException();
    }
}
