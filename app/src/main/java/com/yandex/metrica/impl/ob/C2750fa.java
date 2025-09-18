package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C2880kg;
import defpackage.AbstractC7287tn0;
import defpackage.AbstractC8259yu;
import defpackage.O90;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.fa, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2750fa implements InterfaceC2725ea<Map<String, ? extends List<? extends String>>, C2880kg.d[]> {
    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public /* bridge */ /* synthetic */ C2880kg.d[] b(Map<String, ? extends List<? extends String>> map) {
        return a((Map<String, ? extends List<String>>) map);
    }

    public C2880kg.d[] a(Map<String, ? extends List<String>> map) {
        int size = map.size();
        C2880kg.d[] dVarArr = new C2880kg.d[size];
        for (int i = 0; i < size; i++) {
            dVarArr[i] = new C2880kg.d();
        }
        int i2 = 0;
        for (Object obj : map.entrySet()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC8259yu.j();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            dVarArr[i2].b = (String) entry.getKey();
            C2880kg.d dVar = dVarArr[i2];
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            dVar.c = (String[]) array;
            i2 = i3;
        }
        return dVarArr;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC2725ea
    public Map<String, List<String>> a(C2880kg.d[] dVarArr) {
        int iB = AbstractC7287tn0.b(dVarArr.length);
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (C2880kg.d dVar : dVarArr) {
            String str = dVar.b;
            String[] strArr = dVar.c;
            O90.e(strArr, "it.hosts");
            linkedHashMap.put(str, defpackage.J8.D(strArr));
        }
        return linkedHashMap;
    }
}
