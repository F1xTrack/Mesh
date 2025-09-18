package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.bl */
/* loaded from: classes2.dex */
public final class C5030bl extends AbstractC4750Q5 {

    /* renamed from: b */
    public final C4748Q3 f31336b;

    public C5030bl(Context context, String str) {
        this(context, str, new SafePackageManager(), C5244ka.m20614h().m20620d());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4750Q5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5055cl load(C4726P5 c4726p5) {
        C5055cl c5055cl = (C5055cl) super.load(c4726p5);
        C5155gl c5155gl = c4726p5.f30602a;
        c5055cl.f31437d = c5155gl.f31787f;
        c5055cl.f31438e = c5155gl.f31788g;
        C5005al c5005al = (C5005al) c4726p5.componentArguments;
        String str = c5005al.f31266a;
        if (str != null) {
            c5055cl.f31439f = str;
            c5055cl.f31440g = c5005al.f31267b;
        }
        Map<String, String> map = c5005al.f31268c;
        c5055cl.f31441h = map;
        c5055cl.f31442i = (C4556I3) this.f31336b.m19629a(new C4556I3(map, EnumC4728P7.f30605c));
        C5005al c5005al2 = (C5005al) c4726p5.componentArguments;
        c5055cl.f31444k = c5005al2.f31269d;
        c5055cl.f31443j = c5005al2.f31270e;
        C5155gl c5155gl2 = c4726p5.f30602a;
        c5055cl.f31445l = c5155gl2.f31797p;
        c5055cl.f31446m = c5155gl2.f31799r;
        long j = c5155gl2.f31803v;
        if (c5055cl.f31447n == 0) {
            c5055cl.f31447n = j;
        }
        return c5055cl;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C5055cl();
    }

    public C5030bl(Context context, String str, SafePackageManager safePackageManager, C4748Q3 c4748q3) {
        super(context, str, safePackageManager);
        this.f31336b = c4748q3;
    }

    /* renamed from: a */
    public final C5055cl m20200a() {
        return new C5055cl();
    }
}
