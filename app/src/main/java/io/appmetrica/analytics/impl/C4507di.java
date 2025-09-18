package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.di, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4507di implements on {
    public final nn a = new nn();

    @Override // io.appmetrica.analytics.impl.on
    public final mn a(Revenue revenue) {
        mn mnVar;
        nn nnVar = this.a;
        C4601hf c4601hf = new C4601hf();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            mnVar = new mn(c4601hf, true, "");
        } else {
            mnVar = new mn(c4601hf, false, "Invalid quantity value " + num);
        }
        List<mn> listAsList = Arrays.asList(mnVar);
        nnVar.getClass();
        return nnVar.a(listAsList);
    }
}
