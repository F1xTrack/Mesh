package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class F60 {

    /* renamed from: a */
    public static final /* synthetic */ int[] f3068a;

    static {
        int[] iArr = new int[ImageHeaderParser$ImageType.values().length];
        f3068a = iArr;
        try {
            iArr[ImageHeaderParser$ImageType.WEBP.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f3068a[ImageHeaderParser$ImageType.WEBP_A.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f3068a[ImageHeaderParser$ImageType.ANIMATED_WEBP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
