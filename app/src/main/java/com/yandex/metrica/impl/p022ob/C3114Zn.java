package com.yandex.metrica.impl.p022ob;

import java.util.Comparator;

/* renamed from: com.yandex.metrica.impl.ob.Zn */
/* loaded from: classes2.dex */
public class C3114Zn implements Comparator<C3010Vj> {
    @Override // java.util.Comparator
    public int compare(C3010Vj c3010Vj, C3010Vj c3010Vj2) {
        C3010Vj c3010Vj3 = c3010Vj;
        C3010Vj c3010Vj4 = c3010Vj2;
        if (c3010Vj3 == c3010Vj4) {
            return 0;
        }
        if (!((c3010Vj4 == null) ^ (c3010Vj3 == null)) && c3010Vj3.m15344q() == c3010Vj4.m15344q() && c3010Vj3.m15330c() == c3010Vj4.m15330c() && (c3010Vj3.m15338k() == null ? c3010Vj4.m15338k() == null : c3010Vj3.m15338k().equals(c3010Vj4.m15338k())) && (c3010Vj3.m15339l() == null ? c3010Vj4.m15339l() == null : c3010Vj3.m15339l().equals(c3010Vj4.m15339l())) && (c3010Vj3.m15332e() == null ? c3010Vj4.m15332e() == null : c3010Vj3.m15332e().equals(c3010Vj4.m15332e())) && (c3010Vj3.m15329b() == null ? c3010Vj4.m15329b() == null : c3010Vj3.m15329b().equals(c3010Vj4.m15329b())) && (c3010Vj3.m15341n() == null ? c3010Vj4.m15341n() == null : c3010Vj3.m15341n().equals(c3010Vj4.m15341n())) && (c3010Vj3.m15340m() == null ? c3010Vj4.m15340m() == null : c3010Vj3.m15340m().equals(c3010Vj4.m15340m()))) {
            if (c3010Vj3.m15342o() != null) {
                if (c3010Vj3.m15342o().equals(c3010Vj4.m15342o())) {
                    return 0;
                }
            } else if (c3010Vj4.m15342o() == null) {
                return 0;
            }
        }
        return 10;
    }
}
