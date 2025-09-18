package io.appmetrica.analytics.impl;

import defpackage.N61;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.e2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4516e2 {
    public final Vb a;
    public final ICommonExecutor b;
    public final long c;
    public boolean d = true;
    public final Runnable e = new N61(16, this);

    public C4516e2(Vb vb, IHandlerExecutor iHandlerExecutor, long j) {
        this.a = vb;
        this.b = iHandlerExecutor;
        this.c = j;
    }

    public static final void a(C4516e2 c4516e2) {
        Wb wb = c4516e2.a.a;
        Nh nh = wb.h;
        nh.c.a(wb.b.a);
    }
}
