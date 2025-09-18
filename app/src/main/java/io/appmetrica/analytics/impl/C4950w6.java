package io.appmetrica.analytics.impl;

import defpackage.AbstractC7287tn0;
import defpackage.AbstractC8259yu;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.w6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4950w6 implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4845rl[] fromModel(Map<String, ? extends List<String>> map) {
        C4845rl[] c4845rlArr = new C4845rl[map.size()];
        int i = 0;
        for (Object obj : map.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC8259yu.j();
                throw null;
            }
            Map.Entry entry = (Map.Entry) obj;
            C4845rl c4845rl = new C4845rl();
            c4845rl.a = (String) entry.getKey();
            Object[] array = ((Collection) entry.getValue()).toArray(new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            c4845rl.b = (String[]) array;
            c4845rlArr[i] = c4845rl;
            i = i2;
        }
        return c4845rlArr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, List<String>> toModel(C4845rl[] c4845rlArr) {
        int iB = AbstractC7287tn0.b(c4845rlArr.length);
        if (iB < 16) {
            iB = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
        for (C4845rl c4845rl : c4845rlArr) {
            linkedHashMap.put(c4845rl.a, defpackage.J8.D(c4845rl.b));
        }
        return linkedHashMap;
    }
}
