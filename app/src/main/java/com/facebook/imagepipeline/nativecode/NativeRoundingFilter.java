package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p000.C3916dF;
import p000.InterfaceC1090RK;

@InterfaceC1090RK
/* loaded from: classes.dex */
public class NativeRoundingFilter {
    static {
        C3916dF.m17513c("native-filters");
    }

    @InterfaceC1090RK
    private static native void nativeAddRoundedCornersFilter(Bitmap bitmap, int i, int i2, int i3, int i4);

    @InterfaceC1090RK
    private static native void nativeToCircleFastFilter(Bitmap bitmap, boolean z);

    @InterfaceC1090RK
    private static native void nativeToCircleFilter(Bitmap bitmap, boolean z);

    @InterfaceC1090RK
    private static native void nativeToCircleWithBorderFilter(Bitmap bitmap, int i, int i2, boolean z);

    @InterfaceC1090RK
    public static void toCircle(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFilter(bitmap, z);
    }

    @InterfaceC1090RK
    public static void toCircleFast(Bitmap bitmap, boolean z) {
        bitmap.getClass();
        if (bitmap.getWidth() < 3 || bitmap.getHeight() < 3) {
            return;
        }
        nativeToCircleFastFilter(bitmap, z);
    }
}
