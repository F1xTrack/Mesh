package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3262fg;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.wa */
/* loaded from: classes2.dex */
public class C3698wa implements InterfaceC3230ea<List<C3338ie>, C3262fg> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public List<C3338ie> mo13846a(C3262fg c3262fg) {
        C3262fg c3262fg2 = c3262fg;
        ArrayList arrayList = new ArrayList(c3262fg2.f23438b.length);
        int i = 0;
        while (true) {
            C3262fg.a[] aVarArr = c3262fg2.f23438b;
            if (i >= aVarArr.length) {
                return arrayList;
            }
            C3262fg.a aVar = aVarArr[i];
            arrayList.add(new C3338ie(aVar.f23440b, aVar.f23441c));
            i++;
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: b */
    public C3262fg mo13847b(List<C3338ie> list) {
        List<C3338ie> list2 = list;
        C3262fg c3262fg = new C3262fg();
        c3262fg.f23438b = new C3262fg.a[list2.size()];
        for (int i = 0; i < list2.size(); i++) {
            C3262fg.a[] aVarArr = c3262fg.f23438b;
            C3338ie c3338ie = list2.get(i);
            C3262fg.a aVar = new C3262fg.a();
            aVar.f23440b = c3338ie.f23647a;
            aVar.f23441c = c3338ie.f23648b;
            aVarArr[i] = aVar;
        }
        return c3262fg;
    }
}
