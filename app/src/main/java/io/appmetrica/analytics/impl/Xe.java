package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes2.dex */
public final class Xe implements Converter {
    public final C4763oa a;

    public Xe() {
        this(new C4763oa(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Th fromModel(List<String> list) {
        Im imA = this.a.a((List<Object>) list);
        List list2 = (List) imA.a;
        C4713m8[] c4713m8Arr = new C4713m8[0];
        if (list2 != null) {
            c4713m8Arr = new C4713m8[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                C4713m8 c4713m8 = new C4713m8();
                c4713m8Arr[i] = c4713m8;
                c4713m8.a = StringUtils.getUTF8Bytes((String) list2.get(i));
            }
        }
        imA.b.getBytesTruncated();
        return new Th(c4713m8Arr, imA.b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Xe(C4763oa c4763oa) {
        this.a = c4763oa;
    }

    public final List<String> a(Th th) {
        throw new UnsupportedOperationException();
    }
}
