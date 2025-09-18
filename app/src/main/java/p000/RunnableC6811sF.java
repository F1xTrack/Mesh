package p000;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: sF */
/* loaded from: classes2.dex */
public final class RunnableC6811sF extends AbstractC0593JP implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j */
    public static final RunnableC6811sF f42334j;

    /* renamed from: k */
    public static final long f42335k;

    static {
        Long l;
        RunnableC6811sF runnableC6811sF = new RunnableC6811sF();
        f42334j = runnableC6811sF;
        runnableC6811sF.m4629x(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f42335k = timeUnit.toNanos(l.longValue());
    }

    @Override // p000.AbstractC0656KP
    /* renamed from: J */
    public final void mo4627J(long j, AbstractRunnableC0467HP abstractRunnableC0467HP) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // p000.AbstractC0593JP
    /* renamed from: S */
    public final void mo4307S(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.mo4307S(runnable);
    }

    @Override // p000.AbstractC0593JP, p000.InterfaceC6939uH
    /* renamed from: a */
    public final InterfaceC0776MK mo4311a(long j, RunnableC7627Ga1 runnableC7627Ga1, InterfaceC0125Bz interfaceC0125Bz) {
        long j2 = j > 0 ? j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j : 0L;
        if (j2 >= 4611686018427387903L) {
            return C7876Kv0.f6390a;
        }
        long jNanoTime = System.nanoTime();
        C0404GP c0404gp = new C0404GP(j2 + jNanoTime, runnableC7627Ga1);
        m4312b0(jNanoTime, c0404gp);
        return c0404gp;
    }

    /* renamed from: d0 */
    public final synchronized void m24684d0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            AbstractC0593JP.f5510g.set(this, null);
            AbstractC0593JP.f5511h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zM4310X;
        X91.f13583a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zM4310X) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jMo4306A = mo4306A();
                    if (jMo4306A == j) {
                        long jNanoTime = System.nanoTime();
                        if (j2 == j) {
                            j2 = f42335k + jNanoTime;
                        }
                        long j3 = j2 - jNanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            m24684d0();
                            if (m4310X()) {
                                return;
                            }
                            mo1842w();
                            return;
                        }
                        jMo4306A = AbstractC10132lO1.m22417b(jMo4306A, j3);
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (jMo4306A > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m24684d0();
                            if (m4310X()) {
                                return;
                            }
                            mo1842w();
                            return;
                        }
                        LockSupport.parkNanos(this, jMo4306A);
                    }
                    j = Long.MAX_VALUE;
                }
            }
        } finally {
            _thread = null;
            m24684d0();
            if (!m4310X()) {
                mo1842w();
            }
        }
    }

    @Override // p000.AbstractC0593JP, p000.AbstractC0656KP
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // p000.AbstractC0377Fz
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // p000.AbstractC0656KP
    /* renamed from: w */
    public final Thread mo1842w() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(f42334j.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }
}
