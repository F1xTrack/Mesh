package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* renamed from: io.appmetrica.analytics.impl.jh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4650jh implements Provider {
    public final /* synthetic */ C4753o0 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ReporterConfig c;

    public C4650jh(C4753o0 c4753o0, Context context, ReporterConfig reporterConfig) {
        this.a = c4753o0;
        this.b = context;
        this.c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return C5009yh.a(this.a, this.b, this.c);
    }
}
