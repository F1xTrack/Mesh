package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2906Rf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.hb */
/* loaded from: classes2.dex */
public class C3309hb implements InterfaceC3413lb<C3777zb> {

    /* renamed from: a */
    private final C3335ib f23572a;

    public C3309hb() {
        this(new C3335ib());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public Object mo13846a(List<C3621tb<C2906Rf, InterfaceC2615Fn>> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: b */
    public List<C3621tb<C2906Rf, InterfaceC2615Fn>> mo13847b(Object obj) {
        C3777zb c3777zb = (C3777zb) obj;
        C2906Rf c2906Rf = new C2906Rf();
        c2906Rf.f22133f = new C2906Rf.b();
        C3621tb<C2906Rf.c, InterfaceC2615Fn> c3621tbMo13847b = this.f23572a.mo13847b(c3777zb.f25413c);
        c2906Rf.f22133f.f22138b = c3621tbMo13847b.f24816a;
        c2906Rf.f22129b = c3777zb.f25412b;
        return Collections.singletonList(new C3621tb(c2906Rf, C2590En.m14050a(c3621tbMo13847b)));
    }

    public C3309hb(C3335ib c3335ib) {
        this.f23572a = c3335ib;
    }
}
