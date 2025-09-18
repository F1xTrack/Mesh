package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3242em;
import com.yandex.metrica.impl.p022ob.C3392kg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.Ia */
/* loaded from: classes2.dex */
class C2677Ia implements InterfaceC3230ea<List<C3242em>, C3392kg.x[]> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3392kg.x[] mo13847b(List<C3242em> list) {
        C3392kg.x[] xVarArr = new C3392kg.x[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C3242em c3242em = list.get(i);
            C3392kg.x xVar = new C3392kg.x();
            xVar.f24119b = c3242em.f23374a.f23381a;
            xVar.f24120c = c3242em.f23375b;
            xVarArr[i] = xVar;
        }
        return xVarArr;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public List<C3242em> mo13846a(C3392kg.x[] xVarArr) {
        ArrayList arrayList = new ArrayList(xVarArr.length);
        for (C3392kg.x xVar : xVarArr) {
            arrayList.add(new C3242em(C3242em.b.m15861a(xVar.f24119b), xVar.f24120c));
        }
        return arrayList;
    }
}
