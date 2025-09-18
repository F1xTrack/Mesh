package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.A;
import java.util.HashMap;

/* loaded from: classes2.dex */
class V3 {
    private final HashMap<String, A> a = new HashMap<>();

    public synchronized A a(C2669c4 c2669c4, Im im, G9 g9) {
        A a;
        a = this.a.get(c2669c4.toString());
        if (a == null) {
            A.a aVarE = g9.e();
            a = new A(aVarE.a, aVarE.b, im);
            this.a.put(c2669c4.toString(), a);
        }
        return a;
    }
}
