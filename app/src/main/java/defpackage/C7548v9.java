package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: v9 */
/* loaded from: classes2.dex */
public class C7548v9 extends C0334Ea1 {
    public static final ReentrantLock h;
    public static final Condition i;
    public static final long j;
    public static final long k;
    public static C7548v9 l;
    public boolean e;
    public C7548v9 f;
    public long g;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        h = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        O90.e(conditionNewCondition, "newCondition(...)");
        i = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        j = millis;
        k = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void i() {
        C7548v9 c7548v9;
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            ReentrantLock reentrantLock = h;
            reentrantLock.lock();
            try {
                if (this.e) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.e = true;
                if (l == null) {
                    l = new C7548v9();
                    C6975s9 c6975s9 = new C6975s9("Okio Watchdog");
                    c6975s9.setDaemon(true);
                    c6975s9.start();
                }
                long jNanoTime = System.nanoTime();
                if (j2 != 0 && z) {
                    this.g = Math.min(j2, c() - jNanoTime) + jNanoTime;
                } else if (j2 != 0) {
                    this.g = j2 + jNanoTime;
                } else {
                    if (!z) {
                        throw new AssertionError();
                    }
                    this.g = c();
                }
                long j3 = this.g - jNanoTime;
                C7548v9 c7548v92 = l;
                O90.c(c7548v92);
                while (true) {
                    c7548v9 = c7548v92.f;
                    if (c7548v9 == null || j3 < c7548v9.g - jNanoTime) {
                        break;
                    } else {
                        c7548v92 = c7548v9;
                    }
                }
                this.f = c7548v9;
                c7548v92.f = this;
                if (c7548v92 == l) {
                    i.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean j() {
        ReentrantLock reentrantLock = h;
        reentrantLock.lock();
        try {
            if (!this.e) {
                return false;
            }
            this.e = false;
            C7548v9 c7548v9 = l;
            while (c7548v9 != null) {
                C7548v9 c7548v92 = c7548v9.f;
                if (c7548v92 == this) {
                    c7548v9.f = this.f;
                    this.f = null;
                    return false;
                }
                c7548v9 = c7548v92;
            }
            reentrantLock.unlock();
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void k() {
    }
}
