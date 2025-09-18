package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;

/* renamed from: io.appmetrica.analytics.impl.Ph */
/* loaded from: classes2.dex */
public final class C4738Ph extends AbstractC4701O4 {
    public C4738Ph(C4629L4 c4629l4) {
        super(c4629l4);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4701O4
    /* renamed from: a */
    public final boolean mo19681a(C4821T5 c4821t5, C4557I4 c4557i4) {
        Bundle bundle = c4821t5.f30773m;
        this.f30547a.f30429l.m19474a(new C4605K4(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
