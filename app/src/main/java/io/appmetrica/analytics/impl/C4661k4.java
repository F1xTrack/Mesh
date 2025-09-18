package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: io.appmetrica.analytics.impl.k4, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4661k4 extends AbstractC4908uc {
    public final C4719me a;

    public C4661k4(Context context) {
        this(new C4719me(Z6.a(context).b()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4908uc
    public final void a(int i) {
        this.a.c(i);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4908uc
    public final int b() {
        return (int) this.a.a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC4908uc
    public final SparseArray<InterfaceC4884tc> c() {
        return new SparseArray<>();
    }

    public C4661k4(C4719me c4719me) {
        this.a = c4719me;
    }
}
