package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2906Rf;
import java.util.Collections;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.wb */
/* loaded from: classes2.dex */
public class C3699wb implements InterfaceC3413lb<C2703Jb> {

    /* renamed from: a */
    private final C3517pb f25168a;

    /* renamed from: b */
    private final C3595sb f25169b;

    public C3699wb() {
        this(new C3517pb(), new C3595sb());
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public Object mo13846a(List<C3621tb<C2906Rf, InterfaceC2615Fn>> list) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: b */
    public List<C3621tb<C2906Rf, InterfaceC2615Fn>> mo13847b(Object obj) {
        C3621tb<C2906Rf.m, InterfaceC2615Fn> c3621tbMo13847b;
        C2703Jb c2703Jb = (C2703Jb) obj;
        C2906Rf c2906Rf = new C2906Rf();
        c2906Rf.f22129b = 3;
        c2906Rf.f22132e = new C2906Rf.p();
        C3621tb<C2906Rf.k, InterfaceC2615Fn> c3621tbMo13847b2 = this.f25168a.mo13847b(c2703Jb.f21546b);
        c2906Rf.f22132e.f22180b = c3621tbMo13847b2.f24816a;
        C2628Gb c2628Gb = c2703Jb.f21547c;
        if (c2628Gb != null) {
            c3621tbMo13847b = this.f25169b.mo13847b(c2628Gb);
            c2906Rf.f22132e.f22181c = c3621tbMo13847b.f24816a;
        } else {
            c3621tbMo13847b = null;
        }
        return Collections.singletonList(new C3621tb(c2906Rf, C2590En.m14050a(c3621tbMo13847b2, c3621tbMo13847b)));
    }

    public C3699wb(C3517pb c3517pb, C3595sb c3595sb) {
        this.f25168a = c3517pb;
        this.f25169b = c3595sb;
    }
}
