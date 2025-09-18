package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3044X3;

/* renamed from: com.yandex.metrica.impl.ob.l5 */
/* loaded from: classes2.dex */
public class C3407l5 extends AbstractC3303h5 {

    /* renamed from: b */
    private final C2769M2 f24170b;

    /* renamed from: c */
    private final C2555Dd f24171c;

    public C3407l5(C3094Z3 c3094z3, C2769M2 c2769m2, C2555Dd c2555Dd) {
        super(c3094z3);
        this.f24170b = c2769m2;
        this.f24171c = c2555Dd;
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3303h5
    /* renamed from: a */
    public boolean mo16029a(C3376k0 c3376k0, C2646H4 c2646h4) {
        C3044X3.a aVarM15527a = c2646h4.m14219b().m15527a();
        this.f24170b.m14593a(aVarM15527a.f22762l);
        Boolean bool = aVarM15527a.f22755e;
        Boolean bool2 = aVarM15527a.f22766p;
        Boolean bool3 = Boolean.TRUE;
        if (bool3.equals(bool) || (bool == null && bool3.equals(bool2))) {
            this.f24171c.m13996a(true);
        } else if (Boolean.FALSE.equals(bool)) {
            this.f24171c.m13996a(false);
        }
        return false;
    }
}
