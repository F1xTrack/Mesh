package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* loaded from: classes2.dex */
public final class Vf implements ProtobufConverter {
    public final Bm a;
    public final U b;
    public final C4663k6 c;
    public final Ck d;
    public final Zd e;
    public final C4428ae f;

    public Vf() {
        this(new Bm(), new U(new C4894tm()), new C4663k6(), new Ck(), new Zd(), new C4428ae());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4445b6 fromModel(Uf uf) {
        C4445b6 c4445b6 = new C4445b6();
        c4445b6.f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(uf.a, c4445b6.f));
        Mm mm = uf.b;
        if (mm != null) {
            Cm cm = mm.a;
            if (cm != null) {
                c4445b6.a = this.a.fromModel(cm);
            }
            T t = mm.b;
            if (t != null) {
                c4445b6.b = this.b.fromModel(t);
            }
            List<Ek> list = mm.c;
            if (list != null) {
                c4445b6.e = this.d.fromModel(list);
            }
            c4445b6.c = (String) WrapUtils.getOrDefault(mm.g, c4445b6.c);
            c4445b6.d = this.c.a(mm.h);
            if (!TextUtils.isEmpty(mm.d)) {
                c4445b6.i = this.e.fromModel(mm.d);
            }
            if (!TextUtils.isEmpty(mm.e)) {
                c4445b6.j = mm.e.getBytes();
            }
            if (!hn.a(mm.f)) {
                c4445b6.k = this.f.fromModel(mm.f);
            }
        }
        return c4445b6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Vf(Bm bm, U u, C4663k6 c4663k6, Ck ck, Zd zd, C4428ae c4428ae) {
        this.a = bm;
        this.b = u;
        this.c = c4663k6;
        this.d = ck;
        this.e = zd;
        this.f = c4428ae;
    }

    public final Uf a(C4445b6 c4445b6) {
        throw new UnsupportedOperationException();
    }
}
