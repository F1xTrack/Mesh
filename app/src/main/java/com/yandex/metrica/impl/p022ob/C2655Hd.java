package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2981Uf;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.yandex.metrica.impl.ob.Hd */
/* loaded from: classes2.dex */
public class C2655Hd {
    /* renamed from: a */
    public C2981Uf.a m14263a(C2953Tc c2953Tc) {
        C2981Uf.a aVar = new C2981Uf.a();
        aVar.f22459b = c2953Tc.m15189f() == null ? aVar.f22459b : c2953Tc.m15189f().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.f22460c = timeUnit.toSeconds(c2953Tc.m15187d());
        aVar.f22463f = timeUnit.toSeconds(c2953Tc.m15186c());
        aVar.f22464g = c2953Tc.m15183b() == null ? 0 : C3196d2.m15723a(c2953Tc.m15183b());
        aVar.f22465h = c2953Tc.m15188e() == null ? 3 : C3196d2.m15724a(c2953Tc.m15188e());
        JSONArray jSONArrayM15177a = c2953Tc.m15177a();
        if (jSONArrayM15177a != null) {
            aVar.f22461d = C3196d2.m15733b(jSONArrayM15177a);
        }
        JSONArray jSONArrayM15190g = c2953Tc.m15190g();
        if (jSONArrayM15190g != null) {
            aVar.f22462e = C3196d2.m15730a(jSONArrayM15190g);
        }
        return aVar;
    }
}
