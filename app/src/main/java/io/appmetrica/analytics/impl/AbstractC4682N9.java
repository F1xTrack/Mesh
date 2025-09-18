package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;

/* renamed from: io.appmetrica.analytics.impl.N9 */
/* loaded from: classes2.dex */
public abstract class AbstractC4682N9 {
    /* renamed from: a */
    public final C4706O9 m19654a(FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return mo19596b(featureInfo);
        }
        int i = featureInfo.reqGlEsVersion;
        if (i == 0) {
            return mo19596b(featureInfo);
        }
        return new C4706O9("openGlFeature", i, (featureInfo.flags & 1) != 0);
    }

    /* renamed from: b */
    public abstract C4706O9 mo19596b(FeatureInfo featureInfo);
}
