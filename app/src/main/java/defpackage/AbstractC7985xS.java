package defpackage;

import com.dylanvann.fastimage.FastImageCacheControl;

/* renamed from: xS, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC7985xS {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FastImageCacheControl.values().length];
        a = iArr;
        try {
            iArr[FastImageCacheControl.WEB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[FastImageCacheControl.CACHE_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[FastImageCacheControl.IMMUTABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
