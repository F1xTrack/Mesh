package com.facebook.react.bridge;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11153tN0;
import p000.AbstractC7222ym;

/* loaded from: classes.dex */
public class JSONArguments {
    public static ReadableArray fromJSONArray(JSONArray jSONArray) throws JSONException {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                writableArrayCreateArray.pushMap(fromJSONObject((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableArrayCreateArray.pushArray(fromJSONArray((JSONArray) obj));
            } else if (obj instanceof String) {
                writableArrayCreateArray.pushString((String) obj);
            } else if (obj instanceof Boolean) {
                writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableArrayCreateArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                writableArrayCreateArray.pushDouble(((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                writableArrayCreateArray.pushInt(((Long) obj).intValue());
            } else {
                if (!jSONArray.isNull(i)) {
                    throw new JSONException(AbstractC11153tN0.m24909u(i, "Unexpected value when parsing JSON array. index: "));
                }
                writableArrayCreateArray.pushNull();
            }
        }
        return writableArrayCreateArray;
    }

    public static ReadableArray fromJSONArrayString(String str) throws JSONException {
        return fromJSONArray(new JSONArray(str));
    }

    public static ReadableMap fromJSONObject(JSONObject jSONObject) throws JSONException {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                writableMapCreateMap.putMap(next, fromJSONObject((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                writableMapCreateMap.putArray(next, fromJSONArray((JSONArray) obj));
            } else if (obj instanceof String) {
                writableMapCreateMap.putString(next, (String) obj);
            } else if (obj instanceof Boolean) {
                writableMapCreateMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                writableMapCreateMap.putInt(next, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                writableMapCreateMap.putDouble(next, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                writableMapCreateMap.putInt(next, ((Long) obj).intValue());
            } else {
                if (!jSONObject.isNull(next)) {
                    throw new JSONException(AbstractC7222ym.m26245v("Unexpected value when parsing JSON object. key: ", next));
                }
                writableMapCreateMap.putNull(next);
            }
        }
        return writableMapCreateMap;
    }

    public static ReadableMap fromJSONObjectString(String str) throws JSONException {
        return fromJSONObject(new JSONObject(str));
    }
}
