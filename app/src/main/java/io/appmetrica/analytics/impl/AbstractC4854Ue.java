package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.Period;
import io.appmetrica.analytics.billinginterface.internal.ProductType;

/* renamed from: io.appmetrica.analytics.impl.Ue */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4854Ue {

    /* renamed from: a */
    public static final /* synthetic */ int[] f30810a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f30811b;

    static {
        int[] iArr = new int[Period.TimeUnit.values().length];
        f30811b = iArr;
        try {
            iArr[Period.TimeUnit.DAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f30811b[Period.TimeUnit.WEEK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f30811b[Period.TimeUnit.MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f30811b[Period.TimeUnit.YEAR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[ProductType.values().length];
        f30810a = iArr2;
        try {
            iArr2[ProductType.INAPP.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f30810a[ProductType.SUBS.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
