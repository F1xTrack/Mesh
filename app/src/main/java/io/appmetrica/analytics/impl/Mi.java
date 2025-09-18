package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes2.dex */
public final class Mi implements Na {
    public final /* synthetic */ Revenue a;

    public Mi(Revenue revenue) {
        this.a = revenue;
    }

    @Override // io.appmetrica.analytics.impl.Na
    public final void a(Oa oa) {
        oa.reportRevenue(this.a);
    }
}
