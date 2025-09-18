package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.internal.CounterConfigurationReporterType;

/* renamed from: io.appmetrica.analytics.impl.v4 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5513v4 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f32720a;

    static {
        int[] iArr = new int[CounterConfigurationReporterType.values().length];
        f32720a = iArr;
        try {
            iArr[CounterConfigurationReporterType.COMMUTATION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f32720a[CounterConfigurationReporterType.MAIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f32720a[CounterConfigurationReporterType.SELF_DIAGNOSTIC_MAIN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f32720a[CounterConfigurationReporterType.SELF_DIAGNOSTIC_MANUAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f32720a[CounterConfigurationReporterType.MANUAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f32720a[CounterConfigurationReporterType.SELF_SDK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
