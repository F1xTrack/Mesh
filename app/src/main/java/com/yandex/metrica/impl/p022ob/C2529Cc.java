package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.yandex.metrica.impl.p022ob.C2766M;
import com.yandex.metrica.impl.p022ob.C3028Wc;
import com.yandex.varioqub.config.model.ConfigValue;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Cc */
/* loaded from: classes2.dex */
public class C2529Cc {

    /* renamed from: a */
    private Context f20980a;

    public C2529Cc(Context context) {
        this.f20980a = context;
    }

    /* renamed from: a */
    public String m13964a(C3519pd c3519pd) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("collection_mode", c3519pd.f24442a.m15388a());
            jSONObject.put("lat", c3519pd.m16577c().getLatitude());
            jSONObject.put("lon", c3519pd.m16577c().getLongitude());
            jSONObject.putOpt("timestamp", Long.valueOf(c3519pd.m16577c().getTime()));
            jSONObject.putOpt("receive_timestamp", Long.valueOf(c3519pd.m16579e()));
            jSONObject.put("receive_elapsed_realtime_seconds", c3519pd.m16578d());
            jSONObject.putOpt("precision", c3519pd.m16577c().hasAccuracy() ? Float.valueOf(c3519pd.m16577c().getAccuracy()) : null);
            jSONObject.putOpt(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, c3519pd.m16577c().hasBearing() ? Float.valueOf(c3519pd.m16577c().getBearing()) : null);
            jSONObject.putOpt("speed", c3519pd.m16577c().hasSpeed() ? Float.valueOf(c3519pd.m16577c().getSpeed()) : null);
            jSONObject.putOpt("altitude", c3519pd.m16577c().hasAltitude() ? Double.valueOf(c3519pd.m16577c().getAltitude()) : null);
            jSONObject.putOpt("provider", C2819O2.m14686a(c3519pd.m16577c().getProvider(), null));
            jSONObject.put("charge_type", c3519pd.m16575a().m14568a());
            string = jSONObject.toString();
        } catch (Throwable unused) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        try {
            return C3762ym.m17285b(this.f20980a, string);
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }

    /* renamed from: b */
    public C3519pd m13965b(long j, String str) {
        String strM17270a;
        try {
            strM17270a = C3762ym.m17270a(this.f20980a, str);
        } catch (UnsupportedEncodingException unused) {
            strM17270a = null;
        }
        if (strM17270a != null && !TextUtils.isEmpty(strM17270a)) {
            try {
                JSONObject jSONObject = new JSONObject(strM17270a);
                long jOptLong = jSONObject.optLong("receive_timestamp", 0L);
                long jOptLong2 = jSONObject.optLong("receive_elapsed_realtime_seconds", 0L);
                C3028Wc.a aVarM15387a = C3028Wc.a.m15387a(jSONObject.optString("collection_mode"));
                Location location = new Location(jSONObject.optString("provider", null));
                location.setLongitude(jSONObject.optDouble("lon", ConfigValue.DOUBLE_DEFAULT_VALUE));
                location.setLatitude(jSONObject.optDouble("lat", ConfigValue.DOUBLE_DEFAULT_VALUE));
                location.setTime(jSONObject.optLong("timestamp", 0L));
                location.setAccuracy((float) jSONObject.optDouble("precision", ConfigValue.DOUBLE_DEFAULT_VALUE));
                location.setBearing((float) jSONObject.optDouble(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, ConfigValue.DOUBLE_DEFAULT_VALUE));
                location.setSpeed((float) jSONObject.optDouble("speed", ConfigValue.DOUBLE_DEFAULT_VALUE));
                location.setAltitude(jSONObject.optDouble("altitude", ConfigValue.DOUBLE_DEFAULT_VALUE));
                return new C3519pd(aVarM15387a, jOptLong, jOptLong2, location, C2766M.b.a.m14567a(Integer.valueOf(jSONObject.optInt("charge_type", Integer.MIN_VALUE))), Long.valueOf(j));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public C2953Tc m13962a(long j, String str) {
        String strM17270a;
        try {
            strM17270a = C3762ym.m17270a(this.f20980a, str);
        } catch (UnsupportedEncodingException unused) {
            strM17270a = null;
        }
        if (strM17270a == null || TextUtils.isEmpty(strM17270a)) {
            return null;
        }
        try {
            C2953Tc c2953Tc = new C2953Tc();
            try {
                c2953Tc.m15181a(Long.valueOf(j));
                JSONObject jSONObject = new JSONObject(strM17270a);
                c2953Tc.m15184b(jSONObject.optLong("timestamp", 0L));
                c2953Tc.m15178a(jSONObject.optLong("elapsed_realtime_seconds", 0L));
                c2953Tc.m15182a(jSONObject.optJSONArray("cell_info"));
                c2953Tc.m15185b(jSONObject.optJSONArray("wifi_info"));
                c2953Tc.m15179a(C2766M.b.a.m14567a(Integer.valueOf(jSONObject.optInt("charge_type", Integer.MIN_VALUE))));
                c2953Tc.m15180a(C3028Wc.a.m15387a(jSONObject.optString("collection_mode")));
            } catch (Throwable unused2) {
            }
            return c2953Tc;
        } catch (Throwable unused3) {
            return null;
        }
    }

    /* renamed from: a */
    public String m13963a(C2953Tc c2953Tc) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", c2953Tc.m15187d());
            jSONObject.put("elapsed_realtime_seconds", c2953Tc.m15186c());
            jSONObject.putOpt("wifi_info", c2953Tc.m15190g());
            jSONObject.putOpt("cell_info", c2953Tc.m15177a());
            if (c2953Tc.m15183b() != null) {
                jSONObject.put("charge_type", c2953Tc.m15183b().m14568a());
            }
            if (c2953Tc.m15188e() != null) {
                jSONObject.put("collection_mode", c2953Tc.m15188e().m15388a());
            }
            string = jSONObject.toString();
        } catch (Throwable unused) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        try {
            return C3762ym.m17285b(this.f20980a, string);
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }
}
