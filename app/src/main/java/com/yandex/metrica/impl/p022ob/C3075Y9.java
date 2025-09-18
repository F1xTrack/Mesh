package com.yandex.metrica.impl.p022ob;

import android.util.Pair;
import com.yandex.metrica.impl.p022ob.C3392kg;
import com.yandex.metrica.impl.p022ob.C3498oi;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.Y9 */
/* loaded from: classes2.dex */
public class C3075Y9 implements InterfaceC3230ea<C3498oi, C3392kg.a> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3392kg.a mo13847b(C3498oi c3498oi) {
        C3392kg.a.C7308a c7308a;
        C3392kg.a aVar = new C3392kg.a();
        aVar.f23973b = new C3392kg.a.b[c3498oi.f24393a.size()];
        for (int i = 0; i < c3498oi.f24393a.size(); i++) {
            C3392kg.a.b bVar = new C3392kg.a.b();
            Pair<String, C3498oi.a> pair = c3498oi.f24393a.get(i);
            bVar.f23976b = (String) pair.first;
            if (pair.second != null) {
                bVar.f23977c = new C3392kg.a.C7308a();
                C3498oi.a aVar2 = (C3498oi.a) pair.second;
                if (aVar2 == null) {
                    c7308a = null;
                } else {
                    C3392kg.a.C7308a c7308a2 = new C3392kg.a.C7308a();
                    c7308a2.f23974b = aVar2.f24394a;
                    c7308a = c7308a2;
                }
                bVar.f23977c = c7308a;
            }
            aVar.f23973b[i] = bVar;
        }
        return aVar;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public C3498oi mo13846a(C3392kg.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (C3392kg.a.b bVar : aVar.f23973b) {
            String str = bVar.f23976b;
            C3392kg.a.C7308a c7308a = bVar.f23977c;
            arrayList.add(new Pair(str, c7308a == null ? null : new C3498oi.a(c7308a.f23974b)));
        }
        return new C3498oi(arrayList);
    }
}
