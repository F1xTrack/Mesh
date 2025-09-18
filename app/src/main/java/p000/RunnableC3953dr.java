package p000;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: dr */
/* loaded from: classes.dex */
public final class RunnableC3953dr extends C1043QZ implements Runnable {

    /* renamed from: c */
    public InterfaceC6471n9 f26333c;

    /* renamed from: d */
    public final LinkedBlockingQueue f26334d = new LinkedBlockingQueue(1);

    /* renamed from: e */
    public final CountDownLatch f26335e = new CountDownLatch(1);

    /* renamed from: f */
    public InterfaceFutureC7800Jj0 f26336f;

    /* renamed from: g */
    public volatile InterfaceFutureC7800Jj0 f26337g;

    public RunnableC3953dr(InterfaceC6471n9 interfaceC6471n9, InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0) {
        this.f26333c = interfaceC6471n9;
        interfaceFutureC7800Jj0.getClass();
        this.f26336f = interfaceFutureC7800Jj0;
    }

    /* renamed from: b */
    public static Object m17766b(LinkedBlockingQueue linkedBlockingQueue) {
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

    @Override // p000.C1043QZ, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2 = false;
        if (!this.f9668a.cancel(z)) {
            return false;
        }
        while (true) {
            try {
                this.f26334d.put(Boolean.valueOf(z));
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
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = this.f26336f;
        if (interfaceFutureC7800Jj0 != null) {
            interfaceFutureC7800Jj0.cancel(z);
        }
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj02 = this.f26337g;
        if (interfaceFutureC7800Jj02 != null) {
            interfaceFutureC7800Jj02.cancel(z);
        }
        return true;
    }

    @Override // p000.C1043QZ, java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        if (!this.f9668a.isDone()) {
            InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = this.f26336f;
            if (interfaceFutureC7800Jj0 != null) {
                interfaceFutureC7800Jj0.get();
            }
            this.f26335e.await();
            InterfaceFutureC7800Jj0 interfaceFutureC7800Jj02 = this.f26337g;
            if (interfaceFutureC7800Jj02 != null) {
                interfaceFutureC7800Jj02.get();
            }
        }
        return this.f9668a.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0Apply;
        try {
        } catch (UndeclaredThrowableException e) {
            Throwable cause = e.getCause();
            C0300El c0300El = this.f9669b;
            if (c0300El != null) {
                c0300El.m2377d(cause);
            }
        }
        try {
            try {
                try {
                    try {
                        interfaceFutureC7800Jj0Apply = this.f26333c.apply(AbstractC8301Sz1.m7483f(this.f26336f));
                        this.f26337g = interfaceFutureC7800Jj0Apply;
                    } catch (CancellationException unused) {
                        cancel(false);
                    } catch (ExecutionException e2) {
                        Throwable cause2 = e2.getCause();
                        C0300El c0300El2 = this.f9669b;
                        if (c0300El2 != null) {
                            c0300El2.m2377d(cause2);
                        }
                    }
                } catch (Error e3) {
                    C0300El c0300El3 = this.f9669b;
                    if (c0300El3 != null) {
                        c0300El3.m2377d(e3);
                    }
                }
            } catch (Exception e4) {
                C0300El c0300El4 = this.f9669b;
                if (c0300El4 != null) {
                    c0300El4.m2377d(e4);
                }
            }
            if (!this.f9668a.isCancelled()) {
                interfaceFutureC7800Jj0Apply.mo2494d(new RunnableC1420WZ(this, interfaceFutureC7800Jj0Apply, false, 5), QR1.m6703a());
            } else {
                interfaceFutureC7800Jj0Apply.cancel(((Boolean) m17766b(this.f26334d)).booleanValue());
                this.f26337g = null;
            }
        } finally {
            this.f26333c = null;
            this.f26336f = null;
            this.f26335e.countDown();
        }
    }

    @Override // p000.C1043QZ, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        if (!this.f9668a.isDone()) {
            TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
            if (timeUnit != timeUnit2) {
                j = timeUnit2.convert(j, timeUnit);
                timeUnit = timeUnit2;
            }
            InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = this.f26336f;
            if (interfaceFutureC7800Jj0 != null) {
                long jNanoTime = System.nanoTime();
                interfaceFutureC7800Jj0.get(j, timeUnit);
                j -= Math.max(0L, System.nanoTime() - jNanoTime);
            }
            long jNanoTime2 = System.nanoTime();
            if (this.f26335e.await(j, timeUnit)) {
                j -= Math.max(0L, System.nanoTime() - jNanoTime2);
                InterfaceFutureC7800Jj0 interfaceFutureC7800Jj02 = this.f26337g;
                if (interfaceFutureC7800Jj02 != null) {
                    interfaceFutureC7800Jj02.get(j, timeUnit);
                }
            } else {
                throw new TimeoutException();
            }
        }
        return this.f9668a.get(j, timeUnit);
    }
}
