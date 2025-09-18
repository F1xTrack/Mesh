package com.yandex.metrica.impl.ob;

import android.annotation.TargetApi;
import android.content.pm.FeatureInfo;

/* loaded from: classes2.dex */
public abstract class Yb {

    public static class a extends Yb {
        @Override // com.yandex.metrica.impl.ob.Yb
        @TargetApi(24)
        public Zb b(FeatureInfo featureInfo) {
            return new Zb(featureInfo.name, featureInfo.version, c(featureInfo));
        }
    }

    public static class b extends Yb {
        @Override // com.yandex.metrica.impl.ob.Yb
        public Zb b(FeatureInfo featureInfo) {
            return new Zb(featureInfo.name, -1, c(featureInfo));
        }
    }

    public Zb a(FeatureInfo featureInfo) {
        if (featureInfo.name != null) {
            return b(featureInfo);
        }
        int i = featureInfo.reqGlEsVersion;
        return i == 0 ? b(featureInfo) : new Zb("openGlFeature", i, c(featureInfo));
    }

    public abstract Zb b(FeatureInfo featureInfo);

    public boolean c(FeatureInfo featureInfo) {
        return (featureInfo.flags & 1) != 0;
    }
}
