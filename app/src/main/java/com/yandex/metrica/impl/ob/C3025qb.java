package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Rf;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.qb, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3025qb implements InterfaceC2725ea<List<String>, C3099tb<Rf.l[], Fn>> {
    private final Tn a;

    public C3025qb() {
        this(new Tn(20, 100));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public List<String> a(C3099tb<Rf.l[], Fn> c3099tb) {
        throw new UnsupportedOperationException();
    }

    public C3025qb(Tn tn) {
        this.a = tn;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3099tb<Rf.l[], Fn> b(List<String> list) {
        Qn<List<Object>, Hn> qnA = this.a.a((List<Object>) list);
        List<Object> list2 = qnA.a;
        Rf.l[] lVarArr = new Rf.l[0];
        if (list2 != null) {
            lVarArr = new Rf.l[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                Rf.l lVar = new Rf.l();
                lVarArr[i] = lVar;
                lVar.b = O2.c((String) list2.get(i));
            }
        }
        return new C3099tb<>(lVarArr, qnA.b);
    }
}
