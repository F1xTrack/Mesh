package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C3392kg;
import com.yandex.metrica.impl.p022ob.C3762ym;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.tj */
/* loaded from: classes2.dex */
public class C3629tj {
    /* renamed from: a */
    public void m16872a(C3681vj c3681vj, C3762ym.a aVar) {
        JSONObject jSONObjectOptJSONObject;
        if (!c3681vj.m17028O() || (jSONObjectOptJSONObject = aVar.optJSONObject("socket")) == null) {
            return;
        }
        C3392kg.p pVar = new C3392kg.p();
        long jOptLong = jSONObjectOptJSONObject.optLong("seconds_to_live");
        long jOptLong2 = jSONObjectOptJSONObject.optLong("first_delay_seconds", pVar.f24080f);
        int iOptInt = jSONObjectOptJSONObject.optInt("launch_delay_seconds", pVar.f24081g);
        long jOptLong3 = jSONObjectOptJSONObject.optLong("open_event_interval_seconds", pVar.f24082h);
        long jOptLong4 = jSONObjectOptJSONObject.optLong("min_failed_request_interval_seconds", pVar.f24083i);
        long jOptLong5 = jSONObjectOptJSONObject.optLong("min_successful_request_interval_seconds", pVar.f24084j);
        long jOptLong6 = jSONObjectOptJSONObject.optLong("open_retry_interval_seconds", pVar.f24085k);
        String strOptString = jSONObjectOptJSONObject.optString("token");
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("ports_https");
        JSONArray jSONArray = new JSONArray();
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = jSONArray;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("ports_http");
        JSONArray jSONArray2 = new JSONArray();
        if (jSONArrayOptJSONArray2 == null) {
            jSONArrayOptJSONArray2 = jSONArray2;
        }
        boolean z = jSONArrayOptJSONArray.length() > 0 || jSONArrayOptJSONArray2.length() > 0;
        if (jOptLong <= 0 || TextUtils.isEmpty(strOptString) || !z) {
            return;
        }
        List<Integer> listM16871a = m16871a(jSONArrayOptJSONArray);
        List<Integer> listM16871a2 = m16871a(jSONArrayOptJSONArray2);
        if (((ArrayList) listM16871a).isEmpty() && ((ArrayList) listM16871a2).isEmpty()) {
            return;
        }
        c3681vj.m17034a(new C2585Ei(jOptLong, strOptString, listM16871a, listM16871a2, jOptLong2, iOptInt, jOptLong3, jOptLong4, jOptLong5, jOptLong6));
    }

    /* renamed from: a */
    private List<Integer> m16871a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            int iOptInt = jSONArray.optInt(i);
            if (iOptInt != 0) {
                arrayList.add(Integer.valueOf(iOptInt));
            }
        }
        return arrayList;
    }
}
