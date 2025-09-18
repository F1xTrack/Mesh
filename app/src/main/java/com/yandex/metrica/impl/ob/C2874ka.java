package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import com.yandex.metrica.impl.ob.C3081si;

/* renamed from: com.yandex.metrica.impl.ob.ka, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2874ka implements InterfaceC2725ea {
    private final Z1 a;

    public C2874ka() {
        this(new Mi());
    }

    public C2874ka(Z1 z1) {
        this.a = z1;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.i b(C3081si c3081si) {
        C2880kg.i iVar = new C2880kg.i();
        iVar.e = c3081si.d;
        iVar.d = c3081si.c;
        iVar.c = c3081si.b;
        iVar.b = c3081si.a;
        iVar.k = c3081si.e;
        iVar.l = c3081si.f;
        iVar.f = c3081si.o;
        iVar.i = c3081si.s;
        iVar.j = c3081si.t;
        iVar.t = c3081si.p;
        iVar.g = c3081si.q;
        iVar.o = c3081si.i;
        iVar.h = c3081si.r;
        iVar.n = c3081si.h;
        iVar.m = c3081si.g;
        iVar.p = c3081si.j;
        iVar.q = c3081si.k;
        iVar.r = c3081si.m;
        iVar.w = c3081si.n;
        iVar.s = c3081si.l;
        iVar.u = c3081si.u;
        iVar.v = c3081si.v;
        iVar.x = c3081si.w;
        iVar.y = c3081si.x;
        iVar.z = this.a.a(c3081si.y);
        return iVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C3081si a(C2880kg.i iVar) {
        return new C3081si(new C3081si.a().d(iVar.b).p(iVar.j).c(iVar.i).q(iVar.t).x(iVar.h).w(iVar.g).g(iVar.f).f(iVar.e).o(iVar.k).j(iVar.l).n(iVar.d).m(iVar.c).v(iVar.o).k(iVar.n).l(iVar.m).h(iVar.p).t(iVar.q).s(iVar.r).u(iVar.w).r(iVar.s).a(iVar.u).b(iVar.v).i(iVar.x).e(iVar.y).a(this.a.a(iVar.z)));
    }
}
