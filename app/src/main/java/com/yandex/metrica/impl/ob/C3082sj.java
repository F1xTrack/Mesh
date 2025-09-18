package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import com.yandex.metrica.impl.ob.C3240ym;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.sj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3082sj {
    private final Ba a;

    public C3082sj() {
        this(new Ba());
    }

    public void a(C3162vj c3162vj, C3240ym.a aVar) {
        C2880kg.o oVar = new C2880kg.o();
        JSONObject jSONObjectOptJSONObject = aVar.optJSONObject("sdk_list");
        if (jSONObjectOptJSONObject != null) {
            Long lD = C3240ym.d(jSONObjectOptJSONObject, "min_collecting_interval_seconds");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            oVar.b = C3240ym.a(lD, timeUnit, oVar.b);
            oVar.c = C3240ym.a(C3240ym.d(jSONObjectOptJSONObject, "min_first_collecting_delay_seconds"), timeUnit, oVar.c);
            oVar.d = C3240ym.a(C3240ym.d(jSONObjectOptJSONObject, "min_collecting_delay_after_launch_seconds"), timeUnit, oVar.d);
            oVar.e = C3240ym.a(C3240ym.d(jSONObjectOptJSONObject, "min_request_retry_interval_seconds"), timeUnit, oVar.e);
        }
        c3162vj.a(this.a.a(oVar));
    }

    public C3082sj(Ba ba) {
        this.a = ba;
    }
}
