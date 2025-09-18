package com.yandex.metrica.impl.p022ob;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import com.yandex.metrica.EnumC3798q;
import com.yandex.metrica.impl.p022ob.C3242em;
import com.yandex.metrica.impl.p022ob.C3392kg;
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
public class C3762ym {

    /* renamed from: com.yandex.metrica.impl.ob.ym$a */
    public static class a extends JSONObject {
        public a() {
        }

        /* renamed from: a */
        public Long m17308a(String str) {
            try {
                return Long.valueOf(getLong(str));
            } catch (Throwable unused) {
                return null;
            }
        }

        /* renamed from: b */
        public String m17309b(String str) {
            if (!has(str) || !has(str)) {
                return "";
            }
            try {
                return getString(str);
            } catch (Throwable unused) {
                return "";
            }
        }

        /* renamed from: c */
        public String m17310c(String str) {
            if (has(str)) {
                try {
                    return getString(str);
                } catch (Throwable unused) {
                }
            }
            return "";
        }

        /* renamed from: d */
        public boolean m17311d(String str) {
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

    /* renamed from: a */
    public static <T> T m17269a(T t, T t2) {
        return t == null ? t2 : t;
    }

    /* renamed from: b */
    public static byte[] m17291b(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(str.getBytes("UTF-8"));
        return messageDigest.digest();
    }

    /* renamed from: c */
    public static String m17295c(Map<String, String> map) {
        if (C2968U2.m15250b(map)) {
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

    /* renamed from: d */
    public static boolean m17299d(Map<String, String> map) {
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

    /* renamed from: e */
    public static JSONObject m17302e(Map map) {
        if (C2968U2.m15250b(map)) {
            return null;
        }
        return C2968U2.m15243a(19) ? new JSONObject(map) : m17306h(map);
    }

    /* renamed from: f */
    public static JSONObject m17304f(Map map) {
        if (map == null) {
            return null;
        }
        return map.isEmpty() ? new JSONObject() : m17302e(map);
    }

    /* renamed from: g */
    public static String m17305g(Map map) {
        if (C2968U2.m15250b(map)) {
            return null;
        }
        return C2968U2.m15243a(19) ? new JSONObject(map).toString() : m17268a((Object) map).toString();
    }

    /* renamed from: h */
    private static JSONObject m17306h(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String string = entry.getKey().toString();
            if (string != null) {
                linkedHashMap.put(string, m17268a(entry.getValue()));
            }
        }
        return new JSONObject(linkedHashMap);
    }

    /* renamed from: i */
    public static Map<String, String> m17307i(Map<String, String> map) throws NumberFormatException {
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

    /* renamed from: a */
    public static String m17270a(Context context, String str) throws UnsupportedEncodingException {
        byte[] bArrM17283a = m17283a(context, Base64.decode(str.getBytes("UTF-8"), 0));
        if (bArrM17283a == null) {
            return null;
        }
        try {
            return new String(C2991V0.m15298a(new String(bArrM17283a, "UTF-8")), "UTF-8");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static HashMap<String, String> m17298d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m17287b(new JSONObject(str));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static C3690w2 m17303f(String str) {
        EnumC3798q enumC3798q;
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                int iOptInt = jSONObject.optInt(Snapshot.WIDTH);
                int iOptInt2 = jSONObject.optInt(Snapshot.HEIGHT);
                int iOptInt3 = jSONObject.optInt("dpi");
                float fOptDouble = (float) jSONObject.optDouble("scaleFactor", ConfigValue.DOUBLE_DEFAULT_VALUE);
                String strOptString = jSONObject.optString("deviceType");
                EnumC3798q[] enumC3798qArrValues = EnumC3798q.values();
                int i = 0;
                while (true) {
                    if (i >= 3) {
                        enumC3798q = null;
                        break;
                    }
                    EnumC3798q enumC3798q2 = enumC3798qArrValues[i];
                    if (enumC3798q2.f25518a.equals(strOptString)) {
                        enumC3798q = enumC3798q2;
                        break;
                    }
                    i++;
                }
                return new C3690w2(iOptInt, iOptInt2, iOptInt3, fOptDouble, enumC3798q);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: b */
    public static String m17285b(Context context, String str) throws UnsupportedEncodingException {
        String strM15293a;
        try {
            strM15293a = C2991V0.m15293a(str.getBytes("UTF-8"));
        } catch (Throwable unused) {
            strM15293a = null;
        }
        return Base64.encodeToString(m17283a(context, strM15293a.getBytes("UTF-8")), 0);
    }

    /* renamed from: e */
    public static HashMap<String, String> m17301e(String str) throws JSONException {
        return m17287b(new JSONObject(str));
    }

    /* renamed from: d */
    public static Long m17297d(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Long.valueOf(jSONObject.getLong(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m17300e(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return jSONObject.getString(str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Map<String, String> m17274a(String str) {
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

    /* renamed from: c */
    public static String m17294c(List<String> list) {
        if (C2968U2.m15249b(list)) {
            return null;
        }
        if (C2968U2.m15243a(19)) {
            return new JSONArray((Collection) list).toString();
        }
        return m17268a((Object) list).toString();
    }

    /* renamed from: b */
    private static JSONArray m17289b(Collection<?> collection) {
        if (collection == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(collection.size());
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(m17268a(it.next()));
            }
            return new JSONArray((Collection) arrayList);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static List<String> m17296c(String str) {
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

    /* renamed from: b */
    public static JSONArray m17290b(List<?> list) {
        if (C2968U2.m15249b(list)) {
            return null;
        }
        if (C2968U2.m15243a(19)) {
            return new JSONArray((Collection) list);
        }
        return m17289b((Collection<?>) list);
    }

    /* renamed from: a */
    public static long m17264a(Long l, TimeUnit timeUnit, long j) {
        return l == null ? j : timeUnit.toMillis(l.longValue());
    }

    /* renamed from: a */
    private static byte[] m17283a(Context context, byte[] bArr) {
        try {
            byte[] bArrM17291b = m17291b(context.getPackageName());
            byte[] bArr2 = new byte[bArr.length];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[i] = (byte) (bArr[i] ^ bArrM17291b[i % bArrM17291b.length]);
            }
            return bArr2;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static HashMap<String, String> m17287b(JSONObject jSONObject) {
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

    /* renamed from: c */
    public static Integer m17293c(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Object m17268a(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            if (obj.getClass().isArray()) {
                int length = Array.getLength(obj);
                ArrayList arrayList = new ArrayList(length);
                for (int i = 0; i < length; i++) {
                    arrayList.add(m17268a(Array.get(obj, i)));
                }
                return new JSONArray((Collection) arrayList);
            }
            if (obj instanceof Collection) {
                return m17289b((Collection<?>) obj);
            }
            return obj instanceof Map ? m17306h((Map) obj) : obj;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static C2688Il m17292c(JSONObject jSONObject) throws JSONException {
        C3164bm c3164bm;
        C3392kg.i iVar = new C3392kg.i();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("upc");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("uecc");
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("ucfbc");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ruecc");
        boolean zOptBoolean = jSONObject.optBoolean("upe", iVar.f24013q);
        boolean zOptBoolean2 = jSONObject.optBoolean("uece", iVar.f24014r);
        boolean zOptBoolean3 = jSONObject.optBoolean("ucfbe", iVar.f24015s);
        boolean zOptBoolean4 = jSONObject.optBoolean("ruece", iVar.f24019w);
        if (jSONObjectOptJSONObject == null) {
            c3164bm = null;
        } else {
            C3392kg.v vVar = new C3392kg.v();
            c3164bm = new C3164bm(jSONObjectOptJSONObject.optInt("tltb", vVar.f24108b), jSONObjectOptJSONObject.optInt("ttb", vVar.f24109c), jSONObjectOptJSONObject.optInt("mvcl", vVar.f24110d), jSONObjectOptJSONObject.optLong("act", vVar.f24111e), jSONObjectOptJSONObject.optBoolean("rtsc", vVar.f24112f), jSONObjectOptJSONObject.optBoolean("er", vVar.f24113g), jSONObjectOptJSONObject.optBoolean("pabd", vVar.f24114h), m17273a(jSONObjectOptJSONObject.optJSONArray("f")));
        }
        return new C2688Il(zOptBoolean, zOptBoolean2, zOptBoolean3, zOptBoolean4, c3164bm, jSONObjectOptJSONObject2 == null ? null : m17265a(jSONObjectOptJSONObject2, C3688w0.m17107b()), jSONObjectOptJSONObject3 == null ? null : m17265a(jSONObjectOptJSONObject3, C3688w0.m17106a()), jSONObjectOptJSONObject4 != null ? m17265a(jSONObjectOptJSONObject4, C3688w0.m17107b()) : null);
    }

    /* renamed from: b */
    public static Boolean m17284b(JSONObject jSONObject, String str) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Boolean.valueOf(jSONObject.getBoolean(str));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static List<String> m17288b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(jSONArray.getString(i));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m17272a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        return map.isEmpty() ? "" : m17305g(map);
    }

    /* renamed from: a */
    public static boolean m17282a(JSONObject jSONObject, String str, boolean z) {
        Boolean boolM17284b = m17284b(jSONObject, str);
        return boolM17284b == null ? z : boolM17284b.booleanValue();
    }

    /* renamed from: b */
    public static String m17286b(Map<String, List<String>> map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                JSONArray jSONArrayM17290b = m17290b((List<?>) entry.getValue());
                if (jSONArrayM17290b != null) {
                    jSONObject.put(entry.getKey(), jSONArrayM17290b.toString());
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static JSONArray m17275a(Collection<C3010Vj> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            Iterator<C3010Vj> it = collection.iterator();
            while (it.hasNext()) {
                try {
                    jSONArray.put(m17279a(it.next()));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONObject m17279a(C3010Vj c3010Vj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("cell_id", c3010Vj.m15329b());
        jSONObject.put("signal_strength", c3010Vj.m15343p());
        jSONObject.put("lac", c3010Vj.m15332e());
        jSONObject.put("country_code", c3010Vj.m15338k());
        jSONObject.put("operator_id", c3010Vj.m15339l());
        jSONObject.put("operator_name", c3010Vj.m15341n());
        jSONObject.put("is_connected", c3010Vj.m15344q());
        jSONObject.put("cell_type", c3010Vj.m15330c());
        jSONObject.put("pci", c3010Vj.m15342o());
        jSONObject.put("last_visible_time_offset", c3010Vj.m15331d());
        jSONObject.put("lte_rsrq", c3010Vj.m15335h());
        jSONObject.put("lte_rssnr", c3010Vj.m15337j());
        jSONObject.put("arfcn", c3010Vj.m15327a());
        jSONObject.put("lte_rssi", c3010Vj.m15336i());
        jSONObject.put("lte_bandwidth", c3010Vj.m15333f());
        jSONObject.put("lte_cqi", c3010Vj.m15334g());
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m17277a(C2688Il c2688Il) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("upe", c2688Il.f21448a).put("uece", c2688Il.f21449b).put("ruece", c2688Il.f21451d).put("ucfbe", c2688Il.f21450c);
        C3164bm c3164bm = c2688Il.f21452e;
        JSONObject jSONObjectPutOpt = jSONObjectPut.putOpt("upc", c3164bm == null ? null : new JSONObject().put("tltb", c3164bm.f23148a).put("ttb", c3164bm.f23149b).put("mvcl", c3164bm.f23150c).put("act", c3164bm.f23151d).put("rtsc", c3164bm.f23152e).put("er", c3164bm.f23153f).put("pabd", c3164bm.f23154g).put("f", m17276a(c3164bm.f23155h)));
        C2738Kl c2738Kl = c2688Il.f21453f;
        JSONObject jSONObjectPutOpt2 = jSONObjectPutOpt.putOpt("uecc", c2738Kl == null ? null : m17278a(c2738Kl));
        C2738Kl c2738Kl2 = c2688Il.f21455h;
        JSONObject jSONObjectPutOpt3 = jSONObjectPutOpt2.putOpt("ruecc", c2738Kl2 == null ? null : m17278a(c2738Kl2));
        C2738Kl c2738Kl3 = c2688Il.f21454g;
        return jSONObjectPutOpt3.putOpt("ucfbc", c2738Kl3 != null ? m17278a(c2738Kl3) : null);
    }

    /* renamed from: a */
    private static JSONObject m17278a(C2738Kl c2738Kl) throws JSONException {
        return new JSONObject().put("tsc", c2738Kl.f21592a).put("rtsc1", c2738Kl.f21593b).put("tvc", c2738Kl.f21594c).put("tsc1", c2738Kl.f21595d).put("ic", c2738Kl.f21596e).put("ncvc", c2738Kl.f21597f).put("tlc", c2738Kl.f21598g).put("vh", c2738Kl.f21599h).put("if", c2738Kl.f21600i).put("wvuc", c2738Kl.f21601j).put("tltb", c2738Kl.f21602k).put("ttb", c2738Kl.f21603l).put("mec", c2738Kl.f21604m).put("mfcl", c2738Kl.f21605n).put("wvul", c2738Kl.f21606o).put("f", m17276a(c2738Kl.f21607p));
    }

    /* renamed from: a */
    private static C2738Kl m17265a(JSONObject jSONObject, C3392kg.u uVar) {
        return new C2738Kl(jSONObject.optBoolean("tsc", uVar.f24092b), jSONObject.optBoolean("rtsc1", uVar.f24093c), jSONObject.optBoolean("tvc", uVar.f24094d), jSONObject.optBoolean("tsc1", uVar.f24095e), jSONObject.optBoolean("ic", uVar.f24100j), jSONObject.optBoolean("ncvc", uVar.f24101k), jSONObject.optBoolean("tlc", uVar.f24102l), jSONObject.optBoolean("vh", uVar.f24103m), jSONObject.optBoolean("if", uVar.f24105o), jSONObject.optBoolean("wvuc", uVar.f24106p), jSONObject.optInt("tltb", uVar.f24096f), jSONObject.optInt("ttb", uVar.f24097g), jSONObject.optInt("mec", uVar.f24098h), jSONObject.optInt("mfcl", uVar.f24099i), jSONObject.optInt("wvul", uVar.f24107q), m17273a(jSONObject.optJSONArray("f")));
    }

    /* renamed from: a */
    private static JSONArray m17276a(List<C3242em> list) {
        JSONArray jSONArray = new JSONArray();
        for (C3242em c3242em : list) {
            try {
                jSONArray.put(new JSONObject().put("ft", c3242em.f23374a.f23381a).put("fv", c3242em.f23375b));
            } catch (Throwable unused) {
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    private static List<C3242em> m17273a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    arrayList.add(new C3242em(C3242em.b.m15861a(jSONObject.getInt("ft")), jSONObject.optString("fv")));
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C3051Xa m17267a(JSONObject jSONObject) {
        return new C3051Xa(m17266a(jSONObject, "activation"), m17266a(jSONObject, "satellite_clids"), m17266a(jSONObject, "preload_info"));
    }

    /* renamed from: a */
    public static JSONObject m17281a(C3051Xa c3051Xa) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("activation", m17280a(c3051Xa.f22781a));
            jSONObject.putOpt("preload_info", m17280a(c3051Xa.f22783c));
            jSONObject.putOpt("satellite_clids", m17280a(c3051Xa.f22782b));
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static C3026Wa m17266a(JSONObject jSONObject, String str) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            return new C3026Wa(jSONObjectOptJSONObject.optLong("exp_t"), jSONObjectOptJSONObject.optInt("interval"));
        }
        return null;
    }

    /* renamed from: a */
    private static JSONObject m17280a(C3026Wa c3026Wa) {
        if (c3026Wa == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exp_t", c3026Wa.f22681a).put("interval", c3026Wa.f22682b);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static String m17271a(C3690w2 c3690w2) {
        JSONObject jSONObject;
        if (c3690w2 == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put(Snapshot.WIDTH, c3690w2.m17112e()).put(Snapshot.HEIGHT, c3690w2.m17110c()).put("dpi", c3690w2.m17109b()).put("scaleFactor", c3690w2.m17111d()).putOpt("deviceType", c3690w2.m17108a() == null ? null : c3690w2.m17108a().f25518a);
            } catch (Throwable unused) {
            }
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }
}
