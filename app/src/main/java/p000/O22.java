package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class O22 {
    /* renamed from: a */
    public static WritableArray m5942a(JSONArray jSONArray) throws JSONException {
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
                writableArrayCreateArray.pushMap(m5943b(jSONArray.getJSONObject(i)));
            } else if (obj instanceof JSONArray) {
                writableArrayCreateArray.pushArray(m5942a(jSONArray.getJSONArray(i)));
            } else if (obj == JSONObject.NULL) {
                writableArrayCreateArray.pushNull();
            }
        }
        return writableArrayCreateArray;
    }

    /* renamed from: b */
    public static WritableMap m5943b(JSONObject jSONObject) throws JSONException {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Iterator<String> itKeys = jSONObject.keys();
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
                writableMapCreateMap.putMap(next, m5943b(jSONObject.getJSONObject(next)));
            } else if (obj instanceof JSONArray) {
                writableMapCreateMap.putArray(next, m5942a(jSONObject.getJSONArray(next)));
            } else if (obj == JSONObject.NULL) {
                writableMapCreateMap.putNull(next);
            }
        }
        return writableMapCreateMap;
    }

    /* renamed from: c */
    public static JSONArray m5944c(ReadableArray readableArray) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (AbstractC9903jc0.f35283a[readableArray.getType(i).ordinal()]) {
                case 1:
                    jSONArray.put(JSONObject.NULL);
                    break;
                case 2:
                    jSONArray.put(readableArray.getBoolean(i));
                    break;
                case 3:
                    try {
                        jSONArray.put(readableArray.getInt(i));
                        break;
                    } catch (Exception unused) {
                        jSONArray.put(readableArray.getDouble(i));
                        break;
                    }
                case 4:
                    jSONArray.put(readableArray.getString(i));
                    break;
                case 5:
                    jSONArray.put(m5945d(readableArray.getMap(i)));
                    break;
                case 6:
                    jSONArray.put(m5944c(readableArray.getArray(i)));
                    break;
            }
        }
        return jSONArray;
    }

    /* renamed from: d */
    public static JSONObject m5945d(ReadableMap readableMap) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            switch (AbstractC9903jc0.f35283a[readableMap.getType(strNextKey).ordinal()]) {
                case 1:
                    jSONObject.put(strNextKey, JSONObject.NULL);
                    break;
                case 2:
                    jSONObject.put(strNextKey, readableMap.getBoolean(strNextKey));
                    break;
                case 3:
                    try {
                        jSONObject.put(strNextKey, readableMap.getInt(strNextKey));
                        break;
                    } catch (Exception unused) {
                        jSONObject.put(strNextKey, readableMap.getDouble(strNextKey));
                        break;
                    }
                case 4:
                    jSONObject.put(strNextKey, readableMap.getString(strNextKey));
                    break;
                case 5:
                    jSONObject.put(strNextKey, m5945d(readableMap.getMap(strNextKey)));
                    break;
                case 6:
                    jSONObject.put(strNextKey, m5944c(readableMap.getArray(strNextKey)));
                    break;
            }
        }
        return jSONObject;
    }

    /* renamed from: e */
    public static void m5946e(int i, int i2) {
        String strM6217f;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strM6217f = P22.m6217f("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i2, "negative size: "));
                }
                strM6217f = P22.m6217f("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strM6217f);
        }
    }

    /* renamed from: f */
    public static void m5947f(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m5949h(i, i2, "index"));
        }
    }

    /* renamed from: g */
    public static void m5948g(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? m5949h(i, i3, "start index") : (i2 < 0 || i2 > i3) ? m5949h(i2, i3, "end index") : P22.m6217f("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    /* renamed from: h */
    public static String m5949h(int i, int i2, String str) {
        if (i < 0) {
            return P22.m6217f("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return P22.m6217f("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(AbstractC11153tN0.m24909u(i2, "negative size: "));
    }
}
