package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2466A;
import java.util.HashMap;

/* renamed from: com.yandex.metrica.impl.ob.V3 */
/* loaded from: classes2.dex */
class C2994V3 {

    /* renamed from: a */
    private final HashMap<String, C2466A> f22507a = new HashMap<>();

    /* renamed from: a */
    public synchronized C2466A m15300a(C3172c4 c3172c4, C2689Im c2689Im, C2626G9 c2626g9) {
        C2466A c2466a;
        c2466a = this.f22507a.get(c3172c4.toString());
        if (c2466a == null) {
            C2466A.a aVarM14170e = c2626g9.m14170e();
            c2466a = new C2466A(aVarM14170e.f20825a, aVarM14170e.f20826b, c2689Im);
            this.f22507a.put(c3172c4.toString(), c2466a);
        }
        return c2466a;
    }
}
