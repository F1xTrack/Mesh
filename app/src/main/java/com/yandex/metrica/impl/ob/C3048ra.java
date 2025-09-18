package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;

/* renamed from: com.yandex.metrica.impl.ob.ra, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3048ra implements InterfaceC2725ea {
    private final C2924ma a;
    private final C2974oa b;

    public C3048ra() {
        this(new C2924ma(), new C2974oa());
    }

    public C3048ra(C2924ma c2924ma, C2974oa c2974oa) {
        this.a = c2924ma;
        this.b = c2974oa;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.k.a b(Uc uc) {
        C2880kg.k.a aVar = new C2880kg.k.a();
        aVar.b = uc.a;
        aVar.c = uc.b;
        aVar.d = uc.c;
        aVar.e = uc.d;
        aVar.f = uc.e;
        aVar.g = uc.f;
        aVar.h = uc.g;
        aVar.k = uc.h;
        aVar.i = uc.i;
        aVar.j = uc.j;
        aVar.q = uc.k;
        aVar.r = uc.l;
        Ec ec = uc.m;
        if (ec != null) {
            aVar.l = this.a.b(ec);
        }
        Ec ec2 = uc.n;
        if (ec2 != null) {
            aVar.m = this.a.b(ec2);
        }
        Ec ec3 = uc.o;
        if (ec3 != null) {
            aVar.n = this.a.b(ec3);
        }
        Ec ec4 = uc.p;
        if (ec4 != null) {
            aVar.o = this.a.b(ec4);
        }
        Jc jc = uc.q;
        if (jc != null) {
            aVar.p = this.b.b(jc);
        }
        return aVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Uc a(C2880kg.k.a aVar) {
        C2880kg.k.a.C0015a c0015a = aVar.l;
        Ec ecA = c0015a != null ? this.a.a(c0015a) : null;
        C2880kg.k.a.C0015a c0015a2 = aVar.m;
        Ec ecA2 = c0015a2 != null ? this.a.a(c0015a2) : null;
        C2880kg.k.a.C0015a c0015a3 = aVar.n;
        Ec ecA3 = c0015a3 != null ? this.a.a(c0015a3) : null;
        C2880kg.k.a.C0015a c0015a4 = aVar.o;
        Ec ecA4 = c0015a4 != null ? this.a.a(c0015a4) : null;
        C2880kg.k.a.b bVar = aVar.p;
        return new Uc(aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g, aVar.h, aVar.k, aVar.i, aVar.j, aVar.q, aVar.r, ecA, ecA2, ecA3, ecA4, bVar != null ? this.b.a(bVar) : null);
    }
}
