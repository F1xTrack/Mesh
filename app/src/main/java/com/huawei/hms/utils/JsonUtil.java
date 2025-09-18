package com.huawei.hms.utils;

import android.text.TextUtils;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.support.log.common.Base64;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC11153tN0;

/* loaded from: classes2.dex */
public class JsonUtil {
    protected static final int VAL_BYTE = 2;
    protected static final int VAL_ENTITY = 0;
    protected static final int VAL_LIST = 1;
    protected static final int VAL_MAP = 3;
    protected static final int VAL_NULL = -1;
    protected static final String VAL_TYPE = "_val_type_";

    /* renamed from: a */
    private static String m12685a(IMessageEntity iMessageEntity) throws IllegalAccessException, JSONException, IllegalArgumentException {
        JSONObject jSONObject = new JSONObject();
        for (Class<?> superclass = iMessageEntity.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (field.isAnnotationPresent(Packed.class)) {
                    boolean zIsAccessible = field.isAccessible();
                    m12691a(field, true);
                    String name = field.getName();
                    Object obj = field.get(iMessageEntity);
                    m12691a(field, zIsAccessible);
                    m12692a(name, obj, jSONObject);
                }
            }
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    private static Object m12694b(IMessageEntity iMessageEntity, Field field, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        Object objM12684a = m12684a(field.getName(), jSONObject);
        if (objM12684a != null) {
            try {
                if (field.getType().getName().startsWith("com.huawei") && (field.getType().newInstance() instanceof IMessageEntity)) {
                    return jsonToEntity((String) objM12684a, (IMessageEntity) field.getType().newInstance());
                }
                if (!(objM12684a instanceof JSONObject) || !((JSONObject) objM12684a).has(VAL_TYPE)) {
                    return objM12684a;
                }
                int i = ((JSONObject) objM12684a).getInt(VAL_TYPE);
                if (i != 1 && i != 0) {
                    if (i == 2) {
                        return m12693a((JSONObject) objM12684a);
                    }
                    if (i == 3) {
                        return m12695b(field.getGenericType(), (JSONObject) objM12684a);
                    }
                    HMSLog.m12620e("JsonUtil", "cannot support type : " + i);
                }
                return m12686a(field.getGenericType(), (JSONObject) objM12684a);
            } catch (InstantiationException unused) {
                HMSLog.m12620e("JsonUtil", "InstantiationException  ");
            }
        }
        return null;
    }

    @Deprecated
    public static String createJsonString(IMessageEntity iMessageEntity) {
        if (iMessageEntity == null) {
            HMSLog.m12620e("JsonUtil", "createJsonString error, the input IMessageEntity is null");
            return "";
        }
        try {
            return m12685a(iMessageEntity);
        } catch (IllegalAccessException e) {
            HMSLog.m12620e("JsonUtil", "catch IllegalAccessException " + e.getMessage());
            return "";
        } catch (JSONException e2) {
            HMSLog.m12620e("JsonUtil", "catch JSONException " + e2.getMessage());
            return "";
        }
    }

    public static Object getInfoFromJsonobject(String str, String str2) throws JSONException {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (!jSONObject.has(str2)) {
                    return null;
                }
                Object obj = jSONObject.get(str2);
                if (obj instanceof String) {
                    return obj;
                }
            } catch (JSONException unused) {
                HMSLog.m12620e("JsonUtil", "getInfoFromJsonobject:parser json error :" + str2);
            }
        }
        return null;
    }

    public static int getIntValue(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || !jSONObject.has(str)) {
            return -1;
        }
        return jSONObject.getInt(str);
    }

    public static String getStringValue(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null || !jSONObject.has(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }

    @Deprecated
    public static IMessageEntity jsonToEntity(String str, IMessageEntity iMessageEntity) throws IllegalArgumentException {
        Class<? super Object> superclass;
        if (iMessageEntity == null) {
            return null;
        }
        try {
            Class<?> cls = iMessageEntity.getClass();
            JSONObject jSONObject = new JSONObject(str);
            while (cls != null) {
                Field[] declaredFields = cls.getDeclaredFields();
                if (declaredFields == null) {
                    superclass = cls.getSuperclass();
                } else {
                    for (Field field : declaredFields) {
                        if (field.isAnnotationPresent(Packed.class)) {
                            try {
                                m12687a(iMessageEntity, field, jSONObject);
                            } catch (IllegalAccessException unused) {
                                HMSLog.m12620e("JsonUtil", "jsonToEntity, set value of the field exception, field name:" + field.getName());
                            }
                        }
                    }
                    superclass = cls.getSuperclass();
                }
                cls = superclass;
            }
        } catch (JSONException e) {
            HMSLog.m12620e("JsonUtil", "catch JSONException when parse jsonString" + e.getMessage());
        }
        return iMessageEntity;
    }

    /* renamed from: a */
    private static void m12691a(final Field field, final boolean z) {
        AccessController.doPrivileged(new PrivilegedAction() { // from class: com.huawei.hms.utils.JsonUtil.1
            @Override // java.security.PrivilegedAction
            public Object run() throws SecurityException {
                field.setAccessible(z);
                return null;
            }
        });
    }

    /* renamed from: b */
    private static Map m12695b(Type type, JSONObject jSONObject) throws JSONException, IllegalAccessException, InstantiationException, IllegalArgumentException {
        Class cls = (Class) ((ParameterizedType) type).getActualTypeArguments()[1];
        JSONArray jSONArray = new JSONArray(jSONObject.getString("_map_"));
        HashMap map = new HashMap();
        for (int i = 0; i < jSONArray.length(); i += 2) {
            if (cls.newInstance() instanceof IMessageEntity) {
                map.put(jSONArray.get(i), jsonToEntity(jSONArray.getString(i + 1), (IMessageEntity) cls.newInstance()));
            } else {
                map.put(jSONArray.get(i), jSONArray.get(i + 1));
            }
        }
        return map;
    }

    /* renamed from: a */
    private static boolean m12692a(String str, Object obj, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        if (obj instanceof String) {
            jSONObject.put(str, (String) obj);
            return true;
        }
        if (obj instanceof Integer) {
            jSONObject.put(str, ((Integer) obj).intValue());
            return true;
        }
        if (obj instanceof Short) {
            jSONObject.put(str, (Short) obj);
            return true;
        }
        if (obj instanceof Long) {
            jSONObject.put(str, (Long) obj);
            return true;
        }
        if (obj instanceof Float) {
            jSONObject.put(str, (Float) obj);
            return true;
        }
        if (obj instanceof Double) {
            jSONObject.put(str, (Double) obj);
            return true;
        }
        if (obj instanceof Boolean) {
            jSONObject.put(str, (Boolean) obj);
            return true;
        }
        if (obj instanceof JSONObject) {
            jSONObject.put(str, (JSONObject) obj);
            return true;
        }
        if (obj instanceof byte[]) {
            m12690a(str, (byte[]) obj, jSONObject);
            return true;
        }
        if (obj instanceof List) {
            m12688a(str, (List<?>) obj, jSONObject);
            return true;
        }
        if (obj instanceof Map) {
            m12689a(str, (Map) obj, jSONObject);
            return true;
        }
        if (obj instanceof IMessageEntity) {
            try {
                jSONObject.put(str, m12685a((IMessageEntity) obj));
                return true;
            } catch (IllegalAccessException e) {
                HMSLog.m12620e("JsonUtil", "IllegalAccessException , " + e);
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m12689a(String str, Map map, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key instanceof IMessageEntity) {
                jSONArray.put(m12685a((IMessageEntity) key));
            } else {
                jSONArray.put(key);
            }
            if (value instanceof IMessageEntity) {
                jSONArray.put(m12685a((IMessageEntity) value));
            } else {
                jSONArray.put(value);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(VAL_TYPE, 3);
        jSONObject2.put("_map_", jSONArray.toString());
        jSONObject.put(str, jSONObject2);
    }

    /* renamed from: a */
    private static void m12690a(String str, byte[] bArr, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(VAL_TYPE, 2);
        try {
            jSONObject2.put("_byte_", Base64.encode(bArr));
        } catch (IllegalArgumentException e) {
            HMSLog.m12620e("JsonUtil", "writeByte failed : " + e.getMessage());
        }
        jSONObject.put(str, jSONObject2);
    }

    /* renamed from: a */
    private static void m12688a(String str, List<?> list, JSONObject jSONObject) throws JSONException, IllegalAccessException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(VAL_TYPE, 1);
        jSONObject2.put("_list_size_", list.size());
        for (int i = 0; i < list.size(); i++) {
            m12692a(AbstractC11153tN0.m24909u(i, "_list_item_"), list.get(i), jSONObject2);
            if (list.get(i) instanceof IMessageEntity) {
                jSONObject2.put(VAL_TYPE, 0);
            }
        }
        jSONObject.put(str, jSONObject2);
    }

    /* renamed from: a */
    private static void m12687a(IMessageEntity iMessageEntity, Field field, JSONObject jSONObject) throws JSONException, IllegalAccessException, IllegalArgumentException {
        Object objM12694b = m12694b(iMessageEntity, field, jSONObject);
        if (objM12694b != null) {
            boolean zIsAccessible = field.isAccessible();
            m12691a(field, true);
            field.set(iMessageEntity, objM12694b);
            m12691a(field, zIsAccessible);
        }
    }

    /* renamed from: a */
    private static Object m12684a(String str, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has(str)) {
            return jSONObject.get(str);
        }
        if (jSONObject.has("header") && jSONObject.getJSONObject("header").has(str)) {
            return jSONObject.getJSONObject("header").get(str);
        }
        if (jSONObject.has("body") && jSONObject.getJSONObject("body").has(str)) {
            return jSONObject.getJSONObject("body").get(str);
        }
        return null;
    }

    /* renamed from: a */
    private static List<Object> m12686a(Type type, JSONObject jSONObject) throws JSONException, IllegalAccessException, InstantiationException {
        int i = jSONObject.getInt("_list_size_");
        int i2 = jSONObject.getInt(VAL_TYPE);
        ArrayList arrayList = new ArrayList(i);
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = jSONObject.get("_list_item_" + i3);
            if (i2 == 0) {
                arrayList.add(jsonToEntity((String) obj, (IMessageEntity) ((Class) ((ParameterizedType) type).getActualTypeArguments()[0]).newInstance()));
            } else if (i2 == 1) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static byte[] m12693a(JSONObject jSONObject) throws JSONException {
        try {
            return Base64.decode(jSONObject.getString("_byte_"));
        } catch (IllegalArgumentException e) {
            HMSLog.m12620e("JsonUtil", "readByte failed : " + e.getMessage());
            return null;
        }
    }
}
