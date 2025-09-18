package defpackage;

import com.facebook.react.bridge.ReadableType;

/* renamed from: Pw0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1256Pw0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ReadableType.values().length];
        a = iArr;
        try {
            iArr[ReadableType.Null.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ReadableType.Boolean.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ReadableType.Number.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[ReadableType.String.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[ReadableType.Map.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[ReadableType.Array.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
