package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.Ai */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4375Ai {

    /* renamed from: a */
    public static final /* synthetic */ int[] f29864a;

    static {
        int[] iArr = new int[CounterConfigurationReporterType.values().length];
        f29864a = iArr;
        try {
            iArr[CounterConfigurationReporterType.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f29864a[CounterConfigurationReporterType.MANUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
