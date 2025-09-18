package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2906Rf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.vb */
/* loaded from: classes2.dex */
public class C3673vb implements InterfaceC3413lb<C2678Ib> {

    /* renamed from: a */
    private final C3647ub f25003a;

    /* renamed from: b */
    private final C3517pb f25004b;

    public C3673vb() {
        this(new C3647ub(), new C3517pb());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public Object mo13846a(List<C3621tb<C2906Rf, InterfaceC2615Fn>> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: b */
    public List<C3621tb<C2906Rf, InterfaceC2615Fn>> mo13847b(Object obj) {
        C2678Ib c2678Ib = (C2678Ib) obj;
        C2906Rf c2906Rf = new C2906Rf();
        c2906Rf.f22129b = 2;
        c2906Rf.f22131d = new C2906Rf.o();
        C3621tb<C2906Rf.n, InterfaceC2615Fn> c3621tbMo13847b = this.f25003a.mo13847b(c2678Ib.f21426c);
        c2906Rf.f22131d.f22179c = c3621tbMo13847b.f24816a;
        C3621tb<C2906Rf.k, InterfaceC2615Fn> c3621tbMo13847b2 = this.f25004b.mo13847b(c2678Ib.f21425b);
        c2906Rf.f22131d.f22178b = c3621tbMo13847b2.f24816a;
        return Collections.singletonList(new C3621tb(c2906Rf, C2590En.m14050a(c3621tbMo13847b, c3621tbMo13847b2)));
    }

    public C3673vb(C3647ub c3647ub, C3517pb c3517pb) {
        this.f25003a = c3647ub;
        this.f25004b = c3517pb;
    }
}
