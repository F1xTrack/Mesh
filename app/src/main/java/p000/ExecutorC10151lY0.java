package p000;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: lY0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC10151lY0 implements Executor {

    /* renamed from: b */
    public final Executor f37108b;

    /* renamed from: a */
    public final ArrayDeque f37107a = new ArrayDeque();

    /* renamed from: c */
    public final RunnableC10431nk0 f37109c = new RunnableC10431nk0(6, this);

    /* renamed from: d */
    public int f37110d = 1;

    /* renamed from: e */
    public long f37111e = 0;

    public ExecutorC10151lY0(Executor executor) {
        executor.getClass();
        this.f37108b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.f37107a) {
            int i = this.f37110d;
            if (i != 4 && i != 3) {
                long j = this.f37111e;
                RunnableC6987v2 runnableC6987v2 = new RunnableC6987v2(runnable, 3);
                this.f37107a.add(runnableC6987v2);
                this.f37110d = 2;
                try {
                    this.f37108b.execute(this.f37109c);
                    if (this.f37110d != 2) {
                        return;
                    }
                    synchronized (this.f37107a) {
                        try {
                            if (this.f37111e == j && this.f37110d == 2) {
                                this.f37110d = 3;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f37107a) {
                        try {
                            int i2 = this.f37110d;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.f37107a.removeLastOccurrence(runnableC6987v2)) {
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
            this.f37107a.add(runnable);
        }
    }
}
