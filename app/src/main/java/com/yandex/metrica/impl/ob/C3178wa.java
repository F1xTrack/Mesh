package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2756fg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.wa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3178wa implements InterfaceC2725ea<List<C2829ie>, C2756fg> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public List<C2829ie> a(C2756fg c2756fg) {
        C2756fg c2756fg2 = c2756fg;
        ArrayList arrayList = new ArrayList(c2756fg2.b.length);
        int i = 0;
        while (true) {
            C2756fg.a[] aVarArr = c2756fg2.b;
            if (i >= aVarArr.length) {
                return arrayList;
            }
            C2756fg.a aVar = aVarArr[i];
            arrayList.add(new C2829ie(aVar.b, aVar.c));
            i++;
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2756fg b(List<C2829ie> list) {
        List<C2829ie> list2 = list;
        C2756fg c2756fg = new C2756fg();
        c2756fg.b = new C2756fg.a[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            C2756fg.a[] aVarArr = c2756fg.b;
            C2829ie c2829ie = list2.get(i);
            C2756fg.a aVar = new C2756fg.a();
            aVar.b = c2829ie.a;
            aVar.c = c2829ie.b;
            aVarArr[i] = aVar;
        }
        return c2756fg;
    }
}
