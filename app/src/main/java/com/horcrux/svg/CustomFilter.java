package com.horcrux.svg;

import android.graphics.Bitmap;
import kotlin.KotlinVersion;
import p000.C6730rE;
import p000.InterfaceC0453HB;

/* loaded from: classes.dex */
public class CustomFilter {
    public static Bitmap apply(Bitmap bitmap, Bitmap bitmap2, InterfaceC0453HB interfaceC0453HB) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        int[] iArr3 = new int[i];
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        float[] fArr2 = {0.0f, 0.0f, 0.0f, 0.0f};
        try {
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            bitmap2.getPixels(iArr2, 0, width, 0, 0, width, height);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException unused) {
        }
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                int i4 = (i2 * width) + i3;
                int i5 = iArr[i4];
                fArr[0] = ((i5 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
                fArr[1] = ((i5 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
                fArr[2] = ((i5 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
                fArr[3] = (i5 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
                int i6 = iArr2[i4];
                fArr2[0] = ((i6 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
                fArr2[1] = ((i6 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
                fArr2[2] = ((i6 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
                fArr2[3] = (i6 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
                ((C6730rE) interfaceC0453HB).getClass();
                float f = fArr[0];
                float f2 = 1.0f - f;
                float f3 = fArr2[0];
                float f4 = 1.0f - f3;
                float f5 = fArr[1] * f;
                float f6 = fArr2[1];
                float f7 = (f5 * f6 * f3) + (f6 * f3 * f2) + (f4 * f5);
                float f8 = fArr[2] * f;
                float f9 = fArr2[2];
                float f10 = fArr[3] * f;
                float f11 = fArr2[3];
                iArr3[i4] = normalizeFromFloats(new float[]{1.0f - (f4 * f2), f7, (f8 * f9 * f3) + (f9 * f3 * f2) + (f4 * f8), (f10 * f11 * f3) + (f11 * f3 * f2) + (f4 * f10)});
            }
        }
        return Bitmap.createBitmap(iArr3, width, height, Bitmap.Config.ARGB_8888);
    }

    public static int normalizeFromFloat(float f) {
        return Math.min(KotlinVersion.MAX_COMPONENT_VALUE, Math.max(0, Math.round(f * 255.0f)));
    }

    public static int normalizeFromFloats(float[] fArr) {
        if (fArr.length < 4 || normalizeFromFloat(fArr[0]) <= 0) {
            return 0;
        }
        return normalizeFromFloat(fArr[3] / fArr[0]) | (normalizeFromFloat(fArr[0]) << 24) | (normalizeFromFloat(fArr[1] / fArr[0]) << 16) | (normalizeFromFloat(fArr[2] / fArr[0]) << 8);
    }
}
