package defpackage;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.Objects;
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

/* renamed from: l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5608l0 extends C90 implements InterfaceFutureC0750Jj0 {
    public static final boolean d;
    public static final DO e;
    public static final AbstractC2501cM1 f;
    public static final Object g;
    public volatile Object a;
    public volatile W b;
    public volatile C5226j0 c;

    static {
        boolean z;
        AbstractC2501cM1 c2239b0;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        d = z;
        e = new DO();
        Throwable th = null;
        try {
            c2239b0 = new C4259i0();
            e = null;
        } catch (Error | Exception e2) {
            e = e2;
            try {
                c2239b0 = new Y(AtomicReferenceFieldUpdater.newUpdater(C5226j0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C5226j0.class, C5226j0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5608l0.class, C5226j0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5608l0.class, W.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5608l0.class, Object.class, "a"));
            } catch (Error | Exception e3) {
                th = e3;
                c2239b0 = new C2239b0();
            }
        }
        f = c2239b0;
        if (th != null) {
            DO r0 = e;
            Logger loggerA = r0.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", e);
            r0.a().log(level, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void c(AbstractC5608l0 abstractC5608l0) {
        abstractC5608l0.getClass();
        for (C5226j0 c5226j0F = f.f(abstractC5608l0); c5226j0F != null; c5226j0F = c5226j0F.b) {
            Thread thread = c5226j0F.a;
            if (thread != null) {
                c5226j0F.a = null;
                LockSupport.unpark(thread);
            }
        }
        W wE = f.e(abstractC5608l0);
        W w = null;
        while (wE != null) {
            W w2 = wE.c;
            wE.c = w;
            w = wE;
            wE = w2;
        }
        while (w != null) {
            W w3 = w.c;
            Runnable runnable = w.a;
            Objects.requireNonNull(runnable);
            Executor executor = w.b;
            Objects.requireNonNull(executor);
            e(runnable, executor);
            w = w3;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            e.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof Q) {
            RuntimeException runtimeException = ((Q) obj).a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof U) {
            throw new ExecutionException(((U) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object g(AbstractC5608l0 abstractC5608l0) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractC5608l0.get();
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
            b(sb, objG);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        } catch (Exception e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public final void b(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        Q q;
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (d) {
            q = new Q(z, new CancellationException("Future.cancel() was called."));
        } else {
            q = z ? Q.b : Q.c;
            Objects.requireNonNull(q);
        }
        if (!f.b(this, obj, q)) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // defpackage.InterfaceFutureC0750Jj0
    public void d(Runnable runnable, Executor executor) {
        W w;
        W w2;
        QL1.d(executor, "Executor was null.");
        if (!isDone() && (w = this.b) != (w2 = W.d)) {
            W w3 = new W(runnable, executor);
            do {
                w3.c = w;
                if (f.a(this, w, w3)) {
                    return;
                } else {
                    w = this.b;
                }
            } while (w != w2);
        }
        e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
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
            C5226j0 c5226j0 = this.c;
            C5226j0 c5226j02 = C5226j0.c;
            if (c5226j0 != c5226j02) {
                C5226j0 c5226j03 = new C5226j0();
                do {
                    AbstractC2501cM1 abstractC2501cM1 = f;
                    abstractC2501cM1.g(c5226j03, c5226j0);
                    if (abstractC2501cM1.c(this, c5226j0, c5226j03)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                i(c5226j03);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        i(c5226j03);
                    } else {
                        c5226j0 = this.c;
                    }
                } while (c5226j0 != c5226j02);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return f(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.a;
            if (obj4 != null) {
                return f(obj4);
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
    public final String h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(C5226j0 c5226j0) {
        c5226j0.a = null;
        while (true) {
            C5226j0 c5226j02 = this.c;
            if (c5226j02 == C5226j0.c) {
                return;
            }
            C5226j0 c5226j03 = null;
            while (c5226j02 != null) {
                C5226j0 c5226j04 = c5226j02.b;
                if (c5226j02.a != null) {
                    c5226j03 = c5226j02;
                } else if (c5226j03 != null) {
                    c5226j03.b = c5226j04;
                    if (c5226j03.a == null) {
                        break;
                    }
                } else if (!f.c(this, c5226j02, c5226j04)) {
                    break;
                }
                c5226j02 = c5226j04;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.a instanceof Q;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.a != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L4f
            java.lang.String r1 = "CANCELLED"
            r0.append(r1)
            goto La2
        L4f:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L59
            r6.a(r0)
            goto La2
        L59:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.String r3 = r6.h()     // Catch: java.lang.StackOverflowError -> L70 java.lang.Exception -> L72
            if (r3 == 0) goto L6e
            boolean r4 = r3.isEmpty()     // Catch: java.lang.StackOverflowError -> L70 java.lang.Exception -> L72
            if (r4 == 0) goto L85
        L6e:
            r3 = 0
            goto L85
        L70:
            r3 = move-exception
            goto L73
        L72:
            r3 = move-exception
        L73:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Exception thrown from implementation: "
            r4.<init>(r5)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        L85:
            if (r3 == 0) goto L92
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        L92:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto La2
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.a(r0)
        La2:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5608l0.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return f(obj2);
            }
            C5226j0 c5226j0 = this.c;
            C5226j0 c5226j02 = C5226j0.c;
            if (c5226j0 != c5226j02) {
                C5226j0 c5226j03 = new C5226j0();
                do {
                    AbstractC2501cM1 abstractC2501cM1 = f;
                    abstractC2501cM1.g(c5226j03, c5226j0);
                    if (abstractC2501cM1.c(this, c5226j0, c5226j03)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(c5226j03);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    c5226j0 = this.c;
                } while (c5226j0 != c5226j02);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return f(obj3);
        }
        throw new InterruptedException();
    }
}
