package io.appmetrica.analytics.impl;

import android.content.Context;
import android.util.SparseArray;

/* renamed from: io.appmetrica.analytics.impl.k4 */
/* loaded from: classes2.dex */
public final class C5238k4 extends AbstractC5496uc {

    /* renamed from: a */
    public final C5298me f32027a;

    public C5238k4(Context context) {
        this(new C5298me(C4966Z6.m20064a(context).m20067b()));
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5496uc
    /* renamed from: a */
    public final void mo20602a(int i) {
        this.f32027a.m20722c(i);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5496uc
    /* renamed from: b */
    public final int mo20603b() {
        return (int) this.f32027a.m20711a(-1L);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC5496uc
    /* renamed from: c */
    public final SparseArray<InterfaceC5471tc> mo20604c() {
        return new SparseArray<>();
    }

    public C5238k4(C5298me c5298me) {
        this.f32027a = c5298me;
    }
}
