package io.sentry.android.core;

import io.sentry.EnumC5763F;

/* renamed from: io.sentry.android.core.F */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5834F {

    /* renamed from: a */
    public static final /* synthetic */ int[] f33531a;

    static {
        int[] iArr = new int[EnumC5763F.values().length];
        f33531a = iArr;
        try {
            iArr[EnumC5763F.DISCONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f33531a[EnumC5763F.CONNECTED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
