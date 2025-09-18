package com.yandex.metrica.impl.p022ob;

import android.util.Pair;
import com.yandex.metrica.impl.p022ob.C2510Bi;
import com.yandex.metrica.impl.p022ob.C3392kg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.za */
/* loaded from: classes2.dex */
public class C3776za implements InterfaceC3230ea {

    /* renamed from: a */
    private static final Map<Integer, C2510Bi.a> f25410a = Collections.unmodifiableMap(new a());

    /* renamed from: b */
    private static final Map<C2510Bi.a, Integer> f25411b = Collections.unmodifiableMap(new b());

    /* renamed from: com.yandex.metrica.impl.ob.za$a */
    public class a extends HashMap<Integer, C2510Bi.a> {
        public a() {
            put(1, C2510Bi.a.WIFI);
            put(2, C2510Bi.a.CELL);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.za$b */
    public class b extends HashMap<C2510Bi.a, Integer> {
        public b() {
            put(C2510Bi.a.WIFI, 1);
            put(C2510Bi.a.CELL, 2);
        }
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3392kg.n mo13847b(C2510Bi c2510Bi) {
        C3392kg.n nVar = new C3392kg.n();
        nVar.f24063b = c2510Bi.f20936a;
        nVar.f24064c = c2510Bi.f20937b;
        nVar.f24065d = c2510Bi.f20938c;
        List<Pair<String, String>> list = c2510Bi.f20939d;
        C3392kg.n.a[] aVarArr = new C3392kg.n.a[list.size()];
        int i = 0;
        for (Pair<String, String> pair : list) {
            C3392kg.n.a aVar = new C3392kg.n.a();
            aVar.f24070b = (String) pair.first;
            aVar.f24071c = (String) pair.second;
            aVarArr[i] = aVar;
            i++;
        }
        nVar.f24066e = aVarArr;
        Long l = c2510Bi.f20940e;
        nVar.f24067f = l == null ? 0L : l.longValue();
        List<C2510Bi.a> list2 = c2510Bi.f20941f;
        int[] iArr = new int[list2.size()];
        for (int i2 = 0; i2 < list2.size(); i2++) {
            iArr[i2] = f25411b.get(list2.get(i2)).intValue();
        }
        nVar.f24068g = iArr;
        return nVar;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2510Bi mo13846a(C3392kg.n nVar) {
        String str = nVar.f24063b;
        String str2 = nVar.f24064c;
        String str3 = nVar.f24065d;
        C3392kg.n.a[] aVarArr = nVar.f24066e;
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (C3392kg.n.a aVar : aVarArr) {
            arrayList.add(new Pair(aVar.f24070b, aVar.f24071c));
        }
        Long lValueOf = Long.valueOf(nVar.f24067f);
        int[] iArr = nVar.f24068g;
        ArrayList arrayList2 = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList2.add(f25410a.get(Integer.valueOf(i)));
        }
        return new C2510Bi(str, str2, str3, arrayList, lValueOf, arrayList2);
    }
}
