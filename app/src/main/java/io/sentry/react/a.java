package io.sentry.react;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import io.sentry.EnumC5148n1;
import io.sentry.android.core.T;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class a {
    public static final T a = new T();

    public static Object a(Object obj) {
        boolean z = obj instanceof List;
        T t = a;
        if (z) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                Object objA = a(it.next());
                if (objA == null) {
                    writableArrayCreateArray.pushNull();
                } else if (objA instanceof Boolean) {
                    writableArrayCreateArray.pushBoolean(((Boolean) objA).booleanValue());
                } else if (objA instanceof Double) {
                    writableArrayCreateArray.pushDouble(((Double) objA).doubleValue());
                } else if (objA instanceof Float) {
                    writableArrayCreateArray.pushDouble(((Float) objA).doubleValue());
                } else if (objA instanceof Integer) {
                    writableArrayCreateArray.pushInt(((Integer) objA).intValue());
                } else if (objA instanceof Short) {
                    writableArrayCreateArray.pushInt(((Short) objA).intValue());
                } else if (objA instanceof Byte) {
                    writableArrayCreateArray.pushInt(((Byte) objA).intValue());
                } else if (objA instanceof Long) {
                    writableArrayCreateArray.pushDouble(((Long) objA).doubleValue());
                } else if (objA instanceof BigInteger) {
                    writableArrayCreateArray.pushDouble(((BigInteger) objA).doubleValue());
                } else if (objA instanceof BigDecimal) {
                    writableArrayCreateArray.pushDouble(((BigDecimal) objA).doubleValue());
                } else if (objA instanceof String) {
                    writableArrayCreateArray.pushString((String) objA);
                } else if (objA instanceof ReadableMap) {
                    writableArrayCreateArray.pushMap((ReadableMap) objA);
                } else if (objA instanceof ReadableArray) {
                    writableArrayCreateArray.pushArray((ReadableArray) objA);
                } else {
                    t.k(EnumC5148n1.ERROR, "Could not convert object: " + objA, new Object[0]);
                }
            }
            return writableArrayCreateArray;
        }
        if (!(obj instanceof Map)) {
            if (obj instanceof Byte) {
                return Integer.valueOf(((Byte) obj).byteValue());
            }
            if (obj instanceof Short) {
                return Integer.valueOf(((Short) obj).shortValue());
            }
            if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).floatValue());
            }
            if (obj instanceof Long) {
                return Double.valueOf(((Long) obj).longValue());
            }
            if (obj instanceof BigInteger) {
                return Double.valueOf(((BigInteger) obj).doubleValue());
            }
            if (obj instanceof BigDecimal) {
                return Double.valueOf(((BigDecimal) obj).doubleValue());
            }
            if ((obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Boolean) || obj == null || (obj instanceof String)) {
                return obj;
            }
            t.k(EnumC5148n1.ERROR, "Supplied serialized value could not be converted." + obj, new Object[0]);
            return null;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
                String str = (String) key;
                Object objA2 = a(value);
                if (objA2 == null) {
                    writableMapCreateMap.putNull(str);
                } else if (objA2 instanceof Boolean) {
                    writableMapCreateMap.putBoolean(str, ((Boolean) objA2).booleanValue());
                } else if (objA2 instanceof Double) {
                    writableMapCreateMap.putDouble(str, ((Double) objA2).doubleValue());
                } else if (objA2 instanceof Float) {
                    writableMapCreateMap.putDouble(str, ((Float) objA2).doubleValue());
                } else if (objA2 instanceof Integer) {
                    writableMapCreateMap.putInt(str, ((Integer) objA2).intValue());
                } else if (objA2 instanceof Short) {
                    writableMapCreateMap.putInt(str, ((Short) objA2).intValue());
                } else if (objA2 instanceof Byte) {
                    writableMapCreateMap.putInt(str, ((Byte) objA2).intValue());
                } else if (objA2 instanceof Long) {
                    writableMapCreateMap.putDouble(str, ((Long) objA2).doubleValue());
                } else if (objA2 instanceof BigInteger) {
                    writableMapCreateMap.putDouble(str, ((BigInteger) objA2).doubleValue());
                } else if (objA2 instanceof BigDecimal) {
                    writableMapCreateMap.putDouble(str, ((BigDecimal) objA2).doubleValue());
                } else if (objA2 instanceof String) {
                    writableMapCreateMap.putString(str, (String) objA2);
                } else if (objA2 instanceof ReadableArray) {
                    writableMapCreateMap.putArray(str, (ReadableArray) objA2);
                } else if (objA2 instanceof ReadableMap) {
                    writableMapCreateMap.putMap(str, (ReadableMap) objA2);
                } else {
                    t.k(EnumC5148n1.ERROR, "Could not convert object" + objA2, new Object[0]);
                }
            } else {
                t.k(EnumC5148n1.ERROR, "Only String keys are supported in Map.", key);
            }
        }
        return writableMapCreateMap;
    }
}
