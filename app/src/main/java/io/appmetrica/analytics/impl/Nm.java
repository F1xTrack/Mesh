package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* loaded from: classes2.dex */
public final class Nm implements ProtobufConverter {
    public final Bm a;
    public final U b;
    public final C4663k6 c;
    public final Ck d;
    public final Zd e;
    public final C4428ae f;

    public Nm() {
        this(new Bm(), new U(new C4894tm()), new C4663k6(), new Ck(), new Zd(), new C4428ae());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z5 fromModel(Mm mm) {
        Z5 z5 = new Z5();
        Cm cm = mm.a;
        if (cm != null) {
            z5.a = this.a.fromModel(cm);
        }
        T t = mm.b;
        if (t != null) {
            z5.b = this.b.fromModel(t);
        }
        List<Ek> list = mm.c;
        if (list != null) {
            z5.e = this.d.fromModel(list);
        }
        String str = mm.g;
        if (str != null) {
            z5.c = str;
        }
        z5.d = this.c.a(mm.h);
        if (!TextUtils.isEmpty(mm.d)) {
            z5.h = this.e.fromModel(mm.d);
        }
        if (!TextUtils.isEmpty(mm.e)) {
            z5.i = mm.e.getBytes();
        }
        if (!hn.a(mm.f)) {
            z5.j = this.f.fromModel(mm.f);
        }
        return z5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Nm(Bm bm, U u, C4663k6 c4663k6, Ck ck, Zd zd, C4428ae c4428ae) {
        this.b = u;
        this.a = bm;
        this.c = c4663k6;
        this.d = ck;
        this.e = zd;
        this.f = c4428ae;
    }

    public final Mm a(Z5 z5) {
        throw new UnsupportedOperationException();
    }
}
