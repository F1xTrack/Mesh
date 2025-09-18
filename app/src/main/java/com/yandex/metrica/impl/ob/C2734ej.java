package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ej, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2734ej {
    private final C2675ca a;

    public C2734ej() {
        this(new C2675ca());
    }

    public C3007pi a(JSONObject jSONObject) {
        C2880kg.c cVar = new C2880kg.c();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cache_control");
        if (jSONObjectOptJSONObject != null) {
            Long lD = C3240ym.d(jSONObjectOptJSONObject, "cells_around_ttl");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cVar.b = C3240ym.a(lD, timeUnit, cVar.b);
            cVar.c = C3240ym.a(C3240ym.d(jSONObjectOptJSONObject, "wifi_networks_ttl"), timeUnit, cVar.c);
            cVar.d = C3240ym.a(C3240ym.d(jSONObjectOptJSONObject, "last_known_location_ttl"), timeUnit, cVar.d);
            cVar.e = C3240ym.a(C3240ym.d(jSONObjectOptJSONObject, "net_interfaces_ttl"), timeUnit, cVar.e);
        }
        return this.a.a(cVar);
    }

    public C2734ej(C2675ca c2675ca) {
        this.a = c2675ca;
    }
}
