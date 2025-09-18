package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: b1 */
/* loaded from: classes.dex */
public abstract class AbstractC2243b1 implements InterfaceFutureC0750Jj0 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(AbstractC2243b1.class.getName());
    public static final AbstractC7016sM1 f;
    public static final Object g;
    public volatile Object a;
    public volatile X0 b;
    public volatile C2052a1 c;

    static {
        AbstractC7016sM1 z0;
        try {
            z0 = new Y0(AtomicReferenceFieldUpdater.newUpdater(C2052a1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C2052a1.class, C2052a1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2243b1.class, C2052a1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2243b1.class, X0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC2243b1.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            z0 = new Z0();
        }
        f = z0;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void c(AbstractC2243b1 abstractC2243b1) {
        C2052a1 c2052a1;
        X0 x0;
        X0 x02;
        X0 x03;
        do {
            c2052a1 = abstractC2243b1.c;
        } while (!f.c(abstractC2243b1, c2052a1, C2052a1.c));
        while (true) {
            x0 = null;
            if (c2052a1 == null) {
                break;
            }
            Thread thread = c2052a1.a;
            if (thread != null) {
                c2052a1.a = null;
                LockSupport.unpark(thread);
            }
            c2052a1 = c2052a1.b;
        }
        abstractC2243b1.b();
        do {
            x02 = abstractC2243b1.b;
        } while (!f.a(abstractC2243b1, x02, X0.d));
        while (true) {
            x03 = x0;
            x0 = x02;
            if (x0 == null) {
                break;
            }
            x02 = x0.c;
            x0.c = x03;
        }
        while (x03 != null) {
            X0 x04 = x03.c;
            e(x03.a, x03.b);
            x03 = x04;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof V0) {
            CancellationException cancellationException = ((V0) obj).b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof W0) {
            throw new ExecutionException(((W0) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object g(AbstractC2243b1 abstractC2243b1) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractC2243b1.get();
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
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!f.b(this, obj, d ? new V0(z, new CancellationException("Future.cancel() was called.")) : z ? V0.c : V0.d)) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // defpackage.InterfaceFutureC0750Jj0
    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        X0 x0 = this.b;
        X0 x02 = X0.d;
        if (x0 != x02) {
            X0 x03 = new X0(runnable, executor);
            do {
                x03.c = x0;
                if (f.a(this, x0, x03)) {
                    return;
                } else {
                    x0 = this.b;
                }
            } while (x0 != x02);
        }
        e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C2052a1 c2052a1 = this.c;
            C2052a1 c2052a12 = C2052a1.c;
            if (c2052a1 != c2052a12) {
                C2052a1 c2052a13 = new C2052a1();
                do {
                    AbstractC7016sM1 abstractC7016sM1 = f;
                    abstractC7016sM1.e(c2052a13, c2052a1);
                    if (abstractC7016sM1.c(this, c2052a1, c2052a13)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                i(c2052a13);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(c2052a13);
                    } else {
                        c2052a1 = this.c;
                    }
                } while (c2052a1 != c2052a12);
            }
            return f(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbP = AbstractC8235ym.p("Waited ", j, " ");
        sbP.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbP.toString();
        if (nanos + 1000 < 0) {
            String strI = AbstractC8235ym.i(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strI2 = strI + jConvert + " " + lowerCase;
                if (z) {
                    strI2 = AbstractC8235ym.i(strI2, StringUtils.COMMA);
                }
                strI = AbstractC8235ym.i(strI2, " ");
            }
            if (z) {
                strI = strI + nanos2 + " nanoseconds ";
            }
            string3 = AbstractC8235ym.i(strI, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC8235ym.i(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC1705Vq.h(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(C2052a1 c2052a1) {
        c2052a1.a = null;
        while (true) {
            C2052a1 c2052a12 = this.c;
            if (c2052a12 == C2052a1.c) {
                return;
            }
            C2052a1 c2052a13 = null;
            while (c2052a12 != null) {
                C2052a1 c2052a14 = c2052a12.b;
                if (c2052a12.a != null) {
                    c2052a13 = c2052a12;
                } else if (c2052a13 != null) {
                    c2052a13.b = c2052a14;
                    if (c2052a13.a == null) {
                        break;
                    }
                } else if (!f.c(this, c2052a12, c2052a14)) {
                    break;
                }
                c2052a12 = c2052a14;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof V0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public boolean j(Object obj) {
        if (obj == null) {
            obj = g;
        }
        if (!f.b(this, null, obj)) {
            return false;
        }
        c(this);
        return true;
    }

    public boolean k(Throwable th) {
        th.getClass();
        if (!f.b(this, null, new W0(th))) {
            return false;
        }
        c(this);
        return true;
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof V0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e2) {
                strH = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strH);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return f(obj2);
            }
            C2052a1 c2052a1 = this.c;
            C2052a1 c2052a12 = C2052a1.c;
            if (c2052a1 != c2052a12) {
                C2052a1 c2052a13 = new C2052a1();
                do {
                    AbstractC7016sM1 abstractC7016sM1 = f;
                    abstractC7016sM1.e(c2052a13, c2052a1);
                    if (abstractC7016sM1.c(this, c2052a1, c2052a13)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(c2052a13);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    c2052a1 = this.c;
                } while (c2052a1 != c2052a12);
            }
            return f(this.a);
        }
        throw new InterruptedException();
    }
}
