package com.p019vk.push.core.feature;

import com.p019vk.push.core.feature.Feature;
import kotlin.Metadata;
import p000.InterfaceC1382Vy;

@Metadata(m22266d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0005\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\tJ\u001b\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, m22267d2 = {"Lcom/vk/push/core/feature/FeatureManager;", "", "Lcom/vk/push/core/feature/Feature$BooleanFeature;", "feature", "", "getFeatureValue", "(Lcom/vk/push/core/feature/Feature$BooleanFeature;LVy;)Ljava/lang/Object;", "Lcom/vk/push/core/feature/Feature$StringFeature;", "", "(Lcom/vk/push/core/feature/Feature$StringFeature;LVy;)Ljava/lang/Object;", "Lcom/vk/push/core/feature/Feature$IntFeature;", "", "(Lcom/vk/push/core/feature/Feature$IntFeature;LVy;)Ljava/lang/Object;", "core_release"}, m22268k = 1, m22269mv = {1, 7, 1}, m22271xi = 48)
/* loaded from: classes2.dex */
public interface FeatureManager {
    Object getFeatureValue(Feature.BooleanFeature booleanFeature, InterfaceC1382Vy interfaceC1382Vy);

    Object getFeatureValue(Feature.IntFeature intFeature, InterfaceC1382Vy interfaceC1382Vy);

    Object getFeatureValue(Feature.StringFeature stringFeature, InterfaceC1382Vy interfaceC1382Vy);
}
