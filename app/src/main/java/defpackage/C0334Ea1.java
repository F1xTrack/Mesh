package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: Ea1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0334Ea1 {
    public static final C0256Da1 d = new C0256Da1();
    public boolean a;
    public long b;
    public long c;

    public C0334Ea1 a() {
        this.a = false;
        return this;
    }

    public C0334Ea1 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public C0334Ea1 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public C0334Ea1 g(long j, TimeUnit timeUnit) {
        O90.f(timeUnit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(NX.g(j, "timeout < 0: ").toString());
        }
        this.c = timeUnit.toNanos(j);
        return this;
    }

    public long h() {
        return this.c;
    }
}
