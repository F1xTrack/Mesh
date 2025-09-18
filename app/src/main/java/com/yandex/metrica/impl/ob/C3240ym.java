package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.hms.framework.common.ContainerUtils;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.yandex.metrica.impl.ob.C2737em;
import com.yandex.metrica.impl.ob.C2880kg;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ym */
/* loaded from: classes2.dex */
public class C3240ym {

    /* renamed from: com.yandex.metrica.impl.ob.ym$a */
    public static class a extends JSONObject {
        public a() {
        }

        public Long a(String str) {
            try {
                return Long.valueOf(getLong(str));
            } catch (Throwable unused) {
                return null;
            }
        }

        public String b(String str) {
            if (!has(str) || !has(str)) {
                return "";
            }
            try {
                return getString(str);
            } catch (Throwable unused) {
                return "";
            }
        }

        public String c(String str) {
            if (has(str)) {
                try {
                    return getString(str);
                } catch (Throwable unused) {
                }
            }
            return "";
        }

        public boolean d(String str) {
            try {
                return JSONObject.NULL != get(str);
            } catch (Throwable unused) {
                return false;
            }
        }

        public a(String str) throws JSONException {
            super(str);
        }
    }

    public static <T> T a(T t, T t2) {
        return t == null ? t2 : t;
    }

    public static byte[] b(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(str.getBytes("UTF-8"));
        return messageDigest.digest();
    }

    public static String c(Map<String, String> map) {
        if (U2.b(map)) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            sb.append(entry.getKey());
            sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            sb.append(entry.getValue());
            sb.append(StringUtils.COMMA);
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static boolean d(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            try {
                Integer.parseInt(it.next().getValue());
            } catch (Throwable unused) {
                return false;
            }
        }
        return true;
    }

    public static JSONObject e(Map map) {
        if (U2.b(map)) {
            return null;
        }
        return U2.a(19) ? new JSONObject(map) : h(map);
    }

    public static JSONObject f(Map map) {
        if (map == null) {
            return null;
        }
        return map.isEmpty() ? new JSONObject() : e(map);
    }

    public static String g(Map map) {
        if (U2.b(map)) {
            return null;
        }
        return U2.a(19) ? new JSONObject(map).toString() : a((Object) map).toString();
    }

    private static JSONObject h(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String string = entry.getKey().toString();
            if (string != null) {
                linkedHashMap.put(string, a(entry.getValue()));
            }
        }
        return new JSONObject(linkedHashMap);
    }

    public static Map<String, String> i(Map<String, String> map) throws NumberFormatException {
        long j;
        HashMap map2 = new HashMap();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key) && !key.contains(StringUtils.PROCESS_POSTFIX_DELIMITER) && !key.contains(StringUtils.COMMA) && !key.contains(ContainerUtils.FIELD_DELIMITER)) {
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(value)) {
                        try {
                            j = Long.parseLong(value);
                        } catch (NumberFormatException unused) {
                            j = -1;
                        }
                        if (j != -1) {
                            map2.put(entry.getKey(), entry.getValue());
                        }
                    }
                }
            }
        }
        return map2;
    }

    public static String a(Context context, String str) throws UnsupportedEncodingException {
        byte[] bArrA = a(context, Base64.decode(str.getBytes("UTF-8"), 0));
        if (bArrA == null) {
            return null;
        }
        try {
            return new String(V0.a(new String(bArrA, "UTF-8")), "UTF-8");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static HashMap<String, String> d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return b(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static C3170w2 f(String str) {
        com.yandex.metrica.q qVar;
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt(Snapshot.WIDTH);
                int iOptInt2 = jSONObject.optInt(Snapshot.HEIGHT);
                int iOptInt3 = jSONObject.optInt("dpi");
                float fOptDouble = (float) jSONObject.optDouble("scaleFactor", ConfigValue.DOUBLE_DEFAULT_VALUE);
                String strOptString = jSONObject.optString("deviceType");
                com.yandex.metrica.q[] qVarArrValues = com.yandex.metrica.q.values();
                int i = 0;
                while (true) {
                    if (i >= 3) {
                        qVar = null;
                        break;
                    }
                    com.yandex.metrica.q qVar2 = qVarArrValues[i];
                    if (qVar2.a.equals(strOptString)) {
                        qVar = qVar2;
                        break;
                    }
                    i++;
                }
                return new C3170w2(iOptInt, iOptInt2, iOptInt3, fOptDouble, qVar);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static String b(Context context, String str) throws UnsupportedEncodingException {
        String strA;
        try {
            strA = V0.a(str.getBytes("UTF-8"));
        } catch (Throwable unused) {
            strA = null;
        }
        return Base64.encodeToString(a(context, strA.getBytes("UTF-8")), 0);
    }

    public static HashMap<String, String> e(String str) throws JSONException {
        return b(new JSONObject(str));
    }

    public static Long d(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Long.valueOf(jSONObject.getLong(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static String e(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getString(str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Map<String, String> a(String str) {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : str.split(StringUtils.COMMA)) {
                int iIndexOf = str2.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER);
                if (iIndexOf != -1) {
                    map.put(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1));
                }
            }
        }
        return map;
    }

    public static String c(List<String> list) {
        if (U2.b(list)) {
            return null;
        }
        if (U2.a(19)) {
            return new JSONArray((Collection) list).toString();
        }
        return a((Object) list).toString();
    }

    private static JSONArray b(Collection<?> collection) {
        if (collection == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return new JSONArray((Collection) arrayList);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static List<String> c(String str) {
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

    public static JSONArray b(List<?> list) {
        if (U2.b(list)) {
            return null;
        }
        if (U2.a(19)) {
            return new JSONArray((Collection) list);
        }
        return b((Collection<?>) list);
    }

    public static long a(Long l, TimeUnit timeUnit, long j) {
        return l == null ? j : timeUnit.toMillis(l.longValue());
    }

    private static byte[] a(Context context, byte[] bArr) {
        try {
            byte[] bArrB = b(context.getPackageName());
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[i] = (byte) (bArr[i] ^ bArrB[i % bArrB.length]);
            }
            return bArr2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static HashMap<String, String> b(JSONObject jSONObject) {
        if (JSONObject.NULL.equals(jSONObject)) {
            return null;
        }
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null) {
                map.put(next, strOptString);
            }
        }
        return map;
    }

    public static Integer c(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    arrayList.add(a(Array.get(obj, i)));
                }
                return new JSONArray((Collection) arrayList);
            }
            if (obj instanceof Collection) {
                return b((Collection<?>) obj);
            }
            return obj instanceof Map ? h((Map) obj) : obj;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Il c(JSONObject jSONObject) throws JSONException {
        C2662bm c2662bm;
        C2880kg.i iVar = new C2880kg.i();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("upc");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("uecc");
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("ucfbc");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ruecc");
        boolean zOptBoolean = jSONObject.optBoolean("upe", iVar.q);
        boolean zOptBoolean2 = jSONObject.optBoolean("uece", iVar.r);
        boolean zOptBoolean3 = jSONObject.optBoolean("ucfbe", iVar.s);
        boolean zOptBoolean4 = jSONObject.optBoolean("ruece", iVar.w);
        if (jSONObjectOptJSONObject == null) {
            c2662bm = null;
        } else {
            C2880kg.v vVar = new C2880kg.v();
            c2662bm = new C2662bm(jSONObjectOptJSONObject.optInt("tltb", vVar.b), jSONObjectOptJSONObject.optInt("ttb", vVar.c), jSONObjectOptJSONObject.optInt("mvcl", vVar.d), jSONObjectOptJSONObject.optLong("act", vVar.e), jSONObjectOptJSONObject.optBoolean("rtsc", vVar.f), jSONObjectOptJSONObject.optBoolean("er", vVar.g), jSONObjectOptJSONObject.optBoolean("pabd", vVar.h), a(jSONObjectOptJSONObject.optJSONArray("f")));
        }
        return new Il(zOptBoolean, zOptBoolean2, zOptBoolean3, zOptBoolean4, c2662bm, jSONObjectOptJSONObject2 == null ? null : a(jSONObjectOptJSONObject2, C3168w0.b()), jSONObjectOptJSONObject3 == null ? null : a(jSONObjectOptJSONObject3, C3168w0.a()), jSONObjectOptJSONObject4 != null ? a(jSONObjectOptJSONObject4, C3168w0.b()) : null);
    }

    public static Boolean b(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Boolean.valueOf(jSONObject.getBoolean(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static List<String> b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    public static String a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return map.isEmpty() ? "" : g(map);
    }

    public static boolean a(JSONObject jSONObject, String str, boolean z) {
        Boolean boolB = b(jSONObject, str);
        return boolB == null ? z : boolB.booleanValue();
    }

    public static String b(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                JSONArray jSONArrayB = b((List<?>) entry.getValue());
                if (jSONArrayB != null) {
                    jSONObject.put(entry.getKey(), jSONArrayB.toString());
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public static JSONArray a(Collection<Vj> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            Iterator<Vj> it = collection.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(a(it.next()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    public static JSONObject a(Vj vj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cell_id", vj.b());
        jSONObject.put("signal_strength", vj.p());
        jSONObject.put("lac", vj.e());
        jSONObject.put("country_code", vj.k());
        jSONObject.put("operator_id", vj.l());
        jSONObject.put("operator_name", vj.n());
        jSONObject.put("is_connected", vj.q());
        jSONObject.put("cell_type", vj.c());
        jSONObject.put("pci", vj.o());
        jSONObject.put("last_visible_time_offset", vj.d());
        jSONObject.put("lte_rsrq", vj.h());
        jSONObject.put("lte_rssnr", vj.j());
        jSONObject.put("arfcn", vj.a());
        jSONObject.put("lte_rssi", vj.i());
        jSONObject.put("lte_bandwidth", vj.f());
        jSONObject.put("lte_cqi", vj.g());
        return jSONObject;
    }

    public static JSONObject a(Il il) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("upe", il.a).put("uece", il.b).put("ruece", il.d).put("ucfbe", il.c);
        C2662bm c2662bm = il.e;
        JSONObject jSONObjectPutOpt = jSONObjectPut.putOpt("upc", c2662bm == null ? null : new JSONObject().put("tltb", c2662bm.a).put("ttb", c2662bm.b).put("mvcl", c2662bm.c).put("act", c2662bm.d).put("rtsc", c2662bm.e).put("er", c2662bm.f).put("pabd", c2662bm.g).put("f", a(c2662bm.h)));
        Kl kl = il.f;
        JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("uecc", kl == null ? null : a(kl));
        Kl kl2 = il.h;
        JSONObject jSONObjectPutOpt3 = jSONObjectPutOpt2.putOpt("ruecc", kl2 == null ? null : a(kl2));
        Kl kl3 = il.g;
        return jSONObjectPutOpt3.putOpt("ucfbc", kl3 != null ? a(kl3) : null);
    }

    private static JSONObject a(Kl kl) throws JSONException {
        return new JSONObject().put("tsc", kl.a).put("rtsc1", kl.b).put("tvc", kl.c).put("tsc1", kl.d).put("ic", kl.e).put("ncvc", kl.f).put("tlc", kl.g).put("vh", kl.h).put("if", kl.i).put("wvuc", kl.j).put("tltb", kl.k).put("ttb", kl.l).put("mec", kl.m).put("mfcl", kl.n).put("wvul", kl.o).put("f", a(kl.p));
    }

    private static Kl a(JSONObject jSONObject, C2880kg.u uVar) {
        return new Kl(jSONObject.optBoolean("tsc", uVar.b), jSONObject.optBoolean("rtsc1", uVar.c), jSONObject.optBoolean("tvc", uVar.d), jSONObject.optBoolean("tsc1", uVar.e), jSONObject.optBoolean("ic", uVar.j), jSONObject.optBoolean("ncvc", uVar.k), jSONObject.optBoolean("tlc", uVar.l), jSONObject.optBoolean("vh", uVar.m), jSONObject.optBoolean("if", uVar.o), jSONObject.optBoolean("wvuc", uVar.p), jSONObject.optInt("tltb", uVar.f), jSONObject.optInt("ttb", uVar.g), jSONObject.optInt("mec", uVar.h), jSONObject.optInt("mfcl", uVar.i), jSONObject.optInt("wvul", uVar.q), a(jSONObject.optJSONArray("f")));
    }

    private static JSONArray a(List<C2737em> list) {
        JSONArray jSONArray = new JSONArray();
        for (C2737em c2737em : list) {
            try {
                jSONArray.put(new JSONObject().put("ft", c2737em.a.a).put("fv", c2737em.b));
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    private static List<C2737em> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new C2737em(C2737em.b.a(jSONObject.getInt("ft")), jSONObject.optString("fv")));
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    public static Xa a(JSONObject jSONObject) {
        return new Xa(a(jSONObject, "activation"), a(jSONObject, "satellite_clids"), a(jSONObject, "preload_info"));
    }

    public static JSONObject a(Xa xa) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("activation", a(xa.a));
            jSONObject.putOpt("preload_info", a(xa.c));
            jSONObject.putOpt("satellite_clids", a(xa.b));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private static Wa a(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return new Wa(jSONObjectOptJSONObject.optLong("exp_t"), jSONObjectOptJSONObject.optInt("interval"));
        }
        return null;
    }

    private static JSONObject a(Wa wa) {
        if (wa == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exp_t", wa.a).put("interval", wa.b);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static String a(C3170w2 c3170w2) {
        JSONObject jSONObject;
        if (c3170w2 == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(Snapshot.WIDTH, c3170w2.e()).put(Snapshot.HEIGHT, c3170w2.c()).put("dpi", c3170w2.b()).put("scaleFactor", c3170w2.d()).putOpt("deviceType", c3170w2.a() == null ? null : c3170w2.a().a);
            } catch (Throwable unused) {
            }
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }
}
