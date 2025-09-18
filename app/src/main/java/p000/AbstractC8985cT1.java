package p000;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Iterator;
import kotlin.KotlinVersion;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cT1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8985cT1 {
    /* renamed from: a */
    public static String m10704a(String str, String str2) {
        return new File(str, str2).getAbsolutePath();
    }

    /* renamed from: b */
    public static WritableArray m10705b(JSONArray jSONArray) throws JSONException {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    writableArrayCreateArray.pushMap(m10706c((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableArrayCreateArray.pushArray(m10705b((JSONArray) obj));
                } else if (obj instanceof String) {
                    writableArrayCreateArray.pushString((String) obj);
                } else if (obj instanceof Double) {
                    writableArrayCreateArray.pushDouble(((Double) obj).doubleValue());
                } else if (obj instanceof Integer) {
                    writableArrayCreateArray.pushInt(((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    writableArrayCreateArray.pushBoolean(((Boolean) obj).booleanValue());
                } else {
                    if (obj != null) {
                        throw new C3894cu("Unrecognized object: " + obj);
                    }
                    writableArrayCreateArray.pushNull();
                }
            } catch (JSONException e) {
                throw new C3894cu(i + " should be within bounds of array " + jSONArray.toString(), e);
            }
        }
        return writableArrayCreateArray;
    }

    /* renamed from: c */
    public static WritableMap m10706c(JSONObject jSONObject) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = !jSONObject.isNull(next) ? jSONObject.get(next) : null;
                if (obj instanceof JSONObject) {
                    writableMapCreateMap.putMap(next, m10706c((JSONObject) obj));
                } else if (obj instanceof JSONArray) {
                    writableMapCreateMap.putArray(next, m10705b((JSONArray) obj));
                } else if (obj instanceof String) {
                    writableMapCreateMap.putString(next, (String) obj);
                } else if (obj instanceof Double) {
                    writableMapCreateMap.putDouble(next, ((Double) obj).doubleValue());
                } else if (obj instanceof Long) {
                    writableMapCreateMap.putDouble(next, ((Long) obj).doubleValue());
                } else if (obj instanceof Integer) {
                    writableMapCreateMap.putInt(next, ((Integer) obj).intValue());
                } else if (obj instanceof Boolean) {
                    writableMapCreateMap.putBoolean(next, ((Boolean) obj).booleanValue());
                } else {
                    if (obj != null) {
                        throw new C3894cu("Unrecognized object: " + obj);
                    }
                    writableMapCreateMap.putNull(next);
                }
            } catch (JSONException e) {
                StringBuilder sbM26240q = AbstractC7222ym.m26240q("Key ", next, " should exist in ");
                sbM26240q.append(jSONObject.toString());
                sbM26240q.append(".");
                throw new C3894cu(sbM26240q.toString(), e);
            }
        }
        return writableMapCreateMap;
    }

    /* renamed from: d */
    public static JSONArray m10707d(ReadableArray readableArray) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < readableArray.size(); i++) {
            switch (AbstractC4082fu.f27447a[readableArray.getType(i).ordinal()]) {
                case 1:
                    jSONArray.put(m10708e(readableArray.getMap(i)));
                    break;
                case 2:
                    jSONArray.put(m10707d(readableArray.getArray(i)));
                    break;
                case 3:
                    jSONArray.put(readableArray.getString(i));
                    break;
                case 4:
                    double d = readableArray.getDouble(i);
                    Double dValueOf = Double.valueOf(d);
                    if (d == Math.floor(d) && !Double.isInfinite(d)) {
                        jSONArray.put(dValueOf.longValue());
                        break;
                    } else {
                        try {
                            jSONArray.put(d);
                            break;
                        } catch (JSONException unused) {
                            throw new C3894cu("Unable to put value " + readableArray.getDouble(i) + " in JSONArray");
                        }
                    }
                    break;
                case 5:
                    jSONArray.put(readableArray.getBoolean(i));
                    break;
                case 6:
                    jSONArray.put((Object) null);
                    break;
            }
        }
        return jSONArray;
    }

    /* renamed from: e */
    public static JSONObject m10708e(ReadableMap readableMap) {
        JSONObject jSONObject = new JSONObject();
        ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = readableMap.keySetIterator();
        while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
            String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
            ReadableType type = readableMap.getType(strNextKey);
            try {
                switch (AbstractC4082fu.f27447a[type.ordinal()]) {
                    case 1:
                        jSONObject.put(strNextKey, m10708e(readableMap.getMap(strNextKey)));
                        continue;
                    case 2:
                        jSONObject.put(strNextKey, m10707d(readableMap.getArray(strNextKey)));
                        continue;
                    case 3:
                        jSONObject.put(strNextKey, readableMap.getString(strNextKey));
                        continue;
                    case 4:
                        jSONObject.put(strNextKey, readableMap.getDouble(strNextKey));
                        continue;
                    case 5:
                        jSONObject.put(strNextKey, readableMap.getBoolean(strNextKey));
                        continue;
                    case 6:
                        jSONObject.put(strNextKey, (Object) null);
                        continue;
                    default:
                        throw new C3894cu("Unrecognized type: " + type + " of key: " + strNextKey);
                }
            } catch (JSONException e) {
                throw new C3894cu(AbstractC7222ym.m26234k("Error setting key: ", strNextKey, " in JSONObject"), e);
            }
            throw new C3894cu(AbstractC7222ym.m26234k("Error setting key: ", strNextKey, " in JSONObject"), e);
        }
        return jSONObject;
    }

    /* renamed from: f */
    public static JSONObject m10709f(String str) {
        try {
            return new JSONObject(Z02.m9452d(str));
        } catch (JSONException e) {
            throw new C1188St(str, e);
        }
    }

    /* renamed from: g */
    public static String m10710g(InputStream inputStream) {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            StringBuilder sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                    sb.append("\n");
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if (inputStream == null) {
                        throw th;
                    }
                    inputStream.close();
                    throw th;
                }
            }
            String strTrim = sb.toString().trim();
            bufferedReader.close();
            if (inputStream != null) {
                inputStream.close();
            }
            return strTrim;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }

    /* renamed from: h */
    public static final int m10711h(InputStream inputStream, int i, boolean z) {
        int i2;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw new IOException("no more bytes");
            }
            if (z) {
                i2 = (i5 & KotlinVersion.MAX_COMPONENT_VALUE) << (i4 * 8);
            } else {
                i3 <<= 8;
                i2 = i5 & KotlinVersion.MAX_COMPONENT_VALUE;
            }
            i3 |= i2;
        }
        return i3;
    }

    /* renamed from: i */
    public static void m10712i(String str, Object obj, JSONObject jSONObject) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
            throw new C3894cu("Unable to set value " + obj + " for key " + str + " to JSONObject");
        }
    }

    /* renamed from: j */
    public static void m10713j(JSONObject jSONObject, String str) throws Throwable {
        PrintWriter printWriter;
        String string = jSONObject.toString();
        PrintWriter printWriter2 = null;
        try {
            printWriter = new PrintWriter(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            printWriter.print(string);
            printWriter.close();
        } catch (Throwable th2) {
            th = th2;
            printWriter2 = printWriter;
            if (printWriter2 != null) {
                printWriter2.close();
            }
            throw th;
        }
    }
}
