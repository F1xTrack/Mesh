package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.bb */
/* loaded from: classes2.dex */
public abstract class AbstractC5020bb {
    /* renamed from: a */
    public static String m20170a(HashMap map) {
        if (map == null) {
            return null;
        }
        return map.isEmpty() ? "" : m20174b(map);
    }

    /* renamed from: b */
    public static String m20174b(Map map) {
        if (AbstractC5182hn.m20514a(map)) {
            return null;
        }
        return new JSONObject(map).toString();
    }

    /* renamed from: c */
    public static HashMap m20176c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap map = new HashMap();
            if (!JSONObject.NULL.equals(jSONObject)) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.optString(next));
                }
            }
            return map;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static HashMap m20177d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        if (!JSONObject.NULL.equals(jSONObject)) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
        }
        return map;
    }

    /* renamed from: e */
    public static ScreenInfo m20178e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new ScreenInfo(jSONObject.optInt(Snapshot.WIDTH), jSONObject.optInt(Snapshot.HEIGHT), jSONObject.optInt("dpi"), (float) jSONObject.optDouble("scaleFactor", ConfigValue.DOUBLE_DEFAULT_VALUE));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static ArrayList m20175b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        arrayList.add(jSONArray.getString(i));
                    } catch (Throwable unused) {
                        return arrayList;
                    }
                }
                return arrayList;
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static HashMap m20173a(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new HashMap();
        }
        return m20176c(str);
    }

    /* renamed from: a */
    public static Integer m20168a(JSONObject jSONObject, String str, Integer num) {
        if (jSONObject == null || !jSONObject.has(str)) {
            return num;
        }
        try {
            return Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable unused) {
            return num;
        }
    }

    /* renamed from: a */
    public static ArrayList m20172a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m20169a(ScreenInfo screenInfo) {
        JSONObject jSONObject;
        if (screenInfo == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(Snapshot.WIDTH, screenInfo.getWidth()).put(Snapshot.HEIGHT, screenInfo.getHeight()).put("dpi", screenInfo.getDpi()).put("scaleFactor", screenInfo.getScaleFactor());
            } catch (Throwable unused) {
            }
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static String m20171a(Map map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                List list = (List) entry.getValue();
                JSONArray jSONArray = AbstractC5182hn.m20513a((Collection) list) ? null : new JSONArray((Collection) list);
                if (jSONArray != null) {
                    jSONObject.put((String) entry.getKey(), jSONArray.toString());
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }
}
