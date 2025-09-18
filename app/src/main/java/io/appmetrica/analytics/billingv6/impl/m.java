package io.appmetrica.analytics.billingv6.impl;

import defpackage.AbstractC1676Vg0;
import defpackage.C1518Tf1;
import defpackage.InterfaceC5908mZ;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m extends AbstractC1676Vg0 implements InterfaceC5908mZ {
    public final /* synthetic */ Map a;
    public final /* synthetic */ Map b;
    public final /* synthetic */ p c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(LinkedHashMap linkedHashMap, Map map, p pVar) {
        super(0);
        this.a = linkedHashMap;
        this.b = map;
        this.c = pVar;
    }

    @Override // defpackage.InterfaceC5908mZ
    public final Object invoke() {
        Map map = this.a;
        Map map2 = this.b;
        p pVar = this.c;
        t.a(map, map2, pVar.d, pVar.c.getBillingInfoManager());
        return C1518Tf1.a;
    }
}
