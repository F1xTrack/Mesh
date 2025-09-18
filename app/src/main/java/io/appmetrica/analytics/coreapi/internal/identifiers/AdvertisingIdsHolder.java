package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes2.dex */
public class AdvertisingIdsHolder {

    /* renamed from: a */
    private final AdTrackingInfoResult f29636a;

    /* renamed from: b */
    private final AdTrackingInfoResult f29637b;

    /* renamed from: c */
    private final AdTrackingInfoResult f29638c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    public AdTrackingInfoResult getGoogle() {
        return this.f29636a;
    }

    public AdTrackingInfoResult getHuawei() {
        return this.f29637b;
    }

    public AdTrackingInfoResult getYandex() {
        return this.f29638c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f29636a + ", mHuawei=" + this.f29637b + ", yandex=" + this.f29638c + '}';
    }

    public AdvertisingIdsHolder(AdTrackingInfoResult adTrackingInfoResult, AdTrackingInfoResult adTrackingInfoResult2, AdTrackingInfoResult adTrackingInfoResult3) {
        this.f29636a = adTrackingInfoResult;
        this.f29637b = adTrackingInfoResult2;
        this.f29638c = adTrackingInfoResult3;
    }
}
