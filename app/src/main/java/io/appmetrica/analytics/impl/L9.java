package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;

/* loaded from: classes2.dex */
public final class L9 extends N9 {
    @Override // io.appmetrica.analytics.impl.N9
    @TargetApi(24)
    public final O9 b(FeatureInfo featureInfo) {
        return new O9(featureInfo.name, featureInfo.version, (featureInfo.flags & 1) != 0);
    }
}
