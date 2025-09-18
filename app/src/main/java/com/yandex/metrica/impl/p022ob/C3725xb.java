package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2906Rf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.xb */
/* loaded from: classes2.dex */
public class C3725xb implements InterfaceC3413lb<C2728Kb> {

    /* renamed from: a */
    private final C3647ub f25236a;

    public C3725xb() {
        this(new C3647ub());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public Object mo13846a(List<C3621tb<C2906Rf, InterfaceC2615Fn>> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: b */
    public List<C3621tb<C2906Rf, InterfaceC2615Fn>> mo13847b(Object obj) {
        C2906Rf c2906Rf = new C2906Rf();
        c2906Rf.f22129b = 1;
        c2906Rf.f22130c = new C2906Rf.q();
        C3621tb<C2906Rf.n, InterfaceC2615Fn> c3621tbMo13847b = this.f25236a.mo13847b(((C2728Kb) obj).f21581b);
        c2906Rf.f22130c.f22182b = c3621tbMo13847b.f24816a;
        return Collections.singletonList(new C3621tb(c2906Rf, C2590En.m14050a(c3621tbMo13847b)));
    }

    public C3725xb(C3647ub c3647ub) {
        this.f25236a = c3647ub;
    }
}
