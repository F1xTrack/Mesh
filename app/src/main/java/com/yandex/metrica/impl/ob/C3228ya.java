package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2642b2;
import com.yandex.metrica.impl.ob.C2806hg;
import com.yandex.metrica.impl.ob.C2905lg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ya, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3228ya implements InterfaceC2725ea {
    private static final Map<Integer, C2642b2.d> a = Collections.unmodifiableMap(new a());
    private static final Map<C2642b2.d, Integer> b = Collections.unmodifiableMap(new b());

    /* renamed from: com.yandex.metrica.impl.ob.ya$a */
    public class a extends HashMap<Integer, C2642b2.d> {
        public a() {
            put(1, C2642b2.d.WIFI);
            put(2, C2642b2.d.CELL);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ya$b */
    public class b extends HashMap<C2642b2.d, Integer> {
        public b() {
            put(C2642b2.d.WIFI, 1);
            put(C2642b2.d.CELL, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Object a(Object obj) {
        C2806hg c2806hg = (C2806hg) obj;
        ArrayList arrayList = new ArrayList();
        C2806hg.a[] aVarArr = c2806hg.b;
        int length = aVarArr.length;
        boolean z = false;
        int i = 0;
        while (i < length) {
            C2806hg.a aVar = aVarArr[i];
            String str = aVar.b;
            String str2 = aVar.c;
            String str3 = aVar.d;
            C2806hg.a.C0012a[] c0012aArr = aVar.e;
            Zm zm = new Zm(z);
            int length2 = c0012aArr.length;
            for (?? r14 = z; r14 < length2; r14++) {
                C2806hg.a.C0012a c0012a = c0012aArr[r14];
                zm.a(c0012a.b, c0012a.c);
                aVarArr = aVarArr;
            }
            C2806hg.a[] aVarArr2 = aVarArr;
            long j = aVar.f;
            int[] iArr = aVar.g;
            ArrayList arrayList2 = new ArrayList(iArr.length);
            int length3 = iArr.length;
            int i2 = 0;
            while (i2 < length3) {
                arrayList2.add(a.get(Integer.valueOf(iArr[i2])));
                i2++;
                iArr = iArr;
                length = length;
            }
            arrayList.add(new C2905lg.e.a(str, str2, str3, zm, j, arrayList2));
            i++;
            aVarArr = aVarArr2;
            z = false;
        }
        return new C2905lg.e(arrayList, Arrays.asList(c2806hg.c));
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Object b(Object obj) {
        C2905lg.e eVar = (C2905lg.e) obj;
        C2806hg c2806hg = new C2806hg();
        Set<String> setA = eVar.a();
        c2806hg.c = (String[]) setA.toArray(new String[((HashSet) setA).size()]);
        List<C2905lg.e.a> listB = eVar.b();
        C2806hg.a[] aVarArr = new C2806hg.a[listB.size()];
        for (int i = 0; i < listB.size(); i++) {
            C2905lg.e.a aVar = listB.get(i);
            C2806hg.a aVar2 = new C2806hg.a();
            aVar2.b = aVar.a;
            aVar2.c = aVar.b;
            C2806hg.a.C0012a[] c0012aArr = new C2806hg.a.C0012a[aVar.d.c()];
            int i2 = 0;
            for (Map.Entry<String, ? extends Collection<String>> entry : aVar.d.a()) {
                for (String str : entry.getValue()) {
                    C2806hg.a.C0012a c0012a = new C2806hg.a.C0012a();
                    c0012a.b = entry.getKey();
                    c0012a.c = str;
                    c0012aArr[i2] = c0012a;
                    i2++;
                }
            }
            aVar2.e = c0012aArr;
            aVar2.d = aVar.c;
            aVar2.f = aVar.e;
            List<C2642b2.d> list = aVar.f;
            int[] iArr = new int[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                iArr[i3] = b.get(list.get(i3)).intValue();
            }
            aVar2.g = iArr;
            aVarArr[i] = aVar2;
        }
        c2806hg.b = aVarArr;
        return c2806hg;
    }
}
