package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import p000.AbstractC11077sn0;

/* renamed from: io.appmetrica.analytics.impl.Tc */
/* loaded from: classes2.dex */
public final class C4828Tc implements Converter {

    /* renamed from: a */
    public final C4376Aj f30779a = C5244ka.m20614h().m20628m();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final C5505ul[] fromModel(Map<String, ? extends Object> map) {
        C5505ul c5505ul;
        Map<String, C4565Ic> mapMo19191b = this.f30779a.mo19191b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            C4565Ic c4565Ic = mapMo19191b.get(key);
            if (c4565Ic == null || value == null) {
                c5505ul = null;
            } else {
                c5505ul = new C5505ul();
                c5505ul.f32708a = key;
                c5505ul.f32709b = (byte[]) c4565Ic.f30282c.fromModel(value);
            }
            if (c5505ul != null) {
                arrayList.add(c5505ul);
            }
        }
        Object[] array = arrayList.toArray(new C5505ul[0]);
        if (array != null) {
            return (C5505ul[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final Map<String, Object> toModel(C5505ul[] c5505ulArr) {
        Map<String, C4565Ic> mapMo19191b = this.f30779a.mo19191b();
        ArrayList arrayList = new ArrayList();
        for (C5505ul c5505ul : c5505ulArr) {
            C4565Ic c4565Ic = mapMo19191b.get(c5505ul.f32708a);
            Pair pair = c4565Ic != null ? new Pair(c5505ul.f32708a, c4565Ic.f30282c.toModel(c5505ul.f32709b)) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return AbstractC11077sn0.m24786n(arrayList);
    }
}
