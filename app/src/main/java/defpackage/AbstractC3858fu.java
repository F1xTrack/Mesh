package defpackage;

import com.facebook.react.bridge.ReadableType;

/* renamed from: fu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC3858fu {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ReadableType.values().length];
        a = iArr;
        try {
            iArr[ReadableType.Map.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ReadableType.Array.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ReadableType.String.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[ReadableType.Number.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[ReadableType.Boolean.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[ReadableType.Null.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
