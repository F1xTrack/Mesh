package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2906Rf;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ob */
/* loaded from: classes2.dex */
public class C3491ob implements InterfaceC3230ea<C2553Db, C3621tb<C2906Rf.j, InterfaceC2615Fn>> {

    /* renamed from: a */
    private final C3283gb f24372a;

    /* renamed from: b */
    private final C2753Lb f24373b;

    public C3491ob() {
        this(new C3283gb(), new C2753Lb(30));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C2553Db mo13846a(C3621tb<C2906Rf.j, InterfaceC2615Fn> c3621tb) {
        throw new UnsupportedOperationException();
    }

    public C3491ob(C3283gb c3283gb, C2753Lb c2753Lb) {
        this.f24372a = c3283gb;
        this.f24373b = c2753Lb;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C3621tb<C2906Rf.j, InterfaceC2615Fn> mo13847b(C2553Db c2553Db) {
        int iMo14051a;
        C2906Rf.j jVar = new C2906Rf.j();
        C3621tb<C2906Rf.a, InterfaceC2615Fn> c3621tbMo13847b = this.f24372a.mo13847b(c2553Db.f21015a);
        jVar.f22160b = c3621tbMo13847b.f24816a;
        C2890Qn<List<Object>, C2665Hn> c2890QnMo15090a = this.f24373b.mo15090a((List<Object>) c2553Db.f21016b);
        if (C2968U2.m15249b(c2890QnMo15090a.f22084a)) {
            iMo14051a = 0;
        } else {
            jVar.f22161c = new C2906Rf.a[c2890QnMo15090a.f22084a.size()];
            iMo14051a = 0;
            for (int i = 0; i < c2890QnMo15090a.f22084a.size(); i++) {
                C3621tb<C2906Rf.a, InterfaceC2615Fn> c3621tbMo13847b2 = this.f24372a.mo13847b((C3751yb) c2890QnMo15090a.f22084a.get(i));
                jVar.f22161c[i] = c3621tbMo13847b2.f24816a;
                iMo14051a += c3621tbMo13847b2.f24817b.mo14051a();
            }
        }
        return new C3621tb<>(jVar, C2590En.m14050a(c3621tbMo13847b, c2890QnMo15090a, new C2590En(iMo14051a)));
    }
}
