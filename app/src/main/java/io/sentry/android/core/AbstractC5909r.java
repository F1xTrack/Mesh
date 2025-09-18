package io.sentry.android.core;

import io.sentry.EnumC5763F;

/* renamed from: io.sentry.android.core.r */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5909r {

    /* renamed from: a */
    public static final /* synthetic */ int[] f33852a;

    static {
        int[] iArr = new int[EnumC5763F.values().length];
        f33852a = iArr;
        try {
            iArr[EnumC5763F.CONNECTED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f33852a[EnumC5763F.UNKNOWN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f33852a[EnumC5763F.NO_PERMISSION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
