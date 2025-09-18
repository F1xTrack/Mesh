package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2906Rf;

/* renamed from: com.yandex.metrica.impl.ob.ib */
/* loaded from: classes2.dex */
public class C3335ib implements InterfaceC3230ea<C2478Ab, C3621tb<C2906Rf.c, InterfaceC2615Fn>> {

    /* renamed from: a */
    private final C3517pb f23634a;

    /* renamed from: b */
    private final C3387kb f23635b;

    /* renamed from: c */
    private final C3491ob f23636c;

    /* renamed from: d */
    private final C3595sb f23637d;

    public C3335ib() {
        this(new C3517pb(), new C3387kb(), new C3491ob(), new C3595sb());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public C2478Ab mo13846a(C3621tb<C2906Rf.c, InterfaceC2615Fn> c3621tb) {
        throw new UnsupportedOperationException();
    }

    public C3335ib(C3517pb c3517pb, C3387kb c3387kb, C3491ob c3491ob, C3595sb c3595sb) {
        this.f23634a = c3517pb;
        this.f23635b = c3387kb;
        this.f23636c = c3491ob;
        this.f23637d = c3595sb;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3621tb<C2906Rf.c, InterfaceC2615Fn> mo13847b(C2478Ab c2478Ab) {
        C3621tb<C2906Rf.m, InterfaceC2615Fn> c3621tbMo13847b;
        C2906Rf.c cVar = new C2906Rf.c();
        C3621tb<C2906Rf.k, InterfaceC2615Fn> c3621tbMo13847b2 = this.f23634a.mo13847b(c2478Ab.f20841a);
        cVar.f22139b = c3621tbMo13847b2.f24816a;
        cVar.f22141d = this.f23635b.mo13847b(c2478Ab.f20842b);
        C3621tb<C2906Rf.j, InterfaceC2615Fn> c3621tbMo13847b3 = this.f23636c.mo13847b(c2478Ab.f20843c);
        cVar.f22142e = c3621tbMo13847b3.f24816a;
        C2628Gb c2628Gb = c2478Ab.f20844d;
        if (c2628Gb != null) {
            c3621tbMo13847b = this.f23637d.mo13847b(c2628Gb);
            cVar.f22140c = c3621tbMo13847b.f24816a;
        } else {
            c3621tbMo13847b = null;
        }
        return new C3621tb<>(cVar, C2590En.m14050a(c3621tbMo13847b2, c3621tbMo13847b3, c3621tbMo13847b));
    }
}
