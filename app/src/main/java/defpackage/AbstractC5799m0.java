package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5799m0 implements InterfaceFutureC0750Jj0 {
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger e = Logger.getLogger(AbstractC5799m0.class.getName());
    public static final AbstractC3377dM1 f;
    public static final Object g;
    public volatile Object a;
    public volatile X b;
    public volatile C5417k0 c;

    static {
        AbstractC3377dM1 c2429c0;
        try {
            c2429c0 = new Z(AtomicReferenceFieldUpdater.newUpdater(C5417k0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C5417k0.class, C5417k0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5799m0.class, C5417k0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5799m0.class, X.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5799m0.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c2429c0 = new C2429c0();
        }
        f = c2429c0;
        if (th != null) {
            e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        g = new Object();
    }

    public static void b(AbstractC5799m0 abstractC5799m0) {
        X x;
        X x2;
        X x3 = null;
        while (true) {
            C5417k0 c5417k0 = abstractC5799m0.c;
            if (f.c(abstractC5799m0, c5417k0, C5417k0.c)) {
                while (c5417k0 != null) {
                    Thread thread = c5417k0.a;
                    if (thread != null) {
                        c5417k0.a = null;
                        LockSupport.unpark(thread);
                    }
                    c5417k0 = c5417k0.b;
                }
                do {
                    x = abstractC5799m0.b;
                } while (!f.a(abstractC5799m0, x, X.d));
                while (true) {
                    x2 = x3;
                    x3 = x;
                    if (x3 == null) {
                        break;
                    }
                    x = x3.c;
                    x3.c = x2;
                }
                while (x2 != null) {
                    x3 = x2.c;
                    Runnable runnable = x2.a;
                    if (runnable instanceof RunnableC2048a0) {
                        RunnableC2048a0 runnableC2048a0 = (RunnableC2048a0) runnable;
                        abstractC5799m0 = runnableC2048a0.a;
                        if (abstractC5799m0.a == runnableC2048a0) {
                            if (f.b(abstractC5799m0, runnableC2048a0, f(runnableC2048a0.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, x2.b);
                    }
                    x2 = x3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof S) {
            CancellationException cancellationException = ((S) obj).b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof V) {
            throw new ExecutionException(((V) obj).a);
        }
        if (obj == g) {
            return null;
        }
        return obj;
    }

    public static Object f(InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0) {
        if (interfaceFutureC0750Jj0 instanceof AbstractC5799m0) {
            Object obj = ((AbstractC5799m0) interfaceFutureC0750Jj0).a;
            if (!(obj instanceof S)) {
                return obj;
            }
            S s = (S) obj;
            return s.a ? s.b != null ? new S(false, s.b) : S.d : obj;
        }
        boolean zIsCancelled = interfaceFutureC0750Jj0.isCancelled();
        if ((!d) && zIsCancelled) {
            return S.d;
        }
        try {
            Object objG = g(interfaceFutureC0750Jj0);
            return objG == null ? g : objG;
        } catch (CancellationException e2) {
            if (zIsCancelled) {
                return new S(false, e2);
            }
            return new V(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC0750Jj0, e2));
        } catch (ExecutionException e3) {
            return new V(e3.getCause());
        } catch (Throwable th) {
            return new V(th);
        }
    }

    public static Object g(InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = interfaceFutureC0750Jj0.get();
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
        if (!(obj == null) && !(obj instanceof RunnableC2048a0)) {
            return false;
        }
        S s = d ? new S(z, new CancellationException("Future.cancel() was called.")) : z ? S.c : S.d;
        AbstractC5799m0 abstractC5799m0 = this;
        boolean z2 = false;
        while (true) {
            if (f.b(abstractC5799m0, obj, s)) {
                b(abstractC5799m0);
                if (!(obj instanceof RunnableC2048a0)) {
                    return true;
                }
                InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = ((RunnableC2048a0) obj).b;
                if (!(interfaceFutureC0750Jj0 instanceof AbstractC5799m0)) {
                    interfaceFutureC0750Jj0.cancel(z);
                    return true;
                }
                abstractC5799m0 = (AbstractC5799m0) interfaceFutureC0750Jj0;
                obj = abstractC5799m0.a;
                if (!(obj == null) && !(obj instanceof RunnableC2048a0)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = abstractC5799m0.a;
                if (!(obj instanceof RunnableC2048a0)) {
                    return z2;
                }
            }
        }
    }

    @Override // defpackage.InterfaceFutureC0750Jj0
    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        X x = this.b;
        X x2 = X.d;
        if (x != x2) {
            X x3 = new X(runnable, executor);
            do {
                x3.c = x;
                if (f.a(this, x, x3)) {
                    return;
                } else {
                    x = this.b;
                }
            } while (x != x2);
        }
        c(runnable, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5799m0.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.a;
        if (obj instanceof RunnableC2048a0) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            InterfaceFutureC0750Jj0 interfaceFutureC0750Jj0 = ((RunnableC2048a0) obj).b;
            return AbstractC1705Vq.l(sb, interfaceFutureC0750Jj0 == this ? "this future" : String.valueOf(interfaceFutureC0750Jj0), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(C5417k0 c5417k0) {
        c5417k0.a = null;
        while (true) {
            C5417k0 c5417k02 = this.c;
            if (c5417k02 == C5417k0.c) {
                return;
            }
            C5417k0 c5417k03 = null;
            while (c5417k02 != null) {
                C5417k0 c5417k04 = c5417k02.b;
                if (c5417k02.a != null) {
                    c5417k03 = c5417k02;
                } else if (c5417k03 != null) {
                    c5417k03.b = c5417k04;
                    if (c5417k03.a == null) {
                        break;
                    }
                } else if (!f.c(this, c5417k02, c5417k04)) {
                    break;
                }
                c5417k02 = c5417k04;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof S;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof RunnableC2048a0)) & (this.a != null);
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof S) {
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

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC2048a0))) {
                return e(obj2);
            }
            C5417k0 c5417k0 = this.c;
            C5417k0 c5417k02 = C5417k0.c;
            if (c5417k0 != c5417k02) {
                C5417k0 c5417k03 = new C5417k0();
                do {
                    AbstractC3377dM1 abstractC3377dM1 = f;
                    abstractC3377dM1.j(c5417k03, c5417k0);
                    if (abstractC3377dM1.c(this, c5417k0, c5417k03)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(c5417k03);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC2048a0))));
                        return e(obj);
                    }
                    c5417k0 = this.c;
                } while (c5417k0 != c5417k02);
            }
            return e(this.a);
        }
        throw new InterruptedException();
    }
}
