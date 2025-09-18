package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
class Aj {
    public C2880kg.x[] a(JSONArray jSONArray) {
        JSONObject jSONObject;
        Integer numC;
        Integer num;
        if (jSONArray == null) {
            return new C2880kg.x[0];
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                jSONObject = jSONArray.getJSONObject(i);
                numC = C3240ym.c(jSONObject, "type");
            } catch (Throwable unused) {
            }
            if (numC != null) {
                int iIntValue = numC.intValue();
                if (iIntValue == 0) {
                    num = 0;
                } else if (iIntValue == 1) {
                    num = 1;
                } else if (iIntValue == 2) {
                    num = 2;
                } else if (iIntValue == 3) {
                    num = 3;
                }
                String strE = C3240ym.e(jSONObject, "value");
                if (num == null && strE != null) {
                    C2880kg.x xVar = new C2880kg.x();
                    xVar.b = num.intValue();
                    xVar.c = strE;
                    arrayList.add(xVar);
                }
            }
            num = null;
            String strE2 = C3240ym.e(jSONObject, "value");
            if (num == null) {
            }
        }
        return (C2880kg.x[]) arrayList.toArray(new C2880kg.x[0]);
    }
}
