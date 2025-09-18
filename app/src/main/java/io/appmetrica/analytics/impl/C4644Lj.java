package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.AbstractC11205tn0;
import p000.AbstractC7038vr;

/* renamed from: io.appmetrica.analytics.impl.Lj */
/* loaded from: classes2.dex */
public final class C4644Lj implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final C4692Nj fromModel(Map<String, byte[]> map) {
        C4692Nj c4692Nj = new C4692Nj();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            C4716Oj c4716Oj = new C4716Oj();
            c4716Oj.f30586a = entry.getKey().getBytes(AbstractC7038vr.f44561a);
            c4716Oj.f30587b = entry.getValue();
            arrayList.add(c4716Oj);
        }
        Object[] array = arrayList.toArray(new C4716Oj[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        c4692Nj.f30530a = (C4716Oj[]) array;
        return c4692Nj;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a */
    public final Map<String, byte[]> toModel(C4692Nj c4692Nj) {
        C4716Oj[] c4716OjArr = c4692Nj.f30530a;
        int iM24983b = AbstractC11205tn0.m24983b(c4716OjArr.length);
        if (iM24983b < 16) {
            iM24983b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b);
        for (C4716Oj c4716Oj : c4716OjArr) {
            linkedHashMap.put(new String(c4716Oj.f30586a, AbstractC7038vr.f44561a), c4716Oj.f30587b);
        }
        return linkedHashMap;
    }
}
