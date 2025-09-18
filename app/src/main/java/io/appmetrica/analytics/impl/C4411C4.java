package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.Map;
import java.util.Objects;

/* renamed from: io.appmetrica.analytics.impl.C4 */
/* loaded from: classes2.dex */
public final class C4411C4 implements ArgumentsMerger {

    /* renamed from: a */
    public final String f29938a;

    /* renamed from: b */
    public final Boolean f29939b;

    /* renamed from: c */
    public final Location f29940c;

    /* renamed from: d */
    public final Boolean f29941d;

    /* renamed from: e */
    public final Integer f29942e;

    /* renamed from: f */
    public final Integer f29943f;

    /* renamed from: g */
    public final Integer f29944g;

    /* renamed from: h */
    public final Boolean f29945h;

    /* renamed from: i */
    public final Boolean f29946i;

    /* renamed from: j */
    public final Map<String, String> f29947j;

    /* renamed from: k */
    public final Integer f29948k;

    /* renamed from: l */
    public final Boolean f29949l;

    /* renamed from: m */
    public final Boolean f29950m;

    public C4411C4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6) {
        this.f29938a = str;
        this.f29939b = bool;
        this.f29940c = location;
        this.f29941d = bool2;
        this.f29942e = num;
        this.f29943f = num2;
        this.f29944g = num3;
        this.f29945h = bool3;
        this.f29946i = bool4;
        this.f29947j = map;
        this.f29948k = num4;
        this.f29949l = bool5;
        this.f29950m = bool6;
    }

    /* renamed from: a */
    public final boolean m19262a(C4411C4 c4411c4) {
        return equals(c4411c4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4411C4 mergeFrom(C4411C4 c4411c4) {
        return new C4411C4((String) WrapUtils.getOrDefaultNullable(this.f29938a, c4411c4.f29938a), (Boolean) WrapUtils.getOrDefaultNullable(this.f29939b, c4411c4.f29939b), (Location) WrapUtils.getOrDefaultNullable(this.f29940c, c4411c4.f29940c), (Boolean) WrapUtils.getOrDefaultNullable(this.f29941d, c4411c4.f29941d), (Integer) WrapUtils.getOrDefaultNullable(this.f29942e, c4411c4.f29942e), (Integer) WrapUtils.getOrDefaultNullable(this.f29943f, c4411c4.f29943f), (Integer) WrapUtils.getOrDefaultNullable(this.f29944g, c4411c4.f29944g), (Boolean) WrapUtils.getOrDefaultNullable(this.f29945h, c4411c4.f29945h), (Boolean) WrapUtils.getOrDefaultNullable(this.f29946i, c4411c4.f29946i), (Map) WrapUtils.getOrDefaultNullable(this.f29947j, c4411c4.f29947j), (Integer) WrapUtils.getOrDefaultNullable(this.f29948k, c4411c4.f29948k), (Boolean) WrapUtils.getOrDefaultNullable(this.f29949l, c4411c4.f29949l), (Boolean) WrapUtils.getOrDefaultNullable(this.f29950m, c4411c4.f29950m));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return equals((C4411C4) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4411C4.class != obj.getClass()) {
            return false;
        }
        C4411C4 c4411c4 = (C4411C4) obj;
        if (Objects.equals(this.f29938a, c4411c4.f29938a) && Objects.equals(this.f29939b, c4411c4.f29939b) && Objects.equals(this.f29940c, c4411c4.f29940c) && Objects.equals(this.f29941d, c4411c4.f29941d) && Objects.equals(this.f29942e, c4411c4.f29942e) && Objects.equals(this.f29943f, c4411c4.f29943f) && Objects.equals(this.f29944g, c4411c4.f29944g) && Objects.equals(this.f29945h, c4411c4.f29945h) && Objects.equals(this.f29946i, c4411c4.f29946i) && Objects.equals(this.f29947j, c4411c4.f29947j) && Objects.equals(this.f29948k, c4411c4.f29948k) && Objects.equals(this.f29949l, c4411c4.f29949l)) {
            return Objects.equals(this.f29950m, c4411c4.f29950m);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f29938a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.f29939b;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Location location = this.f29940c;
        int iHashCode3 = (iHashCode2 + (location != null ? location.hashCode() : 0)) * 31;
        Boolean bool2 = this.f29941d;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Integer num = this.f29942e;
        int iHashCode5 = (iHashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f29943f;
        int iHashCode6 = (iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f29944g;
        int iHashCode7 = (iHashCode6 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Boolean bool3 = this.f29945h;
        int iHashCode8 = (iHashCode7 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.f29946i;
        int iHashCode9 = (iHashCode8 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Map<String, String> map = this.f29947j;
        int iHashCode10 = (iHashCode9 + (map != null ? map.hashCode() : 0)) * 31;
        Integer num4 = this.f29948k;
        int iHashCode11 = (iHashCode10 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Boolean bool5 = this.f29949l;
        int iHashCode12 = (iHashCode11 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        Boolean bool6 = this.f29950m;
        return iHashCode12 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f29938a + "', locationTracking=" + this.f29939b + ", manualLocation=" + this.f29940c + ", firstActivationAsUpdate=" + this.f29941d + ", sessionTimeout=" + this.f29942e + ", maxReportsCount=" + this.f29943f + ", dispatchPeriod=" + this.f29944g + ", logEnabled=" + this.f29945h + ", dataSendingEnabled=" + this.f29946i + ", clidsFromClient=" + this.f29947j + ", maxReportsInDbCount=" + this.f29948k + ", nativeCrashesEnabled=" + this.f29949l + ", revenueAutoTrackingEnabled=" + this.f29950m + '}';
    }

    public C4411C4(CounterConfiguration counterConfiguration, Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled());
    }

    public C4411C4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
