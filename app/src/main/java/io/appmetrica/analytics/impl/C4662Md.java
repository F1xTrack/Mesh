package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Md */
/* loaded from: classes2.dex */
public final class C4662Md implements Converter {

    /* renamed from: a */
    public final C5444sa f30480a;

    public C4662Md() {
        this(new C5444sa(20480, 100, 1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4833Th fromModel(Map<String, String> map) {
        C4575Im c4575ImMo19520a = this.f30480a.mo19520a(map);
        C5217j8 c5217j8 = new C5217j8();
        c5217j8.f31969b = ((C4386B4) c4575ImMo19520a.f30324b).f29893b;
        Map map2 = (Map) c4575ImMo19520a.f30323a;
        if (map2 != null) {
            c5217j8.f31968a = new C5192i8[map2.size()];
            int i = 0;
            for (Map.Entry entry : map2.entrySet()) {
                c5217j8.f31968a[i] = new C5192i8();
                c5217j8.f31968a[i].f31915a = StringUtils.getUTF8Bytes((String) entry.getKey());
                c5217j8.f31968a[i].f31916b = StringUtils.getUTF8Bytes((String) entry.getValue());
                i++;
            }
        }
        InterfaceC5437s3 interfaceC5437s3 = c4575ImMo19520a.f30324b;
        int i2 = ((C4386B4) interfaceC5437s3).f32496a;
        return new C4833Th(c5217j8, interfaceC5437s3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4662Md(C5444sa c5444sa) {
        this.f30480a = c5444sa;
    }

    /* renamed from: a */
    public final Map<String, String> m19637a(C4833Th c4833Th) {
        throw new UnsupportedOperationException();
    }
}
