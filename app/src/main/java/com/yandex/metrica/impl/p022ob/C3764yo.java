package com.yandex.metrica.impl.p022ob;

import com.yandex.metrica.Revenue;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.yo */
/* loaded from: classes2.dex */
public class C3764yo implements InterfaceC3660uo<Revenue> {

    /* renamed from: a */
    private final InterfaceC3660uo<List<C3608so>> f25347a = new C3634to();

    @Override // com.yandex.metrica.impl.p022ob.InterfaceC3660uo
    /* renamed from: a */
    public C3608so mo14391a(Revenue revenue) {
        return this.f25347a.mo14391a(Arrays.asList(new C3738xo().mo14391a(revenue.quantity)));
    }
}
