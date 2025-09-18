package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Te */
/* loaded from: classes2.dex */
public final class C4830Te implements Converter {

    /* renamed from: a */
    public final C4662Md f30780a;

    /* renamed from: b */
    public final C4687Ne f30781b;

    /* renamed from: c */
    public final C4410C3 f30782c;

    /* renamed from: d */
    public final C4926Xe f30783d;

    /* renamed from: e */
    public final C5369pa f30784e;

    /* renamed from: f */
    public final C5369pa f30785f;

    public C4830Te() {
        this(new C4662Md(), new C4687Ne(), new C4410C3(), new C4926Xe(), new C5369pa(100), new C5369pa(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final C4833Th fromModel(C4902We c4902We) {
        C4833Th c4833ThFromModel;
        C4833Th c4833ThFromModel2;
        C4833Th c4833ThFromModel3;
        C4833Th c4833ThFromModel4;
        C5267l8 c5267l8 = new C5267l8();
        C4575Im c4575ImMo19520a = this.f30784e.mo19520a(c4902We.f30980a);
        c5267l8.f32135a = StringUtils.getUTF8Bytes((String) c4575ImMo19520a.f30323a);
        C4575Im c4575ImMo19520a2 = this.f30785f.mo19520a(c4902We.f30981b);
        c5267l8.f32136b = StringUtils.getUTF8Bytes((String) c4575ImMo19520a2.f30323a);
        List<String> list = c4902We.f30982c;
        C4833Th c4833ThFromModel5 = null;
        if (list != null) {
            c4833ThFromModel = this.f30782c.fromModel(list);
            c5267l8.f32137c = (C5067d8) c4833ThFromModel.f30788a;
        } else {
            c4833ThFromModel = null;
        }
        Map<String, String> map = c4902We.f30983d;
        if (map != null) {
            c4833ThFromModel2 = this.f30780a.fromModel(map);
            c5267l8.f32138d = (C5217j8) c4833ThFromModel2.f30788a;
        } else {
            c4833ThFromModel2 = null;
        }
        C4735Pe c4735Pe = c4902We.f30984e;
        if (c4735Pe != null) {
            c4833ThFromModel3 = this.f30781b.fromModel(c4735Pe);
            c5267l8.f32139e = (C5242k8) c4833ThFromModel3.f30788a;
        } else {
            c4833ThFromModel3 = null;
        }
        C4735Pe c4735Pe2 = c4902We.f30985f;
        if (c4735Pe2 != null) {
            c4833ThFromModel4 = this.f30781b.fromModel(c4735Pe2);
            c5267l8.f32140f = (C5242k8) c4833ThFromModel4.f30788a;
        } else {
            c4833ThFromModel4 = null;
        }
        List<String> list2 = c4902We.f30986g;
        if (list2 != null) {
            c4833ThFromModel5 = this.f30783d.fromModel(list2);
            c5267l8.f32141g = (C5292m8[]) c4833ThFromModel5.f30788a;
        }
        return new C4833Th(c5267l8, new C5412r3(C5412r3.m21006b(c4575ImMo19520a, c4575ImMo19520a2, c4833ThFromModel, c4833ThFromModel2, c4833ThFromModel3, c4833ThFromModel4, c4833ThFromModel5)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4830Te(C4662Md c4662Md, C4687Ne c4687Ne, C4410C3 c4410c3, C4926Xe c4926Xe, C5369pa c5369pa, C5369pa c5369pa2) {
        this.f30780a = c4662Md;
        this.f30781b = c4687Ne;
        this.f30782c = c4410c3;
        this.f30783d = c4926Xe;
        this.f30784e = c5369pa;
        this.f30785f = c5369pa2;
    }

    /* renamed from: a */
    public final C4902We m19876a(C4833Th c4833Th) {
        throw new UnsupportedOperationException();
    }
}
