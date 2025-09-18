package io.sentry.android.core.internal.gestures;

/* renamed from: io.sentry.android.core.internal.gestures.c */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5873c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f33714a;

    static {
        int[] iArr = new int[EnumC5874d.values().length];
        f33714a = iArr;
        try {
            iArr[EnumC5874d.Click.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f33714a[EnumC5874d.Scroll.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f33714a[EnumC5874d.Swipe.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f33714a[EnumC5874d.Unknown.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
