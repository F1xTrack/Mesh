package io.appmetrica.analytics.impl;

import android.content.pm.FeatureInfo;

/* renamed from: io.appmetrica.analytics.impl.M9 */
/* loaded from: classes2.dex */
public final class C4658M9 extends AbstractC4682N9 {
    @Override // io.appmetrica.analytics.impl.AbstractC4682N9
    /* renamed from: b */
    public final C4706O9 mo19596b(FeatureInfo featureInfo) {
        return new C4706O9(featureInfo.name, -1, (featureInfo.flags & 1) != 0);
    }
}
