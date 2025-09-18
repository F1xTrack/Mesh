package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Xe */
/* loaded from: classes2.dex */
public final class C4926Xe implements Converter {

    /* renamed from: a */
    public final C5344oa f31047a;

    public C4926Xe() {
        this(new C5344oa(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4833Th fromModel(List<String> list) {
        C4575Im c4575ImMo19520a = this.f31047a.mo19520a((List<Object>) list);
        List list2 = (List) c4575ImMo19520a.f30323a;
        C5292m8[] c5292m8Arr = new C5292m8[0];
        if (list2 != null) {
            c5292m8Arr = new C5292m8[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                C5292m8 c5292m8 = new C5292m8();
                c5292m8Arr[i] = c5292m8;
                c5292m8.f32188a = StringUtils.getUTF8Bytes((String) list2.get(i));
            }
        }
        c4575ImMo19520a.f30324b.getBytesTruncated();
        return new C4833Th(c5292m8Arr, c4575ImMo19520a.f30324b);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4926Xe(C5344oa c5344oa) {
        this.f31047a = c5344oa;
    }

    /* renamed from: a */
    public final List<String> m19977a(C4833Th c4833Th) {
        throw new UnsupportedOperationException();
    }
}
