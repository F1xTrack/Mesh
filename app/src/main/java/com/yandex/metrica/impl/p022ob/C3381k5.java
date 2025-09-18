package com.yandex.metrica.impl.p022ob;

import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.k5 */
/* loaded from: classes2.dex */
public class C3381k5 extends AbstractC3303h5 {
    public C3381k5(C3094Z3 c3094z3) {
        super(c3094z3);
    }

    @Override // com.yandex.metrica.impl.p022ob.AbstractC3303h5
    /* renamed from: a */
    public boolean mo16029a(C3376k0 c3376k0, C2646H4 c2646h4) {
        Bundle bundleM16241k = c3376k0.m16241k();
        m16028a().m15528a(bundleM16241k != null ? (ResultReceiver) bundleM16241k.getParcelable("com.yandex.metrica.impl.referrer.common.ReferrerResultReceiver") : null);
        return false;
    }
}
