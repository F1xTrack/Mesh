package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3144b2;
import com.yandex.metrica.impl.p022ob.C3314hg;
import com.yandex.metrica.impl.p022ob.C3418lg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.yandex.metrica.impl.ob.ya */
/* loaded from: classes2.dex */
public class C3750ya implements InterfaceC3230ea {

    /* renamed from: a */
    private static final Map<Integer, C3144b2.d> f25299a = Collections.unmodifiableMap(new a());

    /* renamed from: b */
    private static final Map<C3144b2.d, Integer> f25300b = Collections.unmodifiableMap(new b());

    /* renamed from: com.yandex.metrica.impl.ob.ya$a */
    public class a extends HashMap<Integer, C3144b2.d> {
        public a() {
            put(1, C3144b2.d.WIFI);
            put(2, C3144b2.d.CELL);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.ya$b */
    public class b extends HashMap<C3144b2.d, Integer> {
        public b() {
            put(C3144b2.d.WIFI, 1);
            put(C3144b2.d.CELL, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a */
    public Object mo13846a(Object obj) {
        C3314hg c3314hg = (C3314hg) obj;
        ArrayList arrayList = new ArrayList();
        C3314hg.a[] aVarArr = c3314hg.f23576b;
        int length = aVarArr.length;
        boolean z = false;
        int i = 0;
        while (i < length) {
            C3314hg.a aVar = aVarArr[i];
            String str = aVar.f23579b;
            String str2 = aVar.f23580c;
            String str3 = aVar.f23581d;
            C3314hg.a.C7306a[] c7306aArr = aVar.f23582e;
            C3113Zm c3113Zm = new C3113Zm(z);
            int length2 = c7306aArr.length;
            for (?? r14 = z; r14 < length2; r14++) {
                C3314hg.a.C7306a c7306a = c7306aArr[r14];
                c3113Zm.m15567a(c7306a.f23586b, c7306a.f23587c);
                aVarArr = aVarArr;
            }
            C3314hg.a[] aVarArr2 = aVarArr;
            long j = aVar.f23583f;
            int[] iArr = aVar.f23584g;
            ArrayList arrayList2 = new ArrayList(iArr.length);
            int length3 = iArr.length;
            int i2 = 0;
            while (i2 < length3) {
                arrayList2.add(f25299a.get(Integer.valueOf(iArr[i2])));
                i2++;
                iArr = iArr;
                length = length;
            }
            arrayList.add(new C3418lg.e.a(str, str2, str3, c3113Zm, j, arrayList2));
            i++;
            aVarArr = aVarArr2;
            z = false;
        }
        return new C3418lg.e(arrayList, Arrays.asList(c3314hg.f23577c));
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: b */
    public Object mo13847b(Object obj) {
        C3418lg.e eVar = (C3418lg.e) obj;
        C3314hg c3314hg = new C3314hg();
        Set<String> setM16401a = eVar.m16401a();
        c3314hg.f23577c = (String[]) setM16401a.toArray(new String[((HashSet) setM16401a).size()]);
        List<C3418lg.e.a> listM16403b = eVar.m16403b();
        C3314hg.a[] aVarArr = new C3314hg.a[listM16403b.size()];
        for (int i = 0; i < listM16403b.size(); i++) {
            C3418lg.e.a aVar = listM16403b.get(i);
            C3314hg.a aVar2 = new C3314hg.a();
            aVar2.f23579b = aVar.f24209a;
            aVar2.f23580c = aVar.f24210b;
            C3314hg.a.C7306a[] c7306aArr = new C3314hg.a.C7306a[aVar.f24212d.m15572c()];
            int i2 = 0;
            for (Map.Entry<String, ? extends Collection<String>> entry : aVar.f24212d.m15568a()) {
                for (String str : entry.getValue()) {
                    C3314hg.a.C7306a c7306a = new C3314hg.a.C7306a();
                    c7306a.f23586b = entry.getKey();
                    c7306a.f23587c = str;
                    c7306aArr[i2] = c7306a;
                    i2++;
                }
            }
            aVar2.f23582e = c7306aArr;
            aVar2.f23581d = aVar.f24211c;
            aVar2.f23583f = aVar.f24213e;
            List<C3144b2.d> list = aVar.f24214f;
            int[] iArr = new int[list.size()];
            for (int i3 = 0; i3 < list.size(); i3++) {
                iArr[i3] = f25300b.get(list.get(i3)).intValue();
            }
            aVar2.f23584g = iArr;
            aVarArr[i] = aVar2;
        }
        c3314hg.f23576b = aVarArr;
        return c3314hg;
    }
}
