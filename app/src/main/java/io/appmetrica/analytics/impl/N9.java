package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;

/* loaded from: classes2.dex */
public abstract class N9 {
    public final O9 a(FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i = featureInfo.reqGlEsVersion;
        if (i == 0) {
            return b(featureInfo);
        }
        return new O9("openGlFeature", i, (featureInfo.flags & 1) != 0);
    }

    public abstract O9 b(FeatureInfo featureInfo);
}
