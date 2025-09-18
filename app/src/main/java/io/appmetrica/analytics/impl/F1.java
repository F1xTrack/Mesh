package io.appmetrica.analytics.impl;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class F1 implements InterfaceC4772oj {
    public static final E1 b = new E1();
    public static final int c = 1;
    public final InterfaceC4633j0 a;

    public F1(InterfaceC4633j0 interfaceC4633j0) {
        this.a = interfaceC4633j0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4772oj
    public final void reportData(int i, Bundle bundle) {
        ((C1) this.a).a(bundle);
    }
}
