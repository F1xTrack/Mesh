package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* renamed from: io.appmetrica.analytics.impl.wn */
/* loaded from: classes2.dex */
public final class C5557wn {

    /* renamed from: a */
    public final Context f32782a;

    /* renamed from: b */
    public final LinkedHashMap f32783b = new LinkedHashMap();

    /* renamed from: c */
    public final C5457sn f32784c;

    /* renamed from: d */
    public final C5457sn f32785d;

    public C5557wn(Context context) {
        this.f32782a = context;
        C4945Y9 c4945y9 = new C4945Y9(context, "appmetrica_vital.dat");
        this.f32784c = new C5457sn(C5244ka.m20614h().m20638w(), c4945y9);
        this.f32785d = new C5457sn(new C5398qe(C4966Z6.m20064a(context).m20071d()), c4945y9);
    }

    /* renamed from: a */
    public final C5457sn m21189a() {
        return this.f32784c;
    }

    /* renamed from: b */
    public final C5457sn m21190b() {
        return this.f32785d;
    }
}
