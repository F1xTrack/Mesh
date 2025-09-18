package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;

/* renamed from: io.appmetrica.analytics.impl.jh */
/* loaded from: classes2.dex */
public final class C5226jh implements Provider {

    /* renamed from: a */
    public final /* synthetic */ C5334o0 f31981a;

    /* renamed from: b */
    public final /* synthetic */ Context f31982b;

    /* renamed from: c */
    public final /* synthetic */ ReporterConfig f31983c;

    public C5226jh(C5334o0 c5334o0, Context context, ReporterConfig reporterConfig) {
        this.f31981a = c5334o0;
        this.f31982b = context;
        this.f31983c = reporterConfig;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    public final Object get() {
        return C5601yh.m21219a(this.f31981a, this.f31982b, this.f31983c);
    }
}
