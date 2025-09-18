package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.oi */
/* loaded from: classes2.dex */
public final class C5352oi implements Converter {

    /* renamed from: a */
    public final C4662Md f32354a;

    /* renamed from: b */
    public final C4410C3 f32355b;

    /* renamed from: c */
    public final C5369pa f32356c;

    /* renamed from: d */
    public final C5369pa f32357d;

    public C5352oi() {
        this(new C4662Md(), new C4410C3(), new C5369pa(100), new C5369pa(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final C4833Th fromModel(C5452si c5452si) {
        C4833Th c4833ThFromModel;
        C5342o8 c5342o8 = new C5342o8();
        C4575Im c4575ImMo19520a = this.f32356c.mo19520a(c5452si.f32571a);
        c5342o8.f32333a = StringUtils.getUTF8Bytes((String) c4575ImMo19520a.f30323a);
        List<String> list = c5452si.f32572b;
        C4833Th c4833ThFromModel2 = null;
        if (list != null) {
            c4833ThFromModel = this.f32355b.fromModel(list);
            c5342o8.f32334b = (C5067d8) c4833ThFromModel.f30788a;
        } else {
            c4833ThFromModel = null;
        }
        C4575Im c4575ImMo19520a2 = this.f32357d.mo19520a(c5452si.f32573c);
        c5342o8.f32335c = StringUtils.getUTF8Bytes((String) c4575ImMo19520a2.f30323a);
        Map<String, String> map = c5452si.f32574d;
        if (map != null) {
            c4833ThFromModel2 = this.f32354a.fromModel(map);
            c5342o8.f32336d = (C5217j8) c4833ThFromModel2.f30788a;
        }
        return new C4833Th(c5342o8, new C5412r3(C5412r3.m21006b(c4575ImMo19520a, c4833ThFromModel, c4575ImMo19520a2, c4833ThFromModel2)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C5352oi(C4662Md c4662Md, C4410C3 c4410c3, C5369pa c5369pa, C5369pa c5369pa2) {
        this.f32354a = c4662Md;
        this.f32355b = c4410c3;
        this.f32356c = c5369pa;
        this.f32357d = c5369pa2;
    }

    /* renamed from: a */
    public final C5452si m20880a(C4833Th c4833Th) {
        throw new UnsupportedOperationException();
    }
}
