package io.sentry.android.core;

import io.sentry.EnumC5148n1;

/* renamed from: io.sentry.android.core.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5094k {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EnumC5148n1.values().length];
        a = iArr;
        try {
            iArr[EnumC5148n1.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[EnumC5148n1.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[EnumC5148n1.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[EnumC5148n1.FATAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[EnumC5148n1.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
