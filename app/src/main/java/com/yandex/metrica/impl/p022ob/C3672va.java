package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.va */
/* loaded from: classes2.dex */
public class C3672va implements InterfaceC3230ea {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3392kg.l[] mo13847b(List<C3338ie> list) {
        C3392kg.l[] lVarArr = new C3392kg.l[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C3338ie c3338ie = list.get(i);
            C3392kg.l lVar = new C3392kg.l();
            lVar.f24058b = c3338ie.f23647a;
            lVar.f24059c = c3338ie.f23648b;
            lVarArr[i] = lVar;
        }
        return lVarArr;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<C3338ie> mo13846a(C3392kg.l[] lVarArr) {
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (C3392kg.l lVar : lVarArr) {
            arrayList.add(new C3338ie(lVar.f24058b, lVar.f24059c));
        }
        return arrayList;
    }
}
