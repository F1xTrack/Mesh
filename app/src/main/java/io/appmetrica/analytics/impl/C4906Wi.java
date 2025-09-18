package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.Wi */
/* loaded from: classes2.dex */
public final class C4906Wi implements InterfaceC4683Na {

    /* renamed from: a */
    public final /* synthetic */ AdRevenue f30987a;

    /* renamed from: b */
    public final /* synthetic */ boolean f30988b;

    public C4906Wi(AdRevenue adRevenue, boolean z) {
        this.f30987a = adRevenue;
        this.f30988b = z;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4683Na
    /* renamed from: a */
    public final void mo19451a(InterfaceC4707Oa interfaceC4707Oa) {
        interfaceC4707Oa.reportAdRevenue(this.f30987a, this.f30988b);
    }
}
