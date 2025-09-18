package p000;

import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: vO1 */
/* loaded from: classes.dex */
public final class C11412vO1 extends SQ1 {

    /* renamed from: l */
    public static final AtomicLong f44353l = new AtomicLong(Long.MIN_VALUE);

    /* renamed from: d */
    public IO1 f44354d;

    /* renamed from: e */
    public IO1 f44355e;

    /* renamed from: f */
    public final PriorityBlockingQueue f44356f;

    /* renamed from: g */
    public final LinkedBlockingQueue f44357g;

    /* renamed from: h */
    public final DO1 f44358h;

    /* renamed from: i */
    public final DO1 f44359i;

    /* renamed from: j */
    public final Object f44360j;

    /* renamed from: k */
    public final Semaphore f44361k;

    public C11412vO1(C9110dP1 c9110dP1) {
        super(c9110dP1);
        this.f44360j = new Object();
        this.f44361k = new Semaphore(2);
        this.f44356f = new PriorityBlockingQueue();
        this.f44357g = new LinkedBlockingQueue();
        this.f44358h = new DO1(this, "Thread death: Uncaught exception on worker thread");
        this.f44359i = new DO1(this, "Thread death: Uncaught exception on network thread");
    }

    /* renamed from: A1 */
    public final VO1 m25408A1(Callable callable) {
        m7367w1();
        Preconditions.checkNotNull(callable);
        VO1 vo1 = new VO1(this, callable, false);
        if (Thread.currentThread() == this.f44354d) {
            if (!this.f44356f.isEmpty()) {
                mo6070n().f8381j.m24555d("Callable skipped the worker queue.");
            }
            vo1.run();
        } else {
            m25410C1(vo1);
        }
        return vo1;
    }

    /* renamed from: B1 */
    public final void m25409B1(Runnable runnable) {
        m7367w1();
        Preconditions.checkNotNull(runnable);
        VO1 vo1 = new VO1(this, runnable, false, "Task exception on network thread");
        synchronized (this.f44360j) {
            try {
                this.f44357g.add(vo1);
                IO1 io1 = this.f44355e;
                if (io1 == null) {
                    IO1 io12 = new IO1(this, "Measurement Network", this.f44357g);
                    this.f44355e = io12;
                    io12.setUncaughtExceptionHandler(this.f44359i);
                    this.f44355e.start();
                } else {
                    io1.m3842a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: C1 */
    public final void m25410C1(VO1 vo1) {
        synchronized (this.f44360j) {
            try {
                this.f44356f.add(vo1);
                IO1 io1 = this.f44354d;
                if (io1 == null) {
                    IO1 io12 = new IO1(this, "Measurement Worker", this.f44356f);
                    this.f44354d = io12;
                    io12.setUncaughtExceptionHandler(this.f44358h);
                    this.f44354d.start();
                } else {
                    io1.m3842a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: D1 */
    public final VO1 m25411D1(Callable callable) {
        m7367w1();
        Preconditions.checkNotNull(callable);
        VO1 vo1 = new VO1(this, callable, true);
        if (Thread.currentThread() == this.f44354d) {
            vo1.run();
        } else {
            m25410C1(vo1);
        }
        return vo1;
    }

    /* renamed from: E1 */
    public final void m25412E1(Runnable runnable) {
        m7367w1();
        Preconditions.checkNotNull(runnable);
        m25410C1(new VO1(this, runnable, false, "Task exception on worker thread"));
    }

    /* renamed from: F1 */
    public final void m25413F1(Runnable runnable) {
        m7367w1();
        Preconditions.checkNotNull(runnable);
        m25410C1(new VO1(this, runnable, true, "Task exception on worker thread"));
    }

    /* renamed from: G1 */
    public final boolean m25414G1() {
        return Thread.currentThread() == this.f44354d;
    }

    /* renamed from: H1 */
    public final void m25415H1() {
        if (Thread.currentThread() != this.f44355e) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // p000.AbstractC1259U0
    /* renamed from: v1 */
    public final void mo7681v1() {
        if (Thread.currentThread() != this.f44354d) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // p000.SQ1
    /* renamed from: y1 */
    public final boolean mo6035y1() {
        return false;
    }

    /* renamed from: z1 */
    public final Object m25416z1(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            mo6071p0().m25412E1(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                mo6070n().f8381j.m24555d("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            mo6070n().f8381j.m24555d("Timed out waiting for ".concat(str));
        }
        return obj;
    }
}
