package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;
import java.util.Arrays;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.di */
/* loaded from: classes2.dex */
public final class C5077di implements InterfaceC5357on {

    /* renamed from: a */
    public final C5332nn f31490a = new C5332nn();

    @Override // io.appmetrica.analytics.impl.InterfaceC5357on
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C5307mn mo19211a(Revenue revenue) {
        C5307mn c5307mn;
        C5332nn c5332nn = this.f31490a;
        C5174hf c5174hf = new C5174hf();
        Integer num = revenue.quantity;
        if (num == null || num.intValue() > 0) {
            c5307mn = new C5307mn(c5174hf, true, "");
        } else {
            c5307mn = new C5307mn(c5174hf, false, "Invalid quantity value " + num);
        }
        List<C5307mn> listAsList = Arrays.asList(c5307mn);
        c5332nn.getClass();
        return c5332nn.mo19211a(listAsList);
    }
}
