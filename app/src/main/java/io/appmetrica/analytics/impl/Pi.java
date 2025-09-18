package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes2.dex */
public final class Pi implements Na {
    public final /* synthetic */ AdRevenue a;

    public Pi(AdRevenue adRevenue) {
        this.a = adRevenue;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(Oa oa) {
        oa.reportAdRevenue(this.a);
    }
}
