package io.sentry.react;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import io.sentry.EnumC6069n1;
import io.sentry.android.core.C5847T;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.react.a */
/* loaded from: classes2.dex */
public abstract class AbstractC6117a {

    /* renamed from: a */
    public static final C5847T f34513a = new C5847T();

    /* renamed from: a */
    public static Object m21854a(Object obj) {
        boolean z = obj instanceof List;
        C5847T c5847t = f34513a;
        if (z) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                Object objM21854a = m21854a(it.next());
                if (objM21854a == null) {
                    writableArrayCreateArray.pushNull();
                } else if (objM21854a instanceof Boolean) {
                    writableArrayCreateArray.pushBoolean(((Boolean) objM21854a).booleanValue());
                } else if (objM21854a instanceof Double) {
                    writableArrayCreateArray.pushDouble(((Double) objM21854a).doubleValue());
                } else if (objM21854a instanceof Float) {
                    writableArrayCreateArray.pushDouble(((Float) objM21854a).doubleValue());
                } else if (objM21854a instanceof Integer) {
                    writableArrayCreateArray.pushInt(((Integer) objM21854a).intValue());
                } else if (objM21854a instanceof Short) {
                    writableArrayCreateArray.pushInt(((Short) objM21854a).intValue());
                } else if (objM21854a instanceof Byte) {
                    writableArrayCreateArray.pushInt(((Byte) objM21854a).intValue());
                } else if (objM21854a instanceof Long) {
                    writableArrayCreateArray.pushDouble(((Long) objM21854a).doubleValue());
                } else if (objM21854a instanceof BigInteger) {
                    writableArrayCreateArray.pushDouble(((BigInteger) objM21854a).doubleValue());
                } else if (objM21854a instanceof BigDecimal) {
                    writableArrayCreateArray.pushDouble(((BigDecimal) objM21854a).doubleValue());
                } else if (objM21854a instanceof String) {
                    writableArrayCreateArray.pushString((String) objM21854a);
                } else if (objM21854a instanceof ReadableMap) {
                    writableArrayCreateArray.pushMap((ReadableMap) objM21854a);
                } else if (objM21854a instanceof ReadableArray) {
                    writableArrayCreateArray.pushArray((ReadableArray) objM21854a);
                } else {
                    c5847t.mo21407k(EnumC6069n1.ERROR, "Could not convert object: " + objM21854a, new Object[0]);
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
            c5847t.mo21407k(EnumC6069n1.ERROR, "Supplied serialized value could not be converted." + obj, new Object[0]);
            return null;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof String) {
                String str = (String) key;
                Object objM21854a2 = m21854a(value);
                if (objM21854a2 == null) {
                    writableMapCreateMap.putNull(str);
                } else if (objM21854a2 instanceof Boolean) {
                    writableMapCreateMap.putBoolean(str, ((Boolean) objM21854a2).booleanValue());
                } else if (objM21854a2 instanceof Double) {
                    writableMapCreateMap.putDouble(str, ((Double) objM21854a2).doubleValue());
                } else if (objM21854a2 instanceof Float) {
                    writableMapCreateMap.putDouble(str, ((Float) objM21854a2).doubleValue());
                } else if (objM21854a2 instanceof Integer) {
                    writableMapCreateMap.putInt(str, ((Integer) objM21854a2).intValue());
                } else if (objM21854a2 instanceof Short) {
                    writableMapCreateMap.putInt(str, ((Short) objM21854a2).intValue());
                } else if (objM21854a2 instanceof Byte) {
                    writableMapCreateMap.putInt(str, ((Byte) objM21854a2).intValue());
                } else if (objM21854a2 instanceof Long) {
                    writableMapCreateMap.putDouble(str, ((Long) objM21854a2).doubleValue());
                } else if (objM21854a2 instanceof BigInteger) {
                    writableMapCreateMap.putDouble(str, ((BigInteger) objM21854a2).doubleValue());
                } else if (objM21854a2 instanceof BigDecimal) {
                    writableMapCreateMap.putDouble(str, ((BigDecimal) objM21854a2).doubleValue());
                } else if (objM21854a2 instanceof String) {
                    writableMapCreateMap.putString(str, (String) objM21854a2);
                } else if (objM21854a2 instanceof ReadableArray) {
                    writableMapCreateMap.putArray(str, (ReadableArray) objM21854a2);
                } else if (objM21854a2 instanceof ReadableMap) {
                    writableMapCreateMap.putMap(str, (ReadableMap) objM21854a2);
                } else {
                    c5847t.mo21407k(EnumC6069n1.ERROR, "Could not convert object" + objM21854a2, new Object[0]);
                }
            } else {
                c5847t.mo21407k(EnumC6069n1.ERROR, "Only String keys are supported in Map.", key);
            }
        }
        return writableMapCreateMap;
    }
}
