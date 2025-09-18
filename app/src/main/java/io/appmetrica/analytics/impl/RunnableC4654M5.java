package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.services.WaitForActivationDelayBarrier;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000.C0267EE;

/* renamed from: io.appmetrica.analytics.impl.M5 */
/* loaded from: classes2.dex */
public final class RunnableC4654M5 implements Runnable {

    /* renamed from: a */
    public final List f30461a;

    /* renamed from: b */
    public final IHandlerExecutor f30462b = C5244ka.m20614h().m20636u().m21138a();

    /* renamed from: c */
    public final WaitForActivationDelayBarrier f30463c = C5244ka.m20614h().m20617a();

    public RunnableC4654M5(List list) {
        this.f30461a = list;
    }

    /* renamed from: a */
    public static final void m19627a(RunnableC4654M5 runnableC4654M5) {
        Iterator it = runnableC4654M5.f30461a.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f30463c.subscribe(TimeUnit.SECONDS.toMillis(10L), this.f30462b, new C0267EE(25, this));
    }
}
