package io.sentry.android.core;

import io.sentry.EnumC6069n1;

/* renamed from: io.sentry.android.core.k */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5895k {

    /* renamed from: a */
    public static final /* synthetic */ int[] f33793a;

    static {
        int[] iArr = new int[EnumC6069n1.values().length];
        f33793a = iArr;
        try {
            iArr[EnumC6069n1.INFO.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f33793a[EnumC6069n1.WARNING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f33793a[EnumC6069n1.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f33793a[EnumC6069n1.FATAL.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f33793a[EnumC6069n1.DEBUG.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
