package defpackage;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: sF */
/* loaded from: classes2.dex */
public final class RunnableC6993sF extends JP implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;
    public static final RunnableC6993sF j;
    public static final long k;

    static {
        Long l;
        RunnableC6993sF runnableC6993sF = new RunnableC6993sF();
        j = runnableC6993sF;
        runnableC6993sF.x(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        k = timeUnit.toNanos(l.longValue());
    }

    @Override // defpackage.KP
    public final void J(long j2, HP hp) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // defpackage.JP
    public final void S(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.S(runnable);
    }

    @Override // defpackage.JP, defpackage.InterfaceC7381uH
    public final MK a(long j2, RunnableC0490Ga1 runnableC0490Ga1, InterfaceC0173Bz interfaceC0173Bz) {
        long j3 = j2 > 0 ? j2 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j2 : 0L;
        if (j3 >= 4611686018427387903L) {
            return C0864Kv0.a;
        }
        long jNanoTime = System.nanoTime();
        GP gp = new GP(j3 + jNanoTime, runnableC0490Ga1);
        b0(jNanoTime, gp);
        return gp;
    }

    public final synchronized void d0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            JP.g.set(this, null);
            JP.h.set(this, null);
            notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zX;
        X91.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    if (zX) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j2 = Long.MAX_VALUE;
                long j3 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jA = A();
                    if (jA == j2) {
                        long jNanoTime = System.nanoTime();
                        if (j3 == j2) {
                            j3 = k + jNanoTime;
                        }
                        long j4 = j3 - jNanoTime;
                        if (j4 <= 0) {
                            _thread = null;
                            d0();
                            if (X()) {
                                return;
                            }
                            w();
                            return;
                        }
                        jA = AbstractC5686lO1.b(jA, j4);
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (jA > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            d0();
                            if (X()) {
                                return;
                            }
                            w();
                            return;
                        }
                        LockSupport.parkNanos(this, jA);
                    }
                    j2 = Long.MAX_VALUE;
                }
            }
        } finally {
            _thread = null;
            d0();
            if (!X()) {
                w();
            }
        }
    }

    @Override // defpackage.JP, defpackage.KP
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override // defpackage.AbstractC0485Fz
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override // defpackage.KP
    public final Thread w() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(j.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }
}
