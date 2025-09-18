package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Rf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.xb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3204xb implements InterfaceC2900lb<Kb> {
    private final C3124ub a;

    public C3204xb() {
        this(new C3124ub());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Object a(List<C3099tb<Rf, Fn>> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public List<C3099tb<Rf, Fn>> b(Object obj) {
        Rf rf = new Rf();
        rf.b = 1;
        rf.c = new Rf.q();
        C3099tb<Rf.n, Fn> c3099tbB = this.a.b(((Kb) obj).b);
        rf.c.b = c3099tbB.a;
        return Collections.singletonList(new C3099tb(rf, En.a(c3099tbB)));
    }

    public C3204xb(C3124ub c3124ub) {
        this.a = c3124ub;
    }
}
