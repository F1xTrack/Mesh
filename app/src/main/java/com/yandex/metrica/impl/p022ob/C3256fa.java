package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.impl.p022ob.C3392kg;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.AbstractC0576J8;
import p000.AbstractC11205tn0;
import p000.AbstractC7230yu;
import p000.O90;

/* renamed from: com.yandex.metrica.impl.ob.fa */
/* loaded from: classes2.dex */
public final class C3256fa implements InterfaceC3230ea<Map<String, ? extends List<? extends String>>, C3392kg.d[]> {
    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: b */
    public /* bridge */ /* synthetic */ C3392kg.d[] mo13847b(Map<String, ? extends List<? extends String>> map) {
        return m15928a((Map<String, ? extends List<String>>) map);
    }

    /* renamed from: a */
    public C3392kg.d[] m15928a(Map<String, ? extends List<String>> map) {
        int size = map.size();
        C3392kg.d[] dVarArr = new C3392kg.d[size];
        for (int i = 0; i < size; i++) {
            dVarArr[i] = new C3392kg.d();
        }
        int i2 = 0;
        for (Object obj : map.entrySet()) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                AbstractC7230yu.m26279j();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            dVarArr[i2].f23985b = (String) entry.getKey();
            C3392kg.d dVar = dVarArr[i2];
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            dVar.f23986c = (String[]) array;
            i2 = i3;
        }
        return dVarArr;
    }

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3230ea
    /* renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public Map<String, List<String>> mo13846a(C3392kg.d[] dVarArr) {
        int iM24983b = AbstractC11205tn0.m24983b(dVarArr.length);
        if (iM24983b < 16) {
            iM24983b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b);
        for (C3392kg.d dVar : dVarArr) {
            String str = dVar.f23985b;
            String[] strArr = dVar.f23986c;
            O90.m5967e(strArr, "it.hosts");
            linkedHashMap.put(str, AbstractC0576J8.m4173D(strArr));
        }
        return linkedHashMap;
    }
}
