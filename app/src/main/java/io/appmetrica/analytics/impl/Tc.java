package io.appmetrica.analytics.impl;

import defpackage.AbstractC7096sn0;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes2.dex */
public final class Tc implements Converter {
    public final Aj a = C4667ka.h().m();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final C4917ul[] fromModel(Map<String, ? extends Object> map) {
        C4917ul c4917ul;
        Map<String, Ic> mapB = this.a.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            Ic ic = mapB.get(key);
            if (ic == null || value == null) {
                c4917ul = null;
            } else {
                c4917ul = new C4917ul();
                c4917ul.a = key;
                c4917ul.b = (byte[]) ic.c.fromModel(value);
            }
            if (c4917ul != null) {
                arrayList.add(c4917ul);
            }
        }
        Object[] array = arrayList.toArray(new C4917ul[0]);
        if (array != null) {
            return (C4917ul[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final Map<String, Object> toModel(C4917ul[] c4917ulArr) {
        Map<String, Ic> mapB = this.a.b();
        ArrayList arrayList = new ArrayList();
        for (C4917ul c4917ul : c4917ulArr) {
            Ic ic = mapB.get(c4917ul.a);
            Pair pair = ic != null ? new Pair(c4917ul.a, ic.c.toModel(c4917ul.b)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return AbstractC7096sn0.n(arrayList);
    }
}
