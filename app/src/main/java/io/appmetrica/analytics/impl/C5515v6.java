package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.v6 */
/* loaded from: classes2.dex */
public final class C5515v6 implements ProtobufConverter {

    /* renamed from: a */
    public final C4879Vf f32721a;

    public C5515v6() {
        this(new C4879Vf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5015b6 fromModel(C5490u6 c5490u6) {
        C5015b6 c5015b6FromModel = this.f32721a.fromModel(c5490u6.f32675a);
        c5015b6FromModel.f31301g = 1;
        C4990a6 c4990a6 = new C4990a6();
        c5015b6FromModel.f31302h = c4990a6;
        c4990a6.f31243a = StringUtils.correctIllFormedString(c5490u6.f32676b);
        return c5015b6FromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5515v6(C4879Vf c4879Vf) {
        this.f32721a = c4879Vf;
    }

    /* renamed from: a */
    public final C5490u6 m21157a(C5015b6 c5015b6) {
        throw new UnsupportedOperationException();
    }
}
