package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;

/* renamed from: io.appmetrica.analytics.impl.L9 */
/* loaded from: classes2.dex */
public final class C4634L9 extends AbstractC4682N9 {
    @Override // io.appmetrica.analytics.impl.AbstractC4682N9
    @TargetApi(24)
    /* renamed from: b */
    public final C4706O9 mo19596b(FeatureInfo featureInfo) {
        return new C4706O9(featureInfo.name, featureInfo.version, (featureInfo.flags & 1) != 0);
    }
}
