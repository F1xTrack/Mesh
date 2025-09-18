package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Provider;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;

/* renamed from: io.appmetrica.analytics.impl.E */
/* loaded from: classes2.dex */
public final class C4456E implements Provider {

    /* renamed from: a */
    public final /* synthetic */ Context f30044a;

    /* renamed from: b */
    public final /* synthetic */ C4504G f30045b;

    public C4456E(C4504G c4504g, Context context) {
        this.f30045b = c4504g;
        this.f30044a = context;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Provider
    /* renamed from: a */
    public final AdTrackingInfoResult get() {
        return this.f30045b.f30155a.mo19304a(this.f30044a);
    }
}
