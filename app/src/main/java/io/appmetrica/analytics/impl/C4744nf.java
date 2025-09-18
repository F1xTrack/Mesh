package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.nf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4744nf implements InterfaceC4696lf {
    public final /* synthetic */ C4887tf a;

    public C4744nf(C4887tf c4887tf) {
        this.a = c4887tf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4696lf
    public final void a() {
        C4887tf c4887tf = this.a;
        C4954wa c4954wa = c4887tf.b;
        C4720mf c4720mf = new C4720mf(c4887tf);
        c4954wa.getClass();
        try {
            FutureTask futureTask = new FutureTask(new CallableC4930va(c4954wa));
            C4667ka.C.d.a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + ThreadFactoryC4477cd.a.incrementAndGet()).start();
            Ef ef = (Ef) futureTask.get(5L, TimeUnit.SECONDS);
            hn.a(c4954wa.b);
            C4887tf.a(c4887tf, ef, C4887tf.a(c4887tf));
        } catch (Throwable th) {
            try {
                c4720mf.a(th);
            } finally {
                hn.a(c4954wa.b);
            }
        }
    }
}
