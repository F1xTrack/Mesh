package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;

/* loaded from: classes2.dex */
public final class Ph extends O4 {
    public Ph(L4 l4) {
        super(l4);
    }

    @Override // io.appmetrica.analytics.impl.O4
    public final boolean a(T5 t5, I4 i4) {
        Bundle bundle = t5.m;
        this.a.l.a(new K4(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }
}
