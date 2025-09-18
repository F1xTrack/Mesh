package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.qa */
/* loaded from: classes2.dex */
public class C3542qa implements InterfaceC3230ea {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3392kg.y.a[] mo13847b(List<C2804Nc> list) {
        C3392kg.y.a[] aVarArr = new C3392kg.y.a[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C2804Nc c2804Nc = list.get(i);
            C3392kg.y.a aVar = new C3392kg.y.a();
            aVar.f24125b = c2804Nc.f21772a;
            aVar.f24126c = c2804Nc.f21773b;
            aVarArr[i] = aVar;
        }
        return aVarArr;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List<C2804Nc> mo13846a(C3392kg.y.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (C3392kg.y.a aVar : aVarArr) {
            arrayList.add(new C2804Nc(aVar.f24125b, aVar.f24126c));
        }
        return arrayList;
    }
}
