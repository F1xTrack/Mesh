package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2906Rf;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.pb */
/* loaded from: classes2.dex */
public class C3517pb implements InterfaceC3230ea<C2578Eb, C3621tb<C2906Rf.k, InterfaceC2615Fn>> {

    /* renamed from: a */
    private final C3465nb f24435a;

    /* renamed from: b */
    private final C3491ob f24436b;

    /* renamed from: c */
    private final C3361jb f24437c;

    /* renamed from: d */
    private final C3543qb f24438d;

    /* renamed from: e */
    private final C2989Un f24439e;

    /* renamed from: f */
    private final C2989Un f24440f;

    public C3517pb() {
        this(new C3465nb(), new C3491ob(), new C3361jb(), new C3543qb(), new C2989Un(100), new C2989Un(1000));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C2578Eb mo13846a(C3621tb<C2906Rf.k, InterfaceC2615Fn> c3621tb) {
        throw new UnsupportedOperationException();
    }

    public C3517pb(C3465nb c3465nb, C3491ob c3491ob, C3361jb c3361jb, C3543qb c3543qb, C2989Un c2989Un, C2989Un c2989Un2) {
        this.f24435a = c3465nb;
        this.f24436b = c3491ob;
        this.f24437c = c3361jb;
        this.f24438d = c3543qb;
        this.f24439e = c2989Un;
        this.f24440f = c2989Un2;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C3621tb<C2906Rf.k, InterfaceC2615Fn> mo13847b(C2578Eb c2578Eb) {
        C3621tb<C2906Rf.d, InterfaceC2615Fn> c3621tbMo13847b;
        C3621tb<C2906Rf.i, InterfaceC2615Fn> c3621tbMo13847b2;
        C3621tb<C2906Rf.j, InterfaceC2615Fn> c3621tbMo13847b3;
        C3621tb<C2906Rf.j, InterfaceC2615Fn> c3621tbMo13847b4;
        C2906Rf.k kVar = new C2906Rf.k();
        C2890Qn<String, InterfaceC2615Fn> c2890QnMo15090a = this.f24439e.mo15090a(c2578Eb.f21104a);
        kVar.f22162b = C2819O2.m14689c(c2890QnMo15090a.f22084a);
        C2890Qn<String, InterfaceC2615Fn> c2890QnMo15090a2 = this.f24440f.mo15090a(c2578Eb.f21105b);
        kVar.f22163c = C2819O2.m14689c(c2890QnMo15090a2.f22084a);
        List<String> list = c2578Eb.f21106c;
        C3621tb<C2906Rf.l[], InterfaceC2615Fn> c3621tbMo13847b5 = null;
        if (list != null) {
            c3621tbMo13847b = this.f24437c.mo13847b(list);
            kVar.f22164d = c3621tbMo13847b.f24816a;
        } else {
            c3621tbMo13847b = null;
        }
        Map<String, String> map = c2578Eb.f21107d;
        if (map != null) {
            c3621tbMo13847b2 = this.f24435a.mo13847b(map);
            kVar.f22165e = c3621tbMo13847b2.f24816a;
        } else {
            c3621tbMo13847b2 = null;
        }
        C2553Db c2553Db = c2578Eb.f21108e;
        if (c2553Db != null) {
            c3621tbMo13847b3 = this.f24436b.mo13847b(c2553Db);
            kVar.f22166f = c3621tbMo13847b3.f24816a;
        } else {
            c3621tbMo13847b3 = null;
        }
        C2553Db c2553Db2 = c2578Eb.f21109f;
        if (c2553Db2 != null) {
            c3621tbMo13847b4 = this.f24436b.mo13847b(c2553Db2);
            kVar.f22167g = c3621tbMo13847b4.f24816a;
        } else {
            c3621tbMo13847b4 = null;
        }
        List<String> list2 = c2578Eb.f21110g;
        if (list2 != null) {
            c3621tbMo13847b5 = this.f24438d.mo13847b(list2);
            kVar.f22168h = c3621tbMo13847b5.f24816a;
        }
        return new C3621tb<>(kVar, C2590En.m14050a(c2890QnMo15090a, c2890QnMo15090a2, c3621tbMo13847b, c3621tbMo13847b2, c3621tbMo13847b3, c3621tbMo13847b4, c3621tbMo13847b5));
    }
}
