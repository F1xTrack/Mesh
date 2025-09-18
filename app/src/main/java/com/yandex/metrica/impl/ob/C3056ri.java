package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.P3;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ri */
/* loaded from: classes2.dex */
public class C3056ri {
    public boolean a(Map<String, String> map, Qi qi, Q q) {
        Map<String, String> mapB = q.a(new P3.a(map, E0.APP)).b();
        if (U2.b(mapB)) {
            return true;
        }
        return mapB.equals(C3240ym.a(qi.v()));
    }
}
