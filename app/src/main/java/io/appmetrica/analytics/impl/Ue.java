package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class Ue {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[Period.TimeUnit.values().length];
        b = iArr;
        try {
            iArr[Period.TimeUnit.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            b[Period.TimeUnit.WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            b[Period.TimeUnit.MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            b[Period.TimeUnit.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[ProductType.values().length];
        a = iArr2;
        try {
            iArr2[ProductType.INAPP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[ProductType.SUBS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
