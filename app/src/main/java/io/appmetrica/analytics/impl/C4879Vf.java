package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.Vf */
/* loaded from: classes2.dex */
public final class C4879Vf implements ProtobufConverter {

    /* renamed from: a */
    public final C4404Bm f30859a;

    /* renamed from: b */
    public final C4839U f30860b;

    /* renamed from: c */
    public final C5240k6 f30861c;

    /* renamed from: d */
    public final C4427Ck f30862d;

    /* renamed from: e */
    public final C4973Zd f30863e;

    /* renamed from: f */
    public final C4998ae f30864f;

    public C4879Vf() {
        this(new C4404Bm(), new C4839U(new C5481tm()), new C5240k6(), new C4427Ck(), new C4973Zd(), new C4998ae());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5015b6 fromModel(C4855Uf c4855Uf) {
        C5015b6 c5015b6 = new C5015b6();
        c5015b6.f31300f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(c4855Uf.f30812a, c5015b6.f31300f));
        C4671Mm c4671Mm = c4855Uf.f30813b;
        if (c4671Mm != null) {
            C4429Cm c4429Cm = c4671Mm.f30489a;
            if (c4429Cm != null) {
                c5015b6.f31295a = this.f30859a.fromModel(c4429Cm);
            }
            C4815T c4815t = c4671Mm.f30490b;
            if (c4815t != null) {
                c5015b6.f31296b = this.f30860b.fromModel(c4815t);
            }
            List<C4477Ek> list = c4671Mm.f30491c;
            if (list != null) {
                c5015b6.f31299e = this.f30862d.fromModel(list);
            }
            c5015b6.f31297c = (String) WrapUtils.getOrDefault(c4671Mm.f30495g, c5015b6.f31297c);
            c5015b6.f31298d = this.f30861c.m19468a(c4671Mm.f30496h);
            if (!TextUtils.isEmpty(c4671Mm.f30492d)) {
                c5015b6.f31303i = this.f30863e.fromModel(c4671Mm.f30492d);
            }
            if (!TextUtils.isEmpty(c4671Mm.f30493e)) {
                c5015b6.f31304j = c4671Mm.f30493e.getBytes();
            }
            if (!AbstractC5182hn.m20514a(c4671Mm.f30494f)) {
                c5015b6.f31305k = this.f30864f.fromModel(c4671Mm.f30494f);
            }
        }
        return c5015b6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C4879Vf(C4404Bm c4404Bm, C4839U c4839u, C5240k6 c5240k6, C4427Ck c4427Ck, C4973Zd c4973Zd, C4998ae c4998ae) {
        this.f30859a = c4404Bm;
        this.f30860b = c4839u;
        this.f30861c = c5240k6;
        this.f30862d = c4427Ck;
        this.f30863e = c4973Zd;
        this.f30864f = c4998ae;
    }

    /* renamed from: a */
    public final C4855Uf m19917a(C5015b6 c5015b6) {
        throw new UnsupportedOperationException();
    }
}
