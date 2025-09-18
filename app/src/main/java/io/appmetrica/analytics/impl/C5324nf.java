package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.nf */
/* loaded from: classes2.dex */
public final class C5324nf implements InterfaceC5274lf {

    /* renamed from: a */
    public final /* synthetic */ C5474tf f32292a;

    public C5324nf(C5474tf c5474tf) {
        this.f32292a = c5474tf;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5274lf
    /* renamed from: a */
    public final void mo20693a() {
        C5474tf c5474tf = this.f32292a;
        C5544wa c5544wa = c5474tf.f32634b;
        C5299mf c5299mf = new C5299mf(c5474tf);
        c5544wa.getClass();
        try {
            FutureTask futureTask = new FutureTask(new CallableC5519va(c5544wa));
            C5244ka.f32038C.f32044d.f32697a.getClass();
            new InterruptionSafeThread(futureTask, "IAA-SHMSR-" + ThreadFactoryC5047cd.f31411a.incrementAndGet()).start();
            C4472Ef c4472Ef = (C4472Ef) futureTask.get(5L, TimeUnit.SECONDS);
            AbstractC5182hn.m20509a(c5544wa.f32764b);
            C5474tf.m21081a(c5474tf, c4472Ef, C5474tf.m21080a(c5474tf));
        } catch (Throwable th) {
            try {
                c5299mf.mo19535a(th);
            } finally {
                AbstractC5182hn.m20509a(c5544wa.f32764b);
            }
        }
    }
}
