package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.yandex.metrica.impl.ob.M;
import com.yandex.metrica.impl.ob.Wc;
import com.yandex.varioqub.config.model.ConfigValue;
import java.io.UnsupportedEncodingException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class Cc {
    private Context a;

    public Cc(Context context) {
        this.a = context;
    }

    public String a(C3002pd c3002pd) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("collection_mode", c3002pd.a.a());
            jSONObject.put("lat", c3002pd.c().getLatitude());
            jSONObject.put("lon", c3002pd.c().getLongitude());
            jSONObject.putOpt("timestamp", Long.valueOf(c3002pd.c().getTime()));
            jSONObject.putOpt("receive_timestamp", Long.valueOf(c3002pd.e()));
            jSONObject.put("receive_elapsed_realtime_seconds", c3002pd.d());
            jSONObject.putOpt("precision", c3002pd.c().hasAccuracy() ? Float.valueOf(c3002pd.c().getAccuracy()) : null);
            jSONObject.putOpt(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, c3002pd.c().hasBearing() ? Float.valueOf(c3002pd.c().getBearing()) : null);
            jSONObject.putOpt("speed", c3002pd.c().hasSpeed() ? Float.valueOf(c3002pd.c().getSpeed()) : null);
            jSONObject.putOpt("altitude", c3002pd.c().hasAltitude() ? Double.valueOf(c3002pd.c().getAltitude()) : null);
            jSONObject.putOpt("provider", O2.a(c3002pd.c().getProvider(), null));
            jSONObject.put("charge_type", c3002pd.a().a());
            string = jSONObject.toString();
        } catch (Throwable unused) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        try {
            return C3240ym.b(this.a, string);
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }

    public C3002pd b(long j, String str) {
        String strA;
        try {
            strA = C3240ym.a(this.a, str);
        } catch (UnsupportedEncodingException unused) {
            strA = null;
        }
        if (strA != null && !TextUtils.isEmpty(strA)) {
            try {
                JSONObject jSONObject = new JSONObject(strA);
                long jOptLong = jSONObject.optLong("receive_timestamp", 0L);
                long jOptLong2 = jSONObject.optLong("receive_elapsed_realtime_seconds", 0L);
                Wc.a aVarA = Wc.a.a(jSONObject.optString("collection_mode"));
                Location location = new Location(jSONObject.optString("provider", null));
                location.setLongitude(jSONObject.optDouble("lon", ConfigValue.DOUBLE_DEFAULT_VALUE));
                location.setLatitude(jSONObject.optDouble("lat", ConfigValue.DOUBLE_DEFAULT_VALUE));
                location.setTime(jSONObject.optLong("timestamp", 0L));
                location.setAccuracy((float) jSONObject.optDouble("precision", ConfigValue.DOUBLE_DEFAULT_VALUE));
                location.setBearing((float) jSONObject.optDouble(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, ConfigValue.DOUBLE_DEFAULT_VALUE));
                location.setSpeed((float) jSONObject.optDouble("speed", ConfigValue.DOUBLE_DEFAULT_VALUE));
                location.setAltitude(jSONObject.optDouble("altitude", ConfigValue.DOUBLE_DEFAULT_VALUE));
                return new C3002pd(aVarA, jOptLong, jOptLong2, location, M.b.a.a(Integer.valueOf(jSONObject.optInt("charge_type", Integer.MIN_VALUE))), Long.valueOf(j));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public Tc a(long j, String str) {
        String strA;
        try {
            strA = C3240ym.a(this.a, str);
        } catch (UnsupportedEncodingException unused) {
            strA = null;
        }
        if (strA == null || TextUtils.isEmpty(strA)) {
            return null;
        }
        try {
            Tc tc = new Tc();
            try {
                tc.a(Long.valueOf(j));
                JSONObject jSONObject = new JSONObject(strA);
                tc.b(jSONObject.optLong("timestamp", 0L));
                tc.a(jSONObject.optLong("elapsed_realtime_seconds", 0L));
                tc.a(jSONObject.optJSONArray("cell_info"));
                tc.b(jSONObject.optJSONArray("wifi_info"));
                tc.a(M.b.a.a(Integer.valueOf(jSONObject.optInt("charge_type", Integer.MIN_VALUE))));
                tc.a(Wc.a.a(jSONObject.optString("collection_mode")));
            } catch (Throwable unused2) {
            }
            return tc;
        } catch (Throwable unused3) {
            return null;
        }
    }

    public String a(Tc tc) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("timestamp", tc.d());
            jSONObject.put("elapsed_realtime_seconds", tc.c());
            jSONObject.putOpt("wifi_info", tc.g());
            jSONObject.putOpt("cell_info", tc.a());
            if (tc.b() != null) {
                jSONObject.put("charge_type", tc.b().a());
            }
            if (tc.e() != null) {
                jSONObject.put("collection_mode", tc.e().a());
            }
            string = jSONObject.toString();
        } catch (Throwable unused) {
            string = null;
        }
        if (string == null) {
            return null;
        }
        try {
            return C3240ym.b(this.a, string);
        } catch (UnsupportedEncodingException unused2) {
            return null;
        }
    }
}
