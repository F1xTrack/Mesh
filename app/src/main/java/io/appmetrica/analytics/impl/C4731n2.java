package io.appmetrica.analytics.impl;

import android.util.Pair;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.n2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4731n2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4774ol fromModel(C4707m2 c4707m2) {
        C4726ml c4726ml;
        C4774ol c4774ol = new C4774ol();
        c4774ol.a = new C4750nl[c4707m2.a.size()];
        for (int i = 0; i < c4707m2.a.size(); i++) {
            C4750nl c4750nl = new C4750nl();
            Pair pair = (Pair) c4707m2.a.get(i);
            c4750nl.a = (String) pair.first;
            if (pair.second != null) {
                c4750nl.b = new C4726ml();
                C4683l2 c4683l2 = (C4683l2) pair.second;
                if (c4683l2 == null) {
                    c4726ml = null;
                } else {
                    C4726ml c4726ml2 = new C4726ml();
                    c4726ml2.a = c4683l2.a;
                    c4726ml = c4726ml2;
                }
                c4750nl.b = c4726ml;
            }
            c4774ol.a[i] = c4750nl;
        }
        return c4774ol;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4707m2 toModel(C4774ol c4774ol) {
        ArrayList arrayList = new ArrayList();
        for (C4750nl c4750nl : c4774ol.a) {
            String str = c4750nl.a;
            C4726ml c4726ml = c4750nl.b;
            arrayList.add(new Pair(str, c4726ml == null ? null : new C4683l2(c4726ml.a)));
        }
        return new C4707m2(arrayList);
    }
}
