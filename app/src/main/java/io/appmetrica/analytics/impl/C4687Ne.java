package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Ne */
/* loaded from: classes2.dex */
public final class C4687Ne implements Converter {

    /* renamed from: a */
    public final C4863V f30510a;

    /* renamed from: b */
    public final C4711Oe f30511b;

    public C4687Ne() {
        this(new C4863V(), new C4711Oe(30));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4833Th fromModel(C4735Pe c4735Pe) {
        int bytesTruncated;
        C5242k8 c5242k8 = new C5242k8();
        C4833Th c4833ThFromModel = this.f30510a.fromModel(c4735Pe.f30618a);
        c5242k8.f32032a = (C4992a8) c4833ThFromModel.f30788a;
        C4575Im c4575ImMo19520a = this.f30511b.mo19520a(c4735Pe.f30619b);
        if (AbstractC5182hn.m20513a((Collection) c4575ImMo19520a.f30323a)) {
            bytesTruncated = 0;
        } else {
            c5242k8.f32033b = new C4992a8[((List) c4575ImMo19520a.f30323a).size()];
            bytesTruncated = 0;
            for (int i = 0; i < ((List) c4575ImMo19520a.f30323a).size(); i++) {
                C4833Th c4833ThFromModel2 = this.f30510a.fromModel((C4887W) ((List) c4575ImMo19520a.f30323a).get(i));
                c5242k8.f32033b[i] = (C4992a8) c4833ThFromModel2.f30788a;
                bytesTruncated += c4833ThFromModel2.f30789b.getBytesTruncated();
            }
        }
        return new C4833Th(c5242k8, new C5412r3(C5412r3.m21006b(c4833ThFromModel, c4575ImMo19520a, new C5412r3(bytesTruncated))));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4687Ne(C4863V c4863v, C4711Oe c4711Oe) {
        this.f30510a = c4863v;
        this.f30511b = c4711Oe;
    }

    /* renamed from: a */
    public final C4735Pe m19656a(C4833Th c4833Th) {
        throw new UnsupportedOperationException();
    }
}
