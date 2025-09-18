package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* renamed from: io.appmetrica.analytics.impl.ca */
/* loaded from: classes2.dex */
public final class C5044ca implements ProtobufConverter {

    /* renamed from: a */
    public final AbstractC4542Hd f31410a;

    public C5044ca() {
        this(new C4836Tk());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5480tl fromModel(C5613z4 c5613z4) {
        C5480tl c5480tl = new C5480tl();
        c5480tl.f32650b = c5613z4.f32908b;
        c5480tl.f32649a = c5613z4.f32907a;
        c5480tl.f32651c = c5613z4.f32909c;
        c5480tl.f32652d = c5613z4.f32910d;
        c5480tl.f32653e = c5613z4.f32911e;
        c5480tl.f32654f = this.f31410a.m19468a(c5613z4.f32912f);
        return c5480tl;
    }

    public C5044ca(C4836Tk c4836Tk) {
        this.f31410a = c4836Tk;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5613z4 toModel(C5480tl c5480tl) {
        C5563x4 c5563x4 = new C5563x4();
        c5563x4.f32799d = c5480tl.f32652d;
        c5563x4.f32798c = c5480tl.f32651c;
        c5563x4.f32797b = c5480tl.f32650b;
        c5563x4.f32796a = c5480tl.f32649a;
        c5563x4.f32800e = c5480tl.f32653e;
        c5563x4.f32801f = this.f31410a.m19469a(c5480tl.f32654f);
        return new C5613z4(c5563x4);
    }
}
