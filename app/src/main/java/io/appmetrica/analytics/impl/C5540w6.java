package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000.AbstractC0576J8;
import p000.AbstractC11205tn0;
import p000.AbstractC7230yu;

/* renamed from: io.appmetrica.analytics.impl.w6 */
/* loaded from: classes2.dex */
public final class C5540w6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5430rl[] fromModel(Map<String, ? extends List<String>> map) {
        C5430rl[] c5430rlArr = new C5430rl[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC7230yu.m26279j();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C5430rl c5430rl = new C5430rl();
            c5430rl.f32521a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c5430rl.f32522b = (String[]) array;
            c5430rlArr[i] = c5430rl;
            i = i2;
        }
        return c5430rlArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(C5430rl[] c5430rlArr) {
        int iM24983b = AbstractC11205tn0.m24983b(c5430rlArr.length);
        if (iM24983b < 16) {
            iM24983b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM24983b);
        for (C5430rl c5430rl : c5430rlArr) {
            linkedHashMap.put(c5430rl.f32521a, AbstractC0576J8.m4173D(c5430rl.f32522b));
        }
        return linkedHashMap;
    }
}
