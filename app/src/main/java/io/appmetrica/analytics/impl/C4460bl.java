package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.bl, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4460bl extends Q5 {
    public final Q3 b;

    public C4460bl(Context context, String str) {
        this(context, str, new SafePackageManager(), C4667ka.h().d());
    }

    @Override // io.appmetrica.analytics.impl.Q5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4485cl load(P5 p5) {
        C4485cl c4485cl = (C4485cl) super.load(p5);
        C4583gl c4583gl = p5.a;
        c4485cl.d = c4583gl.f;
        c4485cl.e = c4583gl.g;
        C4435al c4435al = (C4435al) p5.componentArguments;
        String str = c4435al.a;
        if (str != null) {
            c4485cl.f = str;
            c4485cl.g = c4435al.b;
        }
        Map<String, String> map = c4435al.c;
        c4485cl.h = map;
        c4485cl.i = (I3) this.b.a(new I3(map, P7.c));
        C4435al c4435al2 = (C4435al) p5.componentArguments;
        c4485cl.k = c4435al2.d;
        c4485cl.j = c4435al2.e;
        C4583gl c4583gl2 = p5.a;
        c4485cl.l = c4583gl2.p;
        c4485cl.m = c4583gl2.r;
        long j = c4583gl2.v;
        if (c4485cl.n == 0) {
            c4485cl.n = j;
        }
        return c4485cl;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C4485cl();
    }

    public C4460bl(Context context, String str, SafePackageManager safePackageManager, Q3 q3) {
        super(context, str, safePackageManager);
        this.b = q3;
    }

    public final C4485cl a() {
        return new C4485cl();
    }
}
