package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.Mi */
/* loaded from: classes2.dex */
public final class C4667Mi implements InterfaceC4683Na {

    /* renamed from: a */
    public final /* synthetic */ Revenue f30486a;

    public C4667Mi(Revenue revenue) {
        this.f30486a = revenue;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4683Na
    /* renamed from: a */
    public final void mo19451a(InterfaceC4707Oa interfaceC4707Oa) {
        interfaceC4707Oa.reportRevenue(this.f30486a);
    }
}
