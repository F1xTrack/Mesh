package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2906Rf;

/* renamed from: com.yandex.metrica.impl.ob.gb */
/* loaded from: classes2.dex */
public class C3283gb implements InterfaceC3230ea<C3751yb, C3621tb<C2906Rf.a, InterfaceC2615Fn>> {

    /* renamed from: a */
    private final C3387kb f23503a;

    /* renamed from: b */
    private final C2989Un f23504b;

    public C3283gb() {
        this(new C3387kb(), new C2989Un(20));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C3751yb mo13846a(C3621tb<C2906Rf.a, InterfaceC2615Fn> c3621tb) {
        throw new UnsupportedOperationException();
    }

    public C3283gb(C3387kb c3387kb, C2989Un c2989Un) {
        this.f23503a = c3387kb;
        this.f23504b = c2989Un;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3621tb<C2906Rf.a, InterfaceC2615Fn> mo13847b(C3751yb c3751yb) {
        C2906Rf.a aVar = new C2906Rf.a();
        aVar.f22137c = this.f23503a.mo13847b(c3751yb.f25301a);
        C2890Qn<String, InterfaceC2615Fn> c2890QnMo15090a = this.f23504b.mo15090a(c3751yb.f25302b);
        aVar.f22136b = C2819O2.m14689c(c2890QnMo15090a.f22084a);
        return new C3621tb<>(aVar, C2590En.m14050a(c2890QnMo15090a));
    }
}
