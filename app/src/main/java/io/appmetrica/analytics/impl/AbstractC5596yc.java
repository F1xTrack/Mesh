package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;

/* renamed from: io.appmetrica.analytics.impl.yc */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC5596yc {

    /* renamed from: a */
    public static final /* synthetic */ int[] f32853a;

    static {
        int[] iArr = new int[ModuleAdType.values().length];
        iArr[ModuleAdType.NATIVE.ordinal()] = 1;
        iArr[ModuleAdType.BANNER.ordinal()] = 2;
        iArr[ModuleAdType.REWARDED.ordinal()] = 3;
        iArr[ModuleAdType.INTERSTITIAL.ordinal()] = 4;
        iArr[ModuleAdType.MREC.ordinal()] = 5;
        iArr[ModuleAdType.OTHER.ordinal()] = 6;
        f32853a = iArr;
    }
}
