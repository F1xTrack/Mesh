package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.Bi */
/* loaded from: classes2.dex */
public final class C4400Bi {

    /* renamed from: a */
    public final String f29908a;

    /* renamed from: b */
    public final Context f29909b;

    /* renamed from: c */
    public final CounterConfigurationReporterType f29910c;

    /* renamed from: d */
    public final C4475Ei f29911d;

    public C4400Bi(String str, Context context, CounterConfigurationReporterType counterConfigurationReporterType, C4475Ei c4475Ei) {
        this.f29908a = str;
        this.f29909b = context;
        int i = AbstractC4375Ai.f29864a[counterConfigurationReporterType.ordinal()];
        if (i == 1) {
            this.f29910c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN;
        } else if (i != 2) {
            this.f29910c = null;
        } else {
            this.f29910c = CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL;
        }
        this.f29911d = c4475Ei;
    }
}
