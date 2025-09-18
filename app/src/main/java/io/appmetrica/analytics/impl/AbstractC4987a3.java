package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductType;

/* renamed from: io.appmetrica.analytics.impl.a3 */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4987a3 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f31237a;

    static {
        int[] iArr = new int[ProductType.values().length];
        f31237a = iArr;
        try {
            iArr[ProductType.INAPP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f31237a[ProductType.SUBS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
