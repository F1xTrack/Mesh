package io.appmetrica.analytics.impl;

import android.location.Location;
import android.text.TextUtils;
import io.appmetrica.analytics.PreloadInfo;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.X3 */
/* loaded from: classes2.dex */
public abstract class AbstractC4915X3 {
    /* renamed from: a */
    public static String m19961a(Location location) {
        if (location == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("provider", location.getProvider());
            jSONObject.put(CrashHianalyticsData.TIME, location.getTime());
            jSONObject.put("accuracy", location.getAccuracy());
            jSONObject.put("alt", location.getAltitude());
            jSONObject.put("lng", location.getLongitude());
            jSONObject.put("lat", location.getLatitude());
            return jSONObject.toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static PreloadInfo m19962b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        PreloadInfo.Builder builderNewBuilder = PreloadInfo.newBuilder(jSONObject.has("trackid") ? jSONObject.optString("trackid") : null);
        HashMap mapM20176c = AbstractC5020bb.m20176c(jSONObject.optString("params"));
        if (mapM20176c != null && mapM20176c.size() > 0) {
            for (Map.Entry entry : mapM20176c.entrySet()) {
                builderNewBuilder.setAdditionalParams((String) entry.getKey(), (String) entry.getValue());
            }
        }
        return builderNewBuilder.build();
    }

    /* renamed from: a */
    public static Location m19960a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Location location = new Location(jSONObject.has("provider") ? jSONObject.optString("provider") : null);
            location.setLongitude(jSONObject.getDouble("lng"));
            location.setLatitude(jSONObject.getDouble("lat"));
            location.setTime(jSONObject.optLong(CrashHianalyticsData.TIME));
            location.setAccuracy((float) jSONObject.optDouble("accuracy"));
            location.setAltitude((float) jSONObject.optDouble("alt"));
            return location;
        } catch (Throwable unused) {
            return null;
        }
    }
}
