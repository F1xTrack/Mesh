package p000;

import android.graphics.Bitmap;

/* renamed from: pi */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC6634pi {

    /* renamed from: a */
    public static final /* synthetic */ int[] f40286a;

    static {
        int[] iArr = new int[Bitmap.Config.values().length];
        try {
            iArr[Bitmap.Config.ARGB_8888.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Bitmap.Config.ALPHA_8.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Bitmap.Config.ARGB_4444.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Bitmap.Config.RGB_565.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Bitmap.Config.RGBA_F16.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Bitmap.Config.RGBA_1010102.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Bitmap.Config.HARDWARE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        f40286a = iArr;
    }
}
