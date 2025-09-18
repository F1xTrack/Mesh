package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: t01, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC11104t01 {
    /* renamed from: a */
    public static WritableMap m24816a(Exception exc) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        String message = exc.getMessage();
        writableMapCreateMap.putString("code", "unknown");
        writableMapCreateMap.putString("nativeErrorCode", "unknown");
        writableMapCreateMap.putString("message", message);
        writableMapCreateMap.putString("nativeErrorMessage", message);
        return writableMapCreateMap;
    }

    /* renamed from: b */
    public static WritableArray m24817b(JSONArray jSONArray) throws JSONException {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                writableArrayCreateArray.pushDouble(jSONArray.getDouble(i));
            } else if (obj instanceof Number) {
                writableArrayCreateArray.pushInt(jSONArray.getInt(i));
            } else if (obj instanceof String) {
                writableArrayCreateArray.pushString(jSONArray.getString(i));
            } else if (obj instanceof JSONObject) {
                writableArrayCreateArray.pushMap(m24818c(jSONArray.getJSONObject(i)));
            } else if (obj instanceof JSONArray) {
                writableArrayCreateArray.pushArray(m24817b(jSONArray.getJSONArray(i)));
            } else if (obj == JSONObject.NULL) {
                writableArrayCreateArray.pushNull();
            }
        }
        return writableArrayCreateArray;
    }

    /* renamed from: c */
    public static WritableMap m24818c(JSONObject jSONObject) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        WritableMap writableMapCreateMap = Arguments.createMap();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if ((obj instanceof Float) || (obj instanceof Double)) {
                writableMapCreateMap.putDouble(next, jSONObject.getDouble(next));
            } else if (obj instanceof Number) {
                writableMapCreateMap.putInt(next, jSONObject.getInt(next));
            } else if (obj instanceof String) {
                writableMapCreateMap.putString(next, jSONObject.getString(next));
            } else if (obj instanceof JSONObject) {
                writableMapCreateMap.putMap(next, m24818c(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                writableMapCreateMap.putArray(next, m24817b(jSONObject.getJSONArray(next)));
            } else if (obj == JSONObject.NULL) {
                writableMapCreateMap.putNull(next);
            }
        }
        return writableMapCreateMap;
    }

    /* renamed from: d */
    public static WritableArray m24819d(List list) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (Object obj : list) {
            if (obj == null || obj == JSONObject.NULL) {
                writableArrayCreateArray.pushNull();
            } else {
                String name = obj.getClass().getName();
                if (name.equals("java.lang.Integer")) {
                    writableArrayCreateArray.pushInt(((Integer) obj).intValue());
                } else if (name.equals("java.lang.Float")) {
                    writableArrayCreateArray.pushDouble(((Float) obj).floatValue());
                } else if (name.equals("org.json.JSONArray$1")) {
                    try {
                        writableArrayCreateArray.pushArray(m24817b((JSONArray) obj));
                    } catch (JSONException unused) {
                        writableArrayCreateArray.pushNull();
                    }
                } else if (name.equals("java.lang.Boolean")) {
                    writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
                } else if (name.equals("java.lang.Long")) {
                    writableArrayCreateArray.pushDouble(((Long) obj).longValue());
                } else if (name.equals("java.lang.Double")) {
                    writableArrayCreateArray.pushDouble(((Double) obj).doubleValue());
                } else if (name.equals("java.lang.String")) {
                    writableArrayCreateArray.pushString((String) obj);
                } else if (name.equals("org.json.JSONObject$1")) {
                    try {
                        writableArrayCreateArray.pushMap(m24818c((JSONObject) obj));
                    } catch (JSONException unused2) {
                        writableArrayCreateArray.pushNull();
                    }
                } else if (List.class.isAssignableFrom(obj.getClass())) {
                    writableArrayCreateArray.pushArray(m24819d((List) obj));
                } else if (Map.class.isAssignableFrom(obj.getClass())) {
                    writableArrayCreateArray.pushMap(m24821f((Map) obj));
                } else {
                    writableArrayCreateArray.pushNull();
                }
            }
        }
        return writableArrayCreateArray;
    }

    /* renamed from: e */
    public static void m24820e(WritableMap writableMap, String str, Object obj) {
        if (obj == null || obj == JSONObject.NULL) {
            writableMap.putNull(str);
            return;
        }
        String name = obj.getClass().getName();
        if (name.equals("java.lang.Integer")) {
            writableMap.putInt(str, ((Integer) obj).intValue());
            return;
        }
        if (name.equals("java.lang.Float")) {
            writableMap.putDouble(str, ((Float) obj).floatValue());
            return;
        }
        if (name.equals("org.json.JSONArray$1")) {
            try {
                writableMap.putArray(str, m24817b((JSONArray) obj));
                return;
            } catch (JSONException unused) {
                writableMap.putNull(str);
                return;
            }
        }
        if (name.equals("java.lang.Boolean")) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (name.equals("java.lang.Long")) {
            writableMap.putDouble(str, ((Long) obj).longValue());
            return;
        }
        if (name.equals("java.lang.Double")) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
            return;
        }
        if (name.equals("java.lang.String")) {
            writableMap.putString(str, (String) obj);
            return;
        }
        if (name.equals("org.json.JSONObject$1")) {
            try {
                writableMap.putMap(str, m24818c((JSONObject) obj));
            } catch (JSONException unused2) {
                writableMap.putNull(str);
            }
        } else if (List.class.isAssignableFrom(obj.getClass())) {
            writableMap.putArray(str, m24819d((List) obj));
        } else if (Map.class.isAssignableFrom(obj.getClass())) {
            writableMap.putMap(str, m24821f((Map) obj));
        } else {
            writableMap.putNull(str);
        }
    }

    /* renamed from: f */
    public static WritableMap m24821f(Map map) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry entry : map.entrySet()) {
            m24820e(writableMapCreateMap, (String) entry.getKey(), entry.getValue());
        }
        return writableMapCreateMap;
    }
}
