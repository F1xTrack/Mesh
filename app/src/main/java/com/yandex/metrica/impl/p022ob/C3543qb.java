package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C2906Rf;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.qb */
/* loaded from: classes2.dex */
public class C3543qb implements InterfaceC3230ea<List<String>, C3621tb<C2906Rf.l[], InterfaceC2615Fn>> {

    /* renamed from: a */
    private final C2964Tn f24539a;

    public C3543qb() {
        this(new C2964Tn(20, 100));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public List<String> mo13846a(C3621tb<C2906Rf.l[], InterfaceC2615Fn> c3621tb) {
        throw new UnsupportedOperationException();
    }

    public C3543qb(C2964Tn c2964Tn) {
        this.f24539a = c2964Tn;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3621tb<C2906Rf.l[], InterfaceC2615Fn> mo13847b(List<String> list) {
        C2890Qn<List<Object>, C2665Hn> c2890QnMo15090a = this.f24539a.mo15090a((List<Object>) list);
        List<Object> list2 = c2890QnMo15090a.f22084a;
        C2906Rf.l[] lVarArr = new C2906Rf.l[0];
        if (list2 != null) {
            lVarArr = new C2906Rf.l[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                C2906Rf.l lVar = new C2906Rf.l();
                lVarArr[i] = lVar;
                lVar.f22170b = C2819O2.m14689c((String) list2.get(i));
            }
        }
        return new C3621tb<>(lVarArr, c2890QnMo15090a.f22085b);
    }
}
