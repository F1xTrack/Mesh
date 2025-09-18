package io.appmetrica.analytics.impl;

import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.n2 */
/* loaded from: classes2.dex */
public final class C5311n2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5355ol fromModel(C5286m2 c5286m2) {
        C5305ml c5305ml;
        C5355ol c5355ol = new C5355ol();
        c5355ol.f32363a = new C5330nl[c5286m2.f32164a.size()];
        for (int i = 0; i < c5286m2.f32164a.size(); i++) {
            C5330nl c5330nl = new C5330nl();
            Pair pair = (Pair) c5286m2.f32164a.get(i);
            c5330nl.f32308a = (String) pair.first;
            if (pair.second != null) {
                c5330nl.f32309b = new C5305ml();
                C5261l2 c5261l2 = (C5261l2) pair.second;
                if (c5261l2 == null) {
                    c5305ml = null;
                } else {
                    C5305ml c5305ml2 = new C5305ml();
                    c5305ml2.f32231a = c5261l2.f32118a;
                    c5305ml = c5305ml2;
                }
                c5330nl.f32309b = c5305ml;
            }
            c5355ol.f32363a[i] = c5330nl;
        }
        return c5355ol;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5286m2 toModel(C5355ol c5355ol) {
        ArrayList arrayList = new ArrayList();
        for (C5330nl c5330nl : c5355ol.f32363a) {
            String str = c5330nl.f32308a;
            C5305ml c5305ml = c5330nl.f32309b;
            arrayList.add(new Pair(str, c5305ml == null ? null : new C5261l2(c5305ml.f32231a)));
        }
        return new C5286m2(arrayList);
    }
}
