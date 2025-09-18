package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Rf;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ub, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3124ub implements InterfaceC2725ea<Hb, C3099tb<Rf.n, Fn>> {
    private final C2950nb a;
    private final C2850jb b;
    private final Un c;
    private final Un d;

    public C3124ub() {
        this(new C2950nb(), new C2850jb(), new Un(100), new Un(1000));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Hb a(C3099tb<Rf.n, Fn> c3099tb) {
        throw new UnsupportedOperationException();
    }

    public C3124ub(C2950nb c2950nb, C2850jb c2850jb, Un un, Un un2) {
        this.a = c2950nb;
        this.b = c2850jb;
        this.c = un;
        this.d = un2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3099tb<Rf.n, Fn> b(Hb hb) {
        C3099tb<Rf.d, Fn> c3099tbB;
        Rf.n nVar = new Rf.n();
        Qn<String, Fn> qnA = this.c.a(hb.a);
        nVar.b = O2.c(qnA.a);
        List<String> list = hb.b;
        C3099tb<Rf.i, Fn> c3099tbB2 = null;
        if (list != null) {
            c3099tbB = this.b.b(list);
            nVar.c = c3099tbB.a;
        } else {
            c3099tbB = null;
        }
        Qn<String, Fn> qnA2 = this.d.a(hb.c);
        nVar.d = O2.c(qnA2.a);
        Map<String, String> map = hb.d;
        if (map != null) {
            c3099tbB2 = this.a.b(map);
            nVar.e = c3099tbB2.a;
        }
        return new C3099tb<>(nVar, En.a(qnA, c3099tbB, qnA2, c3099tbB2));
    }
}
