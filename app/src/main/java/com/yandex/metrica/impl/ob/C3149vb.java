package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Rf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.vb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3149vb implements InterfaceC2900lb<Ib> {
    private final C3124ub a;
    private final C3000pb b;

    public C3149vb() {
        this(new C3124ub(), new C3000pb());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Object a(List<C3099tb<Rf, Fn>> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public List<C3099tb<Rf, Fn>> b(Object obj) {
        Ib ib = (Ib) obj;
        Rf rf = new Rf();
        rf.b = 2;
        rf.d = new Rf.o();
        C3099tb<Rf.n, Fn> c3099tbB = this.a.b(ib.c);
        rf.d.c = c3099tbB.a;
        C3099tb<Rf.k, Fn> c3099tbB2 = this.b.b(ib.b);
        rf.d.b = c3099tbB2.a;
        return Collections.singletonList(new C3099tb(rf, En.a(c3099tbB, c3099tbB2)));
    }

    public C3149vb(C3124ub c3124ub, C3000pb c3000pb) {
        this.a = c3124ub;
        this.b = c3000pb;
    }
}
