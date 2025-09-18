package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vO1 */
/* loaded from: classes.dex */
public final class C7595vO1 extends SQ1 {
    public static final AtomicLong l = new AtomicLong(Long.MIN_VALUE);
    public IO1 d;
    public IO1 e;
    public final PriorityBlockingQueue f;
    public final LinkedBlockingQueue g;
    public final DO1 h;
    public final DO1 i;
    public final Object j;
    public final Semaphore k;

    public C7595vO1(C3386dP1 c3386dP1) {
        super(c3386dP1);
        this.j = new Object();
        this.k = new Semaphore(2);
        this.f = new PriorityBlockingQueue();
        this.g = new LinkedBlockingQueue();
        this.h = new DO1(this, "Thread death: Uncaught exception on worker thread");
        this.i = new DO1(this, "Thread death: Uncaught exception on network thread");
    }

    public final VO1 A1(Callable callable) {
        w1();
        Preconditions.checkNotNull(callable);
        VO1 vo1 = new VO1(this, callable, false);
        if (Thread.currentThread() == this.d) {
            if (!this.f.isEmpty()) {
                n().j.d("Callable skipped the worker queue.");
            }
            vo1.run();
        } else {
            C1(vo1);
        }
        return vo1;
    }

    public final void B1(Runnable runnable) {
        w1();
        Preconditions.checkNotNull(runnable);
        VO1 vo1 = new VO1(this, runnable, false, "Task exception on network thread");
        synchronized (this.j) {
            try {
                this.g.add(vo1);
                IO1 io1 = this.e;
                if (io1 == null) {
                    IO1 io12 = new IO1(this, "Measurement Network", this.g);
                    this.e = io12;
                    io12.setUncaughtExceptionHandler(this.i);
                    this.e.start();
                } else {
                    io1.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void C1(VO1 vo1) {
        synchronized (this.j) {
            try {
                this.f.add(vo1);
                IO1 io1 = this.d;
                if (io1 == null) {
                    IO1 io12 = new IO1(this, "Measurement Worker", this.f);
                    this.d = io12;
                    io12.setUncaughtExceptionHandler(this.h);
                    this.d.start();
                } else {
                    io1.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final VO1 D1(Callable callable) {
        w1();
        Preconditions.checkNotNull(callable);
        VO1 vo1 = new VO1(this, callable, true);
        if (Thread.currentThread() == this.d) {
            vo1.run();
        } else {
            C1(vo1);
        }
        return vo1;
    }

    public final void E1(Runnable runnable) {
        w1();
        Preconditions.checkNotNull(runnable);
        C1(new VO1(this, runnable, false, "Task exception on worker thread"));
    }

    public final void F1(Runnable runnable) {
        w1();
        Preconditions.checkNotNull(runnable);
        C1(new VO1(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean G1() {
        return Thread.currentThread() == this.d;
    }

    public final void H1() {
        if (Thread.currentThread() != this.e) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // defpackage.U0
    public final void v1() {
        if (Thread.currentThread() != this.d) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // defpackage.SQ1
    public final boolean y1() {
        return false;
    }

    public final Object z1(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            p0().E1(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                n().j.d("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            n().j.d("Timed out waiting for ".concat(str));
        }
        return obj;
    }
}
