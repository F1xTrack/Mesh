package com.yandex.metrica.impl.ob;

import io.appmetrica.analytics.gpllibrary.internal.GplLibraryWrapper;

/* loaded from: classes2.dex */
public class Gc extends Cd<Jc> {
    public Gc(Oc oc, R2 r2) {
        super(oc, r2);
    }

    @Override // com.yandex.metrica.impl.ob.Cd
    public String a() {
        return GplLibraryWrapper.FUSED_PROVIDER;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3075sc
    public boolean b(Object obj) {
        return ((Jc) obj).a.a;
    }

    @Override // com.yandex.metrica.impl.ob.InterfaceC3075sc
    public boolean a(Object obj) {
        Hc hc = ((Jc) obj).b;
        return hc != null && a(hc.c);
    }
}
