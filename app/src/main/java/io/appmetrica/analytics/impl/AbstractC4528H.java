package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* renamed from: io.appmetrica.analytics.impl.H */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4528H {

    /* renamed from: a */
    public static final /* synthetic */ int[] f30205a;

    static {
        int[] iArr = new int[IdentifierStatus.values().length];
        f30205a = iArr;
        try {
            iArr[IdentifierStatus.OK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f30205a[IdentifierStatus.NO_STARTUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f30205a[IdentifierStatus.FEATURE_DISABLED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f30205a[IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f30205a[IdentifierStatus.INVALID_ADV_ID.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
