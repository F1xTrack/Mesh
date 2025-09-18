package com.yandex.metrica.impl.ob;

import com.yandex.metrica.Revenue;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class yo implements uo<Revenue> {
    private final uo<List<so>> a = new to();

    @Override // com.yandex.metrica.impl.ob.uo
    public so a(Revenue revenue) {
        return this.a.a(Arrays.asList(new xo().a(revenue.quantity)));
    }
}
