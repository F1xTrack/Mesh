package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.va, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3148va implements InterfaceC2725ea {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.l[] b(List<C2829ie> list) {
        C2880kg.l[] lVarArr = new C2880kg.l[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C2829ie c2829ie = list.get(i);
            C2880kg.l lVar = new C2880kg.l();
            lVar.b = c2829ie.a;
            lVar.c = c2829ie.b;
            lVarArr[i] = lVar;
        }
        return lVarArr;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public List<C2829ie> a(C2880kg.l[] lVarArr) {
        ArrayList arrayList = new ArrayList(lVarArr.length);
        for (C2880kg.l lVar : lVarArr) {
            arrayList.add(new C2829ie(lVar.b, lVar.c));
        }
        return arrayList;
    }
}
