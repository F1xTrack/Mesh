package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Rf;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ob */
/* loaded from: classes2.dex */
public class C2975ob implements InterfaceC2725ea<Db, C3099tb<Rf.j, Fn>> {
    private final C2776gb a;
    private final Lb b;

    public C2975ob() {
        this(new C2776gb(), new Lb(30));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Db a(C3099tb<Rf.j, Fn> c3099tb) {
        throw new UnsupportedOperationException();
    }

    public C2975ob(C2776gb c2776gb, Lb lb) {
        this.a = c2776gb;
        this.b = lb;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a */
    public C3099tb<Rf.j, Fn> b(Db db) {
        int iA;
        Rf.j jVar = new Rf.j();
        C3099tb<Rf.a, Fn> c3099tbB = this.a.b(db.a);
        jVar.b = c3099tbB.a;
        Qn<List<Object>, Hn> qnA = this.b.a((List<Object>) db.b);
        if (U2.b(qnA.a)) {
            iA = 0;
        } else {
            jVar.c = new Rf.a[qnA.a.size()];
            iA = 0;
            for (int i = 0; i < qnA.a.size(); i++) {
                C3099tb<Rf.a, Fn> c3099tbB2 = this.a.b((C3229yb) qnA.a.get(i));
                jVar.c[i] = c3099tbB2.a;
                iA += c3099tbB2.b.a();
            }
        }
        return new C3099tb<>(jVar, En.a(c3099tbB, qnA, new En(iA)));
    }
}
