package com.yandex.metrica.impl.p022ob;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;

/* renamed from: com.yandex.metrica.impl.ob.Yb */
/* loaded from: classes2.dex */
public abstract class AbstractC3077Yb {

    /* renamed from: com.yandex.metrica.impl.ob.Yb$a */
    public static class a extends AbstractC3077Yb {
        @Override // com.yandex.metrica.impl.p022ob.AbstractC3077Yb
        @TargetApi(24)
        /* renamed from: b */
        public C3102Zb mo15478b(FeatureInfo featureInfo) {
            return new C3102Zb(featureInfo.name, featureInfo.version, m15479c(featureInfo));
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.Yb$b */
    public static class b extends AbstractC3077Yb {
        @Override // com.yandex.metrica.impl.p022ob.AbstractC3077Yb
        /* renamed from: b */
        public C3102Zb mo15478b(FeatureInfo featureInfo) {
            return new C3102Zb(featureInfo.name, -1, m15479c(featureInfo));
        }
    }

    /* renamed from: a */
    public C3102Zb m15477a(FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return mo15478b(featureInfo);
        }
        int i = featureInfo.reqGlEsVersion;
        return i == 0 ? mo15478b(featureInfo) : new C3102Zb("openGlFeature", i, m15479c(featureInfo));
    }

    /* renamed from: b */
    public abstract C3102Zb mo15478b(FeatureInfo featureInfo);

    /* renamed from: c */
    public boolean m15479c(FeatureInfo featureInfo) {
        return (featureInfo.flags & 1) != 0;
    }
}
