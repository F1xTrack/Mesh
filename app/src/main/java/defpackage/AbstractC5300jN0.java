package defpackage;

import com.facebook.react.bridge.ReadableType;

/* renamed from: jN0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC5300jN0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ReadableType.values().length];
        a = iArr;
        try {
            iArr[ReadableType.Map.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ReadableType.Number.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ReadableType.Null.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
