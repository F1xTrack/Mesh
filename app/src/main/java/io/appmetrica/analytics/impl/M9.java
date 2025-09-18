package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;

/* loaded from: classes2.dex */
public final class M9 extends N9 {
    @Override // io.appmetrica.analytics.impl.N9
    public final O9 b(FeatureInfo featureInfo) {
        return new O9(featureInfo.name, -1, (featureInfo.flags & 1) != 0);
    }
}
