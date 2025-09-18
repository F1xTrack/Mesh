package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import p000.N61;

/* renamed from: io.appmetrica.analytics.impl.e2 */
/* loaded from: classes2.dex */
public final class C5086e2 {

    /* renamed from: a */
    public final C4875Vb f31517a;

    /* renamed from: b */
    public final ICommonExecutor f31518b;

    /* renamed from: c */
    public final long f31519c;

    /* renamed from: d */
    public boolean f31520d = true;

    /* renamed from: e */
    public final Runnable f31521e = new N61(16, this);

    public C5086e2(C4875Vb c4875Vb, IHandlerExecutor iHandlerExecutor, long j) {
        this.f31517a = c4875Vb;
        this.f31518b = iHandlerExecutor;
        this.f31519c = j;
    }

    /* renamed from: a */
    public static final void m20301a(C5086e2 c5086e2) {
        C4899Wb c4899Wb = c5086e2.f31517a.f30856a;
        C4690Nh c4690Nh = c4899Wb.f30650h;
        c4690Nh.f30524c.m19696a(c4899Wb.f30644b.f31089a);
    }
}
