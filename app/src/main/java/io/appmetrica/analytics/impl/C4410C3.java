package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.C3 */
/* loaded from: classes2.dex */
public final class C4410C3 implements Converter {

    /* renamed from: a */
    public final C5344oa f29937a;

    public C4410C3() {
        this(new C5344oa(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4833Th fromModel(List<String> list) {
        C4575Im c4575ImMo19520a = this.f29937a.mo19520a((List<Object>) list);
        C5067d8 c5067d8 = new C5067d8();
        c5067d8.f31472a = StringUtils.getUTF8Bytes((List<String>) c4575ImMo19520a.f30323a);
        InterfaceC5437s3 interfaceC5437s3 = c4575ImMo19520a.f30324b;
        int i = ((C4386B4) interfaceC5437s3).f32496a;
        return new C4833Th(c5067d8, interfaceC5437s3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4410C3(C5344oa c5344oa) {
        this.f29937a = c5344oa;
    }

    /* renamed from: a */
    public final List<String> m19261a(C4833Th c4833Th) {
        throw new UnsupportedOperationException();
    }
}
