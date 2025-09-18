package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* renamed from: io.appmetrica.analytics.impl.fn */
/* loaded from: classes2.dex */
public final class C5132fn implements InterfaceC5280ll {

    /* renamed from: a */
    public final UtilityServiceProvider f31698a;

    public C5132fn(UtilityServiceProvider utilityServiceProvider) {
        this.f31698a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5280ll
    /* renamed from: a */
    public final void mo19206a(C5155gl c5155gl) {
        this.f31698a.updateConfiguration(new UtilityServiceConfiguration(c5155gl.f31803v, c5155gl.f31802u));
    }
}
