package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Rf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.hb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2801hb implements InterfaceC2900lb<C3254zb> {
    private final C2826ib a;

    public C2801hb() {
        this(new C2826ib());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Object a(List<C3099tb<Rf, Fn>> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public List<C3099tb<Rf, Fn>> b(Object obj) {
        C3254zb c3254zb = (C3254zb) obj;
        Rf rf = new Rf();
        rf.f = new Rf.b();
        C3099tb<Rf.c, Fn> c3099tbB = this.a.b(c3254zb.c);
        rf.f.b = c3099tbB.a;
        rf.b = c3254zb.b;
        return Collections.singletonList(new C3099tb(rf, En.a(c3099tbB)));
    }

    public C2801hb(C2826ib c2826ib) {
        this.a = c2826ib;
    }
}
