package com.p018my.tracker.ads;

/* loaded from: classes2.dex */
public final class AdEventBuilder {

    /* renamed from: a */
    final int f19689a;

    /* renamed from: b */
    final int f19690b;

    /* renamed from: c */
    final double f19691c;

    /* renamed from: d */
    final String f19692d;

    /* renamed from: e */
    String f19693e;

    /* renamed from: f */
    String f19694f;

    /* renamed from: g */
    String f19695g;

    /* renamed from: h */
    String f19696h;

    private AdEventBuilder(int i, int i2, double d, String str) {
        this.f19689a = i;
        this.f19690b = i2;
        this.f19691c = d;
        this.f19692d = str;
    }

    public static AdEventBuilder newClickBuilder(int i) {
        return new AdEventBuilder(18, i, Double.NaN, null);
    }

    public static AdEventBuilder newImpressionBuilder(int i) {
        return new AdEventBuilder(17, i, Double.NaN, null);
    }

    public static AdEventBuilder newRevenueBuilder(int i, double d, String str) {
        return new AdEventBuilder(19, i, d, str);
    }

    public AdEvent build() {
        return new AdEvent(this.f19689a, this.f19690b, this.f19691c, this.f19692d, this.f19693e, this.f19694f, this.f19695g, this.f19696h);
    }

    public AdEventBuilder withAdFormat(String str) {
        this.f19696h = str;
        return this;
    }

    public AdEventBuilder withAdId(String str) {
        this.f19695g = str;
        return this;
    }

    public AdEventBuilder withPlacementId(String str) {
        this.f19694f = str;
        return this;
    }

    public AdEventBuilder withSource(String str) {
        this.f19693e = str;
        return this;
    }
}
