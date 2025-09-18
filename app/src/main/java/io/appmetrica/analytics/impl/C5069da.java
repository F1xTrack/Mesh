package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.da */
/* loaded from: classes2.dex */
public final class C5069da extends AbstractC4701O4 {
    public C5069da(C4629L4 c4629l4) {
        super(c4629l4);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4701O4
    /* renamed from: a */
    public final boolean mo19681a(C4821T5 c4821t5, C4557I4 c4557i4) {
        Bundle bundle = c4821t5.f30773m;
        this.f30547a.m19573a(bundle != null ? (C4850Ua) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null);
        return false;
    }
}
