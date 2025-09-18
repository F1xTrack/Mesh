package defpackage;

import com.facebook.react.bridge.ReadableType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class YQ0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ReadableType.values().length];
        a = iArr;
        try {
            iArr[ReadableType.Number.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ReadableType.String.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
