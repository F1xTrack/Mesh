package io.appmetrica.analytics.impl;

import android.content.Context;

/* loaded from: classes2.dex */
public final class Tf implements L7 {
    public final InterfaceC4591h5 a;

    public Tf(InterfaceC4591h5 interfaceC4591h5) {
        this.a = interfaceC4591h5;
    }

    @Override // io.appmetrica.analytics.impl.L7
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Sf a(Context context, Z4 z4, D4 d4) {
        return new Sf(context, z4, d4, this.a, new C4419a5(), Ik.a());
    }

    public final InterfaceC4591h5 a() {
        return this.a;
    }
}
