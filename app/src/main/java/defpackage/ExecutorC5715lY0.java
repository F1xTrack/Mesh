package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: lY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC5715lY0 implements Executor {
    public final Executor b;
    public final ArrayDeque a = new ArrayDeque();
    public final RunnableC6133nk0 c = new RunnableC6133nk0(6, this);
    public int d = 1;
    public long e = 0;

    public ExecutorC5715lY0(Executor executor) {
        executor.getClass();
        this.b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.a) {
            int i = this.d;
            if (i != 4 && i != 3) {
                long j = this.e;
                RunnableC7525v2 runnableC7525v2 = new RunnableC7525v2(runnable, 3);
                this.a.add(runnableC7525v2);
                this.d = 2;
                try {
                    this.b.execute(this.c);
                    if (this.d != 2) {
                        return;
                    }
                    synchronized (this.a) {
                        try {
                            if (this.e == j && this.d == 2) {
                                this.d = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.a) {
                        try {
                            int i2 = this.d;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.a.removeLastOccurrence(runnableC7525v2)) {
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
            this.a.add(runnable);
        }
    }
}
