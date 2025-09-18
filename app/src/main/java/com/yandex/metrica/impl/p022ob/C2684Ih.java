package com.yandex.metrica.impl.p022ob;

import android.text.TextUtils;
import com.yandex.metrica.impl.p022ob.C3762ym;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Ih */
/* loaded from: classes2.dex */
public class C2684Ih {
    /* renamed from: a */
    public List<C2659Hh> m14349a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new C3762ym.a(str).optJSONArray("sdk_list");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    String strOptString = jSONObject.optString("name");
                    if (!TextUtils.isEmpty(strOptString)) {
                        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("classes");
                        ArrayList arrayList2 = new ArrayList();
                        if (jSONArrayOptJSONArray2 != null) {
                            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                                try {
                                    String strOptString2 = jSONArrayOptJSONArray2.getJSONObject(i2).optString("name");
                                    if (!TextUtils.isEmpty(strOptString2)) {
                                        arrayList2.add(strOptString2);
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        if (!C2968U2.m15249b(arrayList2)) {
                            arrayList.add(new C2659Hh(strOptString, arrayList2));
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return arrayList;
    }
}
