package p000;

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
public abstract class AbstractC1759b1 implements InterfaceFutureC7800Jj0 {

    /* renamed from: d */
    public static final boolean f16705d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f16706e = Logger.getLogger(AbstractC1759b1.class.getName());

    /* renamed from: f */
    public static final AbstractC11024sM1 f16707f;

    /* renamed from: g */
    public static final Object f16708g;

    /* renamed from: a */
    public volatile Object f16709a;

    /* renamed from: b */
    public volatile C1448X0 f16710b;

    /* renamed from: c */
    public volatile C1638a1 f16711c;

    static {
        AbstractC11024sM1 c1574z0;
        try {
            c1574z0 = new C1511Y0(AtomicReferenceFieldUpdater.newUpdater(C1638a1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1638a1.class, C1638a1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1759b1.class, C1638a1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1759b1.class, C1448X0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1759b1.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1574z0 = new C1574Z0();
        }
        f16707f = c1574z0;
        if (th != null) {
            f16706e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f16708g = new Object();
    }

    /* renamed from: c */
    public static void m10407c(AbstractC1759b1 abstractC1759b1) {
        C1638a1 c1638a1;
        C1448X0 c1448x0;
        C1448X0 c1448x02;
        C1448X0 c1448x03;
        do {
            c1638a1 = abstractC1759b1.f16711c;
        } while (!f16707f.mo9199c(abstractC1759b1, c1638a1, C1638a1.f15281c));
        while (true) {
            c1448x0 = null;
            if (c1638a1 == null) {
                break;
            }
            Thread thread = c1638a1.f15282a;
            if (thread != null) {
                c1638a1.f15282a = null;
                LockSupport.unpark(thread);
            }
            c1638a1 = c1638a1.f15283b;
        }
        abstractC1759b1.mo3341b();
        do {
            c1448x02 = abstractC1759b1.f16710b;
        } while (!f16707f.mo9197a(abstractC1759b1, c1448x02, C1448X0.f13477d));
        while (true) {
            c1448x03 = c1448x0;
            c1448x0 = c1448x02;
            if (c1448x0 == null) {
                break;
            }
            c1448x02 = c1448x0.f13480c;
            c1448x0.f13480c = c1448x03;
        }
        while (c1448x03 != null) {
            C1448X0 c1448x04 = c1448x03.f13480c;
            m10408e(c1448x03.f13478a, c1448x03.f13479b);
            c1448x03 = c1448x04;
        }
    }

    /* renamed from: e */
    public static void m10408e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            f16706e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    /* renamed from: f */
    public static Object m10409f(Object obj) throws ExecutionException {
        if (obj instanceof C1322V0) {
            CancellationException cancellationException = ((C1322V0) obj).f12293b;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof C1385W0) {
            throw new ExecutionException(((C1385W0) obj).f12915a);
        }
        if (obj == f16708g) {
            return null;
        }
        return obj;
    }

    /* renamed from: g */
    public static Object m10410g(AbstractC1759b1 abstractC1759b1) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = abstractC1759b1.get();
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
    public final void m10411a(StringBuilder sb) {
        try {
            Object objM10410g = m10410g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objM10410g == this ? "this future" : String.valueOf(objM10410g));
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
        Object obj = this.f16709a;
        if (obj != null) {
            return false;
        }
        if (!f16707f.mo9198b(this, obj, f16705d ? new C1322V0(z, new CancellationException("Future.cancel() was called.")) : z ? C1322V0.f12290c : C1322V0.f12291d)) {
            return false;
        }
        m10407c(this);
        return true;
    }

    @Override // p000.InterfaceFutureC7800Jj0
    /* renamed from: d */
    public final void mo2494d(Runnable runnable, Executor executor) {
        executor.getClass();
        C1448X0 c1448x0 = this.f16710b;
        C1448X0 c1448x02 = C1448X0.f13477d;
        if (c1448x0 != c1448x02) {
            C1448X0 c1448x03 = new C1448X0(runnable, executor);
            do {
                c1448x03.f13480c = c1448x0;
                if (f16707f.mo9197a(this, c1448x0, c1448x03)) {
                    return;
                } else {
                    c1448x0 = this.f16710b;
                }
            } while (c1448x0 != c1448x02);
        }
        m10408e(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f16709a;
        if (obj != null) {
            return m10409f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C1638a1 c1638a1 = this.f16711c;
            C1638a1 c1638a12 = C1638a1.f15281c;
            if (c1638a1 != c1638a12) {
                C1638a1 c1638a13 = new C1638a1();
                do {
                    AbstractC11024sM1 abstractC11024sM1 = f16707f;
                    abstractC11024sM1.mo9200e(c1638a13, c1638a1);
                    if (abstractC11024sM1.mo9199c(this, c1638a1, c1638a13)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m10412i(c1638a13);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f16709a;
                            if (obj2 != null) {
                                return m10409f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m10412i(c1638a13);
                    } else {
                        c1638a1 = this.f16711c;
                    }
                } while (c1638a1 != c1638a12);
            }
            return m10409f(this.f16709a);
        }
        while (nanos > 0) {
            Object obj3 = this.f16709a;
            if (obj3 != null) {
                return m10409f(obj3);
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
    public String mo3149h() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    /* renamed from: i */
    public final void m10412i(C1638a1 c1638a1) {
        c1638a1.f15282a = null;
        while (true) {
            C1638a1 c1638a12 = this.f16711c;
            if (c1638a12 == C1638a1.f15281c) {
                return;
            }
            C1638a1 c1638a13 = null;
            while (c1638a12 != null) {
                C1638a1 c1638a14 = c1638a12.f15283b;
                if (c1638a12.f15282a != null) {
                    c1638a13 = c1638a12;
                } else if (c1638a13 != null) {
                    c1638a13.f15283b = c1638a14;
                    if (c1638a13.f15282a == null) {
                        break;
                    }
                } else if (!f16707f.mo9199c(this, c1638a12, c1638a14)) {
                    break;
                }
                c1638a12 = c1638a14;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f16709a instanceof C1322V0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f16709a != null;
    }

    /* renamed from: j */
    public boolean m10413j(Object obj) {
        if (obj == null) {
            obj = f16708g;
        }
        if (!f16707f.mo9198b(this, null, obj)) {
            return false;
        }
        m10407c(this);
        return true;
    }

    /* renamed from: k */
    public boolean mo10414k(Throwable th) {
        th.getClass();
        if (!f16707f.mo9198b(this, null, new C1385W0(th))) {
            return false;
        }
        m10407c(this);
        return true;
    }

    public final String toString() {
        String strMo3149h;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f16709a instanceof C1322V0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m10411a(sb);
        } else {
            try {
                strMo3149h = mo3149h();
            } catch (RuntimeException e) {
                strMo3149h = "Exception thrown from implementation: " + e.getClass();
            }
            if (strMo3149h != null && !strMo3149h.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strMo3149h);
                sb.append("]");
            } else if (isDone()) {
                m10411a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public void mo3341b() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f16709a;
            if (obj2 != null) {
                return m10409f(obj2);
            }
            C1638a1 c1638a1 = this.f16711c;
            C1638a1 c1638a12 = C1638a1.f15281c;
            if (c1638a1 != c1638a12) {
                C1638a1 c1638a13 = new C1638a1();
                do {
                    AbstractC11024sM1 abstractC11024sM1 = f16707f;
                    abstractC11024sM1.mo9200e(c1638a13, c1638a1);
                    if (abstractC11024sM1.mo9199c(this, c1638a1, c1638a13)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f16709a;
                            } else {
                                m10412i(c1638a13);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m10409f(obj);
                    }
                    c1638a1 = this.f16711c;
                } while (c1638a1 != c1638a12);
            }
            return m10409f(this.f16709a);
        }
        throw new InterruptedException();
    }
}
