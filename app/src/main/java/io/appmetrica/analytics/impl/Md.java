package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Md implements Converter {
    public final C4858sa a;

    public Md() {
        this(new C4858sa(20480, 100, 1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Th fromModel(Map<String, String> map) {
        Im imA = this.a.a(map);
        C4641j8 c4641j8 = new C4641j8();
        c4641j8.b = ((B4) imA.b).b;
        Map map2 = (Map) imA.a;
        if (map2 != null) {
            c4641j8.a = new C4618i8[map2.size()];
            int i = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c4641j8.a[i] = new C4618i8();
                c4641j8.a[i].a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c4641j8.a[i].b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i++;
            }
        }
        InterfaceC4851s3 interfaceC4851s3 = imA.b;
        int i2 = ((B4) interfaceC4851s3).a;
        return new Th(c4641j8, interfaceC4851s3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Md(C4858sa c4858sa) {
        this.a = c4858sa;
    }

    public final Map<String, String> a(Th th) {
        throw new UnsupportedOperationException();
    }
}
