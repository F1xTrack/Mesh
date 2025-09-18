package com.huawei.hms.rn.push.utils;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ArrayUtils {

    /* renamed from: com.huawei.hms.rn.push.utils.ArrayUtils$1 */
    public static /* synthetic */ class AnonymousClass1 {
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

    private ArrayUtils() {
        throw new IllegalStateException("Utility class");
    }

    public static Object[] toArray(JSONArray jSONArray) throws JSONException {
        Object[] objArr = new Object[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            Object array = jSONArray.get(i);
            if (array instanceof JSONObject) {
                array = MapUtils.toMap((JSONObject) array);
            }
            if (array instanceof JSONArray) {
                array = toArray((JSONArray) array);
            }
            objArr[i] = array;
        }
        return objArr;
    }

    public static JSONArray toJSONArray(ReadableArray readableArray) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < readableArray.size(); i++) {
            int i2 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()];
            if (i2 == 1) {
                jSONArray.put(i, readableArray.getBoolean(i));
            } else if (i2 == 2) {
                jSONArray.put(i, readableArray.getDouble(i));
            } else if (i2 == 3) {
                jSONArray.put(i, readableArray.getString(i));
            } else if (i2 == 4) {
                jSONArray.put(i, MapUtils.toJSONObject(readableArray.getMap(i)));
            } else if (i2 != 5) {
                jSONArray.put(i, (Object) null);
            } else {
                jSONArray.put(i, toJSONArray(readableArray.getArray(i)));
            }
        }
        return jSONArray;
    }

    public static WritableArray toWritableArray(Object[] objArr) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (Object obj : objArr) {
            if (obj == null) {
                writableArrayCreateArray.pushNull();
            }
            if (obj instanceof Boolean) {
                writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
            }
            if (obj instanceof Double) {
                writableArrayCreateArray.pushDouble(((Double) obj).doubleValue());
            }
            if (obj instanceof Integer) {
                writableArrayCreateArray.pushInt(((Integer) obj).intValue());
            }
            if (obj instanceof String) {
                writableArrayCreateArray.pushString((String) obj);
            }
            if (obj instanceof Map) {
                try {
                    writableArrayCreateArray.pushMap(MapUtils.toWritableMap((Map) obj));
                } catch (IllegalStateException | NullPointerException unused) {
                }
            }
            if (obj.getClass().isArray()) {
                writableArrayCreateArray.pushArray(toWritableArray((Object[]) obj));
            }
        }
        return writableArrayCreateArray;
    }

    public static Object[] toArray(ReadableArray readableArray) {
        Object[] objArr = new Object[readableArray.size()];
        for (int i = 0; i < readableArray.size(); i++) {
            int i2 = AnonymousClass1.$SwitchMap$com$facebook$react$bridge$ReadableType[readableArray.getType(i).ordinal()];
            if (i2 == 1) {
                objArr[i] = Boolean.valueOf(readableArray.getBoolean(i));
            } else if (i2 == 2) {
                objArr[i] = Double.valueOf(readableArray.getDouble(i));
            } else if (i2 == 3) {
                objArr[i] = readableArray.getString(i);
            } else if (i2 == 4) {
                objArr[i] = MapUtils.toMap(readableArray.getMap(i));
            } else if (i2 != 5) {
                objArr[i] = null;
            } else {
                objArr[i] = toArray(readableArray.getArray(i));
            }
        }
        return objArr;
    }
}
