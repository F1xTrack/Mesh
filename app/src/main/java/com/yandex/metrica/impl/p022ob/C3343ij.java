package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import com.yandex.metrica.impl.p022ob.C3602si;
import com.yandex.metrica.impl.p022ob.C3762ym;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ij */
/* loaded from: classes2.dex */
public class C3343ij {
    /* renamed from: a */
    public void m16099a(C3681vj c3681vj, C3762ym.a aVar) {
        C3392kg.i iVar = new C3392kg.i();
        try {
            Object jSONObject = new JSONObject();
            try {
                jSONObject = aVar.get("features");
            } catch (Throwable unused) {
            }
            JSONObject jSONObjectOptJSONObject = ((JSONObject) jSONObject).optJSONObject("list");
            if (jSONObjectOptJSONObject != null) {
                C3602si c3602si = new C3602si(new C3602si.a().m16778d(m16098a(jSONObjectOptJSONObject, "easy_collecting", iVar.f23998b)).m16779e(m16098a(jSONObjectOptJSONObject, "egress", iVar.f24021y)).m16787m(m16098a(jSONObjectOptJSONObject, "package_info", iVar.f23999c)).m16788n(m16098a(jSONObjectOptJSONObject, "permissions_collecting", iVar.f24000d)).m16780f(m16098a(jSONObjectOptJSONObject, "features_collecting", iVar.f24001e)).m16789o(m16098a(jSONObjectOptJSONObject, "sdk_list", iVar.f24007k)).m16781g(m16098a(jSONObjectOptJSONObject, "google_aid", iVar.f24002f)).m16791q(m16098a(jSONObjectOptJSONObject, "throttling", iVar.f24016t)).m16797w(m16098a(jSONObjectOptJSONObject, "wifi_around", iVar.f24003g)).m16798x(m16098a(jSONObjectOptJSONObject, "wifi_connected", iVar.f24004h)).m16777c(m16098a(jSONObjectOptJSONObject, "cells_around", iVar.f24005i)).m16790p(m16098a(jSONObjectOptJSONObject, "sim_info", iVar.f24006j)).m16784j(m16098a(jSONObjectOptJSONObject, "identity_light_collecting", iVar.f24008l)).m16786l(m16098a(jSONObjectOptJSONObject, "location_collecting", iVar.f24009m)).m16785k(m16098a(jSONObjectOptJSONObject, "lbs_collecting", iVar.f24010n)).m16782h(m16098a(jSONObjectOptJSONObject, "gpl_collecting", iVar.f24012p)).m16796v(m16098a(jSONObjectOptJSONObject, "wakeup", iVar.f24011o)).m16794t(m16098a(jSONObjectOptJSONObject, "ui_parsing", iVar.f24013q)).m16793s(m16098a(jSONObjectOptJSONObject, "ui_event_sending", iVar.f24014r)).m16795u(m16098a(jSONObjectOptJSONObject, "ui_raw_event_sending", iVar.f24014r)).m16792r(m16098a(jSONObjectOptJSONObject, "ui_collecting_for_bridge", iVar.f24015s)).m16774a(m16098a(jSONObjectOptJSONObject, "cell_additional_info", iVar.f24017u)).m16776b(m16098a(jSONObjectOptJSONObject, "cell_additional_info_connected_only", iVar.f24018v)).m16783i(m16098a(jSONObjectOptJSONObject, "huawei_oaid", iVar.f24020x)).m16773a(jSONObjectOptJSONObject.has("ssl_pinning") ? Boolean.valueOf(jSONObjectOptJSONObject.getJSONObject("ssl_pinning").getBoolean("enabled")) : null));
                c3681vj.m17054a(m16098a(jSONObjectOptJSONObject, "socket", false));
                c3681vj.m17045a(c3602si);
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    private boolean m16098a(JSONObject jSONObject, String str, boolean z) throws JSONException {
        Boolean boolValueOf = jSONObject.has(str) ? Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean("enabled")) : null;
        Boolean boolValueOf2 = Boolean.valueOf(z);
        if (boolValueOf == null) {
            boolValueOf = boolValueOf2;
        }
        return boolValueOf.booleanValue();
    }
}
