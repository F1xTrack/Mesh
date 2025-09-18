package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceConfiguration;
import io.appmetrica.analytics.coreutils.internal.services.UtilityServiceProvider;

/* loaded from: classes2.dex */
public final class fn implements InterfaceC4702ll {
    public final UtilityServiceProvider a;

    public fn(UtilityServiceProvider utilityServiceProvider) {
        this.a = utilityServiceProvider;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4702ll
    public final void a(C4583gl c4583gl) {
        this.a.updateConfiguration(new UtilityServiceConfiguration(c4583gl.v, c4583gl.u));
    }
}
