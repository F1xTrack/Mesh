package com.yandex.metrica.impl.ob;

import android.util.Pair;
import com.yandex.metrica.impl.ob.Bi;
import com.yandex.metrica.impl.ob.C2880kg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.za, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3253za implements InterfaceC2725ea {
    private static final Map<Integer, Bi.a> a = Collections.unmodifiableMap(new a());
    private static final Map<Bi.a, Integer> b = Collections.unmodifiableMap(new b());

    /* renamed from: com.yandex.metrica.impl.ob.za$a */
    public class a extends HashMap<Integer, Bi.a> {
        public a() {
            put(1, Bi.a.WIFI);
            put(2, Bi.a.CELL);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.za$b */
    public class b extends HashMap<Bi.a, Integer> {
        public b() {
            put(Bi.a.WIFI, 1);
            put(Bi.a.CELL, 2);
        }
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2880kg.n b(Bi bi) {
        C2880kg.n nVar = new C2880kg.n();
        nVar.b = bi.a;
        nVar.c = bi.b;
        nVar.d = bi.c;
        List<Pair<String, String>> list = bi.d;
        C2880kg.n.a[] aVarArr = new C2880kg.n.a[list.size()];
        int i = 0;
        for (Pair<String, String> pair : list) {
            C2880kg.n.a aVar = new C2880kg.n.a();
            aVar.b = (String) pair.first;
            aVar.c = (String) pair.second;
            aVarArr[i] = aVar;
            i++;
        }
        nVar.e = aVarArr;
        Long l = bi.e;
        nVar.f = l == null ? 0L : l.longValue();
        List<Bi.a> list2 = bi.f;
        int[] iArr = new int[list2.size()];
        for (int i2 = 0; i2 < list2.size(); i2++) {
            iArr[i2] = b.get(list2.get(i2)).intValue();
        }
        nVar.g = iArr;
        return nVar;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Bi a(C2880kg.n nVar) {
        String str = nVar.b;
        String str2 = nVar.c;
        String str3 = nVar.d;
        C2880kg.n.a[] aVarArr = nVar.e;
        ArrayList arrayList = new ArrayList(aVarArr.length);
        for (C2880kg.n.a aVar : aVarArr) {
            arrayList.add(new Pair(aVar.b, aVar.c));
        }
        Long lValueOf = Long.valueOf(nVar.f);
        int[] iArr = nVar.g;
        ArrayList arrayList2 = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList2.add(a.get(Integer.valueOf(i)));
        }
        return new Bi(str, str2, str3, arrayList, lValueOf, arrayList2);
    }
}
