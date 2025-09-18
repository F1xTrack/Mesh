package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.vf */
/* loaded from: classes2.dex */
public final class C5524vf implements Converter {

    /* renamed from: a */
    public final C5352oi f32732a;

    /* renamed from: b */
    public final C5369pa f32733b;

    /* renamed from: c */
    public final C5369pa f32734c;

    public C5524vf() {
        this(new C5352oi(), new C5369pa(100), new C5369pa(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final C4833Th fromModel(C4712Of c4712Of) {
        C4833Th c4833ThFromModel;
        C5317n8 c5317n8 = new C5317n8();
        C4575Im c4575ImMo19520a = this.f32733b.mo19520a(c4712Of.f30557a);
        c5317n8.f32265a = StringUtils.getUTF8Bytes((String) c4575ImMo19520a.f30323a);
        C4575Im c4575ImMo19520a2 = this.f32734c.mo19520a(c4712Of.f30558b);
        c5317n8.f32266b = StringUtils.getUTF8Bytes((String) c4575ImMo19520a2.f30323a);
        C5452si c5452si = c4712Of.f30559c;
        if (c5452si != null) {
            c4833ThFromModel = this.f32732a.fromModel(c5452si);
            c5317n8.f32267c = (C5342o8) c4833ThFromModel.f30788a;
        } else {
            c4833ThFromModel = null;
        }
        return new C4833Th(c5317n8, new C5412r3(C5412r3.m21006b(c4575ImMo19520a, c4575ImMo19520a2, c4833ThFromModel)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5524vf(C5352oi c5352oi, C5369pa c5369pa, C5369pa c5369pa2) {
        this.f32732a = c5352oi;
        this.f32733b = c5369pa;
        this.f32734c = c5369pa2;
    }

    /* renamed from: a */
    public final C4712Of m21158a(C4833Th c4833Th) {
        throw new UnsupportedOperationException();
    }
}
