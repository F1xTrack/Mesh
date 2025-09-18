package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes2.dex */
public final class T4 extends Yg {
    public T4(Re re) {
        super(re, new CounterConfiguration());
        b().setReporterType(CounterConfigurationReporterType.COMMUTATION);
    }

    @Override // io.appmetrica.analytics.impl.Yg
    public final boolean f() {
        return true;
    }
}
