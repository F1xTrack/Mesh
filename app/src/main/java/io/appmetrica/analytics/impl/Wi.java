package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes2.dex */
public final class Wi implements Na {
    public final /* synthetic */ AdRevenue a;
    public final /* synthetic */ boolean b;

    public Wi(AdRevenue adRevenue, boolean z) {
        this.a = adRevenue;
        this.b = z;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(Oa oa) {
        oa.reportAdRevenue(this.a, this.b);
    }
}
