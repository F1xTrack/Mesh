package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ej */
/* loaded from: classes2.dex */
public class C3239ej {

    /* renamed from: a */
    private final C3178ca f23371a;

    public C3239ej() {
        this(new C3178ca());
    }

    /* renamed from: a */
    public C3524pi m15857a(JSONObject jSONObject) {
        C3392kg.c cVar = new C3392kg.c();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("cache_control");
        if (jSONObjectOptJSONObject != null) {
            Long lM17297d = C3762ym.m17297d(jSONObjectOptJSONObject, "cells_around_ttl");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cVar.f23980b = C3762ym.m17264a(lM17297d, timeUnit, cVar.f23980b);
            cVar.f23981c = C3762ym.m17264a(C3762ym.m17297d(jSONObjectOptJSONObject, "wifi_networks_ttl"), timeUnit, cVar.f23981c);
            cVar.f23982d = C3762ym.m17264a(C3762ym.m17297d(jSONObjectOptJSONObject, "last_known_location_ttl"), timeUnit, cVar.f23982d);
            cVar.f23983e = C3762ym.m17264a(C3762ym.m17297d(jSONObjectOptJSONObject, "net_interfaces_ttl"), timeUnit, cVar.f23983e);
        }
        return this.f23371a.mo13846a(cVar);
    }

    public C3239ej(C3178ca c3178ca) {
        this.f23371a = c3178ca;
    }
}
