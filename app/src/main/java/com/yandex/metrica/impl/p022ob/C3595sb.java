package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2906Rf;

/* renamed from: com.yandex.metrica.impl.ob.sb */
/* loaded from: classes2.dex */
public class C3595sb implements InterfaceC3230ea<C2628Gb, C3621tb<C2906Rf.m, InterfaceC2615Fn>> {

    /* renamed from: a */
    private final C3647ub f24665a;

    /* renamed from: b */
    private final C2989Un f24666b;

    /* renamed from: c */
    private final C2989Un f24667c;

    public C3595sb() {
        this(new C3647ub(), new C2989Un(100), new C2989Un(2048));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C2628Gb mo13846a(C3621tb<C2906Rf.m, InterfaceC2615Fn> c3621tb) {
        throw new UnsupportedOperationException();
    }

    public C3595sb(C3647ub c3647ub, C2989Un c2989Un, C2989Un c2989Un2) {
        this.f24665a = c3647ub;
        this.f24666b = c2989Un;
        this.f24667c = c2989Un2;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3621tb<C2906Rf.m, InterfaceC2615Fn> mo13847b(C2628Gb c2628Gb) {
        C3621tb<C2906Rf.n, InterfaceC2615Fn> c3621tbMo13847b;
        C2906Rf.m mVar = new C2906Rf.m();
        C2890Qn<String, InterfaceC2615Fn> c2890QnMo15090a = this.f24666b.mo15090a(c2628Gb.f21302a);
        mVar.f22171b = C2819O2.m14689c(c2890QnMo15090a.f22084a);
        C2890Qn<String, InterfaceC2615Fn> c2890QnMo15090a2 = this.f24667c.mo15090a(c2628Gb.f21303b);
        mVar.f22172c = C2819O2.m14689c(c2890QnMo15090a2.f22084a);
        C2653Hb c2653Hb = c2628Gb.f21304c;
        if (c2653Hb != null) {
            c3621tbMo13847b = this.f24665a.mo13847b(c2653Hb);
            mVar.f22173d = c3621tbMo13847b.f24816a;
        } else {
            c3621tbMo13847b = null;
        }
        return new C3621tb<>(mVar, C2590En.m14050a(c2890QnMo15090a, c2890QnMo15090a2, c3621tbMo13847b));
    }
}
