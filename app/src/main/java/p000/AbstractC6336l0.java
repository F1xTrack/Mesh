package p000;

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

/* renamed from: l0 */
/* loaded from: classes.dex */
public abstract class AbstractC6336l0 extends C90 implements InterfaceFutureC7800Jj0 {

    /* renamed from: d */
    public static final boolean f36795d;

    /* renamed from: e */
    public static final C0214DO f36796e;

    /* renamed from: f */
    public static final AbstractC8971cM1 f36797f;

    /* renamed from: g */
    public static final Object f36798g;

    /* renamed from: a */
    public volatile Object f36799a;

    /* renamed from: b */
    public volatile C1384W f36800b;

    /* renamed from: c */
    public volatile C6210j0 f36801c;

    static {
        boolean z;
        AbstractC8971cM1 c1758b0;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        f36795d = z;
        f36796e = new C0214DO();
        Throwable th = null;
        try {
            c1758b0 = new C4215i0();
            e = null;
        } catch (Error | Exception e) {
            e = e;
            try {
                c1758b0 = new C1510Y(AtomicReferenceFieldUpdater.newUpdater(C6210j0.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C6210j0.class, C6210j0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC6336l0.class, C6210j0.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC6336l0.class, C1384W.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC6336l0.class, Object.class, "a"));
            } catch (Error | Exception e2) {
                th = e2;
                c1758b0 = new C1758b0();
            }
        }
        f36797f = c1758b0;
        if (th != null) {
            C0214DO c0214do = f36796e;
            Logger loggerM1676a = c0214do.m1676a();
            Level level = Level.SEVERE;
            loggerM1676a.log(level, "UnsafeAtomicHelper is broken!", e);
            c0214do.m1676a().log(level, "SafeAtomicHelper is broken!", th);
        }
        f36798g = new Object();
    }

    /* renamed from: c */
    public static void m22322c(AbstractC6336l0 abstractC6336l0) {
        abstractC6336l0.getClass();
        for (C6210j0 c6210j0Mo9194f = f36797f.mo9194f(abstractC6336l0); c6210j0Mo9194f != null; c6210j0Mo9194f = c6210j0Mo9194f.f34838b) {
            Thread thread = c6210j0Mo9194f.f34837a;
            if (thread != null) {
                c6210j0Mo9194f.f34837a = null;
                LockSupport.unpark(thread);
            }
        }
        C1384W c1384wMo9193e = f36797f.mo9193e(abstractC6336l0);
        C1384W c1384w = null;
        while (c1384wMo9193e != null) {
            C1384W c1384w2 = c1384wMo9193e.f12914c;
            c1384wMo9193e.f12914c = c1384w;
            c1384w = c1384wMo9193e;
            c1384wMo9193e = c1384w2;
        }
        while (c1384w != null) {
            C1384W c1384w3 = c1384w.f12914c;
            Runnable runnable = c1384w.f12912a;
            Objects.requireNonNull(runnable);
            Executor executor = c1384w.f12913b;
            Objects.requireNonNull(executor);
            m22323e(runnable, executor);
            c1384w = c1384w3;
        }
    }

    /* renamed from: e */
    public static void m22323e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            f36796e.m1676a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: f */
    public static Object m22324f(Object obj) throws ExecutionException {
        if (obj instanceof C1007Q) {
            RuntimeException runtimeException = ((C1007Q) obj).f9394a;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(runtimeException);
            throw cancellationException;
        }
        if (obj instanceof C1258U) {
            throw new ExecutionException(((C1258U) obj).f11613a);
        }
        if (obj == f36798g) {
            return null;
        }
        return obj;
    }

    /* renamed from: g */
    public static Object m22325g(AbstractC6336l0 abstractC6336l0) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractC6336l0.get();
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
    public final void m22326a(StringBuilder sb) {
        try {
            Object objM22325g = m22325g(this);
            sb.append("SUCCESS, result=[");
            m22327b(sb, objM22325g);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* renamed from: b */
    public final void m22327b(StringBuilder sb, Object obj) {
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
        C1007Q c1007q;
        Object obj = this.f36799a;
        if (obj != null) {
            return false;
        }
        if (f36795d) {
            c1007q = new C1007Q(z, new CancellationException("Future.cancel() was called."));
        } else {
            c1007q = z ? C1007Q.f9392b : C1007Q.f9393c;
            Objects.requireNonNull(c1007q);
        }
        if (!f36797f.mo9191b(this, obj, c1007q)) {
            return false;
        }
        m22322c(this);
        return true;
    }

    @Override // p000.InterfaceFutureC7800Jj0
    /* renamed from: d */
    public void mo2494d(Runnable runnable, Executor executor) {
        C1384W c1384w;
        C1384W c1384w2;
        QL1.m6668d(executor, "Executor was null.");
        if (!isDone() && (c1384w = this.f36800b) != (c1384w2 = C1384W.f12911d)) {
            C1384W c1384w3 = new C1384W(runnable, executor);
            do {
                c1384w3.f12914c = c1384w;
                if (f36797f.mo9190a(this, c1384w, c1384w3)) {
                    return;
                } else {
                    c1384w = this.f36800b;
                }
            } while (c1384w != c1384w2);
        }
        m22323e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f36799a;
        if (obj != null) {
            return m22324f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C6210j0 c6210j0 = this.f36801c;
            C6210j0 c6210j02 = C6210j0.f34836c;
            if (c6210j0 != c6210j02) {
                C6210j0 c6210j03 = new C6210j0();
                do {
                    AbstractC8971cM1 abstractC8971cM1 = f36797f;
                    abstractC8971cM1.mo9195g(c6210j03, c6210j0);
                    if (abstractC8971cM1.mo9192c(this, c6210j0, c6210j03)) {
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                m22329i(c6210j03);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f36799a;
                            if (obj2 != null) {
                                return m22324f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m22329i(c6210j03);
                    } else {
                        c6210j0 = this.f36801c;
                    }
                } while (c6210j0 != c6210j02);
            }
            Object obj3 = this.f36799a;
            Objects.requireNonNull(obj3);
            return m22324f(obj3);
        }
        while (nanos > 0) {
            Object obj4 = this.f36799a;
            if (obj4 != null) {
                return m22324f(obj4);
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
        StringBuilder sbM26239p = AbstractC7222ym.m26239p("Waited ", j, " ");
        sbM26239p.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbM26239p.toString();
        if (nanos + 1000 < 0) {
            String strM26232i = AbstractC7222ym.m26232i(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strM26232i2 = strM26232i + jConvert + " " + lowerCase;
                if (z) {
                    strM26232i2 = AbstractC7222ym.m26232i(strM26232i2, StringUtils.COMMA);
                }
                strM26232i = AbstractC7222ym.m26232i(strM26232i2, " ");
            }
            if (z) {
                strM26232i = strM26232i + nanos2 + " nanoseconds ";
            }
            string3 = AbstractC7222ym.m26232i(strM26232i, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC7222ym.m26232i(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC1374Vq.m8589h(string3, " for ", string));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public final String m22328h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: i */
    public final void m22329i(C6210j0 c6210j0) {
        c6210j0.f34837a = null;
        while (true) {
            C6210j0 c6210j02 = this.f36801c;
            if (c6210j02 == C6210j0.f34836c) {
                return;
            }
            C6210j0 c6210j03 = null;
            while (c6210j02 != null) {
                C6210j0 c6210j04 = c6210j02.f34838b;
                if (c6210j02.f34837a != null) {
                    c6210j03 = c6210j02;
                } else if (c6210j03 != null) {
                    c6210j03.f34838b = c6210j04;
                    if (c6210j03.f34837a == null) {
                        break;
                    }
                } else if (!f36797f.mo9192c(this, c6210j02, c6210j04)) {
                    break;
                }
                c6210j02 = c6210j04;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f36799a instanceof C1007Q;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f36799a != null;
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
            r6.m22326a(r0)
            goto La2
        L59:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.String r3 = r6.m22328h()     // Catch: java.lang.StackOverflowError -> L70 java.lang.Exception -> L72
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
            r6.m22326a(r0)
        La2:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC6336l0.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f36799a;
            if (obj2 != null) {
                return m22324f(obj2);
            }
            C6210j0 c6210j0 = this.f36801c;
            C6210j0 c6210j02 = C6210j0.f34836c;
            if (c6210j0 != c6210j02) {
                C6210j0 c6210j03 = new C6210j0();
                do {
                    AbstractC8971cM1 abstractC8971cM1 = f36797f;
                    abstractC8971cM1.mo9195g(c6210j03, c6210j0);
                    if (abstractC8971cM1.mo9192c(this, c6210j0, c6210j03)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f36799a;
                            } else {
                                m22329i(c6210j03);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m22324f(obj);
                    }
                    c6210j0 = this.f36801c;
                } while (c6210j0 != c6210j02);
            }
            Object obj3 = this.f36799a;
            Objects.requireNonNull(obj3);
            return m22324f(obj3);
        }
        throw new InterruptedException();
    }
}
