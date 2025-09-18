package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import java.util.List;
import p000.AbstractC9073d70;
import p000.C3916dF;
import p000.InterfaceC1090RK;
import p000.ML1;

@InterfaceC1090RK
/* loaded from: classes.dex */
public class Bitmaps {

    /* renamed from: a */
    public static final /* synthetic */ int f17850a = 0;

    static {
        List list = AbstractC9073d70.f25823a;
        C3916dF.m17513c("imagepipeline");
    }

    @InterfaceC1090RK
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        ML1.m5334a(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        ML1.m5334a(Boolean.valueOf(bitmap.isMutable()));
        ML1.m5334a(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        ML1.m5334a(Boolean.valueOf(bitmap.getHeight() == bitmap2.getHeight()));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @InterfaceC1090RK
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
