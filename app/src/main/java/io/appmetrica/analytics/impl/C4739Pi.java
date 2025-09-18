package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.Pi */
/* loaded from: classes2.dex */
public final class C4739Pi implements InterfaceC4683Na {

    /* renamed from: a */
    public final /* synthetic */ AdRevenue f30625a;

    public C4739Pi(AdRevenue adRevenue) {
        this.f30625a = adRevenue;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4683Na
    /* renamed from: a */
    public final void mo19451a(InterfaceC4707Oa interfaceC4707Oa) {
        interfaceC4707Oa.reportAdRevenue(this.f30625a);
    }
}
