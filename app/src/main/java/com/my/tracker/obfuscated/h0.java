package com.my.tracker.obfuscated;

import android.content.Context;
import com.my.tracker.MyTrackerConfig;

/* loaded from: classes2.dex */
public final class h0 {
    private static volatile h0 l;
    private final h a = new h();
    private final z0 b = new z0();
    private final b0 c = new b0();
    private final m0 d = new m0();
    private final v0 e = new v0();
    private final j1 f = new j1();
    private final b1 g = new b1();
    private final k h = new k();
    private final e0 i = new e0();
    private final p j = new p();
    private final j0 k = new j0();

    private h0() {
    }

    public g0 a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider, boolean z, int i, String str, MyTrackerConfig.OkHttpClientProvider okHttpClientProvider, Context context) {
        return new g0(this.a.a(context), this.b.a(str, okHttpClientProvider), this.c.a(context), this.d.a(context), this.e.a(context), this.f.a(context), this.g.a(i, context), this.h.a(installedPackagesProvider, context), z ? this.i.b(context) : d0.c, this.j.a(context), this.k.a(context));
    }

    public static h0 a() {
        h0 h0Var = l;
        if (h0Var == null) {
            synchronized (h0.class) {
                try {
                    h0Var = l;
                    if (h0Var == null) {
                        h0Var = new h0();
                        l = h0Var;
                    }
                } finally {
                }
            }
        }
        return h0Var;
    }
}
