package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C3762ym;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.jj */
/* loaded from: classes2.dex */
public class C3369jj {

    /* renamed from: a */
    private static final Set<String> f23796a;

    static {
        HashSet hashSet = new HashSet();
        f23796a = hashSet;
        hashSet.add("get_ad");
        hashSet.add("report");
        hashSet.add("report_ad");
        hashSet.add("location");
        hashSet.add("startup");
        hashSet.add("diagnostic");
        hashSet.add("mediascope");
    }

    /* renamed from: a */
    public void m16192a(C3681vj c3681vj, C3762ym.a aVar) {
        String string;
        List<String> listM16191a;
        String string2 = "";
        try {
            Object jSONObject = new JSONObject();
            try {
                jSONObject = aVar.get("query_hosts");
            } catch (Throwable unused) {
            }
            JSONObject jSONObjectOptJSONObject = ((JSONObject) jSONObject).optJSONObject("list");
            if (jSONObjectOptJSONObject != null) {
                try {
                    string = jSONObjectOptJSONObject.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused2) {
                    string = "";
                }
                if (!TextUtils.isEmpty(string)) {
                    c3681vj.m17070f(string);
                }
                List<String> listM16191a2 = m16191a(jSONObjectOptJSONObject, "report");
                if (!C2968U2.m15249b(listM16191a2)) {
                    c3681vj.m17071f(listM16191a2);
                }
                try {
                    string2 = jSONObjectOptJSONObject.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused3) {
                }
                if (!TextUtils.isEmpty(string2)) {
                    c3681vj.m17073g(string2);
                }
                List<String> listM16191a3 = m16191a(jSONObjectOptJSONObject, "location");
                if (!C2968U2.m15249b(listM16191a3)) {
                    c3681vj.m17062c(listM16191a3);
                }
                List<String> listM16191a4 = m16191a(jSONObjectOptJSONObject, "startup");
                if (!C2968U2.m15249b(listM16191a4)) {
                    c3681vj.m17077h(listM16191a4);
                }
                List<String> listM16191a5 = m16191a(jSONObjectOptJSONObject, "diagnostic");
                if (!C2968U2.m15249b(listM16191a5)) {
                    c3681vj.m17052a(listM16191a5);
                }
                List<String> listM16191a6 = m16191a(jSONObjectOptJSONObject, "mediascope");
                if (!C2968U2.m15249b(listM16191a6)) {
                    c3681vj.m17068e(listM16191a6);
                }
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!f23796a.contains(next) && (listM16191a = m16191a(jSONObjectOptJSONObject, next)) != null) {
                        map.put(next, listM16191a);
                    }
                }
                c3681vj.m17053a(map);
            }
        } catch (Throwable unused4) {
        }
    }

    /* renamed from: a */
    private List<String> m16191a(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject != null) {
                return C3762ym.m17288b(jSONObjectOptJSONObject.getJSONArray("urls"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
