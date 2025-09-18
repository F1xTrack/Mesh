package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* renamed from: io.appmetrica.analytics.impl.da, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4499da extends O4 {
    public C4499da(L4 l4) {
        super(l4);
    }

    @Override // io.appmetrica.analytics.impl.O4
    public final boolean a(T5 t5, I4 i4) {
        Bundle bundle = t5.m;
        this.a.a(bundle != null ? (Ua) bundle.getParcelable("io.appmetrica.analytics.impl.IdentifiersData") : null);
        return false;
    }
}
