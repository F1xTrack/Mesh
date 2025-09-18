package com.p018my.tracker.obfuscated;

import android.content.Context;
import com.p018my.tracker.MyTrackerConfig;

/* renamed from: com.my.tracker.obfuscated.h0 */
/* loaded from: classes2.dex */
public final class C2321h0 {

    /* renamed from: l */
    private static volatile C2321h0 f19964l;

    /* renamed from: a */
    private final C2320h f19965a = new C2320h();

    /* renamed from: b */
    private final C2393z0 f19966b = new C2393z0();

    /* renamed from: c */
    private final C2295b0 f19967c = new C2295b0();

    /* renamed from: d */
    private final C2341m0 f19968d = new C2341m0();

    /* renamed from: e */
    private final C2377v0 f19969e = new C2377v0();

    /* renamed from: f */
    private final C2330j1 f19970f = new C2330j1();

    /* renamed from: g */
    private final C2296b1 f19971g = new C2296b1();

    /* renamed from: h */
    private final C2332k f19972h = new C2332k();

    /* renamed from: i */
    private final C2309e0 f19973i = new C2309e0();

    /* renamed from: j */
    private final C2352p f19974j = new C2352p();

    /* renamed from: k */
    private final C2329j0 f19975k = new C2329j0();

    private C2321h0() {
    }

    /* renamed from: a */
    public C2317g0 m13142a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, boolean z, int i, String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        return new C2317g0(this.f19965a.m13140a(context), this.f19966b.m13580a(str, okHttpClientProvider), this.f19967c.m12790a(context), this.f19968d.m13299a(context), this.f19969e.m13519a(context), this.f19970f.m13217a(context), this.f19971g.m12794a(i, context), this.f19972h.m13264a(installedPackagesProvider, context), z ? this.f19973i.m12891b(context) : C2305d0.f19797c, this.f19974j.m13370a(context), this.f19975k.m13208a(context));
    }

    /* renamed from: a */
    public static C2321h0 m13141a() {
        C2321h0 c2321h0 = f19964l;
        if (c2321h0 == null) {
            synchronized (C2321h0.class) {
                try {
                    c2321h0 = f19964l;
                    if (c2321h0 == null) {
                        c2321h0 = new C2321h0();
                        f19964l = c2321h0;
                    }
                } finally {
                }
            }
        }
        return c2321h0;
    }
}
