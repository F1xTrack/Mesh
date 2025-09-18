package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.v6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4926v6 implements ProtobufConverter {
    public final Vf a;

    public C4926v6() {
        this(new Vf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4445b6 fromModel(C4902u6 c4902u6) {
        C4445b6 c4445b6FromModel = this.a.fromModel(c4902u6.a);
        c4445b6FromModel.g = 1;
        C4420a6 c4420a6 = new C4420a6();
        c4445b6FromModel.h = c4420a6;
        c4420a6.a = StringUtils.correctIllFormedString(c4902u6.b);
        return c4445b6FromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4926v6(Vf vf) {
        this.a = vf;
    }

    public final C4902u6 a(C4445b6 c4445b6) {
        throw new UnsupportedOperationException();
    }
}
