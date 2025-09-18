package defpackage;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: dr */
/* loaded from: classes.dex */
public final class RunnableC3467dr extends QZ implements Runnable {
    public InterfaceC6021n9 c;
    public final LinkedBlockingQueue d = new LinkedBlockingQueue(1);
    public final CountDownLatch e = new CountDownLatch(1);
    public InterfaceFutureC0750Jj0 f;
    public volatile InterfaceFutureC0750Jj0 g;

    public RunnableC3467dr(InterfaceC6021n9 interfaceC6021n9, InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0) {
        this.c = interfaceC6021n9;
        interfaceFutureC0750Jj0.getClass();
        this.f = interfaceFutureC0750Jj0;
    }

    public static Object b(LinkedBlockingQueue linkedBlockingQueue) {
        Object objTake;
        boolean z = false;
        while (true) {
            try {
                objTake = linkedBlockingQueue.take();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return objTake;
    }

    @Override // defpackage.QZ, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.a.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.d.put(Boolean.valueOf(z));
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = this.f;
        if (interfaceFutureC0750Jj0 != null) {
            interfaceFutureC0750Jj0.cancel(z);
        }
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj02 = this.g;
        if (interfaceFutureC0750Jj02 != null) {
            interfaceFutureC0750Jj02.cancel(z);
        }
        return true;
    }

    @Override // defpackage.QZ, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.a.isDone()) {
            InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = this.f;
            if (interfaceFutureC0750Jj0 != null) {
                interfaceFutureC0750Jj0.get();
            }
            this.e.await();
            InterfaceFutureC0750Jj0 interfaceFutureC0750Jj02 = this.g;
            if (interfaceFutureC0750Jj02 != null) {
                interfaceFutureC0750Jj02.get();
            }
        }
        return this.a.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0Apply;
        try {
        } catch (UndeclaredThrowableException e) {
            Throwable cause = e.getCause();
            C0365El c0365El = this.b;
            if (c0365El != null) {
                c0365El.d(cause);
            }
        }
        try {
            try {
                try {
                    try {
                        interfaceFutureC0750Jj0Apply = this.c.apply(AbstractC1500Sz1.f(this.f));
                        this.g = interfaceFutureC0750Jj0Apply;
                    } catch (CancellationException unused) {
                        cancel(false);
                    } catch (ExecutionException e2) {
                        Throwable cause2 = e2.getCause();
                        C0365El c0365El2 = this.b;
                        if (c0365El2 != null) {
                            c0365El2.d(cause2);
                        }
                    }
                } catch (Error e3) {
                    C0365El c0365El3 = this.b;
                    if (c0365El3 != null) {
                        c0365El3.d(e3);
                    }
                }
            } catch (Exception e4) {
                C0365El c0365El4 = this.b;
                if (c0365El4 != null) {
                    c0365El4.d(e4);
                }
            }
            if (!this.a.isCancelled()) {
                interfaceFutureC0750Jj0Apply.d(new WZ(this, interfaceFutureC0750Jj0Apply, false, 5), QR1.a());
            } else {
                interfaceFutureC0750Jj0Apply.cancel(((Boolean) b(this.d)).booleanValue());
                this.g = null;
            }
        } finally {
            this.c = null;
            this.f = null;
            this.e.countDown();
        }
    }

    @Override // defpackage.QZ, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = this.f;
            if (interfaceFutureC0750Jj0 != null) {
                long jNanoTime = System.nanoTime();
                interfaceFutureC0750Jj0.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.e.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - jNanoTime2);
                InterfaceFutureC0750Jj0 interfaceFutureC0750Jj02 = this.g;
                if (interfaceFutureC0750Jj02 != null) {
                    interfaceFutureC0750Jj02.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.a.get(j, timeUnit);
    }
}
