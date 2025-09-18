package io.appmetrica.analytics.impl;

import defpackage.AbstractC7287tn0;
import defpackage.AbstractC7680vr;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Lj implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final Nj fromModel(Map<String, byte[]> map) {
        Nj nj = new Nj();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            Oj oj = new Oj();
            oj.a = entry.getKey().getBytes(AbstractC7680vr.a);
            oj.b = entry.getValue();
            arrayList.add(oj);
        }
        Object[] array = arrayList.toArray(new Oj[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        nj.a = (Oj[]) array;
        return nj;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final Map<String, byte[]> toModel(Nj nj) {
        Oj[] ojArr = nj.a;
        int iB = AbstractC7287tn0.b(ojArr.length);
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (Oj oj : ojArr) {
            linkedHashMap.put(new String(oj.a, AbstractC7680vr.a), oj.b);
        }
        return linkedHashMap;
    }
}
