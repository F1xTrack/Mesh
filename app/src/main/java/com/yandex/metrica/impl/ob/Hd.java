package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Uf;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public class Hd {
    public Uf.a a(Tc tc) {
        Uf.a aVar = new Uf.a();
        aVar.b = tc.f() == null ? aVar.b : tc.f().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.c = timeUnit.toSeconds(tc.d());
        aVar.f = timeUnit.toSeconds(tc.c());
        aVar.g = tc.b() == null ? 0 : C2692d2.a(tc.b());
        aVar.h = tc.e() == null ? 3 : C2692d2.a(tc.e());
        JSONArray jSONArrayA = tc.a();
        if (jSONArrayA != null) {
            aVar.d = C2692d2.b(jSONArrayA);
        }
        JSONArray jSONArrayG = tc.g();
        if (jSONArrayG != null) {
            aVar.e = C2692d2.a(jSONArrayG);
        }
        return aVar;
    }
}
