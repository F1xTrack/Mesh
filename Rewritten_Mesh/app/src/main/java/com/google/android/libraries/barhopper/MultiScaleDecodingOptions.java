package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative("jni_common.cc")
/* loaded from: classes.dex */
public final class MultiScaleDecodingOptions {

    @UsedByNative("jni_common.cc")
    private float[] extraScales = new float[0];

    @UsedByNative("jni_common.cc")
    private int minimumDetectedDimension = 10;

    @UsedByNative("jni_common.cc")
    private boolean skipProcessingIfBarcodeFound = true;

    /* renamed from: a */
    public final void m11151a(float[] fArr) {
        this.extraScales = fArr;
    }

    /* renamed from: b */
    public final void m11152b(int i) {
        this.minimumDetectedDimension = i;
    }

    /* renamed from: c */
    public final void m11153c(boolean z) {
        this.skipProcessingIfBarcodeFound = z;
    }
}
