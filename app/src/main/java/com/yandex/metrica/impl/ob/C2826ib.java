package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Rf;

/* renamed from: com.yandex.metrica.impl.ob.ib, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2826ib implements InterfaceC2725ea<Ab, C3099tb<Rf.c, Fn>> {
    private final C3000pb a;
    private final C2875kb b;
    private final C2975ob c;
    private final C3074sb d;

    public C2826ib() {
        this(new C3000pb(), new C2875kb(), new C2975ob(), new C3074sb());
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Ab a(C3099tb<Rf.c, Fn> c3099tb) {
        throw new UnsupportedOperationException();
    }

    public C2826ib(C3000pb c3000pb, C2875kb c2875kb, C2975ob c2975ob, C3074sb c3074sb) {
        this.a = c3000pb;
        this.b = c2875kb;
        this.c = c2975ob;
        this.d = c3074sb;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3099tb<Rf.c, Fn> b(Ab ab) {
        C3099tb<Rf.m, Fn> c3099tbB;
        Rf.c cVar = new Rf.c();
        C3099tb<Rf.k, Fn> c3099tbB2 = this.a.b(ab.a);
        cVar.b = c3099tbB2.a;
        cVar.d = this.b.b(ab.b);
        C3099tb<Rf.j, Fn> c3099tbB3 = this.c.b(ab.c);
        cVar.e = c3099tbB3.a;
        Gb gb = ab.d;
        if (gb != null) {
            c3099tbB = this.d.b(gb);
            cVar.c = c3099tbB.a;
        } else {
            c3099tbB = null;
        }
        return new C3099tb<>(cVar, En.a(c3099tbB2, c3099tbB3, c3099tbB));
    }
}
