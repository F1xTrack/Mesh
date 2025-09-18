package com.huawei.hms.p015rn.push.utils;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MapUtils {

    /* renamed from: com.huawei.hms.rn.push.utils.MapUtils$1 */
    public static /* synthetic */ class C22441 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Boolean.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Null.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private MapUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static WritableMap copyToWritableMap(Map<String, Object> map) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value == null) {
                writableMapCreateMap.putNull(entry.getKey());
            } else if (value instanceof Double) {
                writableMapCreateMap.putDouble(entry.getKey(), ((Double) value).doubleValue());
            } else if (value instanceof Boolean) {
                writableMapCreateMap.putBoolean(entry.getKey(), ((Boolean) value).booleanValue());
            } else if (value instanceof Integer) {
                writableMapCreateMap.putInt(entry.getKey(), ((Integer) value).intValue());
            } else if (value instanceof Map) {
                writableMapCreateMap.putMap(entry.getKey(), copyToWritableMap((Map) value));
            } else if (value instanceof JSONObject) {
                writableMapCreateMap.putMap(entry.getKey(), toWritableMap(toMap((JSONObject) value)));
            } else if (value instanceof String) {
                writableMapCreateMap.putString(entry.getKey(), (String) value);
            } else if (value.getClass().isArray()) {
                writableMapCreateMap.putArray(entry.getKey(), ArrayUtils.toWritableArray((Object[]) value));
            }
        }
        return writableMapCreateMap;
    }

    public static WritableMap put(WritableMap writableMap, String str, Object obj) {
        if (obj == null) {
            writableMap.putNull(str);
        } else if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Double) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
        } else if (obj instanceof Map) {
            writableMap.putMap(str, toWritableMap((Map) obj));
        } else if (obj instanceof WritableMap) {
            writableMap.putMap(str, (WritableMap) obj);
        } else if (obj instanceof WritableArray) {
            writableMap.putArray(str, (WritableArray) obj);
        } else if (obj.getClass().isArray()) {
            writableMap.putArray(str, ArrayUtils.toWritableArray((Object[]) obj));
        }
        return writableMap;
    }

    public static JSONObject toJSONObject(ReadableMap readableMap) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            int i = C22441.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(strNextKey).ordinal()];
            if (i == 1) {
                jSONObject.put(strNextKey, readableMap.getBoolean(strNextKey));
            } else if (i == 2) {
                jSONObject.put(strNextKey, readableMap.getDouble(strNextKey));
            } else if (i == 3) {
                jSONObject.put(strNextKey, readableMap.getString(strNextKey));
            } else if (i == 4) {
                jSONObject.put(strNextKey, toJSONObject(readableMap.getMap(strNextKey)));
            } else if (i != 5) {
                jSONObject.put(strNextKey, (Object) null);
            } else {
                jSONObject.put(strNextKey, ArrayUtils.toJSONArray(readableMap.getArray(strNextKey)));
            }
        }
        return jSONObject;
    }

    public static Map<String, Object> toMap(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            try {
                String next = itKeys.next();
                Object array = jSONObject.get(next);
                if (array instanceof JSONObject) {
                    array = toMap((JSONObject) array);
                }
                if (array instanceof JSONArray) {
                    array = ArrayUtils.toArray((JSONArray) array);
                }
                map.put(next, array);
            } catch (JSONException unused) {
            }
        }
        return map;
    }

    public static Map<String, String> toStringMap(ReadableMap readableMap) {
        Map<String, Object> map = toMap(readableMap);
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            map2.put(entry.getKey(), String.valueOf(entry.getValue()));
        }
        return map2;
    }

    public static WritableMap toWritableMap(Map<String, Object> map) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Object> next = it.next();
            Object value = next.getValue();
            if (value == null) {
                writableMapCreateMap.putNull(next.getKey());
            } else if (value instanceof Boolean) {
                writableMapCreateMap.putBoolean(next.getKey(), ((Boolean) value).booleanValue());
            } else if (value instanceof Double) {
                writableMapCreateMap.putDouble(next.getKey(), ((Double) value).doubleValue());
            } else if (value instanceof Integer) {
                writableMapCreateMap.putInt(next.getKey(), ((Integer) value).intValue());
            } else if (value instanceof String) {
                writableMapCreateMap.putString(next.getKey(), (String) value);
            } else if (value instanceof Map) {
                writableMapCreateMap.putMap(next.getKey(), toWritableMap((Map) value));
            } else if (value instanceof JSONObject) {
                writableMapCreateMap.putMap(next.getKey(), toWritableMap(toMap((JSONObject) value)));
            } else if (value.getClass().isArray()) {
                writableMapCreateMap.putArray(next.getKey(), ArrayUtils.toWritableArray((Object[]) value));
            }
            it.remove();
        }
        return writableMapCreateMap;
    }

    public static Map<String, Object> toMap(ReadableMap readableMap) {
        HashMap map = new HashMap();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            int i = C22441.$SwitchMap$com$facebook$react$bridge$ReadableType[readableMap.getType(strNextKey).ordinal()];
            if (i == 1) {
                map.put(strNextKey, Boolean.valueOf(readableMap.getBoolean(strNextKey)));
            } else if (i == 2) {
                map.put(strNextKey, Double.valueOf(readableMap.getDouble(strNextKey)));
            } else if (i == 3) {
                map.put(strNextKey, readableMap.getString(strNextKey));
            } else if (i == 4) {
                map.put(strNextKey, toMap(readableMap.getMap(strNextKey)));
            } else if (i != 5) {
                map.put(strNextKey, null);
            } else {
                map.put(strNextKey, ArrayUtils.toArray(readableMap.getArray(strNextKey)));
            }
        }
        return map;
    }
}
