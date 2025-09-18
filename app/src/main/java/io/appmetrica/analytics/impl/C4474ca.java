package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.ca, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4474ca implements ProtobufConverter {
    public final Hd a;

    public C4474ca() {
        this(new Tk());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4893tl fromModel(C5020z4 c5020z4) {
        C4893tl c4893tl = new C4893tl();
        c4893tl.b = c5020z4.b;
        c4893tl.a = c5020z4.a;
        c4893tl.c = c5020z4.c;
        c4893tl.d = c5020z4.d;
        c4893tl.e = c5020z4.e;
        c4893tl.f = this.a.a(c5020z4.f);
        return c4893tl;
    }

    public C4474ca(Tk tk) {
        this.a = tk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5020z4 toModel(C4893tl c4893tl) {
        C4972x4 c4972x4 = new C4972x4();
        c4972x4.d = c4893tl.d;
        c4972x4.c = c4893tl.c;
        c4972x4.b = c4893tl.b;
        c4972x4.a = c4893tl.a;
        c4972x4.e = c4893tl.e;
        c4972x4.f = this.a.a(c4893tl.f);
        return new C5020z4(c4972x4);
    }
}
