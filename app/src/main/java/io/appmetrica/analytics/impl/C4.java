package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class C4 implements ArgumentsMerger {
    public final String a;
    public final Boolean b;
    public final Location c;
    public final Boolean d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Boolean h;
    public final Boolean i;
    public final Map<String, String> j;
    public final Integer k;
    public final Boolean l;
    public final Boolean m;

    public C4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6) {
        this.a = str;
        this.b = bool;
        this.c = location;
        this.d = bool2;
        this.e = num;
        this.f = num2;
        this.g = num3;
        this.h = bool3;
        this.i = bool4;
        this.j = map;
        this.k = num4;
        this.l = bool5;
        this.m = bool6;
    }

    public final boolean a(C4 c4) {
        return equals(c4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C4 mergeFrom(C4 c4) {
        return new C4((String) WrapUtils.getOrDefaultNullable(this.a, c4.a), (Boolean) WrapUtils.getOrDefaultNullable(this.b, c4.b), (Location) WrapUtils.getOrDefaultNullable(this.c, c4.c), (Boolean) WrapUtils.getOrDefaultNullable(this.d, c4.d), (Integer) WrapUtils.getOrDefaultNullable(this.e, c4.e), (Integer) WrapUtils.getOrDefaultNullable(this.f, c4.f), (Integer) WrapUtils.getOrDefaultNullable(this.g, c4.g), (Boolean) WrapUtils.getOrDefaultNullable(this.h, c4.h), (Boolean) WrapUtils.getOrDefaultNullable(this.i, c4.i), (Map) WrapUtils.getOrDefaultNullable(this.j, c4.j), (Integer) WrapUtils.getOrDefaultNullable(this.k, c4.k), (Boolean) WrapUtils.getOrDefaultNullable(this.l, c4.l), (Boolean) WrapUtils.getOrDefaultNullable(this.m, c4.m));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(Object obj) {
        return equals((C4) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4.class != obj.getClass()) {
            return false;
        }
        C4 c4 = (C4) obj;
        if (Objects.equals(this.a, c4.a) && Objects.equals(this.b, c4.b) && Objects.equals(this.c, c4.c) && Objects.equals(this.d, c4.d) && Objects.equals(this.e, c4.e) && Objects.equals(this.f, c4.f) && Objects.equals(this.g, c4.g) && Objects.equals(this.h, c4.h) && Objects.equals(this.i, c4.i) && Objects.equals(this.j, c4.j) && Objects.equals(this.k, c4.k) && Objects.equals(this.l, c4.l)) {
            return Objects.equals(this.m, c4.m);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Location location = this.c;
        int iHashCode3 = (iHashCode2 + (location != null ? location.hashCode() : 0)) * 31;
        Boolean bool2 = this.d;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Boolean bool3 = this.h;
        int iHashCode8 = (iHashCode7 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.i;
        int iHashCode9 = (iHashCode8 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Map<String, String> map = this.j;
        int iHashCode10 = (iHashCode9 + (map != null ? map.hashCode() : 0)) * 31;
        Integer num4 = this.k;
        int iHashCode11 = (iHashCode10 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Boolean bool5 = this.l;
        int iHashCode12 = (iHashCode11 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        Boolean bool6 = this.m;
        return iHashCode12 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.a + "', locationTracking=" + this.b + ", manualLocation=" + this.c + ", firstActivationAsUpdate=" + this.d + ", sessionTimeout=" + this.e + ", maxReportsCount=" + this.f + ", dispatchPeriod=" + this.g + ", logEnabled=" + this.h + ", dataSendingEnabled=" + this.i + ", clidsFromClient=" + this.j + ", maxReportsInDbCount=" + this.k + ", nativeCrashesEnabled=" + this.l + ", revenueAutoTrackingEnabled=" + this.m + '}';
    }

    public C4(CounterConfiguration counterConfiguration, Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled());
    }

    public C4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
