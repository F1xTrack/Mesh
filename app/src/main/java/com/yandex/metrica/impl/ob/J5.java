package com.yandex.metrica.impl.ob;

import defpackage.O90;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class J5 extends AbstractC3068s5 {
    private final C2667c2 b;

    public J5(C2744f4 c2744f4) {
        this(c2744f4, P0.i().m());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2944n5
    public boolean a(C2864k0 c2864k0) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject;
        E0 e0 = null;
        try {
            jSONObjectOptJSONObject = new JSONObject(c2864k0.p()).optJSONObject("preloadInfo");
        } catch (Throwable unused) {
            jSONObjectOptJSONObject = null;
        }
        C2667c2 c2667c2 = this.b;
        String strE = C3240ym.e(jSONObjectOptJSONObject, "trackingId");
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObjectOptJSONObject == null || !jSONObjectOptJSONObject.has("additionalParams")) {
            jSONObject = null;
        } else {
            try {
                jSONObject = jSONObjectOptJSONObject.getJSONObject("additionalParams");
            } catch (Throwable unused2) {
            }
        }
        if (jSONObject == null) {
            jSONObject = jSONObject2;
        }
        boolean zA = C3240ym.a(jSONObjectOptJSONObject, "wasSet", false);
        boolean zA2 = C3240ym.a(jSONObjectOptJSONObject, "autoTracking", false);
        String strE2 = C3240ym.e(jSONObjectOptJSONObject, "source");
        E0[] e0ArrValues = E0.values();
        int i = 0;
        while (true) {
            if (i >= 4) {
                break;
            }
            E0 e02 = e0ArrValues[i];
            if (O90.a(e02.a(), strE2)) {
                e0 = e02;
                break;
            }
            i++;
        }
        c2667c2.b(new Le(strE, jSONObject, zA, zA2, e0 != null ? e0 : E0.UNDEFINED));
        return false;
    }

    public J5(C2744f4 c2744f4, C2667c2 c2667c2) {
        super(c2744f4);
        this.b = c2667c2;
    }
}
