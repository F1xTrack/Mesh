package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: v9 */
/* loaded from: classes2.dex */
public class C6994v9 extends C7523Ea1 {

    /* renamed from: h */
    public static final ReentrantLock f44211h;

    /* renamed from: i */
    public static final Condition f44212i;

    /* renamed from: j */
    public static final long f44213j;

    /* renamed from: k */
    public static final long f44214k;

    /* renamed from: l */
    public static C6994v9 f44215l;

    /* renamed from: e */
    public boolean f44216e;

    /* renamed from: f */
    public C6994v9 f44217f;

    /* renamed from: g */
    public long f44218g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f44211h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        O90.m5967e(conditionNewCondition, "newCondition(...)");
        f44212i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f44213j = millis;
        f44214k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* renamed from: i */
    public final void m25369i() {
        C6994v9 c6994v9;
        long j = this.f2792c;
        boolean z = this.f2790a;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = f44211h;
            reentrantLock.lock();
            try {
                if (this.f44216e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f44216e = true;
                if (f44215l == null) {
                    f44215l = new C6994v9();
                    C6805s9 c6805s9 = new C6805s9("Okio Watchdog");
                    c6805s9.setDaemon(true);
                    c6805s9.start();
                }
                long jNanoTime = System.nanoTime();
                if (j != 0 && z) {
                    this.f44218g = Math.min(j, mo2358c() - jNanoTime) + jNanoTime;
                } else if (j != 0) {
                    this.f44218g = j + jNanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.f44218g = mo2358c();
                }
                long j2 = this.f44218g - jNanoTime;
                C6994v9 c6994v92 = f44215l;
                O90.m5965c(c6994v92);
                while (true) {
                    c6994v9 = c6994v92.f44217f;
                    if (c6994v9 == null || j2 < c6994v9.f44218g - jNanoTime) {
                        break;
                    } else {
                        c6994v92 = c6994v9;
                    }
                }
                this.f44217f = c6994v9;
                c6994v92.f44217f = this;
                if (c6994v92 == f44215l) {
                    f44212i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* renamed from: j */
    public final boolean m25370j() {
        ReentrantLock reentrantLock = f44211h;
        reentrantLock.lock();
        try {
            if (!this.f44216e) {
                return false;
            }
            this.f44216e = false;
            C6994v9 c6994v9 = f44215l;
            while (c6994v9 != null) {
                C6994v9 c6994v92 = c6994v9.f44217f;
                if (c6994v92 == this) {
                    c6994v9.f44217f = this.f44217f;
                    this.f44217f = null;
                    return false;
                }
                c6994v9 = c6994v92;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: k */
    public void mo1159k() {
    }
}
