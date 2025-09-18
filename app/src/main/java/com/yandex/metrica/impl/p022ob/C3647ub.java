package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2906Rf;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.ub */
/* loaded from: classes2.dex */
public class C3647ub implements InterfaceC3230ea<C2653Hb, C3621tb<C2906Rf.n, InterfaceC2615Fn>> {

    /* renamed from: a */
    private final C3465nb f24903a;

    /* renamed from: b */
    private final C3361jb f24904b;

    /* renamed from: c */
    private final C2989Un f24905c;

    /* renamed from: d */
    private final C2989Un f24906d;

    public C3647ub() {
        this(new C3465nb(), new C3361jb(), new C2989Un(100), new C2989Un(1000));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C2653Hb mo13846a(C3621tb<C2906Rf.n, InterfaceC2615Fn> c3621tb) {
        throw new UnsupportedOperationException();
    }

    public C3647ub(C3465nb c3465nb, C3361jb c3361jb, C2989Un c2989Un, C2989Un c2989Un2) {
        this.f24903a = c3465nb;
        this.f24904b = c3361jb;
        this.f24905c = c2989Un;
        this.f24906d = c2989Un2;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3621tb<C2906Rf.n, InterfaceC2615Fn> mo13847b(C2653Hb c2653Hb) {
        C3621tb<C2906Rf.d, InterfaceC2615Fn> c3621tbMo13847b;
        C2906Rf.n nVar = new C2906Rf.n();
        C2890Qn<String, InterfaceC2615Fn> c2890QnMo15090a = this.f24905c.mo15090a(c2653Hb.f21355a);
        nVar.f22174b = C2819O2.m14689c(c2890QnMo15090a.f22084a);
        List<String> list = c2653Hb.f21356b;
        C3621tb<C2906Rf.i, InterfaceC2615Fn> c3621tbMo13847b2 = null;
        if (list != null) {
            c3621tbMo13847b = this.f24904b.mo13847b(list);
            nVar.f22175c = c3621tbMo13847b.f24816a;
        } else {
            c3621tbMo13847b = null;
        }
        C2890Qn<String, InterfaceC2615Fn> c2890QnMo15090a2 = this.f24906d.mo15090a(c2653Hb.f21357c);
        nVar.f22176d = C2819O2.m14689c(c2890QnMo15090a2.f22084a);
        Map<String, String> map = c2653Hb.f21358d;
        if (map != null) {
            c3621tbMo13847b2 = this.f24903a.mo13847b(map);
            nVar.f22177e = c3621tbMo13847b2.f24816a;
        }
        return new C3621tb<>(nVar, C2590En.m14050a(c2890QnMo15090a, c3621tbMo13847b, c2890QnMo15090a2, c3621tbMo13847b2));
    }
}
