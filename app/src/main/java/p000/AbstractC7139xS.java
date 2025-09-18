package p000;

import com.dylanvann.fastimage.FastImageCacheControl;

/* renamed from: xS */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC7139xS {

    /* renamed from: a */
    public static final /* synthetic */ int[] f45639a;

    static {
        int[] iArr = new int[FastImageCacheControl.values().length];
        f45639a = iArr;
        try {
            iArr[FastImageCacheControl.WEB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f45639a[FastImageCacheControl.CACHE_ONLY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f45639a[FastImageCacheControl.IMMUTABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
