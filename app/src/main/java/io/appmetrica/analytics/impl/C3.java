package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* loaded from: classes2.dex */
public final class C3 implements Converter {
    public final C4763oa a;

    public C3() {
        this(new C4763oa(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Th fromModel(List<String> list) {
        Im imA = this.a.a((List<Object>) list);
        C4497d8 c4497d8 = new C4497d8();
        c4497d8.a = StringUtils.getUTF8Bytes((List<String>) imA.a);
        InterfaceC4851s3 interfaceC4851s3 = imA.b;
        int i = ((B4) interfaceC4851s3).a;
        return new Th(c4497d8, interfaceC4851s3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C3(C4763oa c4763oa) {
        this.a = c4763oa;
    }

    public final List<String> a(Th th) {
        throw new UnsupportedOperationException();
    }
}
