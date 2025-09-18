package io.appmetrica.analytics.adrevenue.fyber.p023v3.impl;

import com.fyber.fairbid.ads.PlacementType;

/* renamed from: io.appmetrica.analytics.adrevenue.fyber.v3.impl.a */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4282a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f29553a;

    static {
        int[] iArr = new int[PlacementType.values().length];
        f29553a = iArr;
        try {
            iArr[PlacementType.BANNER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f29553a[PlacementType.REWARDED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f29553a[PlacementType.INTERSTITIAL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
