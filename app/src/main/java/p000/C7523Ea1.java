package p000;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: Ea1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C7523Ea1 {

    /* renamed from: d */
    public static final C7471Da1 f2789d = new C7471Da1();

    /* renamed from: a */
    public boolean f2790a;

    /* renamed from: b */
    public long f2791b;

    /* renamed from: c */
    public long f2792c;

    /* renamed from: a */
    public C7523Ea1 mo2356a() {
        this.f2790a = false;
        return this;
    }

    /* renamed from: b */
    public C7523Ea1 mo2357b() {
        this.f2792c = 0L;
        return this;
    }

    /* renamed from: c */
    public long mo2358c() {
        if (this.f2790a) {
            return this.f2791b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public C7523Ea1 mo1728d(long j) {
        this.f2790a = true;
        this.f2791b = j;
        return this;
    }

    /* renamed from: e */
    public boolean mo2359e() {
        return this.f2790a;
    }

    /* renamed from: f */
    public void mo1729f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f2790a && this.f2791b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* renamed from: g */
    public C7523Ea1 mo1730g(long j, TimeUnit timeUnit) {
        O90.m5968f(timeUnit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC0852NX.m5758g(j, "timeout < 0: ").toString());
        }
        this.f2792c = timeUnit.toNanos(j);
        return this;
    }

    /* renamed from: h */
    public long mo2360h() {
        return this.f2792c;
    }
}
