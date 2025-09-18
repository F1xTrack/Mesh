package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Aj */
/* loaded from: classes2.dex */
class C2486Aj {
    /* renamed from: a */
    public C3392kg.x[] m13867a(JSONArray jSONArray) {
        JSONObject jSONObject;
        Integer numM17293c;
        Integer num;
        if (jSONArray == null) {
            return new C3392kg.x[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                jSONObject = jSONArray.getJSONObject(i);
                numM17293c = C3762ym.m17293c(jSONObject, "type");
            } catch (Throwable unused) {
            }
            if (numM17293c != null) {
                int iIntValue = numM17293c.intValue();
                if (iIntValue == 0) {
                    num = 0;
                } else if (iIntValue == 1) {
                    num = 1;
                } else if (iIntValue == 2) {
                    num = 2;
                } else if (iIntValue == 3) {
                    num = 3;
                }
                String strM17300e = C3762ym.m17300e(jSONObject, "value");
                if (num == null && strM17300e != null) {
                    C3392kg.x xVar = new C3392kg.x();
                    xVar.f24119b = num.intValue();
                    xVar.f24120c = strM17300e;
                    arrayList.add(xVar);
                }
            }
            num = null;
            String strM17300e2 = C3762ym.m17300e(jSONObject, "value");
            if (num == null) {
            }
        }
        return (C3392kg.x[]) arrayList.toArray(new C3392kg.x[0]);
    }
}
