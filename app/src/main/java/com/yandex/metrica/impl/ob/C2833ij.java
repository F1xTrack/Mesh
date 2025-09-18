package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import com.yandex.metrica.impl.ob.C3081si;
import com.yandex.metrica.impl.ob.C3240ym;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ij, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2833ij {
    public void a(C3162vj c3162vj, C3240ym.a aVar) {
        C2880kg.i iVar = new C2880kg.i();
        try {
            Object jSONObject = new JSONObject();
            try {
                jSONObject = aVar.get("features");
            } catch (Throwable unused) {
            }
            JSONObject jSONObjectOptJSONObject = ((JSONObject) jSONObject).optJSONObject("list");
            if (jSONObjectOptJSONObject != null) {
                C3081si c3081si = new C3081si(new C3081si.a().d(a(jSONObjectOptJSONObject, "easy_collecting", iVar.b)).e(a(jSONObjectOptJSONObject, "egress", iVar.y)).m(a(jSONObjectOptJSONObject, "package_info", iVar.c)).n(a(jSONObjectOptJSONObject, "permissions_collecting", iVar.d)).f(a(jSONObjectOptJSONObject, "features_collecting", iVar.e)).o(a(jSONObjectOptJSONObject, "sdk_list", iVar.k)).g(a(jSONObjectOptJSONObject, "google_aid", iVar.f)).q(a(jSONObjectOptJSONObject, "throttling", iVar.t)).w(a(jSONObjectOptJSONObject, "wifi_around", iVar.g)).x(a(jSONObjectOptJSONObject, "wifi_connected", iVar.h)).c(a(jSONObjectOptJSONObject, "cells_around", iVar.i)).p(a(jSONObjectOptJSONObject, "sim_info", iVar.j)).j(a(jSONObjectOptJSONObject, "identity_light_collecting", iVar.l)).l(a(jSONObjectOptJSONObject, "location_collecting", iVar.m)).k(a(jSONObjectOptJSONObject, "lbs_collecting", iVar.n)).h(a(jSONObjectOptJSONObject, "gpl_collecting", iVar.p)).v(a(jSONObjectOptJSONObject, "wakeup", iVar.o)).t(a(jSONObjectOptJSONObject, "ui_parsing", iVar.q)).s(a(jSONObjectOptJSONObject, "ui_event_sending", iVar.r)).u(a(jSONObjectOptJSONObject, "ui_raw_event_sending", iVar.r)).r(a(jSONObjectOptJSONObject, "ui_collecting_for_bridge", iVar.s)).a(a(jSONObjectOptJSONObject, "cell_additional_info", iVar.u)).b(a(jSONObjectOptJSONObject, "cell_additional_info_connected_only", iVar.v)).i(a(jSONObjectOptJSONObject, "huawei_oaid", iVar.x)).a(jSONObjectOptJSONObject.has("ssl_pinning") ? Boolean.valueOf(jSONObjectOptJSONObject.getJSONObject("ssl_pinning").getBoolean("enabled")) : null));
                c3162vj.a(a(jSONObjectOptJSONObject, "socket", false));
                c3162vj.a(c3081si);
            }
        } catch (Throwable unused2) {
        }
    }

    private boolean a(JSONObject jSONObject, String str, boolean z) throws JSONException {
        Boolean boolValueOf = jSONObject.has(str) ? Boolean.valueOf(jSONObject.getJSONObject(str).getBoolean("enabled")) : null;
        Boolean boolValueOf2 = Boolean.valueOf(z);
        if (boolValueOf == null) {
            boolValueOf = boolValueOf2;
        }
        return boolValueOf.booleanValue();
    }
}
