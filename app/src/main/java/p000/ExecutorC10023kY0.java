package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* renamed from: kY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC10023kY0 implements Executor {

    /* renamed from: f */
    public static final Logger f36535f = Logger.getLogger(ExecutorC10023kY0.class.getName());

    /* renamed from: a */
    public final Executor f36536a;

    /* renamed from: b */
    public final ArrayDeque f36537b = new ArrayDeque();

    /* renamed from: c */
    public int f36538c = 1;

    /* renamed from: d */
    public long f36539d = 0;

    /* renamed from: e */
    public final RunnableC1420WZ f36540e = new RunnableC1420WZ(this);

    public ExecutorC10023kY0(Executor executor) {
        this.f36536a = (Executor) Preconditions.checkNotNull(executor);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        synchronized (this.f36537b) {
            int i = this.f36538c;
            if (i != 4 && i != 3) {
                long j = this.f36539d;
                RunnableC6987v2 runnableC6987v2 = new RunnableC6987v2(runnable, 2);
                this.f36537b.add(runnableC6987v2);
                this.f36538c = 2;
                try {
                    this.f36536a.execute(this.f36540e);
                    if (this.f36538c != 2) {
                        return;
                    }
                    synchronized (this.f36537b) {
                        try {
                            if (this.f36539d == j && this.f36538c == 2) {
                                this.f36538c = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f36537b) {
                        try {
                            int i2 = this.f36538c;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.f36537b.removeLastOccurrence(runnableC6987v2)) {
                                z = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                    return;
                }
            }
            this.f36537b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f36536a + "}";
    }
}
