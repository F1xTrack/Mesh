package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import com.yandex.metrica.impl.p022ob.C3762ym;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.sj */
/* loaded from: classes2.dex */
public class C3603sj {

    /* renamed from: a */
    private final C2502Ba f24783a;

    public C3603sj() {
        this(new C2502Ba());
    }

    /* renamed from: a */
    public void m16799a(C3681vj c3681vj, C3762ym.a aVar) {
        C3392kg.o oVar = new C3392kg.o();
        JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("sdk_list");
        if (jSONObjectOptJSONObject != null) {
            Long lM17297d = C3762ym.m17297d(jSONObjectOptJSONObject, "min_collecting_interval_seconds");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            oVar.f24072b = C3762ym.m17264a(lM17297d, timeUnit, oVar.f24072b);
            oVar.f24073c = C3762ym.m17264a(C3762ym.m17297d(jSONObjectOptJSONObject, "min_first_collecting_delay_seconds"), timeUnit, oVar.f24073c);
            oVar.f24074d = C3762ym.m17264a(C3762ym.m17297d(jSONObjectOptJSONObject, "min_collecting_delay_after_launch_seconds"), timeUnit, oVar.f24074d);
            oVar.f24075e = C3762ym.m17264a(C3762ym.m17297d(jSONObjectOptJSONObject, "min_request_retry_interval_seconds"), timeUnit, oVar.f24075e);
        }
        c3681vj.m17032a(this.f24783a.mo13846a(oVar));
    }

    public C3603sj(C2502Ba c2502Ba) {
        this.f24783a = c2502Ba;
    }
}
