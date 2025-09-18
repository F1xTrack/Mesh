package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: m0 */
/* loaded from: classes.dex */
public abstract class AbstractC6399m0 implements InterfaceFutureC7800Jj0 {

    /* renamed from: d */
    public static final boolean f37377d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f37378e = Logger.getLogger(AbstractC6399m0.class.getName());

    /* renamed from: f */
    public static final AbstractC9104dM1 f37379f;

    /* renamed from: g */
    public static final Object f37380g;

    /* renamed from: a */
    public volatile Object f37381a;

    /* renamed from: b */
    public volatile C1447X f37382b;

    /* renamed from: c */
    public volatile C6273k0 f37383c;

    static {
        AbstractC9104dM1 c1820c0;
        try {
            c1820c0 = new C1573Z(AtomicReferenceFieldUpdater.newUpdater(C6273k0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C6273k0.class, C6273k0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC6399m0.class, C6273k0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC6399m0.class, C1447X.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC6399m0.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1820c0 = new C1820c0();
        }
        f37379f = c1820c0;
        if (th != null) {
            f37378e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f37380g = new Object();
    }

    /* renamed from: b */
    public static void m22606b(AbstractC6399m0 abstractC6399m0) {
        C1447X c1447x;
        C1447X c1447x2;
        C1447X c1447x3 = null;
        while (true) {
            C6273k0 c6273k0 = abstractC6399m0.f37383c;
            if (f37379f.mo9446c(abstractC6399m0, c6273k0, C6273k0.f35475c)) {
                while (c6273k0 != null) {
                    Thread thread = c6273k0.f35476a;
                    if (thread != null) {
                        c6273k0.f35476a = null;
                        LockSupport.unpark(thread);
                    }
                    c6273k0 = c6273k0.f35477b;
                }
                do {
                    c1447x = abstractC6399m0.f37382b;
                } while (!f37379f.mo9444a(abstractC6399m0, c1447x, C1447X.f13473d));
                while (true) {
                    c1447x2 = c1447x3;
                    c1447x3 = c1447x;
                    if (c1447x3 == null) {
                        break;
                    }
                    c1447x = c1447x3.f13476c;
                    c1447x3.f13476c = c1447x2;
                }
                while (c1447x2 != null) {
                    c1447x3 = c1447x2.f13476c;
                    Runnable runnable = c1447x2.f13474a;
                    if (runnable instanceof RunnableC1637a0) {
                        RunnableC1637a0 runnableC1637a0 = (RunnableC1637a0) runnable;
                        abstractC6399m0 = runnableC1637a0.f15273a;
                        if (abstractC6399m0.f37381a == runnableC1637a0) {
                            if (f37379f.mo9445b(abstractC6399m0, runnableC1637a0, m22609f(runnableC1637a0.f15274b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        m22607c(runnable, c1447x2.f13475b);
                    }
                    c1447x2 = c1447x3;
                }
                return;
            }
        }
    }

    /* renamed from: c */
    public static void m22607c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f37378e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: e */
    public static Object m22608e(Object obj) throws ExecutionException {
        if (obj instanceof C1132S) {
            CancellationException cancellationException = ((C1132S) obj).f10522b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C1321V) {
            throw new ExecutionException(((C1321V) obj).f12289a);
        }
        if (obj == f37380g) {
            return null;
        }
        return obj;
    }

    /* renamed from: f */
    public static Object m22609f(InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0) {
        if (interfaceFutureC7800Jj0 instanceof AbstractC6399m0) {
            Object obj = ((AbstractC6399m0) interfaceFutureC7800Jj0).f37381a;
            if (!(obj instanceof C1132S)) {
                return obj;
            }
            C1132S c1132s = (C1132S) obj;
            return c1132s.f10521a ? c1132s.f10522b != null ? new C1132S(false, c1132s.f10522b) : C1132S.f10520d : obj;
        }
        boolean zIsCancelled = interfaceFutureC7800Jj0.isCancelled();
        if ((!f37377d) && zIsCancelled) {
            return C1132S.f10520d;
        }
        try {
            Object objM22610g = m22610g(interfaceFutureC7800Jj0);
            return objM22610g == null ? f37380g : objM22610g;
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new C1132S(false, e);
            }
            return new C1321V(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + interfaceFutureC7800Jj0, e));
        } catch (ExecutionException e2) {
            return new C1321V(e2.getCause());
        } catch (Throwable th) {
            return new C1321V(th);
        }
    }

    /* renamed from: g */
    public static Object m22610g(InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = interfaceFutureC7800Jj0.get();
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

    /* renamed from: a */
    public final void m22611a(StringBuilder sb) {
        try {
            Object objM22610g = m22610g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM22610g == this ? "this future" : String.valueOf(objM22610g));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f37381a;
        if (!(obj == null) && !(obj instanceof RunnableC1637a0)) {
            return false;
        }
        C1132S c1132s = f37377d ? new C1132S(z, new CancellationException("Future.cancel() was called.")) : z ? C1132S.f10519c : C1132S.f10520d;
        AbstractC6399m0 abstractC6399m0 = this;
        boolean z2 = false;
        while (true) {
            if (f37379f.mo9445b(abstractC6399m0, obj, c1132s)) {
                m22606b(abstractC6399m0);
                if (!(obj instanceof RunnableC1637a0)) {
                    return true;
                }
                InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = ((RunnableC1637a0) obj).f15274b;
                if (!(interfaceFutureC7800Jj0 instanceof AbstractC6399m0)) {
                    interfaceFutureC7800Jj0.cancel(z);
                    return true;
                }
                abstractC6399m0 = (AbstractC6399m0) interfaceFutureC7800Jj0;
                obj = abstractC6399m0.f37381a;
                if (!(obj == null) && !(obj instanceof RunnableC1637a0)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = abstractC6399m0.f37381a;
                if (!(obj instanceof RunnableC1637a0)) {
                    return z2;
                }
            }
        }
    }

    @Override // p000.InterfaceFutureC7800Jj0
    /* renamed from: d */
    public final void mo2494d(Runnable runnable, Executor executor) {
        executor.getClass();
        C1447X c1447x = this.f37382b;
        C1447X c1447x2 = C1447X.f13473d;
        if (c1447x != c1447x2) {
            C1447X c1447x3 = new C1447X(runnable, executor);
            do {
                c1447x3.f13476c = c1447x;
                if (f37379f.mo9444a(this, c1447x, c1447x3)) {
                    return;
                } else {
                    c1447x = this.f37382b;
                }
            } while (c1447x != c1447x2);
        }
        m22607c(runnable, executor);
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
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC6399m0.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final String m22612h() {
        Object obj = this.f37381a;
        if (obj instanceof RunnableC1637a0) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            InterfaceFutureC7800Jj0 interfaceFutureC7800Jj0 = ((RunnableC1637a0) obj).f15274b;
            return AbstractC1374Vq.m8593l(sb, interfaceFutureC7800Jj0 == this ? "this future" : String.valueOf(interfaceFutureC7800Jj0), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: i */
    public final void m22613i(C6273k0 c6273k0) {
        c6273k0.f35476a = null;
        while (true) {
            C6273k0 c6273k02 = this.f37383c;
            if (c6273k02 == C6273k0.f35475c) {
                return;
            }
            C6273k0 c6273k03 = null;
            while (c6273k02 != null) {
                C6273k0 c6273k04 = c6273k02.f35477b;
                if (c6273k02.f35476a != null) {
                    c6273k03 = c6273k02;
                } else if (c6273k03 != null) {
                    c6273k03.f35477b = c6273k04;
                    if (c6273k03.f35476a == null) {
                        break;
                    }
                } else if (!f37379f.mo9446c(this, c6273k02, c6273k04)) {
                    break;
                }
                c6273k02 = c6273k04;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f37381a instanceof C1132S;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r0 instanceof RunnableC1637a0)) & (this.f37381a != null);
    }

    public final String toString() {
        String strM22612h;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f37381a instanceof C1132S) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m22611a(sb);
        } else {
            try {
                strM22612h = m22612h();
            } catch (RuntimeException e) {
                strM22612h = "Exception thrown from implementation: " + e.getClass();
            }
            if (strM22612h != null && !strM22612h.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strM22612h);
                sb.append("]");
            } else if (isDone()) {
                m22611a(sb);
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
            Object obj2 = this.f37381a;
            if ((obj2 != null) & (!(obj2 instanceof RunnableC1637a0))) {
                return m22608e(obj2);
            }
            C6273k0 c6273k0 = this.f37383c;
            C6273k0 c6273k02 = C6273k0.f35475c;
            if (c6273k0 != c6273k02) {
                C6273k0 c6273k03 = new C6273k0();
                do {
                    AbstractC9104dM1 abstractC9104dM1 = f37379f;
                    abstractC9104dM1.mo9447j(c6273k03, c6273k0);
                    if (abstractC9104dM1.mo9446c(this, c6273k0, c6273k03)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f37381a;
                            } else {
                                m22613i(c6273k03);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof RunnableC1637a0))));
                        return m22608e(obj);
                    }
                    c6273k0 = this.f37383c;
                } while (c6273k0 != c6273k02);
            }
            return m22608e(this.f37381a);
        }
        throw new InterruptedException();
    }
}
