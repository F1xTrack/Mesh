package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Nm */
/* loaded from: classes2.dex */
public final class C4695Nm implements ProtobufConverter {

    /* renamed from: a */
    public final C4404Bm f30532a;

    /* renamed from: b */
    public final C4839U f30533b;

    /* renamed from: c */
    public final C5240k6 f30534c;

    /* renamed from: d */
    public final C4427Ck f30535d;

    /* renamed from: e */
    public final C4973Zd f30536e;

    /* renamed from: f */
    public final C4998ae f30537f;

    public C4695Nm() {
        this(new C4404Bm(), new C4839U(new C5481tm()), new C5240k6(), new C4427Ck(), new C4973Zd(), new C4998ae());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4965Z5 fromModel(C4671Mm c4671Mm) {
        C4965Z5 c4965z5 = new C4965Z5();
        C4429Cm c4429Cm = c4671Mm.f30489a;
        if (c4429Cm != null) {
            c4965z5.f31151a = this.f30532a.fromModel(c4429Cm);
        }
        C4815T c4815t = c4671Mm.f30490b;
        if (c4815t != null) {
            c4965z5.f31152b = this.f30533b.fromModel(c4815t);
        }
        List<C4477Ek> list = c4671Mm.f30491c;
        if (list != null) {
            c4965z5.f31155e = this.f30535d.fromModel(list);
        }
        String str = c4671Mm.f30495g;
        if (str != null) {
            c4965z5.f31153c = str;
        }
        c4965z5.f31154d = this.f30534c.m19468a(c4671Mm.f30496h);
        if (!TextUtils.isEmpty(c4671Mm.f30492d)) {
            c4965z5.f31158h = this.f30536e.fromModel(c4671Mm.f30492d);
        }
        if (!TextUtils.isEmpty(c4671Mm.f30493e)) {
            c4965z5.f31159i = c4671Mm.f30493e.getBytes();
        }
        if (!AbstractC5182hn.m20514a(c4671Mm.f30494f)) {
            c4965z5.f31160j = this.f30537f.fromModel(c4671Mm.f30494f);
        }
        return c4965z5;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4695Nm(C4404Bm c4404Bm, C4839U c4839u, C5240k6 c5240k6, C4427Ck c4427Ck, C4973Zd c4973Zd, C4998ae c4998ae) {
        this.f30533b = c4839u;
        this.f30532a = c4404Bm;
        this.f30534c = c5240k6;
        this.f30535d = c4427Ck;
        this.f30536e = c4973Zd;
        this.f30537f = c4998ae;
    }

    /* renamed from: a */
    public final C4671Mm m19673a(C4965Z5 c4965z5) {
        throw new UnsupportedOperationException();
    }
}
