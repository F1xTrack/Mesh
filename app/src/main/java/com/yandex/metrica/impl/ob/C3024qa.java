package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.qa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3024qa implements InterfaceC2725ea {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.y.a[] b(List<Nc> list) {
        C2880kg.y.a[] aVarArr = new C2880kg.y.a[list.size()];
        for (int i = 0; i < list.size(); i++) {
            Nc nc = list.get(i);
            C2880kg.y.a aVar = new C2880kg.y.a();
            aVar.b = nc.a;
            aVar.c = nc.b;
            aVarArr[i] = aVar;
        }
        return aVarArr;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public List<Nc> a(C2880kg.y.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (C2880kg.y.a aVar : aVarArr) {
            arrayList.add(new Nc(aVar.b, aVar.c));
        }
        return arrayList;
    }
}
