package com.google.android.libraries.barhopper;

import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative("jni_common.cc")
/* loaded from: classes.dex */
public final class MultiScaleDetectionOptions {

    @UsedByNative("jni_common.cc")
    private float[] extraScales = new float[0];

    /* renamed from: a */
    public final void m11154a(float[] fArr) {
        this.extraScales = fArr;
    }
}
