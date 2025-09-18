package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2737em;
import com.yandex.metrica.impl.ob.C2880kg;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
class Ia implements InterfaceC2725ea<List<C2737em>, C2880kg.x[]> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.x[] b(List<C2737em> list) {
        C2880kg.x[] xVarArr = new C2880kg.x[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C2737em c2737em = list.get(i);
            C2880kg.x xVar = new C2880kg.x();
            xVar.b = c2737em.a.a;
            xVar.c = c2737em.b;
            xVarArr[i] = xVar;
        }
        return xVarArr;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public List<C2737em> a(C2880kg.x[] xVarArr) {
        ArrayList arrayList = new ArrayList(xVarArr.length);
        for (C2880kg.x xVar : xVarArr) {
            arrayList.add(new C2737em(C2737em.b.a(xVar.b), xVar.c));
        }
        return arrayList;
    }
}
