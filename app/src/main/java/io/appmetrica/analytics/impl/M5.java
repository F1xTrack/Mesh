package io.appmetrica.analytics.impl;

import defpackage.EE;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class M5 implements Runnable {
    public final List a;
    public final IHandlerExecutor b = C4667ka.h().u().a();
    public final WaitForActivationDelayBarrier c = C4667ka.h().a();

    public M5(List list) {
        this.a = list;
    }

    public static final void a(M5 m5) {
        Iterator it = m5.a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.b, new EE(25, this));
    }
}
