package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* loaded from: classes2.dex */
public final class Bi {
    public final String a;
    public final Context b;
    public final CounterConfigurationReporterType c;
    public final Ei d;

    public Bi(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, Ei ei) {
        this.a = str;
        this.b = context;
        int i = Ai.a[counterConfigurationReporterType.ordinal()];
        if (i == 1) {
            this.c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i != 2) {
            this.c = null;
        } else {
            this.c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.d = ei;
    }
}
