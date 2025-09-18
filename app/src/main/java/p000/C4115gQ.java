package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: gQ */
/* loaded from: classes2.dex */
public final class C4115gQ extends AbstractC4052fQ implements InterfaceC6939uH {

    /* renamed from: c */
    public final Executor f27783c;

    public C4115gQ(Executor executor) {
        this.f27783c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // p000.InterfaceC6939uH
    /* renamed from: a */
    public final InterfaceC0776MK mo4311a(long j, RunnableC7627Ga1 runnableC7627Ga1, InterfaceC0125Bz interfaceC0125Bz) {
        Executor executor = this.f27783c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnableC7627Ga1, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                InterfaceC8044Ob0 interfaceC8044Ob0 = (InterfaceC8044Ob0) interfaceC0125Bz.mo937g(C7564Ev0.f2962e);
                if (interfaceC8044Ob0 != null) {
                    ((C9002cc0) interfaceC8044Ob0).m10810l(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new C0714LK(scheduledFutureSchedule) : RunnableC6811sF.f42334j.mo4311a(j, runnableC7627Ga1, interfaceC0125Bz);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f27783c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // p000.InterfaceC6939uH
    /* renamed from: e */
    public final void mo4313e(long j, C0619Jp c0619Jp) {
        Executor executor = this.f27783c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new RunnableC1483XZ(this, 17, c0619Jp), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                InterfaceC8044Ob0 interfaceC8044Ob0 = (InterfaceC8044Ob0) c0619Jp.f5712e.mo937g(C7564Ev0.f2962e);
                if (interfaceC8044Ob0 != null) {
                    ((C9002cc0) interfaceC8044Ob0).m10810l(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            c0619Jp.m4442v(new C0052Ap(0, scheduledFutureSchedule));
        } else {
            RunnableC6811sF.f42334j.mo4313e(j, c0619Jp);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C4115gQ) && ((C4115gQ) obj).f27783c == this.f27783c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f27783c);
    }

    @Override // p000.AbstractC0377Fz
    /* renamed from: l */
    public final void mo732l(InterfaceC0125Bz interfaceC0125Bz, Runnable runnable) {
        try {
            this.f27783c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            InterfaceC8044Ob0 interfaceC8044Ob0 = (InterfaceC8044Ob0) interfaceC0125Bz.mo937g(C7564Ev0.f2962e);
            if (interfaceC8044Ob0 != null) {
                ((C9002cc0) interfaceC8044Ob0).m10810l(cancellationException);
            }
            C0399GK c0399gk = C0399GK.f3694a;
            ExecutorC1023QF.f9548c.mo732l(interfaceC0125Bz, runnable);
        }
    }

    @Override // p000.AbstractC4052fQ
    /* renamed from: p */
    public final Executor mo733p() {
        return this.f27783c;
    }

    @Override // p000.AbstractC0377Fz
    public final String toString() {
        return this.f27783c.toString();
    }
}
