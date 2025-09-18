package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Rf;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.pb */
/* loaded from: classes2.dex */
public class C3000pb implements InterfaceC2725ea<Eb, C3099tb<Rf.k, Fn>> {
    private final C2950nb a;
    private final C2975ob b;
    private final C2850jb c;
    private final C3025qb d;
    private final Un e;
    private final Un f;

    public C3000pb() {
        this(new C2950nb(), new C2975ob(), new C2850jb(), new C3025qb(), new Un(100), new Un(1000));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Eb a(C3099tb<Rf.k, Fn> c3099tb) {
        throw new UnsupportedOperationException();
    }

    public C3000pb(C2950nb c2950nb, C2975ob c2975ob, C2850jb c2850jb, C3025qb c3025qb, Un un, Un un2) {
        this.a = c2950nb;
        this.b = c2975ob;
        this.c = c2850jb;
        this.d = c3025qb;
        this.e = un;
        this.f = un2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a */
    public C3099tb<Rf.k, Fn> b(Eb eb) {
        C3099tb<Rf.d, Fn> c3099tbB;
        C3099tb<Rf.i, Fn> c3099tbB2;
        C3099tb<Rf.j, Fn> c3099tbB3;
        C3099tb<Rf.j, Fn> c3099tbB4;
        Rf.k kVar = new Rf.k();
        Qn<String, Fn> qnA = this.e.a(eb.a);
        kVar.b = O2.c(qnA.a);
        Qn<String, Fn> qnA2 = this.f.a(eb.b);
        kVar.c = O2.c(qnA2.a);
        List<String> list = eb.c;
        C3099tb<Rf.l[], Fn> c3099tbB5 = null;
        if (list != null) {
            c3099tbB = this.c.b(list);
            kVar.d = c3099tbB.a;
        } else {
            c3099tbB = null;
        }
        Map<String, String> map = eb.d;
        if (map != null) {
            c3099tbB2 = this.a.b(map);
            kVar.e = c3099tbB2.a;
        } else {
            c3099tbB2 = null;
        }
        Db db = eb.e;
        if (db != null) {
            c3099tbB3 = this.b.b(db);
            kVar.f = c3099tbB3.a;
        } else {
            c3099tbB3 = null;
        }
        Db db2 = eb.f;
        if (db2 != null) {
            c3099tbB4 = this.b.b(db2);
            kVar.g = c3099tbB4.a;
        } else {
            c3099tbB4 = null;
        }
        List<String> list2 = eb.g;
        if (list2 != null) {
            c3099tbB5 = this.d.b(list2);
            kVar.h = c3099tbB5.a;
        }
        return new C3099tb<>(kVar, En.a(qnA, qnA2, c3099tbB, c3099tbB2, c3099tbB3, c3099tbB4, c3099tbB5));
    }
}
