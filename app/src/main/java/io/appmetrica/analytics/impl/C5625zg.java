package io.appmetrica.analytics.impl;

import android.location.Location;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.zg */
/* loaded from: classes2.dex */
public final class C5625zg extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a */
    public final String f32923a;

    /* renamed from: b */
    public final Location f32924b;

    /* renamed from: c */
    public final boolean f32925c;

    /* renamed from: d */
    public final boolean f32926d;

    /* renamed from: e */
    public final int f32927e;

    /* renamed from: f */
    public final int f32928f;

    /* renamed from: g */
    public final int f32929g;

    /* renamed from: h */
    public final boolean f32930h;

    /* renamed from: i */
    public final boolean f32931i;

    /* renamed from: j */
    public final Map<String, String> f32932j;

    /* renamed from: k */
    public final int f32933k;

    public C5625zg(C4411C4 c4411c4) {
        this(c4411c4.f29938a, c4411c4.f29939b, c4411c4.f29940c, c4411c4.f29941d, c4411c4.f29942e, c4411c4.f29943f, c4411c4.f29944g, c4411c4.f29945h, c4411c4.f29946i, c4411c4.f29947j, c4411c4.f29948k);
    }

    /* renamed from: a */
    public static C5625zg m21239a() {
        return new C5625zg(null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C5625zg mergeFrom(C4411C4 c4411c4) {
        return new C5625zg((String) WrapUtils.getOrDefaultNullable(c4411c4.f29938a, this.f32923a), (Boolean) WrapUtils.getOrDefaultNullable(c4411c4.f29939b, Boolean.valueOf(this.f32925c)), (Location) WrapUtils.getOrDefaultNullable(c4411c4.f29940c, this.f32924b), (Boolean) WrapUtils.getOrDefaultNullable(c4411c4.f29941d, Boolean.valueOf(this.f32926d)), (Integer) WrapUtils.getOrDefaultNullable(c4411c4.f29942e, Integer.valueOf(this.f32927e)), (Integer) WrapUtils.getOrDefaultNullable(c4411c4.f29943f, Integer.valueOf(this.f32928f)), (Integer) WrapUtils.getOrDefaultNullable(c4411c4.f29944g, Integer.valueOf(this.f32929g)), (Boolean) WrapUtils.getOrDefaultNullable(c4411c4.f29945h, Boolean.valueOf(this.f32930h)), (Boolean) WrapUtils.getOrDefaultNullable(c4411c4.f29946i, Boolean.valueOf(this.f32931i)), (Map) WrapUtils.getOrDefaultNullable(c4411c4.f29947j, this.f32932j), (Integer) WrapUtils.getOrDefaultNullable(c4411c4.f29948k, Integer.valueOf(this.f32933k)));
    }

    public C5625zg(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f32923a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f32925c = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f32924b = location;
        this.f32926d = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f32927e = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f32928f = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f32929g = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f32930h = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f32931i = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.f32932j = map;
        this.f32933k = ((Integer) WrapUtils.getOrDefault(num4, 1000)).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(C4411C4 c4411c4) {
        Location location;
        Map<String, String> map;
        String str;
        Boolean bool = c4411c4.f29939b;
        if (bool != null && this.f32925c != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = c4411c4.f29941d;
        if (bool2 != null && this.f32926d != bool2.booleanValue()) {
            return false;
        }
        Integer num = c4411c4.f29942e;
        if (num != null && this.f32927e != num.intValue()) {
            return false;
        }
        Integer num2 = c4411c4.f29943f;
        if (num2 != null && this.f32928f != num2.intValue()) {
            return false;
        }
        Integer num3 = c4411c4.f29944g;
        if (num3 != null && this.f32929g != num3.intValue()) {
            return false;
        }
        Boolean bool3 = c4411c4.f29945h;
        if (bool3 != null && this.f32930h != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = c4411c4.f29946i;
        if (bool4 != null && this.f32931i != bool4.booleanValue()) {
            return false;
        }
        String str2 = c4411c4.f29938a;
        if (str2 != null && ((str = this.f32923a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = c4411c4.f29947j;
        if (map2 != null && ((map = this.f32932j) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = c4411c4.f29948k;
        if (num4 != null && this.f32933k != num4.intValue()) {
            return false;
        }
        Location location2 = c4411c4.f29940c;
        if (location2 != null && (location = this.f32924b) != location2) {
            if (location == null || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || Double.compare(location2.getLatitude(), location.getLatitude()) != 0 || Double.compare(location2.getLongitude(), location.getLongitude()) != 0 || Double.compare(location2.getAltitude(), location.getAltitude()) != 0 || Float.compare(location2.getSpeed(), location.getSpeed()) != 0 || Float.compare(location2.getBearing(), location.getBearing()) != 0 || Float.compare(location2.getAccuracy(), location.getAccuracy()) != 0) {
                return false;
            }
            if (AndroidUtils.isApiAchieved(26) && (Float.compare(location2.getVerticalAccuracyMeters(), location.getVerticalAccuracyMeters()) != 0 || Float.compare(location2.getSpeedAccuracyMetersPerSecond(), location.getSpeedAccuracyMetersPerSecond()) != 0 || Float.compare(location2.getBearingAccuracyDegrees(), location.getBearingAccuracyDegrees()) != 0)) {
                return false;
            }
            if (location.getProvider() != null) {
                if (!location.getProvider().equals(location2.getProvider())) {
                    return false;
                }
            } else if (location2.getProvider() != null) {
                return false;
            }
            if (location.getExtras() != null) {
                if (!location.getExtras().equals(location2.getExtras())) {
                    return false;
                }
            } else if (location2.getExtras() != null) {
                return false;
            }
        }
        return true;
    }
}
