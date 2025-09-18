package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.yandex.metrica.impl.ob.C2880kg;
import com.yandex.metrica.impl.ob.C2982oi;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public class Y9 implements InterfaceC2725ea<C2982oi, C2880kg.a> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.a b(C2982oi c2982oi) {
        C2880kg.a.C0014a c0014a;
        C2880kg.a aVar = new C2880kg.a();
        aVar.b = new C2880kg.a.b[c2982oi.a.size()];
        for (int i = 0; i < c2982oi.a.size(); i++) {
            C2880kg.a.b bVar = new C2880kg.a.b();
            Pair<String, C2982oi.a> pair = c2982oi.a.get(i);
            bVar.b = (String) pair.first;
            if (pair.second != null) {
                bVar.c = new C2880kg.a.C0014a();
                C2982oi.a aVar2 = (C2982oi.a) pair.second;
                if (aVar2 == null) {
                    c0014a = null;
                } else {
                    C2880kg.a.C0014a c0014a2 = new C2880kg.a.C0014a();
                    c0014a2.b = aVar2.a;
                    c0014a = c0014a2;
                }
                bVar.c = c0014a;
            }
            aVar.b[i] = bVar;
        }
        return aVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public C2982oi a(C2880kg.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (C2880kg.a.b bVar : aVar.b) {
            String str = bVar.b;
            C2880kg.a.C0014a c0014a = bVar.c;
            arrayList.add(new Pair(str, c0014a == null ? null : new C2982oi.a(c0014a.b)));
        }
        return new C2982oi(arrayList);
    }
}
