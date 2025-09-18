package defpackage;

import com.facebook.react.bridge.ReadableType;

/* renamed from: o90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6213o90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ReadableType.values().length];
        a = iArr;
        try {
            iArr[ReadableType.String.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ReadableType.Number.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ReadableType.Boolean.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
