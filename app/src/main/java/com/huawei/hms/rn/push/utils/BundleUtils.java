package com.huawei.hms.rn.push.utils;

import android.os.Bundle;
import com.yandex.varioqub.config.model.ConfigValue;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class BundleUtils {
    private BundleUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean contains(Bundle bundle, String str) {
        return bundle != null && bundle.containsKey(str);
    }

    public static String convertJSON(Bundle bundle) {
        return convertJSONObject(bundle).toString();
    }

    public static JSONObject convertJSONObject(Bundle bundle) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj instanceof Bundle) {
                        jSONObject.put(str, convertJSONObject((Bundle) obj));
                    } else {
                        jSONObject.put(str, JSONObject.wrap(obj));
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String get(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getString(str);
        }
        return null;
    }

    public static boolean getB(Bundle bundle, String str) {
        return bundle != null && bundle.getBoolean(str);
    }

    public static double getD(Bundle bundle, String str) {
        return bundle != null ? bundle.getDouble(str) : ConfigValue.DOUBLE_DEFAULT_VALUE;
    }

    public static long getL(Bundle bundle, String str) {
        return (long) getD(bundle, str);
    }

    public static void set(Bundle bundle, String str, String str2) {
        if (bundle != null) {
            bundle.putString(str, str2);
        }
    }

    public static void setB(Bundle bundle, String str, boolean z) {
        if (bundle != null) {
            bundle.putBoolean(str, z);
        }
    }

    public static void setD(Bundle bundle, String str, double d) {
        if (bundle != null) {
            bundle.putDouble(str, d);
        }
    }

    public static String get(Bundle bundle, String str, String str2) {
        return bundle != null ? bundle.getString(str, str2) : str2;
    }

    public static boolean getB(Bundle bundle, String str, boolean z) {
        return bundle != null ? bundle.getBoolean(str, z) : z;
    }

    public static double getD(Bundle bundle, String str, double d) {
        return bundle != null ? bundle.getDouble(str, d) : d;
    }

    public static long getL(Bundle bundle, String str, double d) {
        return (long) getD(bundle, str, d);
    }
}
