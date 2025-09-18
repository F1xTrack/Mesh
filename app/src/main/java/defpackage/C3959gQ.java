package defpackage;

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
public final class C3959gQ extends AbstractC3768fQ implements InterfaceC7381uH {
    public final Executor c;

    public C3959gQ(Executor executor) {
        this.c = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // defpackage.InterfaceC7381uH
    public final MK a(long j, RunnableC0490Ga1 runnableC0490Ga1, InterfaceC0173Bz interfaceC0173Bz) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnableC0490Ga1, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                InterfaceC1115Ob0 interfaceC1115Ob0 = (InterfaceC1115Ob0) interfaceC0173Bz.g(C0396Ev0.e);
                if (interfaceC1115Ob0 != null) {
                    ((C2548cc0) interfaceC1115Ob0).l(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new LK(scheduledFutureSchedule) : RunnableC6993sF.j.a(j, runnableC0490Ga1, interfaceC0173Bz);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.InterfaceC7381uH
    public final void e(long j, C0767Jp c0767Jp) {
        Executor executor = this.c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new XZ(this, 17, c0767Jp), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                InterfaceC1115Ob0 interfaceC1115Ob0 = (InterfaceC1115Ob0) c0767Jp.e.g(C0396Ev0.e);
                if (interfaceC1115Ob0 != null) {
                    ((C2548cc0) interfaceC1115Ob0).l(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            c0767Jp.v(new C0065Ap(0, scheduledFutureSchedule));
        } else {
            RunnableC6993sF.j.e(j, c0767Jp);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3959gQ) && ((C3959gQ) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // defpackage.AbstractC0485Fz
    public final void l(InterfaceC0173Bz interfaceC0173Bz, Runnable runnable) {
        try {
            this.c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            InterfaceC1115Ob0 interfaceC1115Ob0 = (InterfaceC1115Ob0) interfaceC0173Bz.g(C0396Ev0.e);
            if (interfaceC1115Ob0 != null) {
                ((C2548cc0) interfaceC1115Ob0).l(cancellationException);
            }
            GK gk = GK.a;
            QF.c.l(interfaceC0173Bz, runnable);
        }
    }

    @Override // defpackage.AbstractC3768fQ
    public final Executor p() {
        return this.c;
    }

    @Override // defpackage.AbstractC0485Fz
    public final String toString() {
        return this.c.toString();
    }
}
