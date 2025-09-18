package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Rf;

/* renamed from: com.yandex.metrica.impl.ob.sb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3074sb implements InterfaceC2725ea<Gb, C3099tb<Rf.m, Fn>> {
    private final C3124ub a;
    private final Un b;
    private final Un c;

    public C3074sb() {
        this(new C3124ub(), new Un(100), new Un(2048));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Gb a(C3099tb<Rf.m, Fn> c3099tb) {
        throw new UnsupportedOperationException();
    }

    public C3074sb(C3124ub c3124ub, Un un, Un un2) {
        this.a = c3124ub;
        this.b = un;
        this.c = un2;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3099tb<Rf.m, Fn> b(Gb gb) {
        C3099tb<Rf.n, Fn> c3099tbB;
        Rf.m mVar = new Rf.m();
        Qn<String, Fn> qnA = this.b.a(gb.a);
        mVar.b = O2.c(qnA.a);
        Qn<String, Fn> qnA2 = this.c.a(gb.b);
        mVar.c = O2.c(qnA2.a);
        Hb hb = gb.c;
        if (hb != null) {
            c3099tbB = this.a.b(hb);
            mVar.d = c3099tbB.a;
        } else {
            c3099tbB = null;
        }
        return new C3099tb<>(mVar, En.a(qnA, qnA2, c3099tbB));
    }
}
