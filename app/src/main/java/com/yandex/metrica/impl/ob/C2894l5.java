package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.X3;

/* renamed from: com.yandex.metrica.impl.ob.l5 */
/* loaded from: classes2.dex */
public class C2894l5 extends AbstractC2795h5 {
    private final M2 b;
    private final Dd c;

    public C2894l5(Z3 z3, M2 m2, Dd dd) {
        super(z3);
        this.b = m2;
        this.c = dd;
    }

    @Override // com.yandex.metrica.impl.ob.AbstractC2795h5
    public boolean a(C2864k0 c2864k0, H4 h4) {
        X3.a aVarA = h4.b().a();
        this.b.a(aVarA.l);
        Boolean bool = aVarA.e;
        Boolean bool2 = aVarA.p;
        Boolean bool3 = Boolean.TRUE;
        if (bool3.equals(bool) || (bool == null && bool3.equals(bool2))) {
            this.c.a(true);
        } else if (Boolean.FALSE.equals(bool)) {
            this.c.a(false);
        }
        return false;
    }
}
