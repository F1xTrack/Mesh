package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import p000.C3916dF;
import p000.InterfaceC1090RK;

@InterfaceC1090RK
/* loaded from: classes.dex */
public class NativeBlurFilter {
    static {
        C3916dF.m17513c("native-filters");
    }

    /* renamed from: a */
    public static void m10907a(Bitmap bitmap, int i, int i2) {
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 > 0)) {
            throw new IllegalArgumentException();
        }
        nativeIterativeBoxBlur(bitmap, i, i2);
    }

    @InterfaceC1090RK
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
